<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/green_bread.css" type="text/css">
<title>緑</title>
</head>
<body>
<ul class="bread">
<li class="red">
<s:url action="GoRedBread" id="redUrl" />
<s:a href="%{redUrl}">赤</s:a>
</li>
<li class="blue">
<s:url action="GoBlueBread" id="blueUrl" />
<s:a href="%{blueUrl}">青</s:a>
</li>
<li class="green">緑</li>
</ul>
<h1>緑です！</h1>
<s:form action="GoTop">
<s:submit value="TOPへ"></s:submit>
</s:form>
</body>
</html>