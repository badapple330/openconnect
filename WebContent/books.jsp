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

	<jsp:include page="header.jsp" />

	<div class="container">

		<br>
		<h1>書籍一覧</h1>
		<br> <br> 書籍の検索

		<s:form action="BooksSelectAction">
			<input type="text" name="search" maxlength="20"
				placeholder="タイトル入力してください">
			<input class="button" type="submit" value="検索">
		</s:form>
		<br>
		<s:property value="%{resultString}"/>
		<br>

		<s:form action="BooksUpdateAction">
			<table border="1" cellspacing="0">
				<tr>
					<th><center>ID</center></th>
					<th width="500"><center>タイトル一覧</center></th>
					<s:if test="%{#session.userFlg == 3}">
						<th><center>削除</center></th>
					</s:if>
					<th></th>
				</tr>

				<s:iterator value="searchList">
					<tr>
						<td class="bookId"><s:property value="bookId" /></td>
						<td><input type="text" name="titleList"
							value="<s:property value="title" />" class="bookTitle"></td>
						<td><s:if test="%{#session.userFlg == 3}">
								<input type="button" class="button modal-open" value="削除">
							</s:if></td>
						<td><input type="hidden" name="bookIdList"
							value="<s:property value="bookId" />"></td>
					</tr>
				</s:iterator>
			</table>
			<td><s:if test="%{#session.userFlg == 3}">
					<input type="submit" class="button" value="編集" />
				</s:if></td>
		</s:form>

		<div id="modal-main">
			<!-- #contents START -->
			ID <span id="book_id"></span><br> タイトル <span id="title"></span><br>
			<input type="button" class="delete-true button" value="削除"><br>
			<input type="button" class="modal-close button" value="閉じる">

			<div class="delete-prepare">
				本当に削除しますか？
				<s:form action="BooksDeleteAction">
					<input type="hidden" name="bookId" value="" id="true-delete">
					<input type="submit" class="delete-true button" value="はい">
					<input type="button" class="modal-close button" value="いいえ">
				</s:form>
			</div>
		</div>

		<s:form action="BooksInsertAction">
			<s:if test="%{#session.userFlg == 3}">
			書籍の追加
				<input type="text" name="title" placeholder="タイトル入力してください">
				<input class="button" type="submit" value="追加">
			</s:if>
			<br>
		</s:form>

		<s:form action="BooksBorrowSelectAction">
			<input type="submit" class="button" value="貸し出し">
			<br>
		</s:form>

		<s:form action="BackGoAction">
			<input type="submit" class="button" value="戻る">
			<br>
		</s:form>

	</div>
</body>
</html>