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
		<th width="150">貸し出し状況</th>
		<th width="250">日付</th>
		<th width="50">ユーザーID</th>

		<s:iterator value="bookList">
			<tr>
				<td><input type="text" name="bookIdList"
					value="<s:property  value="bookId" />" class="bookId"></td>
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

	<s:form action="">
	ID
	<p>
			<input type="text" name="id">
		<p>ユーザーID
		<p>
			<input type="text" name="userId"> <input class="button"
				type="submit" value="書籍貸し出し確認">
	</s:form>
</body>
</html>

