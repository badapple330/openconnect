<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功</title>
</head>
<body>
<center>
<br><br>
<h2>ログインしました</h2><br>
<h3>
<%
String name = request.getParameter("name"); //requestで値を引き継ぐ
	out.println("ようこそ"+name+"さん！");
%></h3><br><br>

<button type="button" onclick="location.href='http://localhost:8080/Kadai8_1/'">
<font size="3">ログアウト</font>
</button>

</center>
</body>
</html>