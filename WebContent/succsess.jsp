<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ログイン成功</title>
	<link href="css/success.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>!!SUCCESS!!</h1>
	<div class="nameposition">
		<p class="success">ログイン成功
		<br><s:property value="#session.username" />さん
		</p>
	</div>


		<form action="GetAddressAction" id="inner" class="formp">
			<input type="submit" name="submit" value="アプリ一覧" />
		</form>
		<form action="logout" id="inner" class="formp">
			<input type="submit" name="submit2" value="ログアウト"/>
		</form>
</body>
</html>

