<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ログイン失敗</title>
		<link href="css/error.css" rel="stylesheet" type="text/css" >
	</head>

	<body>
	<br>
		<p class="zannen">ログイン失敗</p>
			<s:form theme="simple" id="inner" action="logout">
			<s:submit name="submit" value="リトライ"/>
			</s:form>
		</body>

</html>