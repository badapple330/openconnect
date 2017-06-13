<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>チーム情報</title>

<script src="js/jquery-3.1.0.min.js"></script>
<link rel="stylesheet" href="css/team.css">

</head>
<body>
<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="team" align="center">
	<h1>チーム情報</h1><hr>
	<br>

	<table class="teaminfo">
	<tr>
	<td>ユーザー名：</td><td>プロパティユーザー名</td>
	</tr>

	<tr>
	<td>チーム：</td><td>プロパティチーム名</td>
	<tr>

	<tr>
	<td>役職：</td><td>プロパティ役職</td>
	</table>
	</div>

	<br>
	<div align="center">
	<a href="team_edit.jsp">編集ページ</a>
	</div>

</body>
</html>