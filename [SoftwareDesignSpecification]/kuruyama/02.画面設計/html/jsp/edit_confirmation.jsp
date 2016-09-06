<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>決済情報変更確認</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/edit_confirmation.css">
</head>
<body>
<div id = "backimg" align="center">
<br>
<br>
<br>

	<h1>決済情報変更確認</h1><br>
	<br>

<div id="information_text">
	<table class="edit_confirmation_table">
			<tr>
				<td>お名前</td>
				<td> 田中太郎</td>
			</tr>
			<tr>
				<td>フリガナ</td>
				<td> タナカタロウ</td>
			</tr>
			<tr>
				<td>郵便番号</td>
				<td>×××-××××</td>
			</tr>
			<tr>
				<td>住所</td>
				<td>東京都×××市0-0-0×××マンション109号室</td>
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
</div>
		<h4>以上の内容に確定しますよろしいですか？</h4>
		<br>
		<br>
		<br>
	<div class="edit_cofirmation_btn">
			<table>
				<tr>
					<td><button class="btn" type="submit">確定</button></td>
					<td><button class="btn" type="submit">戻る</button></td>
				</tr>
			</table>
	</div>
	<br>
	<br>
	<br>
</div>
</body>
</html>
