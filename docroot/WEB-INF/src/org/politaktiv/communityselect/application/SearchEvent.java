package org.politaktiv.communityselect.application;


public class SearchEvent implements Event {

	long communityId;
	String nameToSearch;
	PortalState portalState;

	public SearchEvent(long communityId, String nameToSearch, PortalState portalState) {
		this.communityId = communityId;
		this.nameToSearch = nameToSearch;
		this.portalState = portalState;
	}

	public String getNameToSearch() {
		return nameToSearch;
	}

	public PortalState getPortalState() {
		return portalState;
	}

}
