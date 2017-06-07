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

package com.liferay.powwow.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import com.liferay.expando.kernel.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PowwowMeeting service. Represents a row in the &quot;PowwowMeeting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.powwow.model.impl.PowwowMeetingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.powwow.model.impl.PowwowMeetingImpl}.
 * </p>
 *
 * @author Shinn Lok
 * @see PowwowMeeting
 * @see com.liferay.powwow.model.impl.PowwowMeetingImpl
 * @see com.liferay.powwow.model.impl.PowwowMeetingModelImpl
 * @generated
 */
public interface PowwowMeetingModel extends BaseModel<PowwowMeeting>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a powwow meeting model instance should use the {@link PowwowMeeting} interface instead.
	 */

	/**
	 * Returns the primary key of this powwow meeting.
	 *
	 * @return the primary key of this powwow meeting
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this powwow meeting.
	 *
	 * @param primaryKey the primary key of this powwow meeting
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the powwow meeting ID of this powwow meeting.
	 *
	 * @return the powwow meeting ID of this powwow meeting
	 */
	public long getPowwowMeetingId();

	/**
	 * Sets the powwow meeting ID of this powwow meeting.
	 *
	 * @param powwowMeetingId the powwow meeting ID of this powwow meeting
	 */
	public void setPowwowMeetingId(long powwowMeetingId);

	/**
	 * Returns the group ID of this powwow meeting.
	 *
	 * @return the group ID of this powwow meeting
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this powwow meeting.
	 *
	 * @param groupId the group ID of this powwow meeting
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this powwow meeting.
	 *
	 * @return the company ID of this powwow meeting
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this powwow meeting.
	 *
	 * @param companyId the company ID of this powwow meeting
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this powwow meeting.
	 *
	 * @return the user ID of this powwow meeting
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this powwow meeting.
	 *
	 * @param userId the user ID of this powwow meeting
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this powwow meeting.
	 *
	 * @return the user uuid of this powwow meeting
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this powwow meeting.
	 *
	 * @param userUuid the user uuid of this powwow meeting
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this powwow meeting.
	 *
	 * @return the user name of this powwow meeting
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this powwow meeting.
	 *
	 * @param userName the user name of this powwow meeting
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this powwow meeting.
	 *
	 * @return the create date of this powwow meeting
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this powwow meeting.
	 *
	 * @param createDate the create date of this powwow meeting
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this powwow meeting.
	 *
	 * @return the modified date of this powwow meeting
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this powwow meeting.
	 *
	 * @param modifiedDate the modified date of this powwow meeting
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the powwow server ID of this powwow meeting.
	 *
	 * @return the powwow server ID of this powwow meeting
	 */
	public long getPowwowServerId();

	/**
	 * Sets the powwow server ID of this powwow meeting.
	 *
	 * @param powwowServerId the powwow server ID of this powwow meeting
	 */
	public void setPowwowServerId(long powwowServerId);

	/**
	 * Returns the name of this powwow meeting.
	 *
	 * @return the name of this powwow meeting
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this powwow meeting.
	 *
	 * @param name the name of this powwow meeting
	 */
	public void setName(String name);

	/**
	 * Returns the description of this powwow meeting.
	 *
	 * @return the description of this powwow meeting
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this powwow meeting.
	 *
	 * @param description the description of this powwow meeting
	 */
	public void setDescription(String description);

	/**
	 * Returns the provider type of this powwow meeting.
	 *
	 * @return the provider type of this powwow meeting
	 */
	@AutoEscape
	public String getProviderType();

	/**
	 * Sets the provider type of this powwow meeting.
	 *
	 * @param providerType the provider type of this powwow meeting
	 */
	public void setProviderType(String providerType);

	/**
	 * Returns the provider type metadata of this powwow meeting.
	 *
	 * @return the provider type metadata of this powwow meeting
	 */
	@AutoEscape
	public String getProviderTypeMetadata();

	/**
	 * Sets the provider type metadata of this powwow meeting.
	 *
	 * @param providerTypeMetadata the provider type metadata of this powwow meeting
	 */
	public void setProviderTypeMetadata(String providerTypeMetadata);

	/**
	 * Returns the language ID of this powwow meeting.
	 *
	 * @return the language ID of this powwow meeting
	 */
	@AutoEscape
	public String getLanguageId();

	/**
	 * Sets the language ID of this powwow meeting.
	 *
	 * @param languageId the language ID of this powwow meeting
	 */
	public void setLanguageId(String languageId);

	/**
	 * Returns the calendar booking ID of this powwow meeting.
	 *
	 * @return the calendar booking ID of this powwow meeting
	 */
	public long getCalendarBookingId();

	/**
	 * Sets the calendar booking ID of this powwow meeting.
	 *
	 * @param calendarBookingId the calendar booking ID of this powwow meeting
	 */
	public void setCalendarBookingId(long calendarBookingId);

	/**
	 * Returns the status of this powwow meeting.
	 *
	 * @return the status of this powwow meeting
	 */
	public int getStatus();

	/**
	 * Sets the status of this powwow meeting.
	 *
	 * @param status the status of this powwow meeting
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.powwow.model.PowwowMeeting powwowMeeting);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.powwow.model.PowwowMeeting> toCacheModel();

	@Override
	public com.liferay.powwow.model.PowwowMeeting toEscapedModel();

	@Override
	public com.liferay.powwow.model.PowwowMeeting toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}