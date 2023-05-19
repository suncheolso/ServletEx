<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 설치 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
<!-- div 구역나누기, 그룹나누기 -->
<!-- class-효과(변경불가), id(변경가능)-태그명, name(변경가능)=변수 for=지정한 id를 위해-->
<!-- label 출력 -->
<!-- 부트스트랩은 화면을 12칸으로 구성 -->
<!-- w3schools.com 사용법 -->
	<h3>알고싶은 구구단 구하기</h3>
	<form method="post" action="gugu">
		<div class="mb-3 col-3">
			  <label for="exampleFormControlInput1" class="form-label">구구단</label>
			  <input type="number" name="dan" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
		</div>
		<div class="col-auto">
	   		 <input type="submit" id="inputPassword6" class="form-control" aria-labelledby="passwordHelpInline">
	 	 </div>
		
		<input type="submit" value="구구단">
	
	</form>
</body>
</html>