.<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
String name="이순신";

public String getname(){
	return name;
}
%>
<%
//request 모든 값이 문자로 전송.....사용할 때 문자,숫자,날짜 등으로 변환
String age = request.getParameter("age");

//여러 문장으로 구성, 프로그램 작성(가공)
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- 표현식은 1줄 처리 =>출력 -->
<h1>안녕하세요 <%=name %></h1> <!-- 변수값 출력 -->
<h1>나이는 <%=age %>입니다.</h1> <!-- 전달받은 값을 출력 -->
<h1>나이는 <%=180 %> cm입니다.</h1> <!-- 직접 값을 출력 -->
<h1>나이+10은 <%=age+10 %>살 입니다.</h1> <!-- 연산식 사용가능 -->
<h1>나이+10은 <%=Integer.parseInt(age)+10 %></h1><!-- 메소드 사용 -->
</body>
</html>