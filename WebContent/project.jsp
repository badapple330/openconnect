<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>プロジェクト一覧</title>
 <CENTER>
<h1>ヘッダー</h1>
</CENTER>
</head>
<body>

	<p>プロジェクト検索</p>
	<s:form action ="projectSearchAction">
<input type="text" name="search">
<input type="submit"value="検索する">
</s:form>


	<table border="2" cellspacing="0" style="">
		<tr>
			<td>ID</td>
			<td>プロジェクト名</td>
			<td>管理者（リーダー）</td>
			<td>管理者（サブ）</td>
			<td>開始日</td>
			<td>終了日</td>
			<td>備考</td>
		</tr>

		<s:iterator value="projectList"><!-- 繰り返し -->
			<tr>
				<td><s:property value="userId" /></td>
				<td><input type="text"
					value="<s:property value="projectName"/>"></td>
				<td><input type="text" value="<s:property value="manager"/>"></td>
				<td><input type="text" value="<s:property value="subManager"/>"></td>
				<td><input type="text" value="<s:property value="startDate"/>"></td>
				<td><input type="text" value="<s:property value="endDate"/>"></td>
				<td><input type="text" value="<s:property value="note"/>"></td>
			</tr>
		</s:iterator>

		<s:iterator value="searchList">
            <tr>
				<td><s:property value="userId" /></td>
				<td><input type="text"value="<s:property value="projectName"/>"></td>
				<td><input type="text" value="<s:property value="manager"/>"></td>
				<td><input type="text" value="<s:property value="subManager"/>"></td>
				<td><input type="text" value="<s:property value="startDate"/>"></td>
				<td><input type="text" value="<s:property value="endDate"/>"></td>
				<td><input type="text" value="<s:property value="note"/>"></td>
			</tr>
		</s:iterator>

	</table>
	<input type="text" value="プロジェクト名">
	<input type="text" value="管理者(リーダー)">
	<input type="text" value="管理者(サブ)">
	<input type="text" value="開始日">
	<input class="button" type="submit" value="追加">
	<br>
	<input class="button" type="submit" value="編集">
	<br>
	<input class="button" type="submit" value="戻る">

</body>
</body>
</html>