<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>

<table>
 <thead>
  <tr>
   <th>번호</th>
   <th>이름</th>
   <th>출근 시간</th>
   <th>퇴근 시간</th>
  </tr>
 </thead>
 
 <tbody>
  <c:forEach items="${list}" var="list">
 <tr>
  <td>${list.mno}</td>
  <td><a href="/board/view?mno=${list.mno}">${list.name}</a></td>
  <td>||<fmt:formatDate value="${list.gotowork}" pattern="EEEEE dd MMMMM yyyy HH:mm" /></td>
  <td>||<fmt:formatDate value="${list.offwork}" pattern="EEEEE dd MMMMM yyyy HH:mm" /></td>
 </tr>
</c:forEach>
 </tbody>

</table>
<div id="nav">
 <%@ include file="../include/nav.jsp" %>
</div>
</body>
</html>