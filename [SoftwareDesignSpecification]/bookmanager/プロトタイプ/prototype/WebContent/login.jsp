<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<center>
<h4>ログイン認証</h4><br>
<h4>名前とパスワードを入力してください</h4><br>
<s:form action="loginaction">
<table>
<tr>
<td>名前</td> <td><s:textfield name="name" value="" theme="simple"/></td>
</tr>
<tr>
<td>パスワード</td> <td><s:textfield name="password" value="" theme="simple"/></td>
</tr>
<tr><td></td><td><s:submit value="入力"/>
</table>
</s:form>
</center>
</body>
</html>