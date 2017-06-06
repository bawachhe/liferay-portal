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
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PowwowServer service. Represents a row in the &quot;PowwowServer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.powwow.model.impl.PowwowServerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.powwow.model.impl.PowwowServerImpl}.
 * </p>
 *
 * @author Shinn Lok
 * @see PowwowServer
 * @see com.liferay.powwow.model.impl.PowwowServerImpl
 * @see com.liferay.powwow.model.impl.PowwowServerModelImpl
 * @generated
 */
public interface PowwowServerModel extends AuditedModel, BaseModel<PowwowServer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a powwow server model instance should use the {@link PowwowServer} interface instead.
	 */

	/**
	 * Returns the primary key of this powwow server.
	 *
	 * @return the primary key of this powwow server
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this powwow server.
	 *
	 * @param primaryKey the primary key of this powwow server
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the powwow server ID of this powwow server.
	 *
	 * @return the powwow server ID of this powwow server
	 */
	public long getPowwowServerId();

	/**
	 * Sets the powwow server ID of this powwow server.
	 *
	 * @param powwowServerId the powwow server ID of this powwow server
	 */
	public void setPowwowServerId(long powwowServerId);

	/**
	 * Returns the company ID of this powwow server.
	 *
	 * @return the company ID of this powwow server
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this powwow server.
	 *
	 * @param companyId the company ID of this powwow server
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this powwow server.
	 *
	 * @return the user ID of this powwow server
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this powwow server.
	 *
	 * @param userId the user ID of this powwow server
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this powwow server.
	 *
	 * @return the user uuid of this powwow server
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this powwow server.
	 *
	 * @param userUuid the user uuid of this powwow server
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this powwow server.
	 *
	 * @return the user name of this powwow server
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this powwow server.
	 *
	 * @param userName the user name of this powwow server
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this powwow server.
	 *
	 * @return the create date of this powwow server
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this powwow server.
	 *
	 * @param createDate the create date of this powwow server
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this powwow server.
	 *
	 * @return the modified date of this powwow server
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this powwow server.
	 *
	 * @param modifiedDate the modified date of this powwow server
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this powwow server.
	 *
	 * @return the name of this powwow server
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this powwow server.
	 *
	 * @param name the name of this powwow server
	 */
	public void setName(String name);

	/**
	 * Returns the provider type of this powwow server.
	 *
	 * @return the provider type of this powwow server
	 */
	@AutoEscape
	public String getProviderType();

	/**
	 * Sets the provider type of this powwow server.
	 *
	 * @param providerType the provider type of this powwow server
	 */
	public void setProviderType(String providerType);

	/**
	 * Returns the url of this powwow server.
	 *
	 * @return the url of this powwow server
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this powwow server.
	 *
	 * @param url the url of this powwow server
	 */
	public void setUrl(String url);

	/**
	 * Returns the api key of this powwow server.
	 *
	 * @return the api key of this powwow server
	 */
	@AutoEscape
	public String getApiKey();

	/**
	 * Sets the api key of this powwow server.
	 *
	 * @param apiKey the api key of this powwow server
	 */
	public void setApiKey(String apiKey);

	/**
	 * Returns the secret of this powwow server.
	 *
	 * @return the secret of this powwow server
	 */
	@AutoEscape
	public String getSecret();

	/**
	 * Sets the secret of this powwow server.
	 *
	 * @param secret the secret of this powwow server
	 */
	public void setSecret(String secret);

	/**
	 * Returns the active of this powwow server.
	 *
	 * @return the active of this powwow server
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this powwow server is active.
	 *
	 * @return <code>true</code> if this powwow server is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this powwow server is active.
	 *
	 * @param active the active of this powwow server
	 */
	public void setActive(boolean active);

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
	public int compareTo(com.liferay.powwow.model.PowwowServer powwowServer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.powwow.model.PowwowServer> toCacheModel();

	@Override
	public com.liferay.powwow.model.PowwowServer toEscapedModel();

	@Override
	public com.liferay.powwow.model.PowwowServer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}