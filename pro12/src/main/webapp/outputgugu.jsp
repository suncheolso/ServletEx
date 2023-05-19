<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    getbootstrap.com
    부트스트랩 - 웹 표준 - 구글
    CSS, jQuery => 양식폼
    부트스트랩 3,	4,	5 
    
<%
	request.setCharacterEncoding("UTF-8"); //JSP로 사용
    //입력폼에서 전달한 user_id, user_pw를 저장
    //String dan=request.getParameter("dan") 계산불가
    //데이터형 오류
    //String dan = Integer.parseInt(request.getParameter("dan"));
	int dan = Integer.parseInt(request.getParameter("dan"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=dan %>단</h3>
<% 
	for(int i=1; i<10; i++) {
%>
	<%=dan %> * <%=i %> = <%=dan*i %><br>
<%	
}
%>
<!-- 보강작업 -->
<br><br>
<a href="gugu">구구단 입력으로</a>
</body>
</html>