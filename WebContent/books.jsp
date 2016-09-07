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

	<s:form action="BooksSearch">
		<input type="text" name="search">
		<input class="button" type="submit" value="検索">
	</s:form>

	<s:form action="BooksEdit">
		<table border="1" cellspacing="0">
			<tr>
				<th>ID</th>
				<th width="500">タイトル一覧</th>
				<th></th>
				<th>削除</th>
			</tr>

			<s:iterator value="bookList">

				<tr>

					<td><input type="text" name ="bookIdList" value ="<s:property  value="bookId" />"></td>
					<td><input type="text" name ="titleList" value="<s:property value="title" />"></td>
					<td></td>

					<td><input type="submit" class="button" value="削除"></td>

				</tr>

				</s:iterator>

			<s:iterator value="searchList">
				<tr>
					<td><s:property value="bookId" /></td>
					<td><input type="text" value="<s:property value="title" />"></td>
				</tr>
			</s:iterator>

		</table>

		<td><input type="submit" class="button" value="編集" /></td>

<%-- 		<s:iterator value="bookListEdit"> --%>
<!-- 			<tr> -->
<%-- 				<td><s:property value="bookIdList" /></td> --%>
<!-- 			</tr> -->
<%-- 		</s:iterator> --%>

	</s:form>

	<!-- 	<div id="delete-prepare"> -->
	<!-- 		本当に削除しますか？ <input type="button" class="delete-true button" value="はい"> -->
	<!-- 		<input type="button" class="modal-close button" value="いいえ"> -->
	<!-- 	</div> -->

	<div class="delete">
		<s:form action="BooksDelete">
			<input type="text" id="delete-booklistid" name="bookId"
				placeholder="プロジェクトID">
			<input type="submit" class="button" value="削除">
			<!-- 			<input type="button" class="modal-close button" value="閉じる"> -->
		</s:form>
	</div>


	書籍の追加
	<s:form action="BooksCreate">
		<input type="text" name="title">
		<input class="button" type="submit" value="追加">
	</s:form>

	<s:form action="BackGoAction">
		<input type="submit" class="button" value="戻る">
	</s:form>

</body>
</html>