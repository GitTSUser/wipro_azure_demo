<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.wipro.springboot.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center;">Searched Product</h2>

	
	<%
	Product p=(Product)request.getAttribute("product");
	out.println("<h2 style='color:blue;'>"+p.getId()+" "+p.getName()+"  "+p.getPrice()+"</h2>");
	%>
	
</body>
</html>