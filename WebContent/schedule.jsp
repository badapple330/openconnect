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
<s:textfield name="title" label="プロジェクト検索" placeholder="件名を入力" />
<s:submit value="検索"></s:submit>
</s:form>
<br>
<s:property value="id"/>
<table border="2" cellspacing="0"style="white">
<tr>

<td>ID</td><td>開始日</td><td>終了日</td><td>件名</td><td>内容</td></FONT>
</tr>
<tr>
<s:iterator value="result" status="st">
<td><input type="text" name="id" value="<s:property value="id" />"></td>
<td><s:property value="Startdate" /></td>
<td><s:property value="Enddate" /></td>
<td><s:property value="title" /></td>
<td><s:property value="content" /></td>
</s:iterator>
</tr>
</table>
<input type="text" value="開始日"><input type="text" value="終了日"><input type="text" value="件名"><input type="text" value="内容">

<button type="submit" class="button">追加</button>
<br>
<br>
<button type="submit" class="button">編集</button>
<br>
<br>
<button type="submit" class="button">戻る</button>
</body>
</html>