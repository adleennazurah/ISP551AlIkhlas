<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <a href="index.jsp">Create Account</a>
  <a href="accountreport.jsp">Account Report</a>
  <% 
  String name = request.getParameter("name");
  String email = request.getParameter("email");
  String telephonenum =request.getParameter("telephonenum");  
  String address = request.getParameter("address");
 
  %>
  
  Name : <%= name %><br>
  email: <%= email %><br>
  Phone Number: <%= telephonenum %><br>
  address : <%=address %><br>

 
  
</body>
</html>