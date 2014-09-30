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
	<h1>Select projects (without spring form)</h1>
	
	<p>You have selected the following projects : ${selectedProjects.projects }</p>
	
	<form method="POST" action="/checkboxes-manual">
		<ul>
			<c:forEach var="project" varStatus="status" items="${availableProjects}">
        		<li>
        			<c:if var="projectIsSelected" test="${selectedProjects.projects.contains(project)}" />
        			
        			<!-- Must use the same name for each checkbox. IDs must be unique, of course. -->
        			<input type="checkbox" name="projects" value="${project}" id="projects-${status.index}" ${projectIsSelected ? 'checked=checked' : '' } />
        			<label for="projects-${status.index}">${project}</label>
        		</li>
			</c:forEach>
		</ul>
		
		<button>Submit</button>
	</form>

</body>
</html>