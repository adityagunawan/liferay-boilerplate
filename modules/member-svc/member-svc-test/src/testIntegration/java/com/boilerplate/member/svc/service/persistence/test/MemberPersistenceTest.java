/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.service.persistence.test;

import com.boilerplate.member.svc.exception.NoSuchMemberException;
import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.service.MemberLocalServiceUtil;
import com.boilerplate.member.svc.service.persistence.MemberPersistence;
import com.boilerplate.member.svc.service.persistence.MemberUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class MemberPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.boilerplate.member.svc.service"));

	@Before
	public void setUp() {
		_persistence = MemberUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Member> iterator = _members.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Member member = _persistence.create(pk);

		Assert.assertNotNull(member);

		Assert.assertEquals(member.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Member newMember = addMember();

		_persistence.remove(newMember);

		Member existingMember = _persistence.fetchByPrimaryKey(
			newMember.getPrimaryKey());

		Assert.assertNull(existingMember);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addMember();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Member newMember = _persistence.create(pk);

		newMember.setUuid(RandomTestUtil.randomString());

		newMember.setGroupId(RandomTestUtil.nextLong());

		newMember.setCompanyId(RandomTestUtil.nextLong());

		newMember.setFullName(RandomTestUtil.randomString());

		newMember.setCreateDate(RandomTestUtil.nextDate());

		newMember.setModifiedDate(RandomTestUtil.nextDate());

		newMember.setField1(RandomTestUtil.randomString());

		newMember.setField2(RandomTestUtil.randomBoolean());

		newMember.setField3(RandomTestUtil.nextInt());

		newMember.setField4(RandomTestUtil.nextDate());

		newMember.setField5(RandomTestUtil.randomString());

		_members.add(_persistence.update(newMember));

		Member existingMember = _persistence.findByPrimaryKey(
			newMember.getPrimaryKey());

		Assert.assertEquals(existingMember.getUuid(), newMember.getUuid());
		Assert.assertEquals(
			existingMember.getMemberId(), newMember.getMemberId());
		Assert.assertEquals(
			existingMember.getGroupId(), newMember.getGroupId());
		Assert.assertEquals(
			existingMember.getCompanyId(), newMember.getCompanyId());
		Assert.assertEquals(
			existingMember.getFullName(), newMember.getFullName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingMember.getCreateDate()),
			Time.getShortTimestamp(newMember.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingMember.getModifiedDate()),
			Time.getShortTimestamp(newMember.getModifiedDate()));
		Assert.assertEquals(existingMember.getField1(), newMember.getField1());
		Assert.assertEquals(existingMember.isField2(), newMember.isField2());
		Assert.assertEquals(existingMember.getField3(), newMember.getField3());
		Assert.assertEquals(
			Time.getShortTimestamp(existingMember.getField4()),
			Time.getShortTimestamp(newMember.getField4()));
		Assert.assertEquals(existingMember.getField5(), newMember.getField5());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByField2() throws Exception {
		_persistence.countByField2(RandomTestUtil.randomBoolean());

		_persistence.countByField2(RandomTestUtil.randomBoolean());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Member newMember = addMember();

		Member existingMember = _persistence.findByPrimaryKey(
			newMember.getPrimaryKey());

		Assert.assertEquals(existingMember, newMember);
	}

	@Test(expected = NoSuchMemberException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Member> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Boilerplate_Member", "uuid", true, "memberId", true, "groupId",
			true, "companyId", true, "fullName", true, "createDate", true,
			"modifiedDate", true, "field1", true, "field2", true, "field3",
			true, "field4", true, "field5", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Member newMember = addMember();

		Member existingMember = _persistence.fetchByPrimaryKey(
			newMember.getPrimaryKey());

		Assert.assertEquals(existingMember, newMember);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Member missingMember = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingMember);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Member newMember1 = addMember();
		Member newMember2 = addMember();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newMember1.getPrimaryKey());
		primaryKeys.add(newMember2.getPrimaryKey());

		Map<Serializable, Member> members = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, members.size());
		Assert.assertEquals(
			newMember1, members.get(newMember1.getPrimaryKey()));
		Assert.assertEquals(
			newMember2, members.get(newMember2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Member> members = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(members.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Member newMember = addMember();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newMember.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Member> members = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, members.size());
		Assert.assertEquals(newMember, members.get(newMember.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Member> members = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(members.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Member newMember = addMember();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newMember.getPrimaryKey());

		Map<Serializable, Member> members = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, members.size());
		Assert.assertEquals(newMember, members.get(newMember.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			MemberLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Member>() {

				@Override
				public void performAction(Member member) {
					Assert.assertNotNull(member);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Member newMember = addMember();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Member.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("memberId", newMember.getMemberId()));

		List<Member> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Member existingMember = result.get(0);

		Assert.assertEquals(existingMember, newMember);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Member.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("memberId", RandomTestUtil.nextLong()));

		List<Member> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Member newMember = addMember();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Member.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("memberId"));

		Object newMemberId = newMember.getMemberId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("memberId", new Object[] {newMemberId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingMemberId = result.get(0);

		Assert.assertEquals(existingMemberId, newMemberId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Member.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("memberId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"memberId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Member newMember = addMember();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newMember.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		Member newMember = addMember();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Member.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("memberId", newMember.getMemberId()));

		List<Member> result = _persistence.findWithDynamicQuery(dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Member member) {
		Assert.assertEquals(
			member.getUuid(),
			ReflectionTestUtil.invoke(
				member, "getColumnOriginalValue", new Class<?>[] {String.class},
				"uuid_"));
		Assert.assertEquals(
			Long.valueOf(member.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				member, "getColumnOriginalValue", new Class<?>[] {String.class},
				"groupId"));
	}

	protected Member addMember() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Member member = _persistence.create(pk);

		member.setUuid(RandomTestUtil.randomString());

		member.setGroupId(RandomTestUtil.nextLong());

		member.setCompanyId(RandomTestUtil.nextLong());

		member.setFullName(RandomTestUtil.randomString());

		member.setCreateDate(RandomTestUtil.nextDate());

		member.setModifiedDate(RandomTestUtil.nextDate());

		member.setField1(RandomTestUtil.randomString());

		member.setField2(RandomTestUtil.randomBoolean());

		member.setField3(RandomTestUtil.nextInt());

		member.setField4(RandomTestUtil.nextDate());

		member.setField5(RandomTestUtil.randomString());

		_members.add(_persistence.update(member));

		return member;
	}

	private List<Member> _members = new ArrayList<Member>();
	private MemberPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}