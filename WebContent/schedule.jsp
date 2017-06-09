<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="false"%>
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
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/start/jquery-ui.css">
        <script src="js/calendar/calendar.js"></script>
        <script src="js/schedule.js"></script>
        <script src="js/calendar/jquery.min.js"></script>
        <script src="js/calendar/jquery-ui.min.js"></script>
        <script src="js/calendar/moment.min.js"></script>
        <script src="js/calendar/gcal.js"></script>
        <script src="js/calendar/gcal.min.js"></script>
        <script src="js/calendar/datepicker-ja.js"></script>
        <script src="js/calendar/fullcalendar.js"></script>
        <script src="js/calendar/fullcalendar.min.js"></script>

<title>スケジュール一覧</title>
</head>
<body>

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

<div id ="calendar"></div>

<div id="operation">
		<s:if test="%{#session.userFlg < 1}">
			ログイン後に表示します。
		</s:if>
		<s:if test="%{#session.userFlg >= 1}">
			<s:form action="ScheduleSelectAction">
				<input type="text" name="search" placeholder="検索文字を入力" maxlength=100 />
				<s:submit value="検索"></s:submit>
			</s:form>
			<br>

			<!-- 検索した後に表示するメッセージ -->
			<s:property value="successMsg" />
			<s:property value="errorMsg" />
			<s:property value="selectSuccessMsg" />
			<s:property value="selectErrorMsg" />

<s:property value="startDay" />
			<s:form action="ScheduleUpdateAction">
				<table id = "schedule" border=1 style="">
					<tbody>
						<tr>
							<th>ID</th>
							<th>開始日（年-月-日）</th>
							<th>終了日（年-月-日）</th>
							<th>件名</th>
							<th>内容</th>
							<th></th>
						</tr>

						<!-- scheduleListに格納した情報をテーブルで表示 -->
						<!-- カレンダーに渡すだけの情報は<div class="hidden">で囲ってcssで表示させないようにする -->
						<s:iterator value="scheduleList">
							<tr>
								<td><s:property value="id" /></td>
								<td><input type="text" name="scheduleStartdayList"
									value="<s:property value="startDay" />"
									class="scheduleStartdayList" type="date"
									pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
									title="yyyy-MM-ddで入力してください。" placeholder="開始日を入力" required><div class="hidden"><s:property value="startDay" /></div></td>
								<td><input type="text" name="scheduleEnddayList"
									value="<s:property value="endDay" />"
									class="scheduleEnddayList"
									pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
									title="yyyy-MM-ddで入力してください。" placeholder="終了日を入力"><div class="hidden"><s:property value="endDay" /></div></td>
								<td><input type="text" name="scheduleTitleList"
									value="<s:property value="title" />" class="scheduleTitleList"
									placeholder="件名を入力" maxlength=100 required><div class="hidden"><s:property value="title" /></div></td>
								<td><input type="text" name="scheduleContentList"
									value="<s:property value="content" />"
									class="scheduleContentList" placeholder="内容を入力" maxlength=100></td>
								<td>
										<input type="button" class="button modal-open" value="削除" />
								</td>
							</tr>
							<input type="hidden" name="scheduleIdList"
								value="<s:property value="id" />" class="scheduleIdList">
						</s:iterator>
					</tbody>
				</table>


					<button type="submit" class="button">編集</button>

			</s:form>

			<br> 開始日は今日の日付が自動で入力されます。
		<s:form action="ScheduleInsertAction">
				<table border=1 style="">
					<tbody>
						<tr>
							<td><input type="text" class="textcalendar" name="startDay" placeholder="開始日を入力"
								maxlength=100 required></td>
							<td><input type="text" class="textcalendar" name="endDay" placeholder="終了日を入力"
								maxlength=100 required></td>
							<td></td>
							<td><input type="text" name="title" placeholder="件名を入力"
								maxlength=100 required></td>
							<td><input type="text" name="content" placeholder="内容を入力"
								maxlength=100></td>
							<!-- tokenタグ -->

								<s:token />

						</tr>
					</tbody>
				</table>

				<button type="submit" class="button" name="startDay">追加</button>
			</s:form>


			<div id="modal-main">
				<!-- #contents START -->
				<div id="modal-style">
					<table class="modal_border">

						<tr>
							<td>開始日
								<div class="delete-startday modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>終了日
								<div class="delete-endday modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>件名
								<div class="delete-title modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>内容
								<div class="delete-content modalDelete"></div>
							</td>
						</tr>
					</table>
					<input type="button" class="delete-true button" value="削除">
					<input type="button" class="modal-close button" value="閉じる">

					<div class="delete-prepare">
						<p>本当に削除しますか。</p>
						<s:form action="ScheduleDeleteAction">
							<input type="hidden" name="scheduleId" value=""
								class="true-delete">
							<s:token />
							<input type="submit" class="delete-true button" value="はい">
							<input type="button" class="modal-close button" value="いいえ">
						</s:form>

					</div>
				</div>
			</div>
		</s:if>
		<br>
		<s:form action="GetAddressAction">
			<button type="submit" class="button">トップへ戻る</button>
		</s:form>
</div>
</body>
</html>