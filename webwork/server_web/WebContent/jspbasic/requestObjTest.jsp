<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>서블릿에서 처리했던 작업을 jsp에서 처리해보기</h1>
	<%
		//요청정보 추출
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
	%>
	<h3>아이디:<%= id %></h3>
	<h3>패스워드:<%= pass %></h3>
</body>
</html>