<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <%@ include file="../header.jsp" %>   --%>
<%-- <%@ include file="sub_img.jsp"%>  --%>
<%-- <%@ include file="sub_menu.html" %> --%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>로그인 페이지</title>
</head>
<body>
<h1>로그인</h1>
 <article>
    <h1>Login</h1>
    <form method="post" action="${contextPath}/login">
        <fieldset>
        <legend></legend>
          <label>User ID</label>
          <input name="id" type="text" value=""><br> 
          <label>Password</label> 
          <input name="pw" type="password" value=""><br> 
        </fieldset>
        <div class="clear"></div>
        <div id="buttons">
            <input type="submit" value="로그인" class="submit">
        </div>
    </form>  
  </article>
</body>
</html>

<%-- <%@ include file="../footer.jsp" %>    --%>
