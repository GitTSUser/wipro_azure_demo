<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.wipro.springboot.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PRODUCT-INFO</h1>

	<%	
	List<Product> productList=(List<Product>)request.getAttribute("products");
	
	out.println("<table border=1><tr><th>Id</th><th>Name</th><th>Price</th></tr>");
	for(Product p:productList){
	out.println("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getPrice()+"</td></tr>");
	}
	%>
</body>
</html>