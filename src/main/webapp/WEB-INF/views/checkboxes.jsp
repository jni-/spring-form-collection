<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="/resources/css/main.css" media="all" />
	<title>A few form collection examples in Spring MVC</title>
</head>
<body>
	<h1>Select projects</h1>

	<p>You have selected the following projects : ${selectedProjects.projects }</p>
	
	<form:form commandName="selectedProjects" action="/checkboxes">
		<ul>
        	<form:checkboxes element="li" items="${availableProjects}" path="projects"/>
		</ul>
		
		<button>Submit</button>
	</form:form>

</body>
</html>