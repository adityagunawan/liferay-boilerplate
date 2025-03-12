package com.boilerplate.member.web.command.resource;

import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.service.MemberLocalService;
import com.boilerplate.member.web.constants.MemberWebPortletKeys;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component(immediate = true, property = { "mvc.command.name=/member-list",
        "javax.portlet.name=" +  MemberWebPortletKeys.MEMBERWEB }, service = MVCResourceCommand.class)
public class MemberListResource implements MVCResourceCommand {

    private static final Log log = LogFactoryUtil.getLog(MemberListResource.class);

    @Reference
    private MemberLocalService memberLocalService;

    @Reference
    private JSONFactory jsonFactory;

    @Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {
        log.info("MemberListResource.serveResource");
        List<Member> members = new ArrayList<>();
        try {
            members = memberLocalService.getMembers(-1, -1);
        } catch (Exception e) {
            //in case need to return other http status code
            resourceResponse.setProperty(ResourceResponse.HTTP_STATUS_CODE, Integer.toString(HttpServletResponse.SC_BAD_REQUEST));
        }

        //set jsonObject for return data
        JSONObject jsonObject = jsonFactory.createJSONObject();
        List<Map<String, String>> maps = new ArrayList<>();

        members.forEach(member -> {
            Map<String, String> map = new HashMap<>();
            map.put("memberId", String.valueOf(member.getMemberId()));
            map.put("fullName", member.getFullName());
            map.put("field1", member.getField1());
            map.put("createDate", member.getCreateDate().toString());
            maps.add(map);
        });

        jsonObject.put("members", maps);

        try {
            //return json here
            resourceResponse.getWriter().println(jsonObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}
