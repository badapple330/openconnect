<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>書籍一覧</title>
</head>
<body>

	<div class="header">
		<h1>ヘッダー</h1>
	</div>
	<br>
	<h1>書籍一覧</h1>
	<br>
	<br> 書籍の検索
	<input type="text" name="○○○○">
	<input class="button" type="submit" value="検索">

	<table border="1">
		<tr>
			<th>id</th>
			<th width="400">タイトル一覧</th>
			<th></th>
			<th>借りた人</th>
			<th>借りた日付</th>
			<th></th>
			<th></th>
		</tr>
		<s:iterator value="booklist">
			<tr>
				<td><s:property value="bookId" /></td>
				<td><s:property value="title" /></td>
				<td>貸出可</td>
				<td><s:property value="borrowHuman" /></td>
				<td><s:property value="borrowDay" /></td>
				<td></td>
				<td><input class="button" type="submit" value="削除"></td>
			</tr>
		</s:iterator>
	</table>


	書籍の追加
	<input type="text" name="○○○○">
	<input class="button" type="submit" value="追加">
	<br>
	<input class="button" type="submit" value="編集">

	<br>
	<input class="button" type="submit" value="戻る">


</body>
</html>
