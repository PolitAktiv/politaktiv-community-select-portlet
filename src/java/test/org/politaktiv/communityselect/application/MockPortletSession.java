package org.politaktiv.communityselect.application;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletContext;
import javax.portlet.PortletSession;

import org.politaktiv.communityselect.domain.Community;

import com.liferay.portal.model.GroupConstants;

public class MockPortletSession implements PortletSession {

	@Override
	public Object getAttribute(String arg0) {
		List<Community> communityList = new ArrayList<Community>();
		communityList.add(new Community("withoutLogo 1", 1, 20, "url", GroupConstants.TYPE_SITE_OPEN));		
		communityList.add(new Community("withoutLogo 2", 2, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withoutLogo 3", 3, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 4", 4, 44, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 5", 5, 45, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 6", 6, 46, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 7", 7, 47, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogo 8", 8, 48, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 9", 9, 49, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogo 10", 10, 50, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		communityList.add(new Community("withLogoAndUser 21", 21, 51, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withLogoAndUser 22", 22, 52, 20, "url", GroupConstants.TYPE_SITE_OPEN));
		communityList.add(new Community("withoutLogoAndUser 23", 23, 20, "url", GroupConstants.TYPE_SITE_RESTRICTED));
		return communityList;
	}

	@Override
	public Object getAttribute(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getAttributeMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getAttributeMap(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCreationTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getLastAccessedTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxInactiveInterval() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PortletContext getPortletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void invalidate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAttribute(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAttribute(String arg0, Object arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMaxInactiveInterval(int arg0) {
		// TODO Auto-generated method stub

	}

}
