<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出欠検索</title>
</head>
<body>



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
		<th>名前</th>
		<th>出欠状況</th>
		</tr>
	</thead>

	<tbody>
	<s:iterator value="searchList">
		<tr>
			<td>
				<s:property value="attendance"/>

			</td>
			<td>
				<s:property value="familyNameKanji"/>
				</td>
		</tr>
	</s:iterator>

	</tbody>

</table>


</body>
</html>