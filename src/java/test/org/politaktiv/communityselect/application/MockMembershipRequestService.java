package org.politaktiv.communityselect.application;

import org.politaktiv.communityselect.application.MembershipRequestService;

import com.liferay.portal.kernel.exception.SystemException;

public class MockMembershipRequestService extends MembershipRequestService {

	@Override
	public boolean isUserMembershipRequestPending(long userId, long communityId)
			throws SystemException {
		return true;
	}

}
