<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠確認</title>

<script src="js/jquery-3.1.0.min.js"></script>
<link rel="stylesheet" href="./css/admin_attendance.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#searchButtun").click(
				function() {
					if (($("#familyForm").val() != "")
							&& (($("#givenForm").val() == "") || ($(
									"#familyForm").val() == "")
									&& ($("#givenForm").val() != ""))) {
						alert('姓と名の両方を入力してください');
						return false
					}else if (($("#id_year").val() != "")
							&& ($("#id_month").val() != "")
							&& ($("#id_day").val() == "")
							|| ($("#id_year").val() != "")
							&& ($("#id_month").val() == "")
							&& ($("#id_day").val() != "")
							|| ($("#id_year").val() != "")
							&& ($("#id_month").val() == "")
							&& ($("#id_day").val() == "")
							|| ($("#id_year").val() == "")
							&& ($("#id_month").val() != "")
							&& ($("#id_day").val() != "")
							|| ($("#id_year").val() == "")
							&& ($("#id_month").val() != "")
							&& ($("#id_day").val() == "")
							|| ($("#id_year").val() == "")
							&& ($("#id_month").val() == "")
							&& ($("#id_day").val() != "")) {
						alert('日付をすべて選択してください');
						return false
					}else if (($("#id_year").val() == "")
							&& ($("#id_month").val() == "")
							&& ($("#id_day").val() == "")
							&& ($("#familyForm").val() == "")
							&& ($("#givenForm").val() == "")
							&& ($("#teamForm").val() == "")
							&& ($("#id_attendance").val() != "")) {
						alert('出欠の他に何か入力してください');
						return false

					} else {
						return true
					}
				});
	});
</script>

</head>

<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="container">
		<!-- タイトル -->
		<div align="center">
		<h3
			style="border-bottom: 1px solid rgba(0, 0, 0, 0.1); box-shadow: 0 1px 0 rgba(255, 255, 255, 1);">勤怠確認</h3>


		<!-- 日付、名前検索 -->
		<s:form action="AdminAttendanceAction" method="get" id="search">
			<select name="atYear" id="id_year" data-choice="year"><option
					value="">----</option></select><s:text name="年"/>
			<select name="atMonth" id="id_month" data-choice="month"><option
					value="">----</option></select><s:text name="月"/>
			<select name="atDay" id="id_day" data-choice="day"><option
					value="">----</option></select><s:text name="日"/>
			<select name="attendance" id="id_attendance">
				<option value="">出欠状況</option>
				<option value="出席">出席</option>
				<option value="欠席">欠席</option>
				<option value="遅刻">遅刻</option>
				<option value="早退">早退</option>
			</select>
			<s:textfield name="familyNameKanji" id="familyForm" placeholder="名字"
				title="名字"  />
			<s:textfield name="givenNameKanji" id="givenForm" placeholder="名前"
				title="名前"  />
			<s:textfield name="teamName" placeholder="チーム名" id="teamForm"
				title="チーム名"  />
			<s:submit value="検索" class="search-btn" id="searchButtun" />
		</s:form>
		</div>
		<font color="red"><s:property value="errorMsg"/></font>
		<table border="2px" width="30%" height="80">
			<tr>
				<td style="white-space: nowrap;">出席</td>
				<td style="white-space: nowrap;">欠席</td>
				<td style="white-space: nowrap;">遅刻</td>
				<td style="white-space: nowrap;">早退</td>
			</tr>

			<tr align="center">
				<td><s:property value="present" /></td>
				<td><s:property value="absent" /></td>
				<td><s:property value="late" /></td>
				<td><s:property value="early" /></td>
			</tr>
		</table>



		<!-- 一覧表示 -->
		<table align="center" class="type11">
			<thead>
				<tr>
					<th>報告日時</th>
					<th>受講開始月</th>
					<th>チーム</th>
					<th style="white-space: nowrap;">性</th>
					<th style="white-space: nowrap;">名</th>
					<th>出欠状況</th>
					<th width="1000">備考</th>
				</tr>
			</thead>

			<tbody>

				<s:iterator value="searchList">
					<tr>
						<td><s:property value="atDate" /></td>
						<td><s:property value="month" /></td>
						<td><s:property value="teamName" /></td>
						<td style="white-space: nowrap;"><s:property value="familyNameKanji" /></td>
						<td style="white-space: nowrap;"><s:property value="givenNameKanji" /></td>
						<td><s:property value="attendance" /></td>
						<td width="1000"><s:property value="reason" /></td>
					</tr>
				</s:iterator>


			</tbody>

		</table>
	</div>

	<script src="js/jquery.ymdpulldown.js"></script>
	<script>
		$(function() {
			$("#id_year").ymdpulldown({
				startyear : 2016,
			});
			$("#id_month").ymdpulldown();
			$("#id_day").ymdpulldown();
		});
	</script>

</body>
</html>