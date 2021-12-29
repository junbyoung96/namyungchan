<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출퇴근 기록 작성</title>
</head>
<body>
<form method ="post">
<label>이름</label>
<input type="text" name="name"> <br />
<button type="submit">작성</button>

</form>
<div id="nav">
 <%@ include file="../include/nav.jsp" %>
</div>
</body>
</html>