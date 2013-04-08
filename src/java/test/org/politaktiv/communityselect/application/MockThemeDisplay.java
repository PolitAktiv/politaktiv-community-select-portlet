package org.politaktiv.communityselect.application;

import com.liferay.portal.theme.ThemeDisplay;

public class MockThemeDisplay extends ThemeDisplay {

	@Override
	public String getPortalURL() {
		return "localhost:8080/";
	}
}
