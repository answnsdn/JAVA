<%@page import="dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//������ ������ ������ ��������
		ArrayList<DeptDTO> deptlist = (ArrayList<DeptDTO>)request.getAttribute("result");
		int size = deptlist.size();
		
	%>

	<table>
		<tr>
			<th>�μ��ڵ�</th><th>�μ���</th><th>��ġ</th><th>��ȭ��ȣ</th><th>������</th><th>����</th>
		</tr>
	
	
	<%	for(int i=0;i<size;i++) {
		DeptDTO dept = deptlist.get(i);%>
		<tr>
			<td><%= dept.getDeptNo() %></td>
			<td><%= dept.getDeptName() %></td>
			<td><%= dept.getLoc() %></td>
			<td><%= dept.getTel() %></td>
			<td><%= dept.getMgr() %></td>
			<td><a href="/server_web/dept/delete.do?deptNo=<%= dept.getDeptNo()%>">����</a></td>
		</tr>	

	<%} %> 
	</table>
</body>
</html>