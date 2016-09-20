<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="css/login.css">
<body>

	<s:form action="LoginAction">
		<s:textfield name="name" label="%{getText('login.user')}" placeholder="NAME" />
		<s:password name="password" label="%{getText('login.password')}" placeholder="PASS"/>
		<s:submit type="button" value="%{getText('login.signIn')}" />
	</s:form>
	<s:form action="newUser">
		<s:submit type="button" value="%{getText('login.new')}" />
	</s:form>

	<s:submit type="button" value="Twitter" />
	<s:submit type="button" value="FaceBook" />
	<s:submit type="button" value="Google" />
</body>
</html>