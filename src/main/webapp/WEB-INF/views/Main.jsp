<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:if test="${not empty success }">
	<script>alert("${success}")</script>
</c:if>
</head>
<body>

<h1>이거사줘</h1>
<jsp:include page="common/top.jsp" flush="true"></jsp:include><BR>
<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
<a href="AddProduct">상품등록</a>

</body>
</html>