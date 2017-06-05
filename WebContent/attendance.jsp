<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠更新</title>

<script src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>
<body>

<!-- 最終的にif else でログイン時のみに変更 -->

	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="container">

	<h1>勤怠更新</h1>
	<br>

	<s:form action="AttendanceAction">

	<label>
	出欠確認：<br>
	<select name="attendance" required="required">

	<option value="">以下から選択</option>
	<option value="1">出席</option>
	<option value="2">欠席</option>
	<option value="3">遅刻</option>
	<option value="4">早退</option>

	</select></label>

<br>
	<label>備考：<br>
	<textarea name="reason"  rows="10" cols="50" maxlength="500" placeholder="(例）病気のため欠席、電車遅延のため10分遅刻など"></textarea>
	</label>
<br><br>
	<input type="submit"  value="送信"/>



	</s:form>



	</div>
</body>
</html>