package com.boilerplate.member.web.portlet;

import com.boilerplate.member.svc.service.MemberLocalService;
import com.boilerplate.member.web.constants.MemberWebPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author adity
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MemberWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MemberWebPortletKeys.MEMBERWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MemberWebPortlet extends MVCPortlet {

	private static final Log log = LogFactoryUtil.getLog(MemberWebPortlet.class);

	@Reference
	private MemberLocalService memberLocalService;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		log.info(String.format("call MemberLocalService %s data", memberLocalService.getMembersCount()));
		super.doView(renderRequest, renderResponse);
	}

}