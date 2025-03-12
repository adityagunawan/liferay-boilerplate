/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Member service. Represents a row in the &quot;Boilerplate_Member&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MemberModel
 * @generated
 */
@ImplementationClassName("com.boilerplate.member.svc.model.impl.MemberImpl")
@ProviderType
public interface Member extends MemberModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.boilerplate.member.svc.model.impl.MemberImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Member, Long> MEMBER_ID_ACCESSOR =
		new Accessor<Member, Long>() {

			@Override
			public Long get(Member member) {
				return member.getMemberId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Member> getTypeClass() {
				return Member.class;
			}

		};

}