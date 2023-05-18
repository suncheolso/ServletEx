<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post"> <!-- servlet에 전달 login -->
		아이디 : <input type="text" name="user_id"><br> <!-- 아이디 입력 -->	
		비밀번호 : <input type="password" name="user_pw"><br> <!-- 비밀번호 입력 -->
		<input type="submit" value="등록">
		<input type="reset" value="다시작성"> <!-- 등록, 취소버튼 -->
	</form>
</body>
</html>