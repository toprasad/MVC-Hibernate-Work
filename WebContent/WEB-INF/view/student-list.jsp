<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="table-div">
<div>
<input type="button" value="New" onClick="window.location.href='showNewForm';return false;"  class="new_botton">
<input type="button" value="Customer" onClick="window.location.href='${pageContext.request.contextPath}/customer/list';return false;"  class="new_botton">
</div>
	<table align="center">
		<tr>
			<th colspan="4"><h3>Student Table</h3></th>
		</tr>
		<tr>
			<th>SID</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
		</tr>
		<tbody>
			<c:forEach var="tempStudent" items="${students}">
				<tr>
					<td>${tempStudent.sid}</td>
					<td>${tempStudent.fisrtname}</td>
					<td>${tempStudent.lastname}</td>
					<td>${tempStudent.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>