<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
	<% 
	
	for(int i=1; i<=6; i++){%>
		
			<tr>
				<th><h3><%= i %></h3></th>
			</tr>
		
	<%} 
	
	%>
	</table>
</body>
</html>