/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Member}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Member
 * @generated
 */
public class MemberWrapper
	extends BaseModelWrapper<Member> implements Member, ModelWrapper<Member> {

	public MemberWrapper(Member member) {
		super(member);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("memberId", getMemberId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("fullName", getFullName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long memberId = (Long)attributes.get("memberId");

		if (memberId != null) {
			setMemberId(memberId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	@Override
	public Member cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this member.
	 *
	 * @return the company ID of this member
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this member.
	 *
	 * @return the create date of this member
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the field1 of this member.
	 *
	 * @return the field1 of this member
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this member.
	 *
	 * @return the field2 of this member
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this member.
	 *
	 * @return the field3 of this member
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field4 of this member.
	 *
	 * @return the field4 of this member
	 */
	@Override
	public Date getField4() {
		return model.getField4();
	}

	/**
	 * Returns the field5 of this member.
	 *
	 * @return the field5 of this member
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the full name of this member.
	 *
	 * @return the full name of this member
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the group ID of this member.
	 *
	 * @return the group ID of this member
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the member ID of this member.
	 *
	 * @return the member ID of this member
	 */
	@Override
	public long getMemberId() {
		return model.getMemberId();
	}

	/**
	 * Returns the modified date of this member.
	 *
	 * @return the modified date of this member
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this member.
	 *
	 * @return the primary key of this member
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this member.
	 *
	 * @return the uuid of this member
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this member is field2.
	 *
	 * @return <code>true</code> if this member is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this member.
	 *
	 * @param companyId the company ID of this member
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this member.
	 *
	 * @param createDate the create date of this member
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the field1 of this member.
	 *
	 * @param field1 the field1 of this member
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this member is field2.
	 *
	 * @param field2 the field2 of this member
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this member.
	 *
	 * @param field3 the field3 of this member
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field4 of this member.
	 *
	 * @param field4 the field4 of this member
	 */
	@Override
	public void setField4(Date field4) {
		model.setField4(field4);
	}

	/**
	 * Sets the field5 of this member.
	 *
	 * @param field5 the field5 of this member
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the full name of this member.
	 *
	 * @param fullName the full name of this member
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the group ID of this member.
	 *
	 * @param groupId the group ID of this member
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the member ID of this member.
	 *
	 * @param memberId the member ID of this member
	 */
	@Override
	public void setMemberId(long memberId) {
		model.setMemberId(memberId);
	}

	/**
	 * Sets the modified date of this member.
	 *
	 * @param modifiedDate the modified date of this member
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this member.
	 *
	 * @param primaryKey the primary key of this member
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this member.
	 *
	 * @param uuid the uuid of this member
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MemberWrapper wrap(Member member) {
		return new MemberWrapper(member);
	}

}