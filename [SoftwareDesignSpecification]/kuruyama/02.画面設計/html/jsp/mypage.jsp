<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>マイページ</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/mypage.css">
</head>
<body>
<div id = "backimg">
	<div id="information_content">
	<br>
	<br>
	<br>
	<h1>マイページ</h1><br>
	</div>
	<div id="information_text">
<center>
	<table class="mypage_table">
			<tr>
				<td>お名前</td>
				<td> 田中太郎</td>
			</tr>
			<tr>
				<td>フリガナ</td>
				<td> タナカタロウ</td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td>パスワードはセキュリティの関係上表示しません</td>
			</tr>
			<tr>
				<td>ID(メールアドレス)</td>
				<td> ×××@docomo.ne.jp</td>
			</tr>
			<tr>
				<td>カード情報</td>
				<td> VISA</td>
			</tr>
			<tr>
				<td>カード番号</td>
				<td> ●●●●●●●●●●●●●●●●</td>
			</tr>
			<tr>
				<td>有効期限</td>
				<td> 12/16</td>
			</tr>
		</table>
		<br>
		<br>
	</div>
</center>
	<div id="mypage_btn">
			<table>
				<tr>
					<td><button class="btn" type="submit">カード編集</button></td>
					<td><button class="btn" type="submit">マイページ編集</button></td>
					<td><button class="btn" type="submit">退会</button></td>
				</tr>
			</table>
	</div>
	<br>
	<br>
	<br>
</div>
</body>
</html>