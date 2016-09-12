<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="UTF-8">
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<title>申請一覧</title>
</head>
<body>

	<jsp:include page="header.jsp" />


			<h1>決裁手続き申請一覧画面</h1>
			<br> <br>
			<table border="1">
				<tr>
					<td>ID</td>
					<td>プロジェクト名</td>
					<td>決裁分類</td>
					<td>申請・承認状況</td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>1</td>
					<td>rewrite</td>
					<td>実施決裁</td>
					<td>未申請</td>
					<td><input type="button" value="プレビュー"></td>
					<td><input type="button" value="承認"></td>
					<td><input type="button" value="差し戻し"></td>
				</tr>
				<tr>
					<td>2</td>
					<td>mira-mode</td>
					<td>実施決裁</td>
					<td>承認待ち</td>
					<td><input type="button" value="プレビュー"></td>
					<td><input type="button" value="承認"></td>
					<td><input type="button" value="差し戻し"></td>
				</tr>
				<tr>
					<td>3</td>
					<td>internousdev</td>
					<td>契約決裁</td>
					<td>承認済み</td>
					<td><input type="button" value="プレビュー"></td>
					<td><input type="button" value="承認"></td>
					<td><input type="button" value="差し戻し"></td>
				</tr>
			</table>
			<br> <br> <input type="button" value="戻る" class="button">

</body>
</html>