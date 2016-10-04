<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" href="css/admin_user.css">
<script src="js/modi.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
<title>adminuser</title>
</head>
<script>
	$(function() {
		var page = 0;
		function draw() {
			$('#page').html(page + 1);
			$('tr').hide();
			$('tr:first,tr:gt(' + page * 10 + '):lt(10)').show();
		}
		$('#prev').click(function() {
			if (page > 0) {
				page--;
				draw();
			}
		});
		$('#next').click(function() {
			if (page < ($('tr').size() - 1) / 10 - 1) {
				page++;
				draw();
			}
		});
		draw();
	});
</script>
<body>

	<P>利用者一覧</P>
	＊チェックボックスに、チェックをいれて編集・削除を行う。
	<s:form action="AdminUserDelete">
		<table border="1">
			<tr>
				<th>ユーザーID</th>
				<th>name</th>
				<th>email</th>
				<th>削除/編集</th>
			</tr>
			<s:iterator value="UserList">
				<tr>
					<td><input type="text"  name="user_id" value="<s:property value="user_id" />"></td>
					<td><input type="text" name="name" value="<s:property value="name" />"></td>
					<td><input type="text" name="email" value="<s:property value="email" />"></td>
					<td><input type="checkbox" name="check"
						value="<s:property value="user_id" />"></td>
				</tr>
			</s:iterator>
		</table>
		<s:submit type="submit" value="削除" method="AdminDelete"/>
		<s:submit type="submit" value="編集" method="AdminEdit"/>
	</s:form>
	<div class=pager>
		<span id="prev">prev</span> <span id="page"></span> <span id="next">next</span>
	</div>
</body>
</html>