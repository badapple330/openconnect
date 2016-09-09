<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>books_borrow</title>
</head>
<body>

	<div class="header">
		<h1>ヘッダー</h1>
	</div>
	<br>
	<h1>書籍貸し出し</h1>
	<br>
	<br>


	<table border="1" cellspacing="0">
		<th>id</th>
		<th width="300">タイトル</th>
		<th width="150">貸し出し状況</th>
		<th width="200">日付</th>
		<th width="50">ユーザーID</th>

		<s:iterator value="bookList">
			<tr>
				<td><input type="text" name="bookIdList"
					value="<s:property  value="bookId" />" class="bookId"></td>
				<td><input type="text" name="title"
					value="<s:property value="title" />" class="title"></td>
				<td><input type="text" name="statusList"
					value="<s:property value="borrowStatus" />" class="status"></td>
				<td><input type="text" name="dayList"
					value="<s:property value="borrowDay" />" class="day"></td>
				<td><input type="text" name="borrowIdList"
					value="<s:property value="borrowId" />" class="userId"></td>

			</tr>
		</s:iterator>
	</table>

	<br>

<%-- 	<s:form action="BooksBorrowCreate"> --%>
<!-- 		<input type="text" name="id" placeholder="本のID入力してください"> -->
<!-- 		<input class="button" type="submit" value="追加"> -->

<%-- 	</s:form> --%>

	<s:form action="BooksBorrowUpdate">
	ID
	<br>
		<input type="text" name="bookId" placeholder="ID入力してください">
		<br>

		ユーザーID
		 <br>
		<input type="text" name="borrowId" placeholder="ユーザーID入力してください">
		<input class="button" type="submit" value="貸し出し">
	</s:form>

		<s:form action="BackGoAction">
		<input class="button" type="submit" value="戻る">
		</s:form>
</body>
</html>

