<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
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
<script type="text/javascript"><!--
function keydown() {
if(event.keyCode == 116){
event.keyCode = 0;
return false;
}
}
document.onkeydown = keydown;
//-->
</script>
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

	<s:property value="success_msg" />
	<s:property value="error_msg" />
	<s:form action="ScheduleUpdate">
		<table border=1 style="">
			<tbody>
				<tr>
					<td>ID</td>
					<td>開始日（YYYY-MM-DD）</td>
					<td>終了日（YYYY-MM-DD）</td>
					<td>件名</td>
					<td>内容</td>
				</tr>

				<s:iterator value="schedulelist">
					<tr>
						<td><input type="text" name="scheduleIdList" size=5
							value="<s:property value="Id" />" class="scheduleIdList" readonly></td>
						<td><input type="text" name="scheduleStartdayList"
							value="<s:property value="Startday" />"
							class="scheduleStartdayList" type="date"
							pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])" placeholder="開始日を入力" required></td>
						<td><input type="text" name="scheduleEnddayList"
							value="<s:property value="Endday" />"
							class="scheduleEnddayList" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"
							placeholder="終了日を入力"></td>
						<td><input type="text" name="scheduleTitleList"
							value="<s:property value="Title" />" class="scheduleTitleList"
							placeholder="件名を入力" maxlength=100></td>
						<td><input type="text" name="scheduleContentList"
							value="<s:property value="Content" />"
							class="scheduleContentList" placeholder="内容を入力" maxlength=100></td>
						<td><input type="button" class="button modal-open" value="削除" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<button type="submit" class="button">編集</button>
	</s:form>

	<br>
	<br>

	<s:form action="ScheduleInsert">
		<table border=1 style="">
			<tbody>
				<tr>
					<td>件名</td>
					<td>内容</td>
					<td></td>
				</tr>
				<tr>
					<!-- <td><input type="text" name="Start_day" -->
					<!-- pattern="([0-2][0-9]{3})\([0-1][0-9])\([0-3][0-9])" -->
					<!-- placeholder="開始日を入力" required></td> -->
					<td><input type="text" name="Title" placeholder="件名を入力"
						maxlength=100 required></td>
					<td><input type="text" name="Content" placeholder="内容を入力"
						maxlength=100></td>
					<!-- tokenタグ -->
					<s:token />
					<td><button type="submit" class="button" name="Start_day">追加</button></td>
				</tr>
			</tbody>
		</table>
	</s:form>


	<div id="modal-main">
		<!-- #contents START -->
		<div id="modal-style">
			<table class="modal_border">
				<tr>
					<td>ID<input type="text" name="scheduleId"
						id="delete-scheduleid" readonly></td>
				</tr>
				<tr>
					<td>開始日<input type="text" name="scheduleId"
						id="delete-startday" readonly></td>
				</tr>
				<tr>
					<td>終了日<input type="text" name="scheduleId"
						id="delete-endday" readonly></td>
				</tr>
				<tr>
					<td>件名<input type="text" name="scheduleId" id="delete-title"
						readonly></td>
				</tr>
				<tr>
					<td>内容<input type="text" name="scheduleId" id="delete-content"
						readonly></td>
				</tr>
			</table>
			<input type="button" class="delete-true button" value="削除"> <input
				type="button" class="modal-close button" value="閉じる">

			<div class="delete-prepare">
				<p>本当に削除しますか。</p>
				<s:form action="ScheduleDelete">
					<input type="hidden" name="scheduleId" value="" class="true-delete">
					<input type="submit" class="delete-true button" value="はい">
					<input type="button" class="modal-close button" value="いいえ">
				</s:form>

			</div>
		</div>
	</div>
	<br>
	<s:form action="BackGoAction">
		<button type="submit" class="button">戻る</button>
	</s:form>
</body>
</html>