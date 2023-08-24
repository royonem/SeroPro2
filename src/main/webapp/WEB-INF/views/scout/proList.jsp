<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 목록</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="lightgreen">
      <td><b>순서</b></td>
      <td><b>선수명</b></td>
      <td><b>선수 포지션</b></td>
      <td><b>계약서 승인 여부</b></td>
   </tr>
   
 <c:forEach var="pro" items="${proList}" >     
   <tr align="center">
      <td>${pro.proNum}</td>
      <td><a href="${contextPath}/scout/proNum=${pro.proNum}">${pro.proName}</a></td>
      <td>${pro.proPos}</td>
      <td>${pro.proSign}</td>
    </tr>
  </c:forEach>   
</table>
<a  href="${contextPath}/scout/proForm"><h1 style="text-align:center">선수 추가하기</h1></a>
</body>
</html>