<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel='stylesheet' href='css/fullcalendar.min.css' />
<script src='js/calendar/jquery.min.js'></script>
<script src='js/calendar/moment.min.js'></script>
<script src='js/calendar/locale-all.js'></script>
<script src='js/calendar/fullcalendar.min.js'></script>
<script>
$(document).ready(function() {
	02
	    $('#calendar').fullCalendar({

	        header: {

	            left: 'prev,next today',

	            center: 'title',

	            right: 'month,agendaWeek,agendaDay'

	        },

	        editable: true //編集可能

	    });

	});

</script>

<title>スケジュール一覧</title>
</head>
<body>
	<!-- ヘッダー読み込み -->
	<jsp:include page="header.jsp" />
	<!-- ヘッダーここまで -->

<h1>おはよう</h1>
<h2>こんにちは</h2>
<p>こんばんは</p>

<div id ='calendar'></div>
</body>
</html>