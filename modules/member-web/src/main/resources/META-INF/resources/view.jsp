<%@ include file="/init.jsp" %>

<portlet:renderURL var="formAddMemberURL">
    <portlet:param name="mvcRenderCommandName" value="/form-add-member" />
</portlet:renderURL>

<portlet:resourceURL var="memberList" id="/member-list" />

<div class="container">
    <p>
        <b><liferay-ui:message key="memberweb.caption"/></b>
    </p>
    <p>
        <a href="${formAddMemberURL}">Add Member</a>
    </p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Field 1</th>
            <th>Created Date</th>
        </tr>
        </thead>
        <tbody id="member-list">
    <!-- ncomment this if u want to use jsp looping -->
<%--        <c:forEach items="${members}" var="member">--%>
<%--            <tr>--%>
<%--                <td>${member.memberId}</td>--%>
<%--                <td>${member.fullName}</td>--%>
<%--                <td>${member.field1}</td>--%>
<%--                <td>${member.createDate}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
        </tbody>
    </table>
</div>

<script>
    function loadMembers() {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', '${memberList}', true);

        xhr.onload = function() {
            if (xhr.status === 200) {
                console.log('using ajax for fetch members data');

                var response = JSON.parse(xhr.responseText);
                var members = response.members;
                var tbody = document.getElementById('member-list');
                tbody.innerHTML = '';

                members.forEach(function(member) {
                    var row = document.createElement('tr');
                    row.innerHTML =
                        '<td>' + member.memberId + '</td>' +
                        '<td>' + member.fullName + '</td>' +
                        '<td>' + member.field1 + '</td>' +
                        '<td>' + member.createDate + '</td>'
                    ;
                    tbody.appendChild(row);
                });
            }
        };

        xhr.send();
    }

    loadMembers();
</script>