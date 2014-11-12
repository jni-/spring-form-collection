<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="/resources/css/main.css" media="all" />
	<title>A few form collection examples in Spring MVC</title>
</head>
<body>

	<h1>A few form collection examples in Spring MVC</h1>
	
	List of examples : 
	
	<ul>
		<li><a href="<c:url value='/checkboxes' />">Simple checkboxes</a></li>
		<li><a href="<c:url value='/checkboxes-manual' />">Simple checkboxes (without spring form)</a></li>
		<li><a href="<c:url value='/list-of-objects' />">List of complex objects</a></li>
	</ul>
	
</body>
</html>