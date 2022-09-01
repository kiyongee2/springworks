<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div id="container">
		<section id="signup">
			<div class="title">
				<h2>회원 가입</h2>
			</div>
			<form action="/member/signup" method="post" 
				  onsubmit="return checkForm()" name="newWrite">
				<table class="tbl_signup">
					<tr>
						<td>아이디</td>
						<td><input type="text" name="userid" placeholder="ID"></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="userpw"
						       placeholder="PASSWORD"></td>
					</tr>
					<tr>
						<td>비밀번호 확인</td>
						<td><input type="password" name="userpw_confirm"
						       placeholder="PASSWORD"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="username"></td>
					</tr>
					
					<tr>
						<td colspan="2">
							<input type="submit" value="등록">
							<input type="reset" value="취소">
						</td>
					</tr>
				</table>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</section>
	</div>
</body>
</html>