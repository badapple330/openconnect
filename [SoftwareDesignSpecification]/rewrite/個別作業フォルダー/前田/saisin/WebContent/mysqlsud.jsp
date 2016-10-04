<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録情報</title>
</head>
<link rel="stylesheet" href="css/mysqlsud.css">
<body>
	<s:form action="UserSelect">
		<label for="user">ユーザー名：</label>
		<Input type="text" name="user"  />
		<s:submit label="検索" type="button" />
		<s:property value="errorSelect" />
	</s:form>
	<table>
		<s:if test="list.size() > 0">
		<tr>
			<th>ID</th>
            <th>ユーザー名</th>
             <th>パスワード</th>
		</tr>
		</s:if>
		<s:else>
			データがありません
		</s:else>
		<s:iterator value="list">
			<tr>
				<td><s:property value="id"></s:property></td>
				<td><s:property value="user"></s:property></td>
				<td><s:property value="password"></s:property></td>

			</tr>
		</s:iterator>
	</table>

	<br>
	<br>


	<label>★★削除★★</label>
	<s:form action="UserDelete">
		<label for="user">ユーザー名：</label>
		<Input type="text" name="user"  />
		<s:property value="errorUser" />

		<s:submit label="削除" type="button" /><s:property value="errorDelete" />
	</s:form>
	<br>
	<br>


	<label>★★更新★★</label>
	<s:form action="UserUpdate">
		更新するIDを指定して下さい
		<s:textfield name="id" value=""
			label="　　　　　　ID"/>
		<s:textfield name="user" value=""
			label="ユーザー名"/>
		<s:textfield name="password" value=""
			label="パスワード"/>
		<br>
		<s:submit value="更新" />
		<s:property value="errorUpdate" />
	</s:form>
<BR>
<BR>
<s:form id="btn2" action="GoMainAction">
		<s:submit value="%{getText('メインへ戻る')}" />
	</s:form>
</body>
</html>