<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<jsp:include page="./menu.jsp" />
	<div id="container">
		<section id="main">
			<div class="title">
				<h2>Welcome to our community...</h2>
			</div>
			
			<div>
				<img src="/resources/images/activity.jpg" alt="행글라이더" id="pic">
			</div>
		</section>
	</div>
	<jsp:include page="./footer.jsp" />
	<script type="text/javascript">
		//메인 이미지 슬라이드 효과
		let picture = ["/resources/images/activity.jpg", "/resources/images/healing.jpg"];
		let idx = 0;
		
		slideShow();  //함수 호출
		
		function slideShow(){
			document.getElementById("pic").src = picture[idx];
			idx++;
			if(idx == picture.length)
				idx = 0;
			
			setTimeout(slideShow, 2000);  //2초 간격, 콜백 함수(괄호 생략)
		}
	</script>
</body>
</html>