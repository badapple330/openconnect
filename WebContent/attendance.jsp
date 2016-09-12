<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勤怠更新</title>

<script src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>
<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />
	<h1>勤怠更新</h1>
	<br>
	<br>
	<s:form action="AttendanceSelectAction">

受講年を入力<input type="text" name="year" placeholder="例：2016" class="textString" value="2016" maxlength="4" pattern="[1-9][0-9]*" title="半角数字4桁以内">
		<br>
		<br>
受講開始月を入力<input type="text" name="month" placeholder="例：7" class="textString" maxlength="2" pattern="[1-9][0-9]*" title="半角数字2桁以内">
		<br>
		<br>
日付を入力(入力必須)<input type="text" name="attendanceDate" placeholder="例：2016/08/19" class="textString" maxlength="10" value="2016/" required>
		<br>
		<s:submit value="検索" class="button" />
	</s:form>
	<br>
	<s:property value="%{resultString}" />
	<br>
	↓勤怠未入力(0が入っている)人には、あらかじめ1(出席)が入力されており<br>
	このまま更新を押すと表示されている全ての人に1(出席)が保存されます。<br>
	<table border="1">
		<tr>
			<td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td>
		</tr>
		<tr>
			<td>未入力</td><td>出席</td><td>遅刻(連絡有)</td><td>遅刻(連絡無)</td><td>欠席(連絡有)</td><td>欠席(連絡無)</td><td>連絡無し</td>
		</tr>
	</table>
	<br>
	<s:form action="AttendanceUpdateAction">
		<table class="list" border="1">
			<s:if test="attendanceList.size() > 0">
				<tr>
					<th>日付</th>
					<th>ID</th>
					<th>受講年</th>
					<th>受講開始月</th>
					<th>姓</th>
					<th>名</th>
					<th>出席状況</th>
					<th>出席状況入力</th>
					<th>面談</th>
					<th>面談入力</th>
				</tr>
			</s:if>
			<s:else>
				<s:property value="%{errorSelect}" />
			</s:else>
			<s:iterator value="attendanceList">
				<tr>
					<td><input type="text" name="date" value="<s:property value="date"/>" readonly class="textDate"></td>
					<td><input type="text" name="userId" value="<s:property value="userId"/>" readonly class="textInt"></td>
					<td><s:property value="year" /></td>
					<td><s:property value="month" /></td>
					<td><s:property value="familyNameKanji" /></td>
					<td><s:property value="givenNameKanji" /></td>
					<td><s:property value="attendanceString" /></td>
					<td><input type="text" name="attendance" value="<s:property value="attendance"/>" class="textInt" required></td>
					<td><s:property value="interviewString" /></td>
					<td><input type="text" name="interview" value="<s:property value="interview"/>" class="textInt" required></td>
				</tr>
			</s:iterator>
		</table>
		<br>
		<br>
		<s:submit value="更新" class="button" align="left"/>
	</s:form>
	<br>
			追加する年月を入力<br>
			※正しく入力しないと「追加」ボタンを押せません。<br>
			年<input type="text" class="inputYear" placeholder="例：2016" maxlength="4" required><br>
			月<input type="text" class="inputMonth" placeholder="例：08" maxlength="2" required>
			<input type="button" value="追加" class="modal-open"/>
	<br>
	<s:form action="GetAddressAction">
		<s:submit value="戻る" class="button" />
	</s:form>

	<!-- 		追加モーダル -->
	<div id="modal-main">
		入力した年月：<div id="year"></div>年<div id="month"></div>月
		<br>
		<br>
		追加を押すと上記の年月に、<br>
		過去3ヶ月分のユーザーのデータが追加されます。<br>
		(少し時間がかかります)
		<br>
		<s:form action="AttendanceInsertAction">
			<input type="hidden" name="year" value="" id="attendanceYear">
			<input type="hidden" name="month" value="" id="attendanceMonth">
			<s:submit class="delete-true button" value="追加" />
		</s:form>
		<input type="button" class="modal-close button" value="閉じる">
	</div>
</body>
</html>