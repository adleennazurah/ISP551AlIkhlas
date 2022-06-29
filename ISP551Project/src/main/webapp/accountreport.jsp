<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:first-child {
  background-color: #dddddd;
}

</style>
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
<table>
  
  
  <tr>
    <th>Customer ID</th>
    <th>Name</th>
    <th>Phone Number</th>
    <th>Email</th>
    <th>Address</th>
    <th>Action</th>
  </tr>
  <tr>
    <td>01</td>
    <td>Nik</td>
    <td>0123456789</td>
    <td>nikamani@gmail.com</td>
     <td>23, Jalan 7/2, Taman Permaisuri, Pendang,57000, Kedah.</td>
   
    
    <td>
      <button class="update">Update</button>
    <button class="delete">Delete</button>
    <button class="accountInfo.jsp">View</button>
  </td>
  </tr>
  
  
</table>

</body>
</html>