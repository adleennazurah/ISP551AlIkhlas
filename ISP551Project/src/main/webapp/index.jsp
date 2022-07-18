<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("currentSessionUser")==null)
      response.sendRedirect("/ISP551Project/login.jsp");
  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD
	<%	String email = (String)session.getAttribute("currentSessionUser");%>
	Welcome <%= email %>
	
  <ul>
  	<li><a href="LoginLogoutController">Logout</a></li>
  </ul>
=======
<h1>Assalamualaikum and selamat sejahtera FROM AL-IKHLAS </h1>
<h2>QURBAN BERSAMA AL-IKHLAS<h2>
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
     
    

>>>>>>> branch 'main' of https://github.com/adleennazurah/ISP551AlIkhlas.git
</body>
</html>
