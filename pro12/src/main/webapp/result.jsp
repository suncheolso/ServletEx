<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 //프로그램에 위치는 사용하고자하는 범위
 request.setCharacterEncoding("UTF-8"); //Jsp로 사용
		//입력폼에서 전달한 user_id, user_pw를 저장
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디가 admin, 비밀번호 1234하고 같으면 -->
	<!--  로그인 성공 페이지 출력, 그외는 로그인 실패 페이지를 출력 -->
	<!-- 분리 작업(if문) -->
	<%
	if(user_id.equals("admin") && user_pw.equals("1234")){
	%>
		<h1><%=user_id %>님</h1>
		<h1>로그인에 성공하였습니다.</h1>
	<%
	} else{
	%>
		<h1><%=user_id %>는 등록되지 않은 회원입니다.</h1>
		<h1>로그인에 실패하였습니다.</h1>
	<%
		
	}
	%>
	
	
	
</body>
</html>