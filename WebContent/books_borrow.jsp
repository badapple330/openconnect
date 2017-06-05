<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>

<!-- css読み込み  -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/books_borrow.css" rel="stylesheet">
<!-- js読み込み -->
<%-- <script src="js/bootstrap.js"></script> --%>
<script src="js/header.js"></script>

<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>書籍貸し出し</title>
<link rel="stylesheet" href="./css/books_borrow.css" type="text/css"/>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div class="container">

		<br>
		<h1>書籍貸し出し</h1>
		<br> <br>


		<s:if test="%{#session.userFlg >= 1}">

			<s:property value="%{resultSelect}" />
			<br>
			<table class="type01">
				<thead>
				<tr>
					<td><div class="smallWidth"><font color="white">id</font></div></td>
					<td><div class="bigWidth"><font color="white">タイトル</font></div></td>
					<td><div class="middleWidth"><font color="white">貸し出し状況</font></div></td>
					<td><div class="middleWidth"><font color="white">日付</font></div></td>
					<td><div class="middleWidth"><font color="white">ユ ーザー名</font></div></td>
				</tr>
				</thead>
				<tbody>
				<s:iterator value="bookList">
					<tr>
						<th><s:property value="bookId" /><input type="hidden"
							name="bookIdList" value="<s:property  value="bookId" />"
							class="bookId"></th>
						<th><s:property value="title" /><input type="hidden"
							name="title" value="<s:property value="title" />" class="title"></th>
						<th><s:property value="borrowStatus" /><input type="hidden"
							name="statusList" value="<s:property value="borrowStatus" />"
							class="status"></th>
						<th><s:property value="borrowDay" /><input type="hidden"
							name="dayList" value="<s:property value="borrowDay" />"
							class="day"></th>
						<th><s:property value="userName" /><input type="hidden"
							name="borrowIdList" value="<s:property value="userName" />"
							class="userName"></th>

					</tr>
				</s:iterator>
				</tbody>
			</table>
			<br>

			<center><h3>書籍＆ユーザーID入力</h3></center>
<div class="container" align="center"style="border:1px solid #F00;padding:10px;border-radius:10px;width:200px">
	<div class="row">
		<div class="col-md-6 col-md-offset-4">
 			<div class="pad">
				<s:form action="BooksBorrowUpdateAction">
					書籍のIDを入力
					<br>
					<input type="text" name="bookId" pattern="[1-9][0-9]*" maxlength="3"
					title="半角数字3桁以内" required placeholder="半角数字で入力">
						<br><br>

					ユーザーIDを入力
		 			<br>
						<input type="text" name="borrowId" pattern="[1-9][0-9]*"
					title="半角数字3桁以内" maxlength="3" placeholder="半角数字で入力"><br><br>
							<input class="square_btn" type="submit" value="貸し出し">

				</s:form>
			</div>
 		</div>
 	</div>
</div>

		</s:if>

		<s:else>
		ログイン後表示します
		</s:else>

		<s:form action="BooksSelectAction">
			<input class="rti_btn" type="submit" value="戻る">
			<br>
		</s:form>
	</div>

</body>
</html>

