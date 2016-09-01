<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>勤怠更新</title>
</head>
<body>
<!-- ヘッダー-->
<jsp:include page="header.jsp" />
<h1>勤怠更新</h1>
<br>
<br>
<s:form action="UpdateAttendanceSelectAction">
○月生を入力<input type="text" placeholder="半角数字を入力　例：201607">
<br><br>
日付検索　<input type="text" placeholder="日付を入力　例：20160819">
<br>
<s:submit type="button" value="検索" class="button"/>
</s:form>
<br>
<br>
<table class="list">
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
				<td><s:property value="date"></s:property></td>
				<td><s:property value="id"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="attendance"></s:property></td>
				<td><s:property value="interview"></s:property></td>
				<td><s:property value="interview"></s:property></td>
			</tr>
		</s:iterator>
	</table>
		<br>
	<br>
<form action="UpdateAttendanceSelectAction">
<s:submit type="button" value="更新" class="button"/>
</form>
<form action="GetAddressAction">
<s:submit type="button" value="戻る" class="button"/>
</form>
</body>
</html>