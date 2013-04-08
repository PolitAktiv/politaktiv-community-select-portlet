package org.politaktiv.communityselect.application;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.MembershipRequestConstants;
import com.liferay.portal.service.MembershipRequestLocalServiceUtil;

public class MembershipRequestService {

	public boolean isUserMembershipRequestPending(long userId, long communityId)
			throws SystemException {
		return MembershipRequestLocalServiceUtil.hasMembershipRequest(userId,
				communityId, MembershipRequestConstants.STATUS_PENDING);
	}

}
