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
	<h1>Enter up to 3 calculations</h1>
	
	<form:form commandName="calculationsForm">
		<c:forEach items="${calculationsForm.calculations}" var="calculation" varStatus="loop">
			<div class="calculation">
				<form:input path="calculations[${loop.index}].leftOperand" />
				+
				<form:input path="calculations[${loop.index}].rightOperand" />
			
				<c:if test="${calculation.result != null}">
					= ${calculation.result }
				</c:if>
			</div>
		</c:forEach>
		
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>