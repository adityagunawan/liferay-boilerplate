package com.boilerplate.member.web.command.action;

import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.service.MemberLocalService;
import com.boilerplate.member.web.constants.MemberWebPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


@Component(immediate = true, property = { "mvc.command.name=/create-member",
        "javax.portlet.name=" + MemberWebPortletKeys.MEMBERWEB }, service = MVCActionCommand.class)
public class MemberCreateAction extends BaseMVCActionCommand {

    @Reference
    private MemberLocalService memberLocalService;

    @Reference
    private CounterLocalService counterLocalService;

    @Override
    public void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String fullName = getParameter(actionRequest, "fullName");
        String field1 = getParameter(actionRequest, "field1");

        long memberId = counterLocalService.increment(Member.class.getName());
        Member member = memberLocalService.createMember(memberId);
        member.setFullName(fullName);
        member.setField1(field1);

        memberLocalService.addMember(member);
    }

    protected String getParameter(ActionRequest request, String paramName) {
        return ParamUtil.getString(request, paramName, "");
    }
}
