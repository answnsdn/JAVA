<%@page import="dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//서블릿이 공유한 데이터 꺼내오기
		DeptDTO dept = (DeptDTO)request.getAttribute("mydata");
	%>
	<h1>요청 재지정으로 실행될 페이지</h1>
	<hr/>
	<h2>공유데이터 : <%= dept %></h2>
	
</body>
</html>