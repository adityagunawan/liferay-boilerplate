/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MemberService}.
 *
 * @author Brian Wing Shun Chan
 * @see MemberService
 * @generated
 */
public class MemberServiceWrapper
	implements MemberService, ServiceWrapper<MemberService> {

	public MemberServiceWrapper() {
		this(null);
	}

	public MemberServiceWrapper(MemberService memberService) {
		_memberService = memberService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _memberService.getOSGiServiceIdentifier();
	}

	@Override
	public MemberService getWrappedService() {
		return _memberService;
	}

	@Override
	public void setWrappedService(MemberService memberService) {
		_memberService = memberService;
	}

	private MemberService _memberService;

}