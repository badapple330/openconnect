<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>PassWord</TITLE>
</HEAD>
<body bgcolor="#f5f5f5"><br>

<nobr><center><h1>勤怠管理サイト</h1></center>
<div align="right">


<!-- action1------------
------------------------------------------------------------------------- -->
<s:form action="LogoutAction">
<s:submit type="submit" value="ログイン画面に戻る" />
</s:form></div>


<center><hr size="10" color="#66cdaa" noshade><font size=5><B>新規登録</B></FONT></nobr>
<br>
<br>

<nobr><center><b>新規登録を行います、	ユーザー名とユーザーパスワードを入力してください</b></center>
<center><b>ユーザー名とパスワードは半角英数字で入力してください</b></center></nobr>
<br>




    <!-- action2--------------------------------------------------------------------------------------未 -->

<s:form action="RegisterAction">
<table border="0"align="center"width="400" >

        <tr><td><s:textfield  label="ユーザー名" name="username" placeholder="user name"/>
        </td></tr>
             <td><s:password  label="ユーザーパスワード" name="password1" placeholder="password"/></td>
    <tr>


        <td><s:password  label="パスワード再入力" name="password2"  placeholder="password"  />
        </td></tr>
            <tr><td colspan="2" align="center">

		<font size="2" color="red"><s:property value="errormsg5"/></font><br>
		<font size="2" color="red"><s:property value="successmsg"/></font><br>
		<font size="2" color="red"><s:property value="errormsg6"/></font>
</td></tr>


</table>
                        <TABLE BORDER="0">
<TR>
<TD>
<table border="0">
<tr>
<td><s:submit type="submit" name="button1"  value="登録" align="center" /></td>
</tr>
</table>
</TD>
<TD>
<table border="0">
<tr>
<td></td>
</tr>
</table>
</TD>
</TR>
</TABLE>

</s:form>


<br>
<br>
<hr size="10" color="#66cdaa" noshade>
<div>
<ul>
  <li><FONT size="3">Copyright 2014 INTERNOUS KINTAI CONTROL All
  Rights Reserved /</FONT></li>
</ul>
</div>
</BODY></HTML>