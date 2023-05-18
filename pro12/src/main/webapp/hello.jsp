<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
String name = "듀크"; //전역변수

public String getName(){ //메소드(이름을 전달하는 메소드)
	return name;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- 브라우저에서 출력되는 부분 -->
	<h1>안녕하세요.<%=name %></h1> <!-- name에 저장된 값을 출력 -->
</body>
</html>