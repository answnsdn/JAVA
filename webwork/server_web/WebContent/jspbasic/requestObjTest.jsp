<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>�������� ó���ߴ� �۾��� jsp���� ó���غ���</h1>
	<%
		//��û���� ����
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
	%>
	<h3>���̵�:<%= id %></h3>
	<h3>�н�����:<%= pass %></h3>
</body>
</html>