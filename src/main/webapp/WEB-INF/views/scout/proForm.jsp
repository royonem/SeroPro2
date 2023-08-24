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
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
$(function() {
		$("#registerPro").click(function() {
			
		$.ajax({
			type : "post",
			url : "${contextPath}/scout/addPro", // 1. 요청
			contentType : "application/json",
			data : JSON.stringify(member),// 2. JSON을 문자열로 변환
	
			success : function(data, textStatus) {
				
			},
			error : function(data, textStatus) {
				alert("애러가 발생");
			},
			complete : function(data, textStatus){
			}
			}); // end ajax
		
		});
	});
</script>
</head>
<body>
		<h1 class="text_center">Add Pro</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">선수명</td>
				<td width="400"><p><input type="text" name="proName"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 포지션</td>
				<td width="400"><p><input type="text" name="proPos"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 거주지</td>
				<td width="400"><p>
						<input type="text" name="proAddress"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 학교</td>
				<td width="400"><p>
						<input type="text" name="proSchool"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 나이</td>
				<td width="400"><p>
						<input type="number" name="proAge"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 키</td>
				<td width="400"><p>
						<input type="text" name="proHeight"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">BA</td>
				<td width="400"><p>
						<input type="text" name="batAvg"></td>
			</tr>
						<tr>
				<td width="200"><p align="right">WAR</td>
				<td width="400"><p>
						<input type="text" name="war"></td>
			</tr>
						<tr>
				<td width="200"><p align="right">ERA</td>
				<td width="400"><p>
						<input type="text" name="era"></td>
			</tr>
						<tr>
				<td width="200"><p align="right">OPS</td>
				<td width="400"><p>
						<input type="text" name="ops"></td>
			</tr>
									<tr>
				<td width="200"><p align="right">선수 인성</td>
				<td width="400"><p>
						<input type="text" name="mbti"></td>
			</tr>
												<tr>
				<td width="200"><p align="right">선수 영상</td>
				<td width="400"><p>
						<input type="text" name="proVid"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">선수 상세정보</td>
				<td width="400"><p>
				<textarea name="proDetails" rows="20" cols="50"> </textarea>
			</p></td>
			</tr>
			<tr>
				<td width="200"><p align="right">계약서 승인 여부</td>
				<td width="400"><p>
						<input type="text" name="proSign"></td>
			</tr>		
		</table>
				<input type="button" id="registerPro" value="선수 등록하기">
				<input type="reset" value="다시입력"> 
				<div id = "output"></div>
</body>
</html>