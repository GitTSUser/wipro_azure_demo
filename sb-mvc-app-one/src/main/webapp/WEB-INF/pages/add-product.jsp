<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,com.wipro.springboot.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PRODUCT-INFO</h1>

	<div>
		<form action="/MVCApp/add-product" method="post">
			<label>Product Id:</label> 
			<input type="text" name="id" placeholder="ProductId" /> <br> 
			<label>Product Name:</label>
			<input type="text" name="name" placeholder="ProductName" /> <br> 
			<label>Product Price:</label> <input type="text" name="price" placeholder="Price" />
			<br>
			<br>
			<input type="submit" name="s" value="AddProduct"/>
		</form>
	</div>

</body>
</html>