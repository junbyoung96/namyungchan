<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	Date nowTime = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
%>
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
<label>${view.gotowork}</label> <br />
<label>현재시간</label>
<P name="offwork"> <%= sf.format(nowTime) %>  </P> <br />
<button type="submit">퇴근시간 제출</button>
</form>
<div id="nav">
 <%@ include file="../include/nav.jsp" %>
</div>
</body>
</html>