/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Boilerplate_Member&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Member
 * @generated
 */
public class MemberTable extends BaseTable<MemberTable> {

	public static final MemberTable INSTANCE = new MemberTable();

	public final Column<MemberTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Long> memberId = createColumn(
		"memberId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MemberTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MemberTable, String> fullName = createColumn(
		"fullName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MemberTable, String> field1 = createColumn(
		"field1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Boolean> field2 = createColumn(
		"field2", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Integer> field3 = createColumn(
		"field3", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<MemberTable, Date> field4 = createColumn(
		"field4", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MemberTable, String> field5 = createColumn(
		"field5", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MemberTable() {
		super("Boilerplate_Member", MemberTable::new);
	}

}