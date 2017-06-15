<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>チーム情報編集</title>

<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<link rel="stylesheet" href="css/team.css">

</head>
<body>
<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div align="center" class="team">
	<h1 >チーム情報編集</h1><hr>
	<br>

	<font color="red">
	<s:property value="%{teamMes}"/>
	 </font><br>

	変更内容を以下に記入してください
	<s:form action="TeamEditAction">
	<table class="teamedit">
	<tr>
		<td>チーム名：</td>
		<td><input type="text" name=teamName  size="30" pattern="^[0-9A-Za-z]+$" placeholder="半角英数で入力してください" title="半角英数で入力してください"/></td>
	</tr>
	<tr>
		<td>役職：</td>
		<td>
			<select name="userFlg" style="width:200px;">
			<option value="">以下から選択</option>
			<option value="1">メンバー</option>
			<option value="2">リーダー</option>
			</select>
		</td>
	</tr>
	</table>

<br>
	<input type="submit"  value="編集を確定" class="button"/>

	</s:form>
	</div>

</body>
</html>