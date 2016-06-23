<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勤怠登録完了</title>
<link href="css/KintaiChoose.css" rel="stylesheet">
</head>
<body>
<div align="center">
勤怠の登録が完了しました！<BR><BR><BR>
	<s:form action="GoKintaiChooseAction">
	<s:submit cssClass="btn" value="戻る" />
	</s:form>
</div>
</body>
</html>