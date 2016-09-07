<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/schedule.js"></script>
<link rel="stylesheet" href="css/schedule.css">
<!-- css読み込み  -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<!-- js読み込み -->
<script src="js/bootstrap.js"></script>
<title>スケジュール一覧</title>
</head>
<body>
	<!-- 	ヘッダー読み込み -->
	<jsp:include page="header.jsp" />

	<!-- アプリ一覧表示 -->
	<div class="container">
		<h1 class="page-header">スケジュール一覧</h1>
		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{siteUrl}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg" />
	</div>


	<s:form action="ScheduleSelect">
		<s:textfield name="search" label="スケジュール検索" placeholder="件名を入力" />
		<s:submit value="検索"></s:submit>
	</s:form>
<br>

<s:property value="successtitle"/><s:property value="errortitle"/>
<s:form action="ScheduleUpdate">
<table border=1 style="white">
	<tbody>
	<tr>
		<td>ID</td><td>開始日（YY/MM/DD）</td><td>終了日（YY/MM/DD）</td><td>件名</td><td>内容</td>
	</tr>

	<s:iterator value="schedulelist">
	<tr>
		<td><input type="text" name="scheduleIdList" size=5 value="<s:property value="Id" />"
		class="scheduleIdList"></td>
		<td><input type="text" name="scheduleStart_dayList" value="<s:property value="Start_day" />"
		class="scheduleStart_dayList" type="date" pattern="\d{2}/\d{2}/\d{2}" placeholder="開始日を入力"></td>
		<td><input type="text" name="scheduleEnd_dayList" value="<s:property value="End_day" />"
		class="scheduleEnd_dayList" pattern="\d{2}/\d{2}/\d{2}" placeholder="終了日を入力"></td>
		<td><input type="text" name="scheduleTitleList" value="<s:property value="Title" />"
		class="scheduleTitleList" placeholder="件名を入力" maxlength=100></td>
		<td><input type="text" name="scheduleContentList" value="<s:property value="Content" />"
		class="scheduleContentList" placeholder="内容を入力" maxlength=100></td>
		<td><input type="button" class="button modal-open" value="削除" /></td>
	</tr>
	</s:iterator>

	<s:iterator value="dscheduleList">
	<tr>
		<td><input type="text" name="scheduleIdList" size=5 value="<s:property value="Id" />"
		class="delscheduleIdList"></td>
		<td><input type="text" name="scheduleStart_dayList" value="<s:property value="Start_day" />"
		class="delscheduleStart_dayList" type="date" pattern="\d{2}/\d{2}/\d{2}"></td>
		<td><input type="text" name="scheduleEnd_dayList" value="<s:property value="End_day" />"
		class="delscheduleEnd_dayList" pattern="\d{2}/\d{2}/\d{2}"></td>
		<td><input type="text" name="scheduleTitleList" value="<s:property value="Title" />"
		class="delscheduleTitleList" placeholder="件名を入力" maxlength=100></td>
		<td><input type="text" name="scheduleContentList" value="<s:property value="Content" />"
		class="delscheduleContentList" placeholder="内容を入力" maxlength=100></td>
		<td><input type="button" class="button modal-open2" value="削除" /></td>
	</tr>
	</s:iterator>
	</tbody>
</table>
<button type="submit" class="button">編集</button>
</s:form>

<br><br>

<s:form action="ScheduleInsert">
<table border=1  style="white">
	<tbody>
	<tr>
		<td>開始日（YY/MM/DD）</td><td>件名</td><td>内容</td><td></td>
	</tr>
	<tr>
		<td><input type="text" name="Start_day" pattern="\d{2}/\d{2}/\d{2}" placeholder="開始日を入力"></td>
		<td><input type="text" name="Title" placeholder="件名を入力" maxlength=100 required></td>
		<td><input type="text" name="Content" placeholder="内容を入力" maxlength=100></td>
		<td><button type="submit" class="button">追加</button></td></tr>
	</tbody>
</table>
</s:form>


<div id="modal-main">
	<!-- #contents START -->
	<div id="modal-style">
	<table class="modal_border">
		<tr><td>ID<input type="text" name="scheduleId" id="delete-scheduleid" readonly></td></tr>
		<tr><td>開始日<input type="text" name="scheduleId" id="delete-start_day" readonly></td></tr>
		<tr><td>終了日<input type="text" name="scheduleId" id="delete-end_day" readonly></td></tr>
		<tr><td>件名<input type="text" name="scheduleId" id="delete-title" readonly></td></tr>
		<tr><td>内容<input type="text" name="scheduleId" id="delete-content" readonly></td></tr>
		</table>
		<input type="button" class="delete-true button" value="削除">
		<input type="button" class="modal-close button" value="閉じる">

	<div class="delete-prepare">
    	<p>削除しますか。</p>
    	<s:form action="ScheduleDelete">
			<input type="hidden" name="scheduleId" value="" class="true-delete">
			<input type="submit" class="delete-true button" value="はい">
			<input type="button" class="modal-close button" value="いいえ">
    	</s:form>

    	</div>
	</div>
</div>
<br>
<s:form action="GetAddressAction">
	<button type="submit" class="button">戻る</button>
</s:form>
</body>
</html>