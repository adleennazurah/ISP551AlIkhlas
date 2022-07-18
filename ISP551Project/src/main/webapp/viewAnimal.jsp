<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style type="text/css">
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
  background-color: #04AA6D;
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
  
  .logo{
   height: 60px;
   padding-right: 15px;
   padding-left: 5px;
  } 
 .nav-item a:hover{
    background-color: #307c6c;
    color: black;
  
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
}
</style>
</head>
<body>

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
          
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
             Animal
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="ListAnimalController" target="_blank">List Animals</a></li>
             <li><a class="dropdown-item" href="addAnimal.jsp" target="_blank">Add Animals</a></li>
              
            </ul>
          </li>
            
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Order
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="ListOrderController" target="_blank">Order List</a></li>
        
              
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

<br>
	<h1>Animal Info</h1>
	Animal Id: <c:out value="${an.animalid}"/><br>
	Animal Name: <c:out value="${an.animalname}"/><br>
	Quantity: <c:out value="${an.animalqty}"/><br>
	Price:RM <c:out value="${an.animalprice}"/><br>
	

</body>
</html>