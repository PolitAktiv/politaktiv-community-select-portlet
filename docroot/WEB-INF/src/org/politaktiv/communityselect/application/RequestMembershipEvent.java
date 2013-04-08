package org.politaktiv.communityselect.application;

public class RequestMembershipEvent implements Event{

    long userId;
    long companyId;
    long communityId;
    long guestUserId;
    PortalState portalState;

    public long getUserId() {
        return userId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public long getCommunityId() {
        return communityId;
    }

    public long getGuestUserId() {
        return guestUserId;
    }

    public PortalState getPortalState() {
        return portalState;
    }

    public RequestMembershipEvent(long userId, long companyId, long communityId, long guestUserId,
	    PortalState portalState) {
	this.userId = userId;
	this.companyId = companyId;
	this.communityId = communityId;
	this.guestUserId = guestUserId;
	this.portalState = portalState;
    }
}
