<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출근기록</title>
</head>
<body>
<form method="post">
<label>근무자 이름</label>
<label>${view.name}</label><br />
<label>번호 </label>
<label>${view.mno}</label> <br />
<label>출근 시간 </label>
<label><fmt:formatDate value="${view.gotowork}" pattern="EEEEE dd MMMMM yyyy HH:mm" /></label> <br />
<a href="/board/offwork?mno=${view.mno}">퇴근</a>
</form>
<div id="nav">
 <%@ include file="../include/nav.jsp" %>
</div>
</body>
</html>