/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.powwow.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for PowwowMeeting. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Shinn Lok
 * @see PowwowMeetingServiceUtil
 * @see com.liferay.powwow.service.base.PowwowMeetingServiceBaseImpl
 * @see com.liferay.powwow.service.impl.PowwowMeetingServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PowwowMeetingService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PowwowMeetingServiceUtil} to access the powwow meeting remote service. Add custom service methods to {@link com.liferay.powwow.service.impl.PowwowMeetingServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public com.liferay.powwow.model.PowwowMeeting addPowwowMeeting(
		long groupId, java.lang.String portletId, long powwowServerId,
		java.lang.String name, java.lang.String description,
		java.lang.String providerType,
		java.util.Map<java.lang.String, java.io.Serializable> providerTypeMetadataMap,
		java.lang.String languageId, long calendarBookingId, int status,
		java.util.List<com.liferay.powwow.model.PowwowParticipant> powwowParticipants,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.powwow.model.PowwowMeeting deletePowwowMeeting(
		long powwowMeetingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.powwow.model.PowwowMeeting getPowwowMeeting(
		long powwowMeetingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.powwow.model.PowwowMeeting> getPowwowMeetings(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPowwowMeetingsCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.powwow.model.PowwowMeeting updatePowwowMeeting(
		long powwowMeetingId, long powwowServerId, java.lang.String name,
		java.lang.String description, java.lang.String providerType,
		java.util.Map<java.lang.String, java.io.Serializable> providerTypeMetadataMap,
		java.lang.String languageId, long calendarBookingId, int status,
		java.util.List<com.liferay.powwow.model.PowwowParticipant> powwowParticipants,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}