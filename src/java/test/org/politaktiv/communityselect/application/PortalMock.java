/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.politaktiv.communityselect.application;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.PreferencesValidator;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;
import javax.portlet.WindowState;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.servlet.taglib.ui.BreadcrumbEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadServletRequest;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutFriendlyURLComposite;
import com.liferay.portal.model.LayoutQueryStringComposite;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.Portal;
import com.liferay.portal.util.PortalPortEventListener;
import com.liferay.portlet.expando.model.ExpandoBridge;

public class PortalMock implements Portal {
	
	//private static Log _log = LogFactoryUtil.getLog(PortalMock.class);

    @Override
    public void addPageDescription(String description, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPageKeywords(String keywords, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPageSubtitle(String subtitle, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPageTitle(String title, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPortalPortEventListener(PortalPortEventListener portalPortEventListener) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPortletBreadcrumbEntry(HttpServletRequest request, String title, String url) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPortletBreadcrumbEntry(HttpServletRequest request, String title, String url, Map<String, Object> data) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPortletDefaultResource(HttpServletRequest request, Portlet portlet) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void addPortletDefaultResource(long companyId, Layout layout, Portlet portlet) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String addPreservedParameters(ThemeDisplay themeDisplay, Layout layout, String url, boolean doAsUser) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String addPreservedParameters(ThemeDisplay themeDisplay, String url) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addUserLocaleOptionsMessage(HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void clearRequestParameters(RenderRequest renderRequest) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void copyRequestParameters(ActionRequest actionRequest, ActionResponse actionResponse) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String escapeRedirect(String url) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String generateRandomKey(HttpServletRequest request, String input) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getAbsoluteURL(HttpServletRequest request, String url) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public LayoutQueryStringComposite getActualLayoutQueryStringComposite(long groupId, boolean privateLayout,
	    String friendlyURL, Map<String, String[]> params, Map<String, Object> requestContext)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getActualURL(long groupId, boolean privateLayout, String mainPath, String friendlyURL,
	    Map<String, String[]> params, Map<String, Object> requestContext) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Locale[] getAlternateLocales(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getAlternateURL(String canonicalURL, ThemeDisplay themeDisplay, Locale locale, Layout layout)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Set<String> getAuthTokenIgnoreActions() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Set<String> getAuthTokenIgnorePortlets() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public BaseModel<?> getBaseModel(ResourcePermission resourcePermission) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public BaseModel<?> getBaseModel(String modelName, String primKey) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getBasicAuthUserId(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getBasicAuthUserId(HttpServletRequest request, long companyId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getCanonicalURL(String completeURL, ThemeDisplay themeDisplay, Layout layout) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCanonicalURL(String completeURL, ThemeDisplay themeDisplay, Layout layout,
	    boolean forceLayoutFriendlyURL) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCDNHost() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCDNHost(boolean secure) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCDNHost(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCDNHostHttp(long companyId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCDNHostHttps(long companyId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getClassName(long classNameId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getClassNameId(Class<?> clazz) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getClassNameId(String value) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getClassNamePortletId(String className) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Company getCompany(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Company getCompany(PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getCompanyId(HttpServletRequest requestuest) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getCompanyId(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long[] getCompanyIds() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getComputerAddress() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getComputerName() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Map<String, List<Portlet>> getControlPanelCategoriesMap(HttpServletRequest request) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getControlPanelCategory(String portletId, ThemeDisplay themeDisplay) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getControlPanelFullURL(long scopeGroupId, String ppid, Map<String, String[]> params)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getControlPanelPlid(long companyId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getControlPanelPlid(PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public Set<Portlet> getControlPanelPortlets(long companyId, String category) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Portlet> getControlPanelPortlets(String category, ThemeDisplay themeDisplay) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getControlPanelPortletURL(HttpServletRequest request, String portletId, long referrerPlid,
	    String lifecycle) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getControlPanelPortletURL(PortletRequest portletRequest, String portletId, long referrerPlid,
	    String lifecycle) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCreateAccountURL(HttpServletRequest request, ThemeDisplay themeDisplay) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCurrentCompleteURL(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCurrentURL(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCurrentURL(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCustomSQLFunctionIsNotNull() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getCustomSQLFunctionIsNull() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getDate(int month, int day, int year) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getDate(int month, int day, int year, Class<? extends PortalException> clazz) throws PortalException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getDate(int month, int day, int year, int hour, int min, Class<? extends PortalException> clazz)
	    throws PortalException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getDate(int month, int day, int year, int hour, int min, TimeZone timeZone,
	    Class<? extends PortalException> clazz) throws PortalException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getDate(int month, int day, int year, TimeZone timeZone, Class<? extends PortalException> clazz)
	    throws PortalException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getDefaultCompanyId() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getDigestAuthUserId(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getEmailFromAddress(PortletPreferences preferences, long companyId, String defaultValue)
	    throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getEmailFromName(PortletPreferences preferences, long companyId, String defaultValue)
	    throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Map<String, Serializable> getExpandoBridgeAttributes(ExpandoBridge expandoBridge,
	    PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Map<String, Serializable> getExpandoBridgeAttributes(ExpandoBridge expandoBridge,
	    UploadPortletRequest uploadPortletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Serializable getExpandoValue(PortletRequest portletRequest, String name, int type, String displayType)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Serializable getExpandoValue(UploadPortletRequest uploadPortletRequest, String name, int type,
	    String displayType) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getFacebookURL(Portlet portlet, String facebookCanvasPageURL, ThemeDisplay themeDisplay)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Portlet getFirstMyAccountPortlet(ThemeDisplay themeDisplay) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getFirstPageLayoutTypes(PageContext pageContext) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Portlet getFirstSiteAdministrationPortlet(ThemeDisplay themeDisplay) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getFullName(String firstName, String middleName, String lastName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getGlobalLibDir() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getGoogleGadgetURL(Portlet portlet, ThemeDisplay themeDisplay) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getGroupFriendlyURL(Group group, boolean privateLayoutSet, ThemeDisplay themeDisplay)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getGroupFriendlyURL(Group group, boolean privateLayoutSet, ThemeDisplay themeDisplay, Locale locale)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int[] getGroupFriendlyURLIndex(String requestURI) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGroupPermissions(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGroupPermissions(HttpServletRequest request, String className) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGroupPermissions(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGroupPermissions(PortletRequest portletRequest, String className) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGuestPermissions(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGuestPermissions(HttpServletRequest request, String className) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGuestPermissions(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getGuestPermissions(PortletRequest portletRequest, String className) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getHomeURL(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getHost(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getHost(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public HttpServletRequest getHttpServletRequest(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public HttpServletResponse getHttpServletResponse(PortletResponse portletResponse) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getI18nPathLanguageId(Locale locale, String defaultI18nPathLanguageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getJournalArticleActualURL(long groupId, boolean privateLayout, String mainPath, String friendlyURL,
	    Map<String, String[]> params, Map<String, Object> requestContext) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Layout getJournalArticleLayout(long groupId, boolean privateLayout, String friendlyURL)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getJsSafePortletId(String portletId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutActualURL(Layout layout) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutActualURL(Layout layout, String mainPath) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutActualURL(long groupId, boolean privateLayout, String mainPath, String friendlyURL)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutActualURL(long groupId, boolean privateLayout, String mainPath, String friendlyURL,
	    Map<String, String[]> params, Map<String, Object> requestContext) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutEditPage(Layout layout) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutEditPage(String type) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFriendlyURL(Layout layout, ThemeDisplay themeDisplay) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFriendlyURL(Layout layout, ThemeDisplay themeDisplay, Locale locale) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public LayoutFriendlyURLComposite getLayoutFriendlyURLComposite(long groupId, boolean privateLayout,
	    String friendlyURL, Map<String, String[]> params, Map<String, Object> requestContext)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFullURL(Layout layout, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFullURL(Layout layout, ThemeDisplay themeDisplay, boolean doAsUser) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFullURL(long groupId, String portletId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFullURL(long groupId, String portletId, boolean secure) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutFullURL(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutSetFriendlyURL(LayoutSet layoutSet, ThemeDisplay themeDisplay) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutTarget(Layout layout) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutURL(Layout layout, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutURL(Layout layout, ThemeDisplay themeDisplay, boolean doAsUser) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutURL(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutViewPage(Layout layout) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLayoutViewPage(String type) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public LiferayPortletRequest getLiferayPortletRequest(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public LiferayPortletResponse getLiferayPortletResponse(PortletResponse portletResponse) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Locale getLocale(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Locale getLocale(HttpServletRequest request, HttpServletResponse response, boolean initialize) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Locale getLocale(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getLocalizedFriendlyURL(HttpServletRequest request, Layout layout, Locale locale,
	    Locale originalLocale) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getMailId(String mx, String popPortletPrefix, Object... ids) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getNetvibesURL(Portlet portlet, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getNewPortletTitle(String portletTitle, String oldScopeName, String newScopeName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public HttpServletRequest getOriginalServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getParentGroupId(long scopeGroupId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getPathContext() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathContext(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathContext(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathContext(String contextPath) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathFriendlyURLPrivateGroup() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathFriendlyURLPrivateUser() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathFriendlyURLPublic() {
	// This auto-generated method is called by PortalUtil.getPathFriendlyURLPublic() which is called by CommunityService.calculateUrlToCommunity(PortalState, String)
    	//Thus the JUnit-Test fails, because this method returns null.
    	//This is of because org.politaktiv.communityselect.application.TestCommunityService.setupClass() 
    	//Thus, this method now returns "/web" 
    //_log.info("portalMockisCalled");
	return "/web";
    }

    @Override
    public String getPathImage() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathMain() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathModule() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPathProxy() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getPlidFromFriendlyURL(long companyId, String friendlyURL) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getPlidFromPortletId(long groupId, boolean privateLayout, String portletId) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getPlidFromPortletId(long groupId, String portletId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getPortalLibDir() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int getPortalPort() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getPortalPort(boolean secure) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public Properties getPortalProperties() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(HttpServletRequest request, boolean secure) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(Layout layout, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(PortletRequest portletRequest, boolean secure) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(String serverName, int serverPort, boolean secure) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalURL(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortalWebDir() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Set<String> getPortletAddDefaultResourceCheckWhitelist() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Set<String> getPortletAddDefaultResourceCheckWhitelistActions() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<BreadcrumbEntry> getPortletBreadcrumbList(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<BreadcrumbEntry> getPortletBreadcrumbs(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletConfig getPortletConfig(long companyId, String portletId, ServletContext servletContext)
	    throws PortletException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletDescription(Portlet portlet, ServletContext servletContext, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletDescription(Portlet portlet, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletDescription(String portletId, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletDescription(String portletId, String languageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletDescription(String portletId, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletId(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletId(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(Portlet portlet, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(Portlet portlet, ServletContext servletContext, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(Portlet portlet, String languageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(Portlet portlet, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(String portletId, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(String portletId, String languageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletLongTitle(String portletId, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletNamespace(String portletId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(Portlet portlet, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(Portlet portlet, ServletContext servletContext, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(Portlet portlet, String languageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(Portlet portlet, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(RenderRequest renderRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(RenderResponse renderResponse) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(String portletId, Locale locale) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(String portletId, String languageId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletTitle(String portletId, User user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getPortletXmlFileName() throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletPreferences getPreferences(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PreferencesValidator getPreferencesValidator(Portlet portlet) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getRelativeHomeURL(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getScopeGroupId(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(HttpServletRequest request, String portletId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(HttpServletRequest request, String portletId, boolean checkStagingGroup)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(Layout layout) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(Layout layout, String portletId) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(long plid) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getScopeGroupId(PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public User getSelectedUser(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public User getSelectedUser(HttpServletRequest request, boolean checkPermission) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public User getSelectedUser(PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public User getSelectedUser(PortletRequest portletRequest, boolean checkPermission) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getServletContextName() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Map<String, List<Portlet>> getSiteAdministrationCategoriesMap(HttpServletRequest request)
	    throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getSiteAdministrationURL(HttpServletRequest request, ThemeDisplay themeDisplay)
	    throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getSiteAdministrationURL(HttpServletRequest request, ThemeDisplay themeDisplay, String portletName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getSiteAdministrationURL(PortletResponse portletResponse, ThemeDisplay themeDisplay)
	    throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletURL getSiteAdministrationURL(PortletResponse portletResponse, ThemeDisplay themeDisplay,
	    String portletName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long[] getSiteAndCompanyGroupIds(long groupId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long[] getSiteAndCompanyGroupIds(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Locale getSiteDefaultLocale(long groupId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getSiteGroupId(long groupId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getSiteLoginURL(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getStaticResourceURL(HttpServletRequest request, String uri) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getStaticResourceURL(HttpServletRequest request, String uri, long timestamp) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getStaticResourceURL(HttpServletRequest request, String uri, String queryString) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getStaticResourceURL(HttpServletRequest request, String uri, String queryString, long timestamp) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getStrutsAction(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getSystemGroups() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getSystemOrganizationRoles() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getSystemRoles() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String[] getSystemSiteRoles() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUniqueElementId(HttpServletRequest request, String namespace, String id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUniqueElementId(PortletRequest request, String namespace, String id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public UploadPortletRequest getUploadPortletRequest(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public UploadServletRequest getUploadServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Date getUptime() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getURLWithSessionId(String url, String sessionId) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public User getUser(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public User getUser(PortletRequest portletRequest) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserEmailAddress(long userId) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getUserId(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long getUserId(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getUserName(BaseModel<?> baseModel) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserName(long userId, String defaultUserName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserName(long userId, String defaultUserName, HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserName(long userId, String defaultUserName, String userAttribute) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserName(long userId, String defaultUserName, String userAttribute, HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserPassword(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserPassword(HttpSession session) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserPassword(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUserValue(long userId, String param, String defaultValue) throws SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getValidUserId(long companyId, long userId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String getVirtualLayoutActualURL(long groupId, boolean privateLayout, String mainPath, String friendlyURL,
	    Map<String, String[]> params, Map<String, Object> requestContext) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public LayoutFriendlyURLComposite getVirtualLayoutFriendlyURLComposite(boolean privateLayout, String friendlyURL,
	    Map<String, String[]> params, Map<String, Object> requestContext) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getWidgetURL(Portlet portlet, ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void initCustomSQL() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public User initUser(HttpServletRequest request) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void invokeTaglibDiscussion(PortletConfig portletConfig, ActionRequest actionRequest,
	    ActionResponse actionResponse) throws Exception {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean isAllowAddPortletDefaultResource(HttpServletRequest request, Portlet portlet)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCDNDynamicResourcesEnabled(HttpServletRequest request) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCDNDynamicResourcesEnabled(long companyId) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCommunityAdmin(User user, long groupId) throws Exception {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCommunityOwner(User user, long groupId) throws Exception {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCompanyAdmin(User user) throws Exception {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCompanyControlPanelPortlet(String portletId, String category, ThemeDisplay themeDisplay)
	    throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCompanyControlPanelPortlet(String portletId, ThemeDisplay themeDisplay) throws PortalException,
	    SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCompanyControlPanelVisible(ThemeDisplay themeDisplay) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isControlPanelPortlet(String portletId, String category, ThemeDisplay themeDisplay)
	    throws SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isControlPanelPortlet(String portletId, ThemeDisplay themeDisplay) throws SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isGroupAdmin(User user, long groupId) throws Exception {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isGroupFriendlyURL(String fullURL, String groupFriendlyURL, String layoutFriendlyURL) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isGroupOwner(User user, long groupId) throws Exception {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutDescendant(Layout layout, long layoutId) throws PortalException, SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutFirstPageable(Layout layout) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutFirstPageable(String type) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutFriendliable(Layout layout) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutFriendliable(String type) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutParentable(Layout layout) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutParentable(String type) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLayoutSitemapable(Layout layout) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isLoginRedirectRequired(HttpServletRequest request) throws SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isMethodGet(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isMethodPost(PortletRequest portletRequest) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isMultipartRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isOmniadmin(long userId) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isReservedParameter(String name) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isRSSFeedsEnabled() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isSecure(HttpServletRequest request) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isSystemGroup(String groupName) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isSystemRole(String roleName) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isUpdateAvailable() throws SystemException {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isValidResourceId(String resourceId) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public void removePortalPortEventListener(PortalPortEventListener portalPortEventListener) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void resetCDNHosts() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Set<String> resetPortletAddDefaultResourceCheckWhitelist() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Set<String> resetPortletAddDefaultResourceCheckWhitelistActions() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void sendError(Exception e, ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendError(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException,
	    ServletException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendError(int status, Exception e, ActionRequest actionRequest, ActionResponse actionResponse)
	    throws IOException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendError(int status, Exception e, HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendRSSFeedsDisabledError(HttpServletRequest request, HttpServletResponse response) throws IOException,
	    ServletException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendRSSFeedsDisabledError(PortletRequest portletRequest, PortletResponse portletResponse)
	    throws IOException, ServletException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPageDescription(String description, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPageKeywords(String keywords, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPageSubtitle(String subtitle, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPageTitle(String title, HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPortalPort(HttpServletRequest request) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void storePreferences(PortletPreferences portletPreferences) throws IOException, ValidatorException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String[] stripURLAnchor(String url, String separator) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String transformCustomSQL(String sql) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String transformSQL(String sql) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PortletMode updatePortletMode(String portletId, User user, Layout layout, PortletMode portletMode,
	    HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String updateRedirect(String redirect, String oldPath, String newPath) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public WindowState updateWindowState(String portletId, User user, Layout layout, WindowState windowState,
	    HttpServletRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

	

}
