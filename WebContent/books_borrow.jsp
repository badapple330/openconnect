<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>books_borrow</title>
</head>
<body>

	<div class="header">
		<h1>ヘッダー</h1>
	</div>
	<br>
	<h1>書籍貸し出し</h1>
	<br>
	<br>

	<table border="1" cellspacing="0">
		<th width="150">貸し出し状況</th>
		<th width="250">日付</th>
		<th width="50">ユーザーID</th>
	</table>
	<br>

	<s:form action="">
		<input class="button" type="submit" value="書籍貸し出し">
	</s:form>
</body>
</html>

