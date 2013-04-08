package org.politaktiv.communityselect.application;

import java.util.ArrayList;
import java.util.List;

public class CommunityViewContainer {

    List<CommunityView> memberCommunityViews;
    List<CommunityView> nonMemberOpenCommunityViews;
    List<CommunityView> openCommunityViews;
    List<CommunityView> restrictedCommunityViews;
    long currentCompanyId;
    PortalState portalState;
    String nameToSearch;

    public CommunityViewContainer(long currentCompanyId, String nameToSearch, PortalState portalState) {
	resetResults();
	this.currentCompanyId = currentCompanyId;
	this.nameToSearch = nameToSearch;
	this.portalState = portalState;
    }

    public void addMemberCommunity(CommunityView communityView) {
	memberCommunityViews.add(communityView);
    }

    public List<CommunityView> getMemberCommunities() {
	return memberCommunityViews;
    }

    public int getMemberCommunitySize() {
	return memberCommunityViews.size();
    }
    
    public void addNonMemberOpenCommunity(CommunityView communityView) {
	nonMemberOpenCommunityViews.add(communityView);
    }

    public List<CommunityView> getNonMemberOpenCommunities() {
	return nonMemberOpenCommunityViews;
    }

    public void addRestrictedCommunity(CommunityView communityView) {
	restrictedCommunityViews.add(communityView);
    }

    public List<CommunityView> getRestrictedCommunities() {
	return restrictedCommunityViews;
    }

    public void addOpenCommunity(CommunityView communityView) {
	openCommunityViews.add(communityView);
    }

    public List<CommunityView> getOpenCommunities() {
	return openCommunityViews;
    }

    public boolean isDirty(PortalState portalState) {
	return !this.portalState.equals(portalState);
    }

    public void setPortalState(PortalState portalState) {
	this.portalState = portalState;
    }

    public PortalState getPortalState() {
	return portalState;
    }

    public long getCurrentCompanyId() {
	return currentCompanyId;
    }

    public void setNameToSearch(String nameToSearch) {
	this.nameToSearch = nameToSearch;
    }

    public String getNameToSearch() {
	return nameToSearch;
    }

    void resetResults() {
	memberCommunityViews = new ArrayList<CommunityView>();
	nonMemberOpenCommunityViews = new ArrayList<CommunityView>();
	restrictedCommunityViews = new ArrayList<CommunityView>();
	openCommunityViews = new ArrayList<CommunityView>();
    }
}
