<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- ヘッダー読み込み -->
	<jsp:include page="header.jsp" />
	<!-- ヘッダーここまで -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
		<link href='css/schedule.css' rel='stylesheet' />
        <link href='css/fullcalendar.min.css' rel='stylesheet' />
        <script src="js/calendar/calendar.js"></script>
        <script src="js/calendar/jquery.min.js"></script>
        <script src="js/calendar/jquery-ui.min.js"></script>
        <script src="js/calendar/moment.min.js"></script>
        <script src="js/calendar/fullcalendar.js"></script>
        <script src="js/calendar/fullcalendar.min.js"></script>


<title>スケジュール一覧</title>
</head>
<body>
<h1>Cat'n dogsさんのスケジュール</h1>

<div id ="calendar"></div>

<div id = "memo">
<ul>
	<li>今日の予定<br></li>
	<li>テキストフィールドを作る<br></li>
	<li>ページのレイアウト<br></li>
	<li>早ければaction,dao,dtoをつくる</li>
</ul>
</div>

<div id = "a">
<table id="textfirld">
<tr>
	<td>内容:</td>
	<td><input id = "schedule" type="text" name = "text1"></td>
</tr>
<tr>
	<td>開始日:</td>
	<td><input class = "textcalendar" type="text" name = "start"></td>
	<td>終了日:</td>
	<td><input class = "textcalendar" type="text" name = "end"></td>
</tr>
</table>
<input type ="button" id ="btn1" value="送信">
</div>
</body>
</html>