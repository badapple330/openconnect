<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出欠検索</title>

<script src="js/jquery-3.1.0.min.js"></script>

</head>
<body>

	<select name="atYear" id="id_year" data-choice="year"><option
			value="">----</option></select>
	<select name="atMonth" id="id_month" data-choice="month"><option
			value="">----</option></select>
	<select name="atDay" id="id_day" data-choice="day"><option
			value="">----</option></select>

	<s:form action="attendanceACTION">
		<select name="attendance">
			<option value="">出欠状況</option>
			<option value="出席">出席</option>
			<option value="欠席">欠席</option>
			<option value="遅刻">遅刻</option>
			<option value="早退">早退</option>
		</select>
		<s:submit value="検索" />
	</s:form>

	<table class="table table-striped table-borderd">
		<thead>
			<tr>
				<th>報告日時</th>
				<th>受講開始月</th>
				<th>チーム</th>
				<th>性</th>
				<th>名</th>
				<th>出欠状況</th>
				<th>備考</th>
			</tr>
		</thead>

		<tbody>
			<s:iterator value="displayList">
				<tr>
					<td><s:property value="atDate" /></td>
					<td><s:property value="month" /></td>
					<td><s:property value="teamName" /></td>
					<td><s:property value="familyNameKanji" /></td>
					<td><s:property value="givenNameKanji" /></td>
					<td><s:property value="attendance" /></td>
					<td><s:property value="reason" /></td>
				</tr>
			</s:iterator>

		</tbody>

	</table>

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