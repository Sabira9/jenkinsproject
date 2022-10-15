<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="com.example.demo.*" %>
    <%@ page  import="java.util.*"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> e=(List<Employee>)request.getAttribute("list");
%>

<table  border="1">
<tr><th>id</th><th>name</th><th>phoneno</th><th>age</th><th>Edit operation</th><th>Delete operation</th></tr>
<%for(Employee ee:e){ %>
<tr><td><%=ee.getEmpno()%></td><td><%=ee.getEmpname() %></td><td><%=ee.getPhono() %></td><td><%=ee.getAge() %></td><td><a href="edit.jsp">Edit By name</a></td><td><a href="delete.jsp">Delete by id</a></td></tr>
<%} %>
</table>

</body>
</html>