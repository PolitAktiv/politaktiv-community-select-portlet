package org.politaktiv.communityselect.configuration;

import javax.portlet.PortletPreferences;

public class ConfigurationUtil {
	
	/**
	 * Filters the PortletPreferences, only lets numbers pass. 
	 * Same functionality as ensureValidNumberOfCommunities, but takes the preferences instead of a simple string as parameter
	 * 
	 * @param prefs
	 * @return the number of communities to show, specified by the user through configuration.jsp if the input was valid. Returns 1 if input was not valid.
	 */
	public static int getSafeNumberOfCommunitiesToShow(PortletPreferences prefs){
		
		return ensureValidNumberOfCommunities(prefs.getValue("numberOfCommunitiesToShowInVerticalView","0"));
	}
	
	
	/**
	 * Filters Strings
	 * 
	 * @param numberOfCommunitiesToShowInputString
	 * @return the number of communities to show, specified by the user through configuration.jsp if the input was valid. Returns 1 if input was not valid.
	 */
	public static int ensureValidNumberOfCommunities(String numberOfCommunitiesToShowInputString){
		int numberOfCommunitiesToShow;
		if(!numberOfCommunitiesToShowInputString.matches("[0-9]+"))
			numberOfCommunitiesToShow = 1; //if user input was invalid, show at least one community
		else
			numberOfCommunitiesToShow = new Integer(numberOfCommunitiesToShowInputString);
		
		return numberOfCommunitiesToShow;
	}
	
}
