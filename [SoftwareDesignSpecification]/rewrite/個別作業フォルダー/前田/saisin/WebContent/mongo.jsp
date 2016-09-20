<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="mongo_ja">
<head>
<!-- 国際化-->
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- CSSで書式を指定する -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/mongo.css">
<title>Mongo</title>

</head>
<body marginwidth="100">
	<h1>

			<!-- コメントの一覧の国際化 -->
			<s:text name="履歴確認" />

	</h1>
	<!-- コメント一覧の表示設定 -->

	<!-- select表示ボタン -->
	<table>
		<s:iterator value="commentList"></s:iterator>
	</table>

	<!-- select画面表示設定 -->
	<s:form action="MongoSelectAction">
		<s:submit class="btn btn-success" value="%{getText('mongo.select')}" />
	</s:form>

	<table>
		<tbody>
			<s:iterator value="selectList">
				<tr>

					<td><s:property value="%{getText('mongo.name')}" /></td>

					<td><s:property value="%{getText('mongo.comment')}" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>


		<!-- 送信ボタンの表示設定＆国際化 -->
		<h1>
			<s:text name="コメント入力フォーム" />
		</h1>

	<!-- 入力フォームの表示設定 -->
	<s:form name="send" id="btn2" action="MongoInsertAction">
		<s:textfield name="name" label="%{getText('mongo.name')}" placeholder="名前"
			onchange="wupBtn()" />
				<s:textarea name="comment" rows="30" cols="50"
			wrap="hard" onchange="wupBtn()" />
		<s:submit class="btn btn-success" value="%{getText('mongo.transmission')}"
		disabled="true" />
		<div>
			<s:reset class="btn btn-success" value="%{getText('mongo.reset')}" />
		</div>
	</s:form>

	<br>
	<s:form id="btn2" action="GoMainAction">
		<!-- main.jspへのリンク -->
		<s:submit class="btn btn-success" value="%{getText('mongo.back')}" />
	</s:form>
	<script type="text/javascript">
		function wupBtn() {
			var name = document.send.elements[0].value;
			var comment = document.send.elements[1].value;

			if (!name || !comment) {
				document.send.elements[2].disabled = true;
			} else if (!name && !comment) {
				document.send.elements[2].disabled = true;
			} else {
				document.send.elements[2].disabled = false;
			}
		}
	</script>
</body>
</html>