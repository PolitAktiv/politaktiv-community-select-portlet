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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.politaktiv.communityselect.application.CommunityService;
import org.politaktiv.communityselect.application.CommunityView;
import org.politaktiv.communityselect.application.CommunityViewContainer;
import org.politaktiv.communityselect.application.InitializeEvent;
import org.politaktiv.communityselect.application.PortalState;
import org.politaktiv.communityselect.application.SearchEvent;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.util.PortalUtil;

public class TestCommunityService {

	static CommunityService service;

	@BeforeClass
	public static void setupClass() throws PortalException, SystemException {
		PortalUtil pu = new PortalUtil();
		pu.setPortal(new PortalMock());

		HttpUtil hu = new HttpUtil();
		hu.setHttp(new HttpMock());

		service = new CommunityService();
		service.setCommunitiesRepository(new MockCommunitiesRepository());
		service.setMembershipRequestService(new MockMembershipRequestService());
	}

	@Test
	public void testInitiate() throws PortalException, SystemException {
		InitializeEvent initializeEvent = new InitializeEvent(99,
				singedOffPortalState());
		CommunityViewContainer container = service
				.initializeView(initializeEvent);
		assertNotNull(container);
		assertFalse(container.isDirty(singedOffPortalState()));
		assertTrue(container.isDirty(new PortalState(true, null,
				"localhost:8080", false, "", "")));

		// signed out
		List<CommunityView> communityViewList = container
				.getMemberCommunities();
		assertNotNull(communityViewList);
		assertEquals(0, communityViewList.size());

		communityViewList = container.getNonMemberOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(7, communityViewList.size());

		communityViewList = container.getOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(7, communityViewList.size());
		
		communityViewList = container.getRestrictedCommunities();
		assertNotNull(communityViewList);
		assertEquals(6, communityViewList.size());
	}

	@Test
	public void testPortalStateSwitchesToSignedIn() throws PortalException,
			SystemException {
		InitializeEvent initializeEvent = new InitializeEvent(99,
				singedOffPortalState());
		CommunityViewContainer container = service
				.initializeView(initializeEvent);

		container = service.calculateView(container, new PortalState(true,
				new MockUser(), "localhost:8080", false, "", ""));

		List<CommunityView> communityViewList = container
				.getMemberCommunities();
		assertNotNull(communityViewList);
		assertEquals(3, communityViewList.size());

		communityViewList = container.getNonMemberOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(5, communityViewList.size());
		
		communityViewList = container.getOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(7, communityViewList.size());

		communityViewList = container.getRestrictedCommunities();
		assertNotNull(communityViewList);
		assertEquals(6, communityViewList.size());
	}
	
	@Test
	public void testPortalSearch() throws PortalException,
			SystemException {
		InitializeEvent initializeEvent = new InitializeEvent(99,
				singedOffPortalState());
		CommunityViewContainer container = service
				.initializeView(initializeEvent);

		SearchEvent searchEvent = new SearchEvent(99, "withLogo",
				singedOffPortalState());
		container = service.searchCommunity(container, searchEvent);

		List<CommunityView> communityViewList = container
				.getMemberCommunities();
		assertNotNull(communityViewList);
		assertEquals(0, communityViewList.size());

		communityViewList = container.getNonMemberOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(5, communityViewList.size());
		
		communityViewList = container.getOpenCommunities();
		assertNotNull(communityViewList);
		assertEquals(5, communityViewList.size());

		communityViewList = container.getRestrictedCommunities();
		assertNotNull(communityViewList);
		assertEquals(4, communityViewList.size());		
	}

	@Test
	public void testCalculateUrlToCommunity() {
		String url = service.calculateUrlToCommunity(singedOffPortalState(), "/test");
		assertEquals("localhost:8080/web/test", url);
		
		url = service.calculateUrlToCommunity(new PortalState(false, null, "localhost:8080", true, "/en", ""), "/test");
		assertEquals("localhost:8080/en/web/test", url);
	}

	PortalState singedOffPortalState() {
		return new PortalState(false, null, "localhost:8080", false, "", "");
	}

}
