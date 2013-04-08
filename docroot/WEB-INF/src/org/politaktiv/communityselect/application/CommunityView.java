package org.politaktiv.communityselect.application;

public class CommunityView {

	private String name;
	private String id;	
	private String communityUrl;
	private String logoUrl;
	private int memberCount;
	private String actionIcon;
	private String actionText;
	private String action;

	public CommunityView(String name, String id, String communityUrl, String logoUrl,
			int memberCount, String actionIcon, String actionText,
			String actionUrl) {
		this.name = name;
		this.id = id;
		this.communityUrl = communityUrl;
		this.logoUrl = logoUrl;
		this.memberCount = memberCount;
		this.actionIcon = actionIcon;
		this.actionText = actionText;
		this.action = actionUrl;
	}

	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}

	public String getCommunityUrl() {
		return communityUrl;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public String getActionIcon() {
		return actionIcon;
	}

	public String getActionText() {
		return actionText;
	}

	public boolean isActionJoin() {
		return "JOIN".equals(action);
	}
	
	public boolean isActionLeave() {
		return "LEAVE".equals(action);
	}

}
