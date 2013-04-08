

<%@ include file="./init.jsp" %>

<portlet:defineObjects /> 

<portlet:actionURL name="saveConfig" var="saveConfigURL">
	<portlet:param name="action" value="saveConfig" />
</portlet:actionURL>

<liferay-ui:error message="Problem beim Speichern der Ansicht" key="problem-while-saving-new-view-mode" />
<liferay-ui:error key="illegalDatatype" message="illegal-datatype" />
<liferay-ui:error key="smallerZero" message="please-not-smaller-zero" />

<% 
	String saveConfigURLString = saveConfigURL.toString();
	boolean isWideViewMode = portletPreferences.getValue("viewMode", "default").equals("wide_view");
	boolean isVerticalViewMode = portletPreferences.getValue("viewMode", "default").equals("vertical_view");
	String preferenceFullPageUrl = portletPreferences.getValue(CommunityViewConstants.PREFERENCE_FULL_PAGE_URL, "default");
	int numberOfCommunitiesToShow = new Integer(portletPreferences.getValue("numberOfCommunitiesToShowInVerticalView","0"));
%>
<aui:form name="viewEditfm" action="<%= saveConfigURLString %>" method="post">
	<aui:select name="viewMode" label="View Mode">
		<aui:option label="wide-view" value="wide_view" selected="<%= isWideViewMode %>" />
		<aui:option label="vertical-view" value="vertical_view" selected="<%= isVerticalViewMode %>"/>
	</aui:select>
	
	<aui:select name="numberOfCommunitiesToShowInVerticalView" label="how-many-communities-to-show-in-vertical-view-not-logged-in">
		<aui:option label="all" value="0" selected="<%=  numberOfCommunitiesToShow == 0 %>"/>
		
		<% for(int i=1;i <= 10;i++){ %>
			<aui:option label="<%=i %>" value="<%= i %>" selected="<%= i == numberOfCommunitiesToShow %>"/>
		<% } %>
		
	</aui:select>
	
	<aui:input id="<portlet:namespace />FULL_COMMUNITY_URL"
					label="URL to the large page"
					name="<%=CommunityViewConstants.PREFERENCE_FULL_PAGE_URL%>"
					value="<%=preferenceFullPageUrl%>"/>
	
	<aui:button type="submit" id="saveConfig" value="save"/>


</aui:form>