<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    

<html>
<head>
<title>전체 리스트</title>
</head>
<body>
<h1>스프링 작심 3일</h1>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="yellow">
      <td ><b>학습일자</b></td>
      <td><b>학습내용</b></td>
      <td><b>학습량</b></td>
   </tr>
   
 <c:forEach var="board" items="${boardsList}" >     
      <tr align="center">
      <td>${board.sday}</td>
      <td><a href="${contextPath}/writeForm.do" >${board.subject}</a></td>
      <td>${board.hit}</td>

  </c:forEach>   
</table>

</body>
</html>