<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>書籍一覧</title>
<link rel="stylesheet" href="css/books.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/books.js"></script>
</head>
<body>

	<div class="header">
	<jsp:include page="header.jsp" />
	</div>
	<br>
	<h1>書籍一覧</h1>
	<br>
	<br> 書籍の検索

	<s:form action="BooksSearch">
		<input type="text" name="search"placeholder="タイトル入力してください">
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
					<td><input type="text" name="bookIdList"
						value="<s:property  value="bookId" />" class="bookId"></td>
					<td><input type="text" name="titleList"
						value="<s:property value="title" />" class="bookTitle"></td>
					<td></td>
					<td><input type="button" class="button modal-open" value="削除"></td>
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
	</s:form>


<div id="modal-main">
		<!-- #contents START -->
		ID <input type="text" id="delete-bookid" readonly><br>
		タイトル <input type="text" id="delete-booktitle" readonly><br>
		<input type="button" class="delete-true button" value="削除"> <input
			type="button" class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
					<s:form action="BooksDelete">
				<input type="hidden" name="bookId" value=""
					id="true-delete">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>





	書籍の追加
	<s:form action="BooksCreate">
		<input type="text" name="title"placeholder="タイトル入力してください">
		<input class="button" type="submit" value="追加">
	</s:form>

	<s:form action="BackGoAction">
		<input type="submit" class="button" value="戻る">
	</s:form>

</body>
</html>