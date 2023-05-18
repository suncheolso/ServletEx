<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
//전역변수, 메소드를 생성
	String name="이순신"; //전역변수
	
	public String getName(){ //메소드
		return name; 
	}
%>

<%
//자바프로그램을 구현
	String age = request.getParameter("age"); //age로 전달받는 값을
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>안녕하세요. <%=name %></h1> //변수값을 출력
<h1>나이는 <%=age %>입니다.</h1>
</body>
</html>