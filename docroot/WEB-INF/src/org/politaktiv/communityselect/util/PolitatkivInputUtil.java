package org.politaktiv.communityselect.util;

import javax.portlet.PortletPreferences;

public class PolitatkivInputUtil {
	
	/**
	 * Filters the user Input, only lets numbers pass. 
	 * 
	 * @param prefs
	 * @return the number of communities to show, specified by the user through edit.jsp if the input was valid. Returns 1 if input was not valid.
	 */
	public static int getSafeNumberOfCommunitiesToShow(PortletPreferences prefs){
		
		String numberOfCommunitiesToShowInputString = prefs.getValue("numberOfCommunitiesToShowInVerticalView","0");
		int numberOfCommunitiesToShow;
		if(!numberOfCommunitiesToShowInputString.matches("[0-9]+"))
			numberOfCommunitiesToShow = 1; //if user input was invalid, show at least one community
		else
			numberOfCommunitiesToShow = new Integer(numberOfCommunitiesToShowInputString);
		
		return numberOfCommunitiesToShow;
	}
}
