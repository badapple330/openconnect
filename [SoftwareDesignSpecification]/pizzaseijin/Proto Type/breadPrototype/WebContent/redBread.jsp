<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/red_bread.css" type="text/css">
<title>赤</title>
</head>
<body>
<ul class="bread">
</ul>
<h1>赤です！</h1>
<s:form action="GoBlueBread">
<s:submit value="次へ"></s:submit>
</s:form>
</body>
</html>