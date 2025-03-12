/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.model.impl;

import com.boilerplate.member.svc.model.Member;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Member in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MemberCacheModel implements CacheModel<Member>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MemberCacheModel)) {
			return false;
		}

		MemberCacheModel memberCacheModel = (MemberCacheModel)object;

		if (memberId == memberCacheModel.memberId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, memberId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", memberId=");
		sb.append(memberId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Member toEntityModel() {
		MemberImpl memberImpl = new MemberImpl();

		if (uuid == null) {
			memberImpl.setUuid("");
		}
		else {
			memberImpl.setUuid(uuid);
		}

		memberImpl.setMemberId(memberId);
		memberImpl.setGroupId(groupId);
		memberImpl.setCompanyId(companyId);

		if (fullName == null) {
			memberImpl.setFullName("");
		}
		else {
			memberImpl.setFullName(fullName);
		}

		if (createDate == Long.MIN_VALUE) {
			memberImpl.setCreateDate(null);
		}
		else {
			memberImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			memberImpl.setModifiedDate(null);
		}
		else {
			memberImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			memberImpl.setField1("");
		}
		else {
			memberImpl.setField1(field1);
		}

		memberImpl.setField2(field2);
		memberImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			memberImpl.setField4(null);
		}
		else {
			memberImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			memberImpl.setField5("");
		}
		else {
			memberImpl.setField5(field5);
		}

		memberImpl.resetOriginalValues();

		return memberImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		memberId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		fullName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(memberId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long memberId;
	public long groupId;
	public long companyId;
	public String fullName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;

}