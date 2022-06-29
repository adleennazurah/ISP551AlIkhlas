
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<body>
<b><h1>Account Details</h1></b>
 
    Name: <c:out value="${param.name}"/><br>
    Email: <c:out value="${param.email}"/><br>
    Phone No: <c:out value="${param.telephonenum}"/><br>
    Address: <c:out value="${param.address}"/><br>
  



</body>
</html>