/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.boilerplate.member.svc.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MemberLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MemberLocalService
 * @generated
 */
public class MemberLocalServiceWrapper
	implements MemberLocalService, ServiceWrapper<MemberLocalService> {

	public MemberLocalServiceWrapper() {
		this(null);
	}

	public MemberLocalServiceWrapper(MemberLocalService memberLocalService) {
		_memberLocalService = memberLocalService;
	}

	/**
	 * Adds the member to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MemberLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param member the member
	 * @return the member that was added
	 */
	@Override
	public com.boilerplate.member.svc.model.Member addMember(
		com.boilerplate.member.svc.model.Member member) {

		return _memberLocalService.addMember(member);
	}

	/**
	 * Creates a new member with the primary key. Does not add the member to the database.
	 *
	 * @param memberId the primary key for the new member
	 * @return the new member
	 */
	@Override
	public com.boilerplate.member.svc.model.Member createMember(long memberId) {
		return _memberLocalService.createMember(memberId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MemberLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param memberId the primary key of the member
	 * @return the member that was removed
	 * @throws PortalException if a member with the primary key could not be found
	 */
	@Override
	public com.boilerplate.member.svc.model.Member deleteMember(long memberId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.deleteMember(memberId);
	}

	/**
	 * Deletes the member from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MemberLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param member the member
	 * @return the member that was removed
	 */
	@Override
	public com.boilerplate.member.svc.model.Member deleteMember(
		com.boilerplate.member.svc.model.Member member) {

		return _memberLocalService.deleteMember(member);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _memberLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _memberLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _memberLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _memberLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.boilerplate.member.svc.model.impl.MemberModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _memberLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.boilerplate.member.svc.model.impl.MemberModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _memberLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _memberLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _memberLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.boilerplate.member.svc.model.Member fetchMember(long memberId) {
		return _memberLocalService.fetchMember(memberId);
	}

	/**
	 * Returns the member matching the UUID and group.
	 *
	 * @param uuid the member's UUID
	 * @param groupId the primary key of the group
	 * @return the matching member, or <code>null</code> if a matching member could not be found
	 */
	@Override
	public com.boilerplate.member.svc.model.Member fetchMemberByUuidAndGroupId(
		String uuid, long groupId) {

		return _memberLocalService.fetchMemberByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _memberLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _memberLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _memberLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the member with the primary key.
	 *
	 * @param memberId the primary key of the member
	 * @return the member
	 * @throws PortalException if a member with the primary key could not be found
	 */
	@Override
	public com.boilerplate.member.svc.model.Member getMember(long memberId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.getMember(memberId);
	}

	/**
	 * Returns the member matching the UUID and group.
	 *
	 * @param uuid the member's UUID
	 * @param groupId the primary key of the group
	 * @return the matching member
	 * @throws PortalException if a matching member could not be found
	 */
	@Override
	public com.boilerplate.member.svc.model.Member getMemberByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.getMemberByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.boilerplate.member.svc.model.impl.MemberModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @return the range of members
	 */
	@Override
	public java.util.List<com.boilerplate.member.svc.model.Member> getMembers(
		int start, int end) {

		return _memberLocalService.getMembers(start, end);
	}

	/**
	 * Returns all the members matching the UUID and company.
	 *
	 * @param uuid the UUID of the members
	 * @param companyId the primary key of the company
	 * @return the matching members, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.boilerplate.member.svc.model.Member>
		getMembersByUuidAndCompanyId(String uuid, long companyId) {

		return _memberLocalService.getMembersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of members matching the UUID and company.
	 *
	 * @param uuid the UUID of the members
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of members
	 * @param end the upper bound of the range of members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching members, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.boilerplate.member.svc.model.Member>
		getMembersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.boilerplate.member.svc.model.Member> orderByComparator) {

		return _memberLocalService.getMembersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of members.
	 *
	 * @return the number of members
	 */
	@Override
	public int getMembersCount() {
		return _memberLocalService.getMembersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _memberLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _memberLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the member in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MemberLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param member the member
	 * @return the member that was updated
	 */
	@Override
	public com.boilerplate.member.svc.model.Member updateMember(
		com.boilerplate.member.svc.model.Member member) {

		return _memberLocalService.updateMember(member);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _memberLocalService.getBasePersistence();
	}

	@Override
	public MemberLocalService getWrappedService() {
		return _memberLocalService;
	}

	@Override
	public void setWrappedService(MemberLocalService memberLocalService) {
		_memberLocalService = memberLocalService;
	}

	private MemberLocalService _memberLocalService;

}