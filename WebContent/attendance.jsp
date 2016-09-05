<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勤怠更新</title>

<%-- <script type="text/javascript" src="update_attendance.js"></script> --%>
</head>
<body>
<!-- ヘッダー-->
<jsp:include page="header.jsp" />
<h1>勤怠更新</h1>
<br>
<br>
<s:form action="AttendanceSelectAction">

○月生を入力<input type="text" placeholder="例：201607">
<br><br>
日付検索　<input type="text" name="attendanceDate" placeholder="例：20160819">
<br>
<s:submit type="button" value="検索" class="button"/>
</s:form>
<br>
<br>

<s:form action="AttendanceSelectAction" >
<table class="list"  border="1">

		<s:if test="list.size() > 0">
			<tr>
				<th>日付</th>
				<th>ID</th>
				<th>出席</th>
				<th>遅刻(連絡有)</th>
				<th>遅刻(連絡無)</th>
				<th>欠席(連絡有)</th>
				<th>欠席(連絡無)</th>
				<th>連絡無し</th>
				<th>面談有</th>
				<th>面談無</th>
			</tr>
		</s:if>
		<s:else>
			<s:property value="%{errorSelect}" />
		</s:else>
		<s:iterator value="list">

			<tr>
				<td><input type="text" value="<s:property value="date"/>"></td>
				<td><s:property value="id"></s:property></td>
				<td><input type="radio" name="<s:property value="id"/>" value="1" <s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>" value="2"<s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>" value="3"<s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>" value="4"<s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>" value="5"<s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>" value="6"<s:property value="attendance"/>></td>
				<td><input type="radio" name="<s:property value="id"/>a" value="1"<s:property value="interview"/>></td>
				<td><input type="radio" name="<s:property value="id"/>a" value="2"<s:property value="interview"/>></td>
			</tr>
		</s:iterator>
	</table>

		<br>
	<br>

<s:submit type="button" value="更新" class="button"/>
</s:form>
	<br>
<s:form action="GetAddressAction">
<s:submit type="button" value="戻る" class="button"/>
</s:form>
</body>
</html>