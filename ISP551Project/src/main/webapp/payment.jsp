<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
</style>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
@import url('https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap');

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    list-style: none;
    font-family: 'Montserrat', sans-serif
}

body{
    background-color:#FFFFFF;
}

.container {
    margin: 20px auto;
    width: 800px;
    padding: 30px
}

.card.box1 {
    width: 350px;
    height: 500px;
    background-color: #307c6c;
    color: #baf0c3;
    border-radius: 0
}

.card.box2 {
    width: 450px;
    height: 580px;
    background-color: #ffffff;
    border-radius: 0
}

.text {
    font-size: 13px
}

.box2 .btn.btn-primary.bar {
    width: 20px;
    background-color: transparent;
    border: none;
    color: #307c6c
}

.box2 .btn.btn-primary.bar:hover {
    color: #baf0c3
}

.box1 .btn.btn-primary {
    background-color: #57c97d;
    width: 45px;
    height: 45px;
    display: flex;
    justify-content: center;
    align-items: center;
    border: 1px solid #ddd
}

.box1 .btn.btn-primary:hover {
    background-color: #f6f8f7;
    color: #307c6c
}

.btn.btn-success {
    width: 40px;
    height: 40px;
    border-radius: 50%;
    background-color: #ddd;
    color: black;
    display: flex;
    justify-content: center;
    align-items: center;
    border: none
}

.nav.nav-tabs {
    border: none;
    border-bottom: 2px solid #ddd
}

.nav.nav-tabs .nav-item .nav-link {
    border: none;
    color: black;
    border-bottom: 2px solid transparent;
    font-size: 14px
}

.nav.nav-tabs .nav-item .nav-link:hover {
    border-bottom: 2px solid #307c6c;
    color: #307c6c
}

.nav.nav-tabs .nav-item .nav-link.active {
    border: none;
    border-bottom: 2px solid #307c6c
}

.form-control {
    border: none;
    border-bottom: 1px solid #ddd;
    box-shadow: none;
    height: 20px;
    font-weight: 600;
    font-size: 14px;
    padding: 15px 0px;
    letter-spacing: 1.5px;
    border-radius: 0
}

.inputWithIcon {
    position: relative
}

img {
    width: 50px;
    height: 20px;
    object-fit: cover
}

.inputWithIcon span {
    position: absolute;
    right: 0px;
    bottom: 9px;
    color: #307c6c;
    cursor: pointer;
    transition: 0.3s;
    font-size: 14px
}

.form-control:focus {
    box-shadow: none;
    border-bottom: 1px solid #ddd
}

.btn-outline-primary {
    color: black;
    background-color: #ddd;
    border: 1px solid #ddd
}

.btn-outline-primary:hover {
    background-color: #307c6c;
    border: 1px solid #ddd
}

.btn-check:active+.btn-outline-primary,
.btn-check:checked+.btn-outline-primary,
.btn-outline-primary.active,
.btn-outline-primary.dropdown-toggle.show,
.btn-outline-primary:active {
    color: #baf0c3;
    background-color: #307c6c;
    box-shadow: none;
    border: 1px solid #ddd
}

.btn-group>.btn-group:not(:last-child)>.btn,
.btn-group>.btn:not(:last-child):not(.dropdown-toggle),
.btn-group>.btn-group:not(:first-child)>.btn,
.btn-group>.btn:nth-child(n+3),
.btn-group>:not(.btn-check)+.btn {
    border-radius: 50px;
    margin-right: 20px
}

form {
    font-size: 14px
}

form .btn.btn-primary {
    width: 100%;
    height: 45px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    background-color: #307c6c;
    border: 1px solid #ddd
}

form .btn.btn-primary:hover {
    background-color: #F5F5F5
    form
}

