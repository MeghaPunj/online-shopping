<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js/"></spring:url>
<spring:url var="images" value="/resources/images/"></spring:url>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Online Shopping - ${title}</title>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/shop-item.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script>
	window.menu = '${title}';
</script>
<script src="${js}/myapp.js"></script>
<link href="${css}/bootstrap-readable.css" rel="stylesheet">

</head>
<body>
	<div class="content">
		<div class="main">
			<%@include file="./shared/navbar.jsp"%>
			<c:if test="${userClickHome==true}">
				<%@include file="./home.jsp"%>
			</c:if>
			<c:if test="${userClickAbout==true}">
				<%@include file="./about.jsp"%>
			</c:if>
			<c:if test="${userClickContact==true}">
				<%@include file="./contact.jsp"%>
			</c:if>
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="./listProducts.jsp"%>
			</c:if>
			
		</div>
	</div>
	<%@include file="./shared/footer.jsp"%>
</body>
</html>
