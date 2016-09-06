<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/login.css" />
<title>ログイン</title>
</head>
<body>
		<div class="Hintergrund">
		<br>
		<br>
		<br>
			<h1>ログイン</h1>
			<div class=box2>
				<img src="../img/login_ramen.png" style="zoom: 70%;">
			</div>
			<div class=box3>
				<form action="#">
					<div class="textFeilds">
						<table>
							<tr>
								<td><h4>ID(メールアドレス)</h4></td>
								<td>：<input type="text" name="mailAddress"></td>
							</tr>
							<tr>
								<td><h4>パスワード</h4></td>
								<td>：<input type="password" name="password">
								</td>
							</tr>
						</table>
					</div>

					<div class="sns">
						<a href="#"><img src="../img/Facebook.jpg" class="faceBook" style="width: 50px"></a>
						<a href="#"><img src="../img/twitter.jpg"class="twitter" style="width: 50px"></a>
						<a href="#"><img src="../img/GooglePlusIcon.jpg" class="google"
							style="width: 50px"></a>
					</div>
					<div class="buttons">
						<button class="newBtn" type="submit">新規登録</button>
						<button class="loginBtn" type="submit">ログイン</button>
								<br>
				<br>
				<br>
					</div>
			
				</form>
				
			</div>
			
		</div>

</body>
</html>