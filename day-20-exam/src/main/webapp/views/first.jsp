<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:tomato">FirstJsp</h1>



<img alt="" src="http://localhost:8081/i1.jpg">
<div>Another Way</div>
<img alt="" src="${pageContext.request.contextPath}/i1.jpg">


<div>Third way</div>
<img alt="" src="http://localhost:8081/i2.jpg" style="height;400px">
<div>Recommended way</div>
<img src="${pageContext.request.contextPath}/i1.jpg" style="height:300px">

</body>
</html>