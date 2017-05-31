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
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="container">

	<h1>勤怠更新</h1>
	<br>

	<s:form action="">

	<h3>出欠確認</h3>
	<select name="" class="" required="required">

	<option value="">以下から選択</option>
	<option value="出席">出席</option>
	<option value="">欠席</option>
	<option value="">遅刻</option>
	<option value="">早退</option>

	</select>

<br>
	<h3>備考</h3>
	<textarea name="" class="" rows="10" cols="50" maxlength="500"
			placeholder="例）病気のため欠席、電車遅延のため10分遅刻など">
	</textarea>
	<s:submit class="" value="送信"/>


	</s:form>



	</div>
</body>
</html>