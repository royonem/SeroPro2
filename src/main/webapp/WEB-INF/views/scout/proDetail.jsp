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
</head>
<body>
	<table align="center">
		<tr>
			<td width="200"><p align="right">선수명</td>
			<td width="400"><p>${proName}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 포지션</td>
			<td width="400"><p>${proPos}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 거주지</td>
			<td width="400"><p>${proAddress}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 학교</td>
			<td width="400"><p>${proSchool}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 나이</td>
			<td width="400"><p>${proAge}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 키</td>
			<td width="400"><p>${proHeight}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">BA</td>
			<td width="400"><p>${batAvg}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">WAR</td>
			<td width="400"><p>${war}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">ERA</td>
			<td width="400"><p>${era}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">OPS</td>
			<td width="400"><p>${ops}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 인성</td>
			<td width="400"><p>${mbti}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 영상</td>
			<td width="400"><p>${proVid}</td>
		</tr>
		<tr>
			<td width="200"><p align="right">선수 상세정보</td>
			<td width="400"><p>${proDetails }</p></td>
		</tr>
		<tr>
			<td width="200"><p align="right">계약서 승인 여부</td>
			<td width="400"><p>${proSign}</td>
		</tr>
	</table>
</body>
</html>