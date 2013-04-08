package org.politaktiv.communityselect.application;


public class InitializeEvent implements Event {
	
	PortalState data;
	private long currentCompanyId;

	public InitializeEvent(long currentCompanyId,
			PortalState portalState) {
		this.currentCompanyId = currentCompanyId;
		this.data = portalState;
	}
	
	public long getCurrentCompanyId() {
		return currentCompanyId;
	}

	public PortalState getPortalState() {
		return data;
	}
}
