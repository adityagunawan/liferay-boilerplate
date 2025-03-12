package com.boilerplate.member.web.command.render;

import com.boilerplate.member.web.constants.MemberWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(immediate = true, property = { "mvc.command.name=/form-add-member",
        "javax.portlet.name=" +  MemberWebPortletKeys.MEMBERWEB }, service = MVCRenderCommand.class)
public class MemberFormRender implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return "/add-member.jsp";
    }
}
