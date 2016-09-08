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
</head>
<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />
	<h1>勤怠更新</h1>
	<br>
	<br>
	<s:form action="AttendanceSelectAction">

○月生を入力<input type="text" placeholder="例：201607">
		<br>
		<br>
日付検索　<input type="text" name="attendanceDate" placeholder="例：20160819">
		<br>
		<s:submit value="検索" class="button" />
	</s:form>
	<br>
	<br>

	<s:form action="AttendanceUpdateAction">
		<table class="list" border="1">
			<s:if test="attendanceList.size() > 0">
				<tr>
					<th>日付</th>
					<th>ID</th>
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
					<td><input type="text" name="date" value="<s:property value="date"/>" readonly></td>
					<td><input type="text" name="userId" value="<s:property value="userId"/>" readonly></td>
					<td><s:property value="attendanceString" /></td>
					<td><input type="text" name="attendance" value="<s:property value="attendance"/>"></td>
					<td><s:property value="interviewString" /></td>
					<td><input type="text" name="interview" value="<s:property value="interview"/>"></td>
				</tr>
			</s:iterator>
		</table>
		<br>
		<br>
		<s:submit value="更新" class="button" align="left"/>
	</s:form>
	<br>
	<s:form action="GetAddressAction">
		<s:submit value="戻る" class="button" />
	</s:form>
</body>
</html>