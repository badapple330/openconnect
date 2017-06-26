<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="BotExerciseAction">
    <textarea name="sentence" class="form-control" rows="10" cols="80%" id="sendContents"></textarea>
    <button type="submit">送信</button>
</s:form>
</body>
</html>