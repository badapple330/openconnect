<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/blue_bread.css" type="text/css">
<title>青</title>
</head>
<body>
<ul class="bread">
<li class="red">
<s:url action="GoRedBread" id="redUrl" />
<s:a href="%{redUrl}">赤</s:a>
</li>
<li class="blue">青</li>
</ul>
<h1>青です！</h1>
<s:form action="GoGreenBread">
<s:submit value="次へ"></s:submit>
</s:form>
</body>
</html>