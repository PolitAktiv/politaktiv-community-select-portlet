package org.politaktiv.communityselect.application;

import java.util.ArrayList;
import java.util.List;

import org.politaktiv.communityselect.domain.CommunitiesRepository;
import org.politaktiv.communityselect.domain.Community;

import com.liferay.portal.model.GroupConstants;

public class MockCommunitiesRepository extends CommunitiesRepository {

	@Override
	public List<Community> findCommunitiesByCompanyId(long companyId) {
		List<Community> communityList = new ArrayList<Community>();
		communityList.add(new Community("withoutLogo 1", 1, 20, "url", GroupConstants.TYPE_SITE_OPEN));		
		communityList.add(new Community("withoutLogo 2", 2, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withoutLogo 3", 3, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 4", 4, 44, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 5", 5, 45, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 6", 6, 46, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 7", 7, 47, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 8", 8, 48, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 9", 9, 49, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 10", 10, 50, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogoAndUser 21", 21, 51, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogoAndUser 22", 22, 52, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withoutLogoAndUser 23", 23, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		return communityList;
	}
}
