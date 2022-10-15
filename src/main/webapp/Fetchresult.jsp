<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.example.demo.*" %>
    <%@ page  import="java.util.Optional"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee emp=(Employee)request.getAttribute("list");
%>

<table  border="1">
<tr><th>id</th><th>name</th><th>phoneno</th><th>age</th></tr>
<tr><td><%=emp.getEmpno()%></td><td><%=emp.getEmpname() %></td><td><%=emp.getPhono() %></td><td><%=emp.getAge()%></td></tr>

</table>
</body>
</html>