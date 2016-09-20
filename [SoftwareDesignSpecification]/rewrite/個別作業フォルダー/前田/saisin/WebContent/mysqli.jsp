<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to our site!</title>
</head>
<link rel="stylesheet" href="css/mysqli.css">
<body>
	<h1>新規登録</h1>

	<s:form action="UserInsertAction">
		<s:textfield align="center" name="user" label="会員名" />
		<s:property value="errorUser" />
		<br>
		<s:textfield align="center" name="password" label="password" />
		<s:property value="errorPassword" />
		<br>
		<s:submit type="button" label="登録" />
	</s:form>
	<s:form id="btn2" action="GoLoginAction">
		<s:submit value="%{getText('ログインへ戻る')}" />
	</s:form>
</body>
</html>