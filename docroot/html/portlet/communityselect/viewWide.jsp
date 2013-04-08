
<liferay-ui:tabs
	names="available-open-communities,available-restricted-communities,my-communities"
	refresh="false">
	<%List<CommunityView> viewList;%>
	<liferay-ui:section>
		<%@include file="/html/portlet/communityselect/wide/viewOpenCommunities.jspf"%>
	</liferay-ui:section>
	<liferay-ui:section>
		<%@include file="/html/portlet/communityselect/wide/viewRestrictedCommunities.jspf"%>
	</liferay-ui:section>
<%
	if (viewContainer.getPortalState().isSignedIn()) {
	%>	
	<liferay-ui:section>
		<%@include file="/html/portlet/communityselect/wide/viewMemberCommunities.jspf"%>
	</liferay-ui:section>
	<%
	}
%>
</liferay-ui:tabs>