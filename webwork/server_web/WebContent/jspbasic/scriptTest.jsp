
<%@page import="dept.DeptDTO"%>
<%@page import="java.util.Date"%>
<%@page import="fw.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" 
    import="java.util.Random , java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML�ּ��� (Ŭ���̾�Ʈ�� ���۵ȴ�.) -->
	<!-- JSP�ּ��� (Ŭ���̾�Ʈ�� ���۵��� �ʴ´�.) -->
	<h2>1. ��ũ��Ʈ�� - �ڹ��ڵ带 ������ �� �ִ�.</h2>
	
	<%
	//�ڹ� �ּ� - Ŭ���̾�Ʈ�� ������ ���� �ʴ´�.
	/*
	�ڹ� - Ŭ���̾�Ʈ�� ���۵��� �ʴ´�.
	�ּ���
	*/
	String str = new String("Java");
	out.print("<h3>���ڿ��� ���� : "+str.length()+"</h3>");
	Random rand = null;
	ArrayList list = null;
	DeptDTO dept = null;
	%>
	<h2>�߰��۾�</h2>
	<%
		int num = 100;
	%>
	<h2>2. ����</h2>
	<%! int num = 10000; %>
	<%! public void test(){//�Ⱦ���.
			System.out.print("test");}
	%>
	<h2>ǥ����</h2>
	<h4><%= 10000 %></h4>
	<h4><%= 10.5 %></h4>
	<h4><%= "���ڿ��� ����"+str.length() %></h4>
	<h4><%= new Date().toString() %></h4>
	<h4><%= 100/3 %></h4>
	
</body>
</html>