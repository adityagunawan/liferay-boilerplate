package command;

import com.boilerplate.member.svc.model.Member;
import com.boilerplate.member.svc.service.MemberLocalService;
import com.boilerplate.member.web.command.action.MemberCreateAction;
import com.liferay.counter.kernel.service.CounterLocalService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MemberCreateActionTest {

    @InjectMocks
    private MemberCreateAction memberCreateAction = new MemberCreateAction() {
        @Override
        protected String getParameter(ActionRequest request, String paramName) {
            if ("fullName".equals(paramName)) return "John Doe";
            if ("field1".equals(paramName)) return "Some value";
            return "";
        }
    };

    @Mock
    private CounterLocalService counterLocalService;

    @Mock
    private MemberLocalService memberLocalService;

    @Mock
    private ActionRequest actionRequest;

    @Mock
    private ActionResponse actionResponse;

    @Mock
    private Member member;

    private static final long MEMBER_ID = 12345L;
    private static final String FULL_NAME = "John Doe";
    private static final String FIELD1 = "Some value";

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        // Mocking counterLocalService behavior
        when(counterLocalService.increment(Member.class.getName())).thenReturn(MEMBER_ID);

        // Mocking memberLocalService behavior
        when(memberLocalService.createMember(MEMBER_ID)).thenReturn(member);
    }

    @Test
    public void testDoProcessAction() throws Exception {
        assertNotNull(memberCreateAction);
        // Execute the action command
        memberCreateAction.doProcessAction(actionRequest, actionResponse);

        // Verify that a new member is created with the expected ID
        verify(memberLocalService).createMember(MEMBER_ID);

        // Verify that the member's fields are set correctly
        verify(member).setFullName(FULL_NAME);
        verify(member).setField1(FIELD1);

        // Verify that the member is added to the database
        verify(memberLocalService).addMember(member);
    }
}