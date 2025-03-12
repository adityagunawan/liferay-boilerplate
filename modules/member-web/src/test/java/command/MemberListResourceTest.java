package command;

import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.service.MemberLocalService;
import com.boilerplate.member.web.command.resource.MemberListResource;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MemberListResourceTest {

    @InjectMocks
    private MemberListResource memberListResource;

    @Mock
    private MemberLocalService memberLocalService;

    @Mock
    private ResourceRequest resourceRequest;

    @Mock
    private ResourceResponse resourceResponse;

    private List<Member> mockMembers;

    @Mock
    private JSONFactory jsonFactory; // Mock JSONFactory (no PowerMock needed)

    @Mock
    private JSONObject jsonObject; // Mock JSONObject

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        // Mock JSONFactory to return a mock JSONObject
        when(jsonFactory.createJSONObject()).thenReturn(jsonObject);

        // Create mock members
        mockMembers = new ArrayList<>();
        Member member1 = mock(Member.class);
        when(member1.getMemberId()).thenReturn(1L);
        when(member1.getFullName()).thenReturn("John Doe");
        when(member1.getField1()).thenReturn("Field Data 1");
        when(member1.getCreateDate()).thenReturn(new Date());

        Member member2 = mock(Member.class);
        when(member2.getMemberId()).thenReturn(2L);
        when(member2.getFullName()).thenReturn("Jane Smith");
        when(member2.getField1()).thenReturn("Field Data 2");
        when(member2.getCreateDate()).thenReturn(new Date());

        mockMembers.add(member1);
        mockMembers.add(member2);
    }

    @Test
    public void testServeResource() throws Exception {
        // Mock service call
        when(memberLocalService.getMembers(-1, -1)).thenReturn(mockMembers);

        // Mock response writer
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        when(resourceResponse.getWriter()).thenReturn(printWriter);

        // Execute method
        boolean result = memberListResource.serveResource(resourceRequest, resourceResponse);

        // Verify interactions
        verify(memberLocalService).getMembers(-1, -1);

//        // Verify JSON output
//        printWriter.flush();
//        String jsonOutput = stringWriter.toString();
//        JSONObject jsonResponse = jsonFactory.createJSONObject(jsonOutput);
//
//        assertNotNull(jsonResponse);
//        assertTrue(jsonResponse.has("members"));
//
//        // Check that JSON contains expected values
//        assertEquals(2, jsonResponse.getJSONArray("members").length());
//
//        // Ensure method returned false (expected behavior)
//        assertFalse(result);
    }
}
