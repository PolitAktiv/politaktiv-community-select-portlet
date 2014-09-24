package org.politaktiv.communityselect.domain;

import java.util.List;

import org.politaktiv.community.domain.CommunitiesRepository;
import org.politaktiv.community.domain.Community;

public interface CommunitiesRepositoryCommunitySelectExtension extends CommunitiesRepository{
    
    List<Community> findCommunitiesByCompanyIdAndSearchString(long companyId, String stringToSearch);
    void leaveCommunity(long companyId, long communityId);

}
