<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>情報変更</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" media="all" />
<link rel="stylesheet" type="text/css" href="../css/edit_user.css">
</head>
<body>
<div id="backimg">
		<br>
		<br>
		<br>
		<h1>情報変更</h1>
		<br>
		<br>
			<div class="form">
				
				<p><span>※</span>のついているものは必須入力です。<br>
				名前を変更することはできません。</p>
				<br>
				<br>
			<table>
				<tr>
					<td>お名前</td>
				</tr>
				<tr>
					<td>山田　太郎</td>
				</tr>
			</table>
			<br>
			<br>
			<table>
				<tr>
					<td><span>※</span>パスワード(8文字以上、16文字以内)</td>
				</tr>
				<tr>
					<td><input type="password" name="password" size="50" minlength="8" maxlength="16"></td>
				</tr>
			</table>
			<br>
			<table>
				<tr>
					<td><span>※</span>パスワード(確認用)</td>
				</tr>
				<tr>
					<td><input type="password" name="saipassword" size="50" minlength="8" maxlength="16"><br></td>
				</tr>
				<tr>
					<td><input type="checkbox">パスワードを表示</td>
				</tr>
			</table>
			<br>
			<br>
			<table>
				<tr>
					<td><h5>☆メールアドレスはIDとして使用します。</h5></td>
				</tr>
				<tr>
					<td><span>※</span>メールアドレス(1文字以上、256文字以内)</td>
				</tr>
				<tr>
					<td><input type="text" name="mail" size="50" minlength="1" maxlength="256"></td>
				</tr>
			</table>
			<br>
			<table>
				<tr>
					<td><span>※</span>メールアドレス(確認用)</td>
				</tr>
				<tr>
					<td><input type="text" name="saimail" size="50" minlength="1" maxlength="256"></td>
				</tr>
			</table>
		</div>
			<br>
			<br>
			<br>
			<div align="center">
				<button class="btn" type="submit">
					確定
				</button>
			</div>
			<br>
			<br>
			<br>
		</div>
	</body>
</html>
