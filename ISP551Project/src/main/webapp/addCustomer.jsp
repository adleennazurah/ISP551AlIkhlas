<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
  if(session.getAttribute("sessionEmail")==null)
      response.sendRedirect("/ISP551Project/login.jsp");
  %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<style>
.logo{
   height: 60px;
   padding-right: 15px;
   padding-left: 5px;
  } 
 .nav-item a:hover{
    background-color: #307c6c;
    color: white;
  
  }
  .dropdown-menu
   {
    display: none;
    position: absolute;
    background-color:#307c6c;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
  }
    </style>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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
            <a class="nav-link active" aria-current="page" href="index2.html" target="_blank">Home</a>
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
<%	String email = (String)session.getAttribute("sessionEmail");%>
	Welcome <b> <%= email %> </b>
<br>
	
	
	<form action="AddCustomerController" method="post">
	<div class="w3-container w3-light-grey" style="padding:40px 9px" id="customer">
  <div class="form-group">
    <label for="custname">Name:</label>
    <input type="text" class="form-control" id="custname" name="custname" aria-describedby="emailHelp" placeholder="Enter your name">
    
  </div>
  <div class="form-group">
    <label for="custemail">Email:</label>
    <input type="email" class="form-control" id="custemail" name="custemail" placeholder="Enter your email">
  </div>
  
  <div class="form-group">
    <label for="custaddress">Address:</label>
    <input type="text" class="form-control" id="custaddress" name="custaddress" aria-describedby="emailHelp" placeholder="Enter your address">
    
    <div class="form-group">
    <label for="custnumber">Telephone Number:</label>
    <input type="number" class="form-control" id="custnumber" name="custnumber" aria-describedby="emailHelp" placeholder="Enter your phone number">
    <br>
  <button type="submit" value="Submit" class="btn btn-primary">Submit</button>
  <button type="reset" value="Reset" class="btn btn-primary">Reset</button>
</form>
</body>
</html>