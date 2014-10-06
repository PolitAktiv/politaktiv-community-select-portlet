<%--
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
        
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 --%>

<%@ include file="./init.jsp"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
    byte[] serializedContainer = (byte[])(renderRequest.getAttribute(CommunityViewConstants.COMMUNITY_VIEW));
	CommunityViewContainer viewContainer = (CommunityViewContainer) CommunitySerializationUtil.deserializeContainer(serializedContainer); 
    String activeSearchString = (String) renderRequest.getAttribute(CommunityViewConstants.SEARCH_STRING);
    String viewMode = portletPreferences.getValue("viewMode", "vertical_view");
    String placeholder = LanguageUtil.get(pageContext, "search-for-project-ellipsis");
    String title = LanguageUtil.get(pageContext, "project-search");
%>

<!--  THE SEARCH -->
<portlet:actionURL name="doSearch" var="doSearchURL" />
<div name="communitySearchContainer" id="communitySearchContainer">
	<aui:form name="fm" action="<%=doSearchURL%>" method="post">
		<liferay-portlet:renderURLParams varImpl="doSearchURL" />
	
				<aui:input type="search"
						id="<portlet:namespace /><%=CommunityViewConstants.SEARCH_STRING%>"
						label="" placeholder="<%=placeholder%>" title="<%=title%>"
						name="<%=CommunityViewConstants.SEARCH_STRING%>"
						value="<%=activeSearchString%>" />
			  <aui:button type="submit" name="Suchen" value="lookup" />
	</aui:form>
</div>


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
