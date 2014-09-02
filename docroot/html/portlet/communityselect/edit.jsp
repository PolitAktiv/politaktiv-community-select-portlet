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

<%@ include file="./init.jsp" %>

<portlet:defineObjects /> 

<liferay-ui:error message="Problem beim Speichern der Ansicht" key="problem-while-saving-new-view-mode" />
<liferay-ui:error key="illegalDatatype" message="illegal-datatype" />
<liferay-ui:error key="smallerZero" message="please-not-smaller-zero" />


<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<% 
	boolean isWideViewMode = portletPreferences.getValue("viewMode", "default").equals("wide_view");
	boolean isVerticalViewMode = portletPreferences.getValue("viewMode", "default").equals("vertical_view");
	String preferenceFullPageUrl = portletPreferences.getValue(CommunityViewConstants.PREFERENCE_FULL_PAGE_URL, "default");
	int numberOfCommunitiesToShow = new Integer(portletPreferences.getValue("numberOfCommunitiesToShowInVerticalView","0"));

%>

	
<%
	String currentView = "";
	if(isWideViewMode)
		currentView="Breit";
	else 
		currentView="Vertikal";
%>


<aui:form action="<%= configurationURL%>" method="post" name="fm">
<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

	<aui:fieldset>


		<aui:input type="radio" name="preferences--viewMode--" label="wide-view" value="wide_view"/>
		<aui:input type="radio" name="preferences--viewMode--" label="vertical-view" value="vertical_view"/>
		<p>(Aktuelle Ansicht: <%=currentView%>)</p>
		<br/>
		<br/>

		<aui:input 	name="preferences--numberOfCommunitiesToShowInVerticalView--" 
					label="Wie viele Diskussionskreise sollen im vertikalen View maximal angezeigt werden?"
					value="<%= numberOfCommunitiesToShow %>"/>		

		<br/>
		<br/>

		<aui:input id="<portlet:namespace />FULL_COMMUNITY_URL"
						label="URL zur Hauptseite"
						name="<%=CommunityViewConstants.PREFERENCE_FULL_PAGE_URL%>"
						value="<%=preferenceFullPageUrl%>">
		</aui:input>
	
	    <aui:button-row>
	       <aui:button type="submit" value="save"/>
	    </aui:button-row>
    </aui:fieldset>
</aui:form>