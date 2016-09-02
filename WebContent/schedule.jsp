<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>スケジュール一覧</title>
</head>
<body>
<p>プロジェクト検索</p>
<s:form action="ScheduleSelect">
<s:textfield name="search" label="プロジェクト検索" placeholder="件名を入力" />
<s:submit value="検索"></s:submit>
</s:form>
<br>
<%-- <s:property value="id"/> --%>





<s:form action="ScheduleUpdate">
<table border="2" style="white">
<tbody>
<tr>
<td>ID</td><td>開始日</td><td>終了日</td><td>件名</td><td>内容</td>
</tr>

<s:iterator value="schedulelist" status="st">
<tr>
<td><input type="text" name="id" value="<s:property value="Id" />"></td>
<td><input type="text" name="startdate" value="<s:property value="Startdate" />"></td>
<td><input type="text" name="enddate" value="<s:property value="Enddate" />"></td>
<td><input type="text" name="title" value="<s:property value="Title" />"></td>
<td><input type="text" name="content" value="<s:property value="Content" />"></td>
</tr>
</s:iterator>
</tbody>
</table>
<button type="submit" class="button">編集</button>
</s:form>

<br><br>

<s:form action="ScheduleInsert">
<table border="2" cellspacing="0"style="white">
<tbody>
<tr>
<td>開始日</td><td>件名</td><td>内容</td><td></td>
</tr>
<tr>
<td><input type="text" name="startdate"></td>
<td><input type="text" name="title"></td>
<td><input type="text" name="content"></td>
<td><button type="submit" class="button">追加</button></td></tr>
</s:form>
</tbody>
</table>

<br>
<s:form action="GetAddressAction">
<button type="submit" class="button">戻る</button>
</s:form>
</body>
</html>