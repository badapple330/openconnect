<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>書籍貸し出し</title>
<link rel="stylesheet" href="css/books_borrow.css">
</head>
<body>


	<jsp:include page="header.jsp" />

	<div class="container">

		<br>
		<h1>書籍貸し出し</h1>
		<br><br>

		<table border="1">

			<th><center>id</center></th>
			<th><center>タイトル</center></th>
			<th><center>貸し出し状況</center></th>
			<th><center>日付</center></th>
			<th><center>ユーザーID</center></th>


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

		<s:form action="BooksBorrowUpdateAction">
	書籍のID
	<br>
			<input type="text" name="bookId" pattern="[1-9][0-9]*" maxlength="3" required placeholder="ID入力してください">
			<br>

		ユーザーID
		 <br>
			<input type="text" name="borrowId" pattern="[1-9][0-9]*" maxlength="3" placeholder="ユーザーID入力してください">
			<input class="button" type="submit" value="貸し出し">
			<br>
		</s:form>

		<s:form action="BackGoAction">
			<input class="button" type="submit" value="戻る">
			<br>
		</s:form>
	</div>
</body>
</html>

