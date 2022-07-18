<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Order</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

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

 <!-- HEADER -->
<header class="header">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href=""><img src="https://i.ibb.co/bQpf5WB/1-removebg-preview.png" class="img-responsive logo" ></a>
  </div>
      <a class="navbar-brand" href="#"><b></b></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-auto">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.html" target="_blank">Home</a>
          </li>
          
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              My Account
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="addCustomer.jsp" target="_blank">Account Information</a></li>
          
              
            </ul>
          </li>
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
             Dependent 
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="addDependent.jsp" target="_blank">Add Dependent</a></li>
              <li><a class="dropdown-item" href="ListDependentController" target="_blank">List Dependent</a></li>
              
            </ul>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Order
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="ListOrderController" target="_blank">Order List</a></li>
              <li><a class="dropdown-item" href="addOrder.jsp" target="_blank">My Order</a></li>
              
            </ul>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="LoginLogoutController" target="_blank" >Logout</a>
          </li>
          
        </ul>
        
    </div>
    </div>
  </nav>
<!-- Navigation bar ends here -->

<a href="ListOrderController">List Order</a><br><br>
	<form action="UpdateOrderController" method="post">
	Order ID: <br>
	<input type="number" name="orderId" value="<c:out value="${od.orderId}"/>"/><br>
	Customer ID: <br>
	<input type="number" name="custId" value="<c:out value="${od.custId}"/>"/><br>
	Animal ID: <br>
	<select name="animalId">
		<option value="<c:out value="${od.animalId}"/>"><c:out value="${od.animalId}"/></option>
		<option value="LEM376">LEMBU</option>
		<option value="KAM943">KAMBING</option>
		<option value="UNT501">UNTA</option>
	</select><br>
	Order Part: <br>
	<input type="text" name="orderPart" value="<c:out value="${od.orderPart}"/>"/><br>
	Order Date: <br>
	<input type="date" name="orderDate" value="<c:out value="${od.orderDate}"/>"/><br>
	
	<input type="hidden" name="orderId" value="<c:out value="${od.orderId}"/>"/><br><br>
	<input type="submit" value="Submit">
	<input type="reset" value="Reset">
	</form>
</body>
</html>