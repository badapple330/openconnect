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

	<s:form action="BookListSearch">
		<input type="text" name="search">
		<input class="button" type="submit" value="検索">
	</s:form>


<table border="1" cellspacing="0">

		<tr>

			<th>id</th>
			<th width="500">タイトル一覧</th>
			<th></th>
			<th></th>


		</tr>

		<s:iterator value="searchList">
		<tr>
			<td><s:property value="bookId" /></td>
			<td><s:property value="title" /></td>
		</tr>
	</s:iterator>

		<s:iterator value ="bookList">

		<tr>

			<td><s:property value = "bookId"/></td>
			<td><s:property value = "title"/></td>
			<td></td>
			<td><input class="button" type="submit" value="削除"></td>


		</tr>

	</s:iterator>

	<s:iterator value="title">
		<tr>
			<td><s:property value="bookId" /></td>
			<td><s:property value="title" /></td>
		</tr>
	</s:iterator>

	</table>

	書籍の追加
	<s:form action="BookListCreate">
	<input type="text" name="title">
	<input class="button" type="submit" value="追加">
	</s:form>



	<br>
	<input class="button" type="submit" value="編集">

	<br>
	<input class="button" type="submit" value="戻る">


</body>
</html>
