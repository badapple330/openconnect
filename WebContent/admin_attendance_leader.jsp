<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=0.9, user-scalable=no">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠確認</title>
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/admin_attendance_leader.js"></script>
<link rel="stylesheet" href="css/admin_attendance_leader.css">
</head>
<body>

	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />
	<!-- タイトル -->
			<div align="center">
				<h3
					style="border-bottom: 1px solid rgba(0, 0, 0, 0.1); box-shadow: 0 1px 0 rgba(255, 255, 255, 1);">勤怠確認</h3>
</div>
	<div class="container">

		<s:if test="%{#session.userFlg >= 2}">
			<div class="formbox" align="center">
				<s:form action="AdminAttendanceLeaderAction">
					<table class="atform">
						<colgroup>
							<col style="width: 33%;">
							<col style="width: 67%;">
						</colgroup>

						<tr>
							<th>チーム名：</th>
							<td><s:iterator value="atUserList">
									<s:property value="teamName" />
								</s:iterator></td>
						</tr>

						<tr>
							<!-- 表示用の日時 -->
							<th>日 時 ：</th>
							<td class="ymd"></td>
						</tr>
						<tr>
						<tr id="tr_type">
							<th>出欠確認：</th>
							<td><select name="attendance"
								required="required">

									<option value="">出欠状況</option>
									<option value="='出席'">出席</option>
									<option value="='欠席'">欠席</option>
									<option value="='遅刻'">遅刻</option>
									<option value="='早退'">早退</option>
									<option value=" in ('欠席','遅刻','早退')">出席以外</option>

							</select></td>
						</tr>

						<tr id="tr_reason" style="display: none;">
							<th>備 考 ：<span
								style="background-color: red; color: white; padding: 1px 2px; border-radius: 5px;">必須</span></th>
							<td><textarea id="reason" name="reason" rows="6" cols="40"
									maxlength="200" placeholder="(例）病気のため欠席、電車遅延のため10分遅刻など"
									disabled="disabled"></textarea></td>
						</tr>

						<tr style="display: none;">
							<!-- 日時のデータ送信用 選択させないため非表示 -->
							<th>日 時 ：</th>
							<td><select style="width: 60px;" name="atYear" id="id_year"
								data-choice="year" required="required"></select> <span
								style="margin-left: 3px; margin-right: 5px; display: inline-block;">年</span>

								<select style="width: 45px;" name="atMonth" id="id_month"
								data-choice="month" required="required"></select> <span
								style="margin-left: 3px; margin-right: 5px; display: inline-block;">月</span>

								<select style="width: 45px;" name="atDay" id="id_day"
								data-choice="day" required="required"></select> <span
								style="margin-left: 3px; margin-right: 5px; display: inline-block;">日</span>
							</td>
						</tr>
						<tr>
					</table>
					<input type="submit" value="検索" class="button"
						onClick="javascript:double(this)" />

				</s:form>
			</div>
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


			<!-- 印刷用モーダル表示ボタン -->
			<input type="button" class="modal-open" id="modal-open" value="一覧表示" />


			<!-- 一覧表示 -->
			<table style="margin-top: 10px;" class="type12">
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
							<td style="white-space: nowrap;"><s:property
									value="familyNameKanji" /></td>
							<td style="white-space: nowrap;"><s:property
									value="givenNameKanji" /></td>
							<td><s:property value="attendance" /></td>
							<td width="1000"><s:property value="reason" /></td>
						</tr>

						<input type="hidden" name="modalList" value="searchList"
							class="modal-list">
					</s:iterator>
				</tbody>
			</table>


		</s:if>
		<s:else>
	リーダーログイン後に表示します。
	</s:else>
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