<%@ include file="/init.jsp" %>

<portlet:actionURL var="createMemberURL" name="/create-member" />

<div class="container">
  <div class="col-md-5">
    <form method="POST" action="${createMemberURL}" class="needs-validation">
      <div class="form-group mb-3">
        <label for="fullName" class="form-label">Full Name:</label>
        <input type="text" id="fullName" name="<portlet:namespace/>fullName" class="form-control" required>
      </div>

      <div class="form-group mb-3">
        <label for="field1" class="form-label">field1:</label>
        <input type="text" id="field1" name="<portlet:namespace/>field1" class="form-control" required>
      </div>

      <button type="submit" class="btn btn-success">Submit</button>
    </form>
  </div>
</div>