@media (max-width:750px) {
    .container {
        padding: 10px;
        width: 100%
    }

    .text-green {
        font-size: 14px
    }

    .card.box1,
    .card.box2 {
        width: 100%
    }

    .nav.nav-tabs .nav-item .nav-link {
        font-size: 12px
    }
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



<div class="container bg-light d-md-flex align-items-center"> 
	<div class="card box1 shadow-sm p-md-5 p-md-5 p-4"> 
		<div class="fw-bolder mb-4">
			<span class="ps-1">AL-IKHLAS</span>
		</div> 
		
		<div class="d-flex flex-column"> 
			<div class="d-flex align-items-center justify-content-between text"> 
				<h1>MAKE PAYMENT<h1> 
			</div> 
			
			
			<div class="border-bottom mb-4"></div> 
				<div class="d-flex flex-column mb-4"> 	
			</div> 
			
		
			
			<div class="d-flex align-items-center justify-content-between text mt-5"> 
				
			</div> 
		</div> 
	</div> 
	
	<div class="card box2 shadow-sm"> 
		<div class="d-flex align-items-center justify-content-between p-md-5 p-4"> 
			<span class="h5 fw-bold m-0">Payment methods</span> 
				
		</div> 
		
		<ul class="nav nav-tabs mb-3 px-md-4 px-2"> 
			<li class="nav-item"> 
				<a class="nav-link px-2 active" aria-current="page" href="#">Credit Card</a> 
			</li> 
			
			<li class="nav-item"> 
				<a class="nav-link px-2" href="#">Online Banking (FPX)</a> 
			</li> 
			
			<li class="nav-item ms-auto"> 
				<a class="nav-link px-2" href="#">+ More</a> 
			</li> 
			
		</ul> 
		
		<div class="px-md-5 px-4 mb-4 d-flex align-items-center"> 
			<div class="btn btn-success me-4">
				<span class="fas fa-plus"></span>
			</div> 
			
			<div class="btn-group" role="group" aria-label="Basic radio toggle button group"> 
				<input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" checked> 
				<label class="btn btn-outline-primary" for="btnradio1">
					<span class="pe-1"></span>Credit</label> 
					<input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off"> 
			
				<label class="btn btn-outline-primary" for="btnradio2">
					<span class="lpe-1"></span>Debit</label> 
				</div> </div> <form action=""> 
				
			<div class="row"> 
				<div class="col-12"> 
					<div class="d-flex flex-column px-md-5 px-4 mb-4"> 
						<span>Credit Card</span> 
						<div class="inputWithIcon"> 
							<input class="form-control" type="text" > 
								<span class=""> <img src="https://www.freepnglogos.com/uploads/mastercard-png/mastercard-logo-logok-15.png" alt=""></span> 
						</div> 
					</div> 
				</div> 
				
				<div class="col-md-6"> 
					<div class="d-flex flex-column ps-md-5 px-md-0 px-4 mb-4"> 
						<span>Expiration<span class="ps-1">Date</span></span> 
						<div class="inputWithIcon"> 
							<input type="text" class="form-control" value="MM/YY"> 
								<span class="fas fa-calendar-alt"></span> 
						</div> 
					</div> 
				</div> 
				
				<div class="col-md-6"> 
					<div class="d-flex flex-column pe-md-5 px-md-0 px-4 mb-4"> 
						<span>Code CVV</span> 
						<div class="inputWithIcon"> 
							<input type="password" class="form-control" value="123"> 
								<span class="fas fa-lock"></span> 
						</div> 
					</div> 
				</div> 
				
				<div class="col-12"> 
					<div class="d-flex flex-column px-md-5 px-4 mb-4"> 
						<span>Name</span> 
						
						<div class="inputWithIcon"> 
							<input class="form-control text-uppercase" type="text" > 
							<span class="far fa-user"></span> 
						</div> 
					</div> 
				</div> 
				
				<div class="col-12 px-md-5 px-4 mt-3"> 
					<div class="btn btn-primary w-100" onclick="viewOrder.jsp">Pay Now</div> 
				</div> 
				
			</div> 
		</form> 
	</div> 
</div>

</body>
</html>