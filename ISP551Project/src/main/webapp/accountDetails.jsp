
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Qurban Account Details</title>
</head>
<body>
  <a href="index.jsp">Create Account</a><br>
  <a href="accountreport.jsp">Account Report</a><br>
  
<h1>Account Details</h1> <br>
 
    Name: <c:out value="${param.name}"/><br>
    Email: <c:out value="${param.email}"/><br>
    Phone No: <c:out value="${param.telephonenum}"/><br>
    Address: <c:out value="${param.address}"/><br>
  



</body>
</html>
