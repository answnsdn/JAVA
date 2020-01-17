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
		String str = "java";
		int size = str.length();
		if(size>=4){%>
				<h1>좋아요:<%= size %></h1>
	<%	}else{ %>
			<h1>싫어요 : <%= size %></h1>
	<%	} %>
</body>
</html>