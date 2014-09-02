package org.politaktiv.communityselect.application;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;

import org.politaktiv.communityselect.domain.PreferencesRepository;
import org.politaktiv.infrastructure.liferay.PAParamUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;

public class ConfigurationActionImpl extends DefaultConfigurationAction {
	
	PreferencesRepository prefsRepository = new PreferencesRepository();
    PAParamUtil PaParamUtil = new PAParamUtil();
    private static Log _log = LogFactoryUtil.getLog(ConfigurationActionImpl.class);

    @Override
    public void processAction(
        PortletConfig portletConfig, ActionRequest actionRequest,
        ActionResponse actionResponse) throws Exception{

        super.processAction(portletConfig, actionRequest, actionResponse);

        //get preferences from edit.jsp call
        PortletPreferences preferences = actionRequest.getPreferences();
        String viewMode = preferences.getValue("viewMode", "vertical_View");
        String maxCommunitiesToShow = preferences.getValue("numberOfCommunitiesToShowInVerticalView", "15");
        String preferenceFullPageUrl = preferences.getValue(CommunityViewConstants.PREFERENCE_FULL_PAGE_URL, CommunityViewConstants.PREFERENCE_FULL_PAGE_URL);

        // write them into the database
        prefsRepository.setValueAndStore(preferences, "viewMode", viewMode); // except for wide view: another bug here
        prefsRepository.setValueAndStore(preferences, "numberOfCommunitiesToShowInVerticalView", maxCommunitiesToShow);
        prefsRepository.setValueAndStore(preferences, CommunityViewConstants.PREFERENCE_FULL_PAGE_URL, preferenceFullPageUrl);

    }
}



