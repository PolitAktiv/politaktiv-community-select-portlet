package org.politaktiv.communityselect.application;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.politaktiv.communityselect.domain.PreferencesRepository;
import org.politaktiv.infrastructure.liferay.PAParamUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CommunitiesPortlet extends model view controler
 * portlet from liferay
 */
public class CommunitySelectPortlet extends MVCPortlet {
    private static final String EVENT_QUEUE = "EVENT_LIST";
    private static Log _log = LogFactoryUtil.getLog(CommunitySelectPortlet.class);
    PreferencesRepository prefsRepository = new PreferencesRepository();
    CommunityService communityService = new CommunityService();
    PAParamUtil PaParamUtil = new PAParamUtil();

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liferay.util.bridges.mvc.MVCPortlet#doView(javax.portlet.RenderRequest
     * , javax.portlet.RenderResponse)
     */
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

	ThemeDisplay themeDisplay = getThemeDisplay(renderRequest);
	PortalState currentPortalState = new PortalState(themeDisplay);
	PortletSession portletSession = renderRequest.getPortletSession();

	try {
	    portletSession = doLazyInitializeSession(portletSession, themeDisplay.getCompanyId(), currentPortalState);
	    portletSession = consumeEvents(portletSession, currentPortalState);
	    renderRequest = copyViewFromSessionToRequest(renderRequest, portletSession);
	} catch (Exception e) {
	    throw new PortletException(e);
	}

	super.doView(renderRequest, renderResponse);
    }

    public void doSearch(ActionRequest actionRequest, ActionResponse actionResponse) {
	PortletSession portletSession = actionRequest.getPortletSession();
	ThemeDisplay themeDisplay = getThemeDisplay(actionRequest);
	PortalState currentPortalState = new PortalState(themeDisplay);

	String searchString = ParamUtil.get(actionRequest, CommunityViewConstants.SEARCH_STRING, "");
	SearchEvent searchEvent = new SearchEvent(themeDisplay.getCompanyGroupId(), searchString, currentPortalState);
	fireEvent(portletSession, searchEvent);
    }

    /**
     * Save marker view mode (function call come from form in edit view)
     * 
     * @param actionRequest
     * @param actionResponse
     * @throws PortletException
     * @throws IOException
     */
    public void saveConfig(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
	    PortletException, ValidatorException {
	PortletPreferences preferences = actionRequest.getPreferences();
	String viewMode = actionRequest.getParameter("viewMode");
	String maxCommunitiesToShow = new Integer(PaParamUtil.getIntZeroOrGreater(actionRequest,
		"numberOfCommunitiesToShowInVerticalView")).toString();
	String preferenceFullPageUrl = actionRequest.getParameter(CommunityViewConstants.PREFERENCE_FULL_PAGE_URL);

	prefsRepository.setValueAndStore(preferences, "viewMode", viewMode);
	prefsRepository.setValueAndStore(preferences, "numberOfCommunitiesToShowInVerticalView", maxCommunitiesToShow);
	prefsRepository.setValueAndStore(preferences, CommunityViewConstants.PREFERENCE_FULL_PAGE_URL, preferenceFullPageUrl);
	actionResponse.setPortletMode(PortletMode.VIEW);
    }

    /**
     * Join the current user (scope) to community with given community id, if
     * user is allowed (function call comes from actionURL)
     * 
     * @param actionRequest
     * @param actionResponse
     */
    public void joinCommunity(ActionRequest actionRequest, ActionResponse actionResponse) {
	PortletSession portletSession = actionRequest.getPortletSession();
	ThemeDisplay themeDisplay = getThemeDisplay(actionRequest);
	PortalState currentPortalState = new PortalState(themeDisplay);

	long currentUserId = getThemeDisplay(actionRequest).getUserId();
	long communityId = Long.parseLong(actionRequest.getParameter(CommunityViewConstants.COMMUNITY_ID));
	JoinEvent joinEvent = new JoinEvent(currentUserId, communityId, currentPortalState);
	fireEvent(portletSession, joinEvent);
    }

    /**
     * Leave the current user (scope) to community with given community id, if
     * user is allowed (function call comes from actionURL)
     * 
     * @param actionRequest
     * @param actionResponse
     */
    public void leaveCommunity(ActionRequest actionRequest, ActionResponse actionResponse) {
	PortletSession portletSession = actionRequest.getPortletSession();
	ThemeDisplay themeDisplay = getThemeDisplay(actionRequest);
	PortalState currentPortalState = new PortalState(themeDisplay);

	long currentUserId = getThemeDisplay(actionRequest).getUserId();
	long communityId = Long.parseLong(actionRequest.getParameter(CommunityViewConstants.COMMUNITY_ID));
	LeaveEvent leaveEvent = new LeaveEvent(currentUserId, communityId, currentPortalState);
	fireEvent(portletSession, leaveEvent);
    }

    public void requestMembershipToCommunity(ActionRequest actionRequest, ActionResponse actionResponse)
	    throws PortalException, SystemException {
	PortletSession portletSession = actionRequest.getPortletSession();
	ThemeDisplay themeDisplay = getThemeDisplay(actionRequest);
	PortalState currentPortalState = new PortalState(themeDisplay);

	long currentUserId = getThemeDisplay(actionRequest).getUserId();
	long communityId = Long.parseLong(actionRequest.getParameter(CommunityViewConstants.COMMUNITY_ID));
	long currentGuestUserId = themeDisplay.getDefaultUserId();
	long currentCompanyId = themeDisplay.getCompanyId();

	RequestMembershipEvent rmEvent = new RequestMembershipEvent(currentUserId, currentCompanyId, communityId,
		currentGuestUserId, currentPortalState);
	fireEvent(portletSession, rmEvent);
    }

    // dispatch helper for portlet to redirect to specific page
    @Override
    protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException,
	    PortletException {
	PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);
	if (portletRequestDispatcher == null) {
	    _log.error(path + " is not a valid include");
	} else {
	    portletRequestDispatcher.include(renderRequest, renderResponse);
	}
    }

    PortletSession doLazyInitializeSession(PortletSession portletSession, long currentCompanyId,
	    PortalState currentPortalState) {
	CommunityViewContainer containerToShow = getViewContainer(portletSession);
	if (null == containerToShow) {
	    Event event = new InitializeEvent(currentCompanyId, currentPortalState);
	    portletSession = fireEvent(portletSession, event);
	}
	return portletSession;
    }

    PortletSession consumeEvents(PortletSession portletSession, PortalState currentPortalState) throws PortalException,
	    SystemException {
	Queue<Event> eventQueue = getOrCreateEventListFromSession(portletSession);
	CommunityViewContainer container = getViewContainer(portletSession);

	while (!eventQueue.isEmpty()) {
	    Event event = eventQueue.poll();
	    if (event instanceof InitializeEvent) {
		container = communityService.initializeView((InitializeEvent) event);
	    } else if (event instanceof SearchEvent) {
		container = communityService.searchCommunity(container, (SearchEvent) event);
	    } else if (event instanceof JoinEvent) {
		container = communityService.joinCommunity(container, (JoinEvent) event);
	    } else if (event instanceof LeaveEvent) {
		container = communityService.leaveCommunity(container, (LeaveEvent) event);
	    } else if (event instanceof RequestMembershipEvent) {
		container = communityService.requestCommunityMembership(container, (RequestMembershipEvent) event);
	    } else {
		container = communityService.calculateView(container, currentPortalState);
	    }
	}
	eventQueue.clear();
	portletSession = putViewContainer(portletSession, container);
	return portletSession;
    }

    <T extends PortletRequest> T copyViewFromSessionToRequest(T request, PortletSession portletSession) {
	CommunityViewContainer containerToShow = getViewContainer(portletSession);
	request.setAttribute(CommunityViewConstants.COMMUNITY_VIEW, containerToShow);
	request.setAttribute(CommunityViewConstants.SEARCH_STRING, containerToShow.getNameToSearch());
	return request;
    }

    PortletSession fireEvent(PortletSession portletSession, Event event) {
	Queue<Event> eventQueue = getOrCreateEventListFromSession(portletSession);
	eventQueue.add(event);
	return portletSession;
    }

    ThemeDisplay getThemeDisplay(PortletRequest portletRequest) {
	Object attribute = portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
	assert (null != attribute && attribute instanceof ThemeDisplay);
	ThemeDisplay themeDisplay = (ThemeDisplay) attribute;
	return themeDisplay;
    }

    PortletSession putViewContainer(PortletSession portletSession, CommunityViewContainer containerToShow) {
	portletSession.setAttribute(CommunityViewConstants.COMMUNITY_VIEW, containerToShow,
		PortletSession.APPLICATION_SCOPE);
	return portletSession;
    }

    CommunityViewContainer getViewContainer(PortletSession portletSession) {
	CommunityViewContainer containerToShow = (CommunityViewContainer) portletSession.getAttribute(
		CommunityViewConstants.COMMUNITY_VIEW, PortletSession.APPLICATION_SCOPE);
	return containerToShow;
    }

    @SuppressWarnings("unchecked")
    Queue<Event> getOrCreateEventListFromSession(PortletSession portletSession) {
	Object attribute = portletSession.getAttribute(EVENT_QUEUE, PortletSession.APPLICATION_SCOPE);
	if (attribute == null) {
	    attribute = new ArrayBlockingQueue<Event>(2);
	    portletSession.setAttribute(EVENT_QUEUE, attribute, PortletSession.APPLICATION_SCOPE);
	}
	assert (attribute instanceof Queue);
	return (Queue<Event>) attribute;
    }
}