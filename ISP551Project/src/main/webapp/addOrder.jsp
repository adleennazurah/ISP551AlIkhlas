<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
* {
  box-sizing: border-box;
}
.alt {
    float: left;
    width:  100px;
    height: 100px;
    object-fit: cover;
}

.row {
  display: flex;
}

.column {
  flex: 10%;
  padding: 20px;
  margin: 20px;
}

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
<meta charset="ISO-8859-1">
<title>Order</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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


<br><br>
	<h2>Add Order</h2>
<div class="row">
  <div class="column">
    <img src="https://pbs.twimg.com/media/Djeg_2wU4AEdRgI?format=jpg&name=4096x4096" alt="Snow" style="width:100%">
    <h2 class="item">LEMBU</h2>
      <h3 class="price">Sebahagian RM320</h3>
      <p class="description">Seekor RM2240</p>
  </div>
  <div class="column">
    <img src="https://media.istockphoto.com/photos/grey-goat-picture-id1395049757?b=1&k=20&m=1395049757&s=170667a&w=0&h=0zxqjL_Vwv3Py-iOsnVe5D91KaeU4T6MwRw5TYC_P5g=" alt="Forest" style="width:100%">
    <h2 class="item">KAMBING</h2>
      <h3 class="price">Seekor RM580</h3>
  </div>
  <div class="column">
    <img src="https://images.unsplash.com/photo-1598113972215-96c018fb1a0b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8Y2FtZWx8ZW58MHx8MHx8&w=1000&q=80" alt="Mountains" style="width:100%">
    <h2 class="item">UNTA</h2>
      <h3 class="price">Sebahagian RM480</h3>
      <p class="description">Seekor RM3360</p>
  </div>
</div>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
			<form method="post" action="AddOrderController">
					<caption>
						<h2> Add Order</h2>
					</caption>
					<br>
					<fieldset class="form-group">
						<label>Animal Name</label> 
						<select name="animalId">
							<option value="1">Lembu</option>
							<option value="2">Kambing</option>
							<option value="3">Unta</option>
						</select><br>
					</fieldset>
					<fieldset class="form-group">
						<label>Order Part</label> 
						<select name="orderPart">
							<option value="one">One</option>
							<option value="two">Two</option>
							<option value="three">Three</option>
							<option value="four">Four</option>
							<option value="five">Five</option>
							<option value="six">Six</option>
							<option value="Whole">Whole</option>
						</select><br>
					</fieldset>
					<fieldset class="form-group">
						<label>Order Date</label> 
						<input type="date" class="form-control" id="orderDate" name="orderDate" required="required" placeholder="yyyy-mm-dd">
					</fieldset>
				
					
					<button type="submit" class="btn btn-success">Submit</button>
					<button type="reset" class="btn btn-success">Reset</button>
			</form>
			</div>
		</div>
	</div>
</body>
</html>