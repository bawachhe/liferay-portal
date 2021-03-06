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

package com.liferay.asset.list.item.selector.web.internal;

import com.liferay.asset.list.item.selector.criterion.AssetListItemSelectorCriterion;
import com.liferay.asset.list.item.selector.web.internal.constants.AssetListItemSelectorWebKeys;
import com.liferay.asset.list.item.selector.web.internal.display.context.AssetListItemSelectorViewDisplayContext;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.ItemSelectorView;
import com.liferay.item.selector.criteria.UUIDItemSelectorReturnType;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.io.IOException;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.PortletURL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pavel Savinov
 */
@Component(immediate = true, service = ItemSelectorView.class)
public class AssetListItemSelectorView
	implements ItemSelectorView<AssetListItemSelectorCriterion> {

	@Override
	public Class<AssetListItemSelectorCriterion>
		getItemSelectorCriterionClass() {

		return AssetListItemSelectorCriterion.class;
	}

	@Override
	public List<ItemSelectorReturnType> getSupportedItemSelectorReturnTypes() {
		return _supportedItemSelectorReturnTypes;
	}

	@Override
	public String getTitle(Locale locale) {
		ResourceBundle resourceBundle =
			_resourceBundleLoader.loadResourceBundle(locale);

		return ResourceBundleUtil.getString(resourceBundle, "asset-lists");
	}

	@Override
	public boolean isVisible(ThemeDisplay themeDisplay) {
		return true;
	}

	@Override
	public void renderHTML(
			ServletRequest request, ServletResponse response,
			AssetListItemSelectorCriterion assetListItemSelectorCriterion,
			PortletURL portletURL, String itemSelectedEventName, boolean search)
		throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest)request;

		AssetListItemSelectorViewDisplayContext
			assetListItemSelectorViewDisplayContext =
				new AssetListItemSelectorViewDisplayContext(
					assetListItemSelectorCriterion, httpServletRequest,
					itemSelectedEventName, portletURL);

		request.setAttribute(
			AssetListItemSelectorWebKeys.
				ASSET_LIST_ITEM_SELECTOR_VIEW_DISPLAY_CONTEXT,
			assetListItemSelectorViewDisplayContext);

		ServletContext servletContext = _servletContext;

		RequestDispatcher requestDispatcher =
			servletContext.getRequestDispatcher("/asset_lists.jsp");

		requestDispatcher.include(request, response);
	}

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.asset.list.item.selector.web)",
		unbind = "-"
	)
	public void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	private static final List<ItemSelectorReturnType>
		_supportedItemSelectorReturnTypes = Collections.unmodifiableList(
			ListUtil.fromArray(
				new ItemSelectorReturnType[] {
					new UUIDItemSelectorReturnType()
				}));

	@Reference(
		target = "(bundle.symbolic.name=com.liferay.asset.list.item.selector.web)",
		unbind = "-"
	)
	private ResourceBundleLoader _resourceBundleLoader;

	private ServletContext _servletContext;

}