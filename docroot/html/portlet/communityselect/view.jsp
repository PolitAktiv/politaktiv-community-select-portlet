<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@ include file="./init.jsp"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
    CommunityViewContainer viewContainer = (CommunityViewContainer) renderRequest
		    .getAttribute(CommunityViewConstants.COMMUNITY_VIEW);
    String activeSearchString = (String) renderRequest.getAttribute(CommunityViewConstants.SEARCH_STRING);
    String viewMode = portletPreferences.getValue("viewMode", "vertical_view");
    String placeholder = LanguageUtil.get(pageContext, "search-for-project-ellipsis");
    String title = LanguageUtil.get(pageContext, "project-search");
%>

<!--  THE SEARCH -->
<portlet:actionURL name="doSearch" var="doSearchURL" />
<aui:form name="fm" action="<%=doSearchURL%>" method="post">
	<liferay-portlet:renderURLParams varImpl="doSearchURL" />
	<table border="0">
		<tr>
			<th><aui:input type="search"
					id="<portlet:namespace /><%=CommunityViewConstants.SEARCH_STRING%>"
					label="" placeholder="<%=placeholder%>" title="<%=title%>"
					name="<%=CommunityViewConstants.SEARCH_STRING%>"
					value="<%=activeSearchString%>" /></th>
			<th><aui:button type="submit" name="Suchen" value="lookup" /></th>
		</tr>
	</table>
</aui:form>

<%
    if (viewMode.equals("wide_view")) {
%>
<%@include file="/html/portlet/communityselect/viewWide.jsp"%>
<%
    } else if (viewMode.equals("vertical_view")) {
%>
<%@include file="/html/portlet/communityselect/viewVertical.jspf"%>
<%
    }
%>
