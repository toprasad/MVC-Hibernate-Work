<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>


<div class="table-div">
<div>
<input type="button" value="New" onClick="window.location.href='showNewForm';return false;"  class="new_botton">
<input type="button" value="Student" onClick="window.location.href='${pageContext.request.contextPath}/student/list';return false;"  class="new_botton">
</div>
	<table align="center">
		<tr>
			<th colspan="5"><h3>Customer Table</h3></th>
		</tr>
		<tr>
			<th>EDIT/DELETE</th>
			<th>CID</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
		</tr>
		<tbody>
			<c:forEach var="tempCustomer" items="${customers}">
			
			<c:url var="updateLink" value="/updateCustomer">
			<c:param name="id" value="${tempCustomer.cid}"/>
			</c:url>
				<tr>
					<td>
					<a href="${updateLink}"/><i class="fa fa-edit" style="font-size:20px;color:red;"></i></a>
					<a href="#"/><i class="fa fa-trash" style="font-size:20px;color:red;"></i></a>
					</td>
					<td>${tempCustomer.cid}</td>
					<td>${tempCustomer.firstname}</td>
					<td>${tempCustomer.lastname}</td>
					<td>${tempCustomer.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>