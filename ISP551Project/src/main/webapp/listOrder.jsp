<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Orders</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">

<style >
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

th {
  background-color: #307c6c;
  color: white;
}

tr:hover {background-color: coral;}

button {
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

button {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
}

button:hover {
  background-color: #4CAF50;
  color: white;
}

#button {
  background-color: white; 
  color: black; 
  border: 10px solid #4CAF50;
}

#button:hover {
  background-color: #4CAF50;
  color: white;
}


</style>

</head>
<body>
<a href="addOrder.jsp">Add Order</a><br>
<a href="LoginLogoutController">Logout</a>
<br>
	<table border="1">
		<tr>
			<th>Order Id</th>
			<th>Customer Id</th>
			<th>Animal Id</th>
			<th>Order Part</th>
			<th colspan="3">Action</th>
		</tr>
		<c:forEach items="${orders}" var="od" varStatus="orders">
		<tr>
			<td><c:out value="${od.orderId}"/></td>
			<td><c:out value="${od.custId}"/></td>
			<td><c:out value="${od.animalId}"/></td>
			<td><c:out value="${od.orderPart}"/></td>
			<td><a class="btn btn-primary" href="ViewOrderController?id=<c:out value="${od.orderId}"/>">View</a></td> 
			<td><a class="btn btn-primary" href="UpdateOrderController?id=<c:out value="${od.orderId}"/>">Update</a></td>
			<td><button class="btn btn-danger" id="<c:out value="${od.orderId}"/>" onclick="confirmation(this.id)">Delete</button></td>
		</tr>
		</c:forEach>
	</table>
	<script>
		function confirmation(id)
		{
			console.log(id);
			var r = confirm("Are you sure you want to delete?");
			if(r == true)
			{
				location.href = 'DeleteOrderController?id=' + id;
				alert("Order successfully deleted");
			}
			else{return false;}
		}
	</script>
</body>
</html>