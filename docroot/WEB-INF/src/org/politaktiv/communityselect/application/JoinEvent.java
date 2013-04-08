package org.politaktiv.communityselect.application;

public class JoinEvent implements Event {

    long userId;
    long communityId;
    PortalState portalState;

    public JoinEvent(long userId, long communityId, PortalState portalState) {
	this.userId = userId;
	this.communityId = communityId;
	this.portalState = portalState;
    }

    public long getUserId() {
	return userId;
    }

    public long getCommunityId() {
	return communityId;
    }
    
    public PortalState getPortalState() {
	return portalState;
    }
}
