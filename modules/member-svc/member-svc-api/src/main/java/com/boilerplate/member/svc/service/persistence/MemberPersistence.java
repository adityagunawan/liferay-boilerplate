/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.service.persistence;

import com.boilerplate.member.svc.exception.NoSuchMemberException;
import com.boilerplate.member.svc.model.Member;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the member service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MemberUtil
 * @generated
 */
@ProviderType
public interface MemberPersistence extends BasePersistence<Member> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MemberUtil} to access the member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the members where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching members
	 */
	public java.util.List<Member> findByUuid(String uuid);

	/**
	 * Returns a range of all the members where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @return the range of matching members
	 */
	public java.util.List<Member> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the members where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns an ordered range of all the members where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first member in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the first member in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the last member in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the last member in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the members before and after the current member in the ordered set where uuid = &#63;.
	 *
	 * @param memberId the primary key of the current member
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next member
	 * @throws NoSuchMemberException if a member with the primary key could not be found
	 */
	public Member[] findByUuid_PrevAndNext(
			long memberId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Removes all the members where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of members where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching members
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the member where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMemberException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByUUID_G(String uuid, long groupId)
		throws NoSuchMemberException;

	/**
	 * Returns the member where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the member where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the member where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the member that was removed
	 */
	public Member removeByUUID_G(String uuid, long groupId)
		throws NoSuchMemberException;

	/**
	 * Returns the number of members where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching members
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the members where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching members
	 */
	public java.util.List<Member> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the members where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @return the range of matching members
	 */
	public java.util.List<Member> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the members where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns an ordered range of all the members where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first member in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the first member in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the last member in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the last member in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the members before and after the current member in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param memberId the primary key of the current member
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next member
	 * @throws NoSuchMemberException if a member with the primary key could not be found
	 */
	public Member[] findByUuid_C_PrevAndNext(
			long memberId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Removes all the members where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of members where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching members
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the members where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching members
	 */
	public java.util.List<Member> findByField2(boolean field2);

	/**
	 * Returns a range of all the members where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @return the range of matching members
	 */
	public java.util.List<Member> findByField2(
		boolean field2, int start, int end);

	/**
	 * Returns an ordered range of all the members where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns an ordered range of all the members where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching members
	 */
	public java.util.List<Member> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first member in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the first member in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the last member in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member
	 * @throws NoSuchMemberException if a matching member could not be found
	 */
	public Member findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Returns the last member in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching member, or <code>null</code> if a matching member could not be found
	 */
	public Member fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns the members before and after the current member in the ordered set where field2 = &#63;.
	 *
	 * @param memberId the primary key of the current member
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next member
	 * @throws NoSuchMemberException if a member with the primary key could not be found
	 */
	public Member[] findByField2_PrevAndNext(
			long memberId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Member>
				orderByComparator)
		throws NoSuchMemberException;

	/**
	 * Removes all the members where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of members where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching members
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the member in the entity cache if it is enabled.
	 *
	 * @param member the member
	 */
	public void cacheResult(Member member);

	/**
	 * Caches the members in the entity cache if it is enabled.
	 *
	 * @param members the members
	 */
	public void cacheResult(java.util.List<Member> members);

	/**
	 * Creates a new member with the primary key. Does not add the member to the database.
	 *
	 * @param memberId the primary key for the new member
	 * @return the new member
	 */
	public Member create(long memberId);

	/**
	 * Removes the member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param memberId the primary key of the member
	 * @return the member that was removed
	 * @throws NoSuchMemberException if a member with the primary key could not be found
	 */
	public Member remove(long memberId) throws NoSuchMemberException;

	public Member updateImpl(Member member);

	/**
	 * Returns the member with the primary key or throws a <code>NoSuchMemberException</code> if it could not be found.
	 *
	 * @param memberId the primary key of the member
	 * @return the member
	 * @throws NoSuchMemberException if a member with the primary key could not be found
	 */
	public Member findByPrimaryKey(long memberId) throws NoSuchMemberException;

	/**
	 * Returns the member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param memberId the primary key of the member
	 * @return the member, or <code>null</code> if a member with the primary key could not be found
	 */
	public Member fetchByPrimaryKey(long memberId);

	/**
	 * Returns all the members.
	 *
	 * @return the members
	 */
	public java.util.List<Member> findAll();

	/**
	 * Returns a range of all the members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @return the range of members
	 */
	public java.util.List<Member> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of members
	 */
	public java.util.List<Member> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator);

	/**
	 * Returns an ordered range of all the members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MemberModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of members
	 */
	public java.util.List<Member> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Member>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the members from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of members.
	 *
	 * @return the number of members
	 */
	public int countAll();

}