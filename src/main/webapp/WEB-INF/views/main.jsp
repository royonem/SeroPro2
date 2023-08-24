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
	<title>Home</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
$(function() {
	$("loginJSON").click(function() {
		var member = {id:"park",
				      name: "박",
				      pwd : "1234",
				      email : "park@n.com" };
		$.ajax({
		   type:"post",
		   url: "${contextPath}/scout/pro",
		   contentType : "application/json",
		   data : JSON.stringify(member),
		   success:function (data,textStatus){
			   
		   },
		   error:function(data,textStatus){
			   alert("에라 발생");
		   },
		   complete:function(data,textStatus){			   
		   }
		});
	});
});

</script>

<script>
$(function() {
	$("proJSON").click(function() {
		var member = {id:"park",
				      name: "박",
				      pwd : "1234",
				      email : "park@n.com" };
		$.ajax({
		   type:"post",
		   url: "${contextPath}/test/info",
		   contentType : "application/json",
		   data : JSON.stringify(member),
		   success:function (data,textStatus){
			   
		   },
		   error:function(data,textStatus){
			   alert("에라 발생");
		   },
		   complete:function(data,textStatus){			   
		   }
		});
	});
});

</script>


<script>
$(function() {
	$("ctJSON").click(function() {
		var member = {id:"park",
				      name: "박",
				      pwd : "1234",
				      email : "park@n.com" };
		$.ajax({
		   type:"post",
		   url: "${contextPath}/test/info",
		   contentType : "application/json",
		   data : JSON.stringify(member),
		   success:function (data,textStatus){
			   
		   },
		   error:function(data,textStatus){
			   alert("에라 발생");
		   },
		   complete:function(data,textStatus){			   
		   }
		});
	});
});

</script>
</head>
<body>
<h1>
	스카우터야 일해라
</h1>
<input type="button" id ="loginJSON" value="로그인" /><br><br>
<div id="output"></div>

<input type="button" id ="proJSON" value="선수목록" /><br><br>
<div id="output"></div>

<input type="button" id ="ctJSON" value="계약서" /><br><br>
<div id="output"></div>
</body>
</html>
