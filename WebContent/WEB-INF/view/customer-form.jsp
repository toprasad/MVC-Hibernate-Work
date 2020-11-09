<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div>
<a href="${pageContext.request.contextPath}/customer/list">Show List</a>
</div>
<div class="customer-table-div">
<form:form action="saveCustomer" modelAttribute="customer" method="POST">
<from:hidden path="cid"/>
<table align="center">
		<tr>
			<th colspan="5"><h3>New Customer</h3></th>
		</tr>
		<tbody>
		<tr>
		<td>First Name:<td><td><form:input path="firstname" /><td><td><form:errors path="firstname" cssClass="error" /></td>
		</tr>
		<tr>
		<td>Last Name:<td><td><form:input path="lastname" /><td><td><form:errors path="lastname" cssClass="error" /></td>
		</tr>
		<tr>
		<td>Email:<td><td><form:input path="email" /><td><td><form:errors path="email" cssClass="error" /></td>
		</tr>
		
		<tr>
		<td colspan="5"><input type="submit" value="Save"></td>
		</tr>
		</tbody>
	</table>
</form:form>	
</div>
</body>
</html>