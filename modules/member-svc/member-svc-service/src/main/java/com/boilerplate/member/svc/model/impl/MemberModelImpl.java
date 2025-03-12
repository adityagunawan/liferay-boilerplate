/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.model.impl;

import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.model.MemberModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Member service. Represents a row in the &quot;Boilerplate_Member&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MemberModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MemberImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MemberImpl
 * @generated
 */
@JSON(strict = true)
public class MemberModelImpl
	extends BaseModelImpl<Member> implements MemberModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a member model instance should use the <code>Member</code> interface instead.
	 */
	public static final String TABLE_NAME = "Boilerplate_Member";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"memberId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"fullName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"field1", Types.VARCHAR},
		{"field2", Types.BOOLEAN}, {"field3", Types.INTEGER},
		{"field4", Types.TIMESTAMP}, {"field5", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("memberId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fullName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("field1", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("field2", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("field3", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("field4", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("field5", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Boilerplate_Member (uuid_ VARCHAR(75) null,memberId LONG not null primary key,groupId LONG,companyId LONG,fullName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,field1 VARCHAR(75) null,field2 BOOLEAN,field3 INTEGER,field4 DATE null,field5 VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table Boilerplate_Member";

	public static final String ORDER_BY_JPQL = " ORDER BY member_.field1 ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Boilerplate_Member.field1 ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FIELD2_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FIELD1_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public MemberModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _memberId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMemberId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _memberId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Member.class;
	}

	@Override
	public String getModelClassName() {
		return Member.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Member, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Member, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Member, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Member)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Member, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Member, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Member)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Member, Object>> getAttributeGetterFunctions() {
		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Member, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Member, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Member, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Member, Object>>();

			attributeGetterFunctions.put("uuid", Member::getUuid);
			attributeGetterFunctions.put("memberId", Member::getMemberId);
			attributeGetterFunctions.put("groupId", Member::getGroupId);
			attributeGetterFunctions.put("companyId", Member::getCompanyId);
			attributeGetterFunctions.put("fullName", Member::getFullName);
			attributeGetterFunctions.put("createDate", Member::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", Member::getModifiedDate);
			attributeGetterFunctions.put("field1", Member::getField1);
			attributeGetterFunctions.put("field2", Member::getField2);
			attributeGetterFunctions.put("field3", Member::getField3);
			attributeGetterFunctions.put("field4", Member::getField4);
			attributeGetterFunctions.put("field5", Member::getField5);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Member, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Member, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Member, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Member, String>)Member::setUuid);
			attributeSetterBiConsumers.put(
				"memberId", (BiConsumer<Member, Long>)Member::setMemberId);
			attributeSetterBiConsumers.put(
				"groupId", (BiConsumer<Member, Long>)Member::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId", (BiConsumer<Member, Long>)Member::setCompanyId);
			attributeSetterBiConsumers.put(
				"fullName", (BiConsumer<Member, String>)Member::setFullName);
			attributeSetterBiConsumers.put(
				"createDate", (BiConsumer<Member, Date>)Member::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<Member, Date>)Member::setModifiedDate);
			attributeSetterBiConsumers.put(
				"field1", (BiConsumer<Member, String>)Member::setField1);
			attributeSetterBiConsumers.put(
				"field2", (BiConsumer<Member, Boolean>)Member::setField2);
			attributeSetterBiConsumers.put(
				"field3", (BiConsumer<Member, Integer>)Member::setField3);
			attributeSetterBiConsumers.put(
				"field4", (BiConsumer<Member, Date>)Member::setField4);
			attributeSetterBiConsumers.put(
				"field5", (BiConsumer<Member, String>)Member::setField5);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getMemberId() {
		return _memberId;
	}

	@Override
	public void setMemberId(long memberId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_memberId = memberId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public String getFullName() {
		if (_fullName == null) {
			return "";
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fullName = fullName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getField1() {
		if (_field1 == null) {
			return "";
		}
		else {
			return _field1;
		}
	}

	@Override
	public void setField1(String field1) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_field1 = field1;
	}

	@JSON
	@Override
	public boolean getField2() {
		return _field2;
	}

	@JSON
	@Override
	public boolean isField2() {
		return _field2;
	}

	@Override
	public void setField2(boolean field2) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_field2 = field2;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public boolean getOriginalField2() {
		return GetterUtil.getBoolean(
			this.<Boolean>getColumnOriginalValue("field2"));
	}

	@JSON
	@Override
	public int getField3() {
		return _field3;
	}

	@Override
	public void setField3(int field3) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_field3 = field3;
	}

	@JSON
	@Override
	public Date getField4() {
		return _field4;
	}

	@Override
	public void setField4(Date field4) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_field4 = field4;
	}

	@JSON
	@Override
	public String getField5() {
		if (_field5 == null) {
			return "";
		}
		else {
			return _field5;
		}
	}

	@Override
	public void setField5(String field5) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_field5 = field5;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Member.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Member.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Member toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Member>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MemberImpl memberImpl = new MemberImpl();

		memberImpl.setUuid(getUuid());
		memberImpl.setMemberId(getMemberId());
		memberImpl.setGroupId(getGroupId());
		memberImpl.setCompanyId(getCompanyId());
		memberImpl.setFullName(getFullName());
		memberImpl.setCreateDate(getCreateDate());
		memberImpl.setModifiedDate(getModifiedDate());
		memberImpl.setField1(getField1());
		memberImpl.setField2(isField2());
		memberImpl.setField3(getField3());
		memberImpl.setField4(getField4());
		memberImpl.setField5(getField5());

		memberImpl.resetOriginalValues();

		return memberImpl;
	}

	@Override
	public Member cloneWithOriginalValues() {
		MemberImpl memberImpl = new MemberImpl();

		memberImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		memberImpl.setMemberId(this.<Long>getColumnOriginalValue("memberId"));
		memberImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		memberImpl.setCompanyId(this.<Long>getColumnOriginalValue("companyId"));
		memberImpl.setFullName(this.<String>getColumnOriginalValue("fullName"));
		memberImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		memberImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		memberImpl.setField1(this.<String>getColumnOriginalValue("field1"));
		memberImpl.setField2(this.<Boolean>getColumnOriginalValue("field2"));
		memberImpl.setField3(this.<Integer>getColumnOriginalValue("field3"));
		memberImpl.setField4(this.<Date>getColumnOriginalValue("field4"));
		memberImpl.setField5(this.<String>getColumnOriginalValue("field5"));

		return memberImpl;
	}

	@Override
	public int compareTo(Member member) {
		int value = 0;

		value = getField1().compareTo(member.getField1());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Member)) {
			return false;
		}

		Member member = (Member)object;

		long primaryKey = member.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Member> toCacheModel() {
		MemberCacheModel memberCacheModel = new MemberCacheModel();

		memberCacheModel.uuid = getUuid();

		String uuid = memberCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			memberCacheModel.uuid = null;
		}

		memberCacheModel.memberId = getMemberId();

		memberCacheModel.groupId = getGroupId();

		memberCacheModel.companyId = getCompanyId();

		memberCacheModel.fullName = getFullName();

		String fullName = memberCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			memberCacheModel.fullName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			memberCacheModel.createDate = createDate.getTime();
		}
		else {
			memberCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			memberCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			memberCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		memberCacheModel.field1 = getField1();

		String field1 = memberCacheModel.field1;

		if ((field1 != null) && (field1.length() == 0)) {
			memberCacheModel.field1 = null;
		}

		memberCacheModel.field2 = isField2();

		memberCacheModel.field3 = getField3();

		Date field4 = getField4();

		if (field4 != null) {
			memberCacheModel.field4 = field4.getTime();
		}
		else {
			memberCacheModel.field4 = Long.MIN_VALUE;
		}

		memberCacheModel.field5 = getField5();

		String field5 = memberCacheModel.field5;

		if ((field5 != null) && (field5.length() == 0)) {
			memberCacheModel.field5 = null;
		}

		return memberCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Member, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Member, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Member, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Member)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Member>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Member.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _memberId;
	private long _groupId;
	private long _companyId;
	private String _fullName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _field1;
	private boolean _field2;
	private int _field3;
	private Date _field4;
	private String _field5;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Member, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Member)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("memberId", _memberId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("fullName", _fullName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("field1", _field1);
		_columnOriginalValues.put("field2", _field2);
		_columnOriginalValues.put("field3", _field3);
		_columnOriginalValues.put("field4", _field4);
		_columnOriginalValues.put("field5", _field5);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("memberId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("fullName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("field1", 128L);

		columnBitmasks.put("field2", 256L);

		columnBitmasks.put("field3", 512L);

		columnBitmasks.put("field4", 1024L);

		columnBitmasks.put("field5", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Member _escapedModel;

}