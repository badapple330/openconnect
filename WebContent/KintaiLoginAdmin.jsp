<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理ログイン</title>
<link href="css/LoginAdmin.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1 class="window">
<s:form action="GoKintaiAction">
			<s:textfield label="管理者名" name="adminName" value="" size="15"></s:textfield>
			<s:password  label="パスワード" name="adminPass" value="5" size="16"></s:password>
			<s:submit name="submit" value="Login"/>
	</s:form>
	</h1>
	</body>
</html>