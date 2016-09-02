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
<s:property value="id"/>
<table border="2" cellspacing="0"style="white">
<tr>

<td>ID</td><td>開始日</td><td>終了日</td><td>件名</td><td>内容</td>
</tr>

<tbody>
<s:form action="ScheduleUpdate">
<s:iterator value="schedulelist" status="st">
<tr>
<td><input type="text" name="id" value="<s:property value="Id" />"></td>
<td><input type="text" name="startdate" value="<s:property value="Startdate" />"></td>
<td><input type="text" name="enddate" value="<s:property value="Enddate" />"></td>
<td><input type="text" name="title" value="<s:property value="Title" />"></td>
<td><input type="text" name="content" value="<s:property value="Content" />"></td>
</tr>
</s:iterator>
<button type="submit" class="button">編集</button>
</s:form>
</tbody>
</table>

<br><br>

<table border="2" cellspacing="0"style="white">
<tr>
<td>開始日</td><td>件名</td><td>内容</td><td></td>
</tr>
<tr>
<s:form action="ScheduleInsert">
<td><input type="text" name="startdate"></td>
<td><input type="text" name="title"></td>
<td><input type="text" name="content"></td>
<td><button type="submit" class="button">追加</button></td>
</s:form>
</tr>
</table>

<br>
<br>

<br>
<br>
<button type="submit" class="button">戻る</button>
</body>
</html>