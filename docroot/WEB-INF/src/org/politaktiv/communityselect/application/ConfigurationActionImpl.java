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
   // private static Log _log = LogFactoryUtil.getLog(ConfigurationActionImpl.class);

    @Override
    public void processAction(
        PortletConfig portletConfig, ActionRequest actionRequest,
        ActionResponse actionResponse) throws Exception{

        super.processAction(portletConfig, actionRequest, actionResponse);

        //get preferences from edit.jsp call
        PortletPreferences preferences = actionRequest.getPreferences();
        String viewMode = preferences.getValue("viewMode", "vertical_View");
        String maxCommunitiesToShow = preferences.getValue("numberOfCommunitiesToShowInVerticalView", "0");
        String preferenceFullPageUrl = preferences.getValue("fullPageURL", "www.politaktiv.org"); //main page as default, in case something goes wrong

        // write them into the database
        prefsRepository.setValueAndStore(preferences, "viewMode", viewMode); // except for wide view: another bug here
        prefsRepository.setValueAndStore(preferences, "numberOfCommunitiesToShowInVerticalView", maxCommunitiesToShow);
        prefsRepository.setValueAndStore(preferences, "fullPageURL", preferenceFullPageUrl);

    }
}



