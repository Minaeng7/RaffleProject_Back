<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>MyPage</h1>
<jsp:include page="common/top.jsp" flush="true"></jsp:include><BR>
<jsp:include page="common/menu.jsp" flush="true"></jsp:include><BR>
<hr>
<jsp:include page="Mypage/Mypage.jsp" flush="true"></jsp:include><BR>
</body>
</html>