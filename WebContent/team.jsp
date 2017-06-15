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

<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>

<link rel="stylesheet" href="css/team.css">

</head>
<body>
<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="team" align="center">
	<h1>チーム情報</h1><hr>
	<br>


<s:iterator value="teamUserList">
	<table class="teaminfo">
	<tr>
	<th>ユーザー名：</th><td><s:property value="familyNameKanji"/> <s:property value="givenNameKanji"/></td>
	</tr>


	<tr>
	<th> チ ー ム ：</th><td><s:property value="teamName"/></td>

	<tr>

	<tr>
	<th>  役  職  ：</th>
		<td>
			<s:if test="%{#session.userFlg == 1}">メンバー</s:if>
			<s:if test="%{#session.userFlg == 2}">リーダー</s:if>
			<s:if test="%{#session.userFlg >= 3}">管理者</s:if>
		</td>
	</table>
	</s:iterator>


	<br>
	<div align="center">
	<a href="GoTeamEditAction">編集ページ</a>
	</div>
	</div>

</body>
</html>