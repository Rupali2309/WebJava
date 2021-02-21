<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:pink">This is Second page</h1>
<c:forEach var="item" items="${userList}">
<div>${item.username}</div>
<div>${item.profileImage}</div>
<img alt="" src="${pageContext.request.contextPath}${item.profileImage}">

</c:forEach>
</body>
</html>