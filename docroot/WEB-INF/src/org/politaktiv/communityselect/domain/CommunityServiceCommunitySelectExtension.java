package org.politaktiv.communityselect.domain;

import org.politaktiv.community.application.AfterPageRefreshEvent;
import org.politaktiv.community.application.CommunityViewContainer;
import org.politaktiv.community.application.LeaveEvent;
import org.politaktiv.community.application.SearchEvent;
import org.politaktiv.community.domain.CommunityService;

public interface CommunityServiceCommunitySelectExtension extends CommunityService{
    
    
    public void setCommunitiesRepository(CommunitiesRepositoryCommunitySelectExtension repository);
    CommunityViewContainer searchCommunity(CommunityViewContainer container,SearchEvent searchEvent);
    CommunityViewContainer leaveCommunity(CommunityViewContainer container,LeaveEvent leaveEvent);
    public CommunityViewContainer refreshCommunity(CommunityViewContainer container, AfterPageRefreshEvent event);
}
