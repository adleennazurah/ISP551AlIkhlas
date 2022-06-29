<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Qurban Registration System</h1>
<div class="topnav">

  <a href="index.jsp">Create Account</a>
  <a href="accountreport.jsp">Account Report</a>
  
</div>

<br><br>

<form action="accountInfo.jsp" method="post">
       <label for="name">Name: </label>
     <input type="text" name="name" ><br>
     
      <br> <label for="email">Email: </label>
       <input type="email" name="email"><br>
      <br> <label for="telephonenum">Phone No: </label>
     <input type="text" id="telephonenum" name="telephonenum" ><br>
     <br>   <label for="address">Address: </label>
     <input type="text" id="address" name="address" ><br>
     
      <br>   <label for="password">Password: </label>
     <input type="password" id="password" name="password" ><br>
     
 

 <br><br>
          <input type="submit" value="Submit" >
    <input type="reset" value="Reset">
    
          
     </form>
     
    

</body>
</html>