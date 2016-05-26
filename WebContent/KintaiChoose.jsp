<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勤怠管理</title>
<link href="css/KintaiChoose.css" rel="stylesheet">
</head>
<body>
	<s:form action="">
			<s:submit cssClass="btn" value="出席" />
	</s:form>
	<s:form action="">
			<s:submit cssClass="btn" value="欠席" />
	</s:form>
	<s:form action="">
			<s:submit cssClass="btn" value="遅刻" />
	</s:form>
	<s:form action="">
			<s:submit cssClass="btn" value="面談" />
	</s:form>
</body>
</html>