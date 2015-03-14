<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Campaigns</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<br><br><br>

	<c:forEach items="${campaigns}" var="campaign">
		<c:out value="${campaign.title}" />
<%-- 		<c:out value="${campaign.categories}" /> --%>
<%-- 		<c:out value="${campaign.description}" /> --%>
<%-- 		<c:out value="${campaign.duration}" /> --%>
<%-- 		<c:out value="${campaign.hashtag}" /> --%>
<%-- 		<a href="<c:out value= "${campaign.imageURI}"/>" /><img src="${campaign.imageURI}"/> </a> --%>
<%-- 		<c:out value="${campaign.summary}" /> --%>
		

</c:forEach>

<br><br><br>

<jsp:include page="footer.jsp"/>

</body>
</html>