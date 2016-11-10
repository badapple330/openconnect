<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/admin_user.css">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
<script type="text/javascript" src="js/admin_user.js"></script>
<title>ユーザー管理</title>
</head>
<body>
	<P>利用者一覧</P>
	＊チェックボックスに、チェックをいれて編集・削除を行う。
	<s:form id='form' nam='form'>
		<table>
			<tbody id="list_body">
				<tr>
					<th>ユーザーID</th>
					<th>name</th>
					<th>email</th>
					<th>削除/編集</th>
				</tr>
				<s:iterator value="UserList">
					<tr>
						<input type="text" hidden="hidden"
							value="<s:property value="userFlg" />">
						<input type="text" hidden="hidden"
							value="<s:property value="userId" />" name="idList" />
						<td><s:property value="userId" /></td>
						<td><input type="text" name="nameList"
							value="<s:property value="name" />" maxlength="25"></td>
						<td><input type="text" name="emailList"
							value="<s:property value="email" />" maxlength="50"
							pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
							title="メールアドレスの形式で記入してください　例：a@a.com"></td>
						<td><s:if test="%{!(userFlg==2)}">
								<input type="checkbox" name="checkList"
									value="<s:property value="userId" />">
							</s:if></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<input type="submit" value="削除" onclick="actionA();">
		<input type="submit" value="編集" onclick="actionB();">
	</s:form>
	<div id="page_ctrl">
		<ul id="page_before">
			<li id="page_prev">prev</li>
		</ul>
		<ul id="page_number"></ul>
		<ul id="page_after">
			<li id="page_next">next</li>
		</ul>
	</div>
	<a href="admin_top.jsp"><input type="button" value="戻る"></a>
</body>
</html>