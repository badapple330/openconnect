<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登録確認</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/create_user_check.css">
</head>
<body>
	<div id="backimg" align="center">
		<div class="title">
		<h1>登録確認</h1>
	</div>
		<table class="create_check_table">
			<tr>
				<th>お名前</th>
				<td> 佐藤太郎</td>
			</tr>
			<tr>
				<th>フリガナ</th>
				<td> サトウタロウ</td>
			</tr>
			<tr>
				<th>パスワード</th>
				<td>パスワードはセキュリティの関係上表示しません</td>
			</tr>
			<tr>
				<th>ID(メールアドレス)</th>
				<td> ××××@docomo.ne.jp</td>
			</tr>
			<tr>
				<th>カード情報</th>
				<td> VISA</td>
			</tr>
			<tr>
				<th>カード番号</th>
				<td> ●●●●●●●●●●●●●●●●</td>
			</tr>
			<tr>
				<th>有効期限</th>
				<td> 12/16</td>
			</tr>
		</table>

		<div class="kakunin">
			<h4>以上の内容に登録しますよろしいですか？</h4>

			<button class="btn" type="submit">登録</button>
			<button class="btn" type="submit">戻る</button>
		</div>

	</div>
</body>
</html>
