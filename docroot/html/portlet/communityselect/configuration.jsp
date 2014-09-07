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

<%@page import="org.politaktiv.communityselect.configuration.ConfigurationUtil"%>
<%@ include file="./init.jsp" %>

<portlet:defineObjects /> 

java.lang.Object errorException = (java.lang.Object) pageContext.getAttribute("errorException");
java.lang.Object errorException = (java.lang.Object) pageContext.getAttribute("errorException");
java.lang.Object errorException = (java.lang.Object) pageContext.getAttribute("errorException");


<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	boolean isWideViewMode = portletPreferences.getValue("viewMode", "default").equals("wide_view");
	boolean isVerticalViewMode = portletPreferences.getValue("viewMode", "default").equals("vertical_view");
	int numberOfCommunitiesToShow = ConfigurationUtil.getSafeNumberOfCommunitiesToShow(portletPreferences);
	String preferenceFullPageUrl = portletPreferences.getValue("fullPageURL", "www.politaktiv.org"); //in case something goes wrong, go back to main page
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

		<%//Todo: internationalize %>
		<aui:input type="radio" name="preferences--viewMode--" label="Breite Ansicht (Bitte in breiten Spalten verwenden! Grafikfehler bei zu kleiner Spalte.)" value="wide_view"/>
		<aui:input type="radio" name="preferences--viewMode--" label="Vertikale Ansicht (Bitte in schmalen Spalten verwenden! Füllt Platz nicht aus bei zu großen Spalten.)" value="vertical_view"/>
		<p>(Aktuelle Ansicht: <%=currentView%>)</p>
		<br/>
		<br/>

		<aui:input 	name="preferences--numberOfCommunitiesToShowInVerticalView--" 
					label="Wie viele Diskussionskreise sollen im vertikalen View maximal angezeigt werden? (Bitte ausschließlich Zahlen eintragen!)"
					value="<%= numberOfCommunitiesToShow %>"/>		

		<br/>
		<br/>
		
		<aui:input id="<portlet:namespace />FULL_COMMUNITY_URL"
						label="URL zur Hauptseite"
						name="preferences--fullPageURL--"
						value="<%=preferenceFullPageUrl%>">
		</aui:input>
		<p>beschreibt den Link zu einer Seite auf Politaktiv. Er ist dafür gedacht, auf eine Seite zu verlinken, die ein Community-Select-Portlet mit allen Diskussionskreisen (in breiter Ansicht) beinhaltet. </p>
		<p>Bitte darauf achten, einen relativen Link zu benutzen!</p>
		<p>Beispiel: Für die Hauptseite des Diskussionskreises "BB-Nufringen Mitte" benutzen Sie:</p>
		<p>web/nufringen</p>
	    <aui:button-row>
	       <aui:button type="submit" value="save"/>
	    </aui:button-row>
    </aui:fieldset>
</aui:form>