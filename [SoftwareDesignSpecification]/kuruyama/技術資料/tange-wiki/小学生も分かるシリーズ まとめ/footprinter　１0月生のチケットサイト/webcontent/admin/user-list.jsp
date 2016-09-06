<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/navi.jsp" flush="true" />

	<div class="conntainer">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
			<s:form action = "user-list" method = "get">
			<s:textfield label="" placeholder="ユーザー名入力" name="name" />
				<input type="submit" value = "検索"> 
				</s:form>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-10 col-xs-offset-1">
				<table class="table">
					<tr>
						<th colspan="11">会員情報一覧</th>
					</tr>

					<tr>
						<th style="border-right: 1px solid #CCC;">ID</th>
						<th style="border-right: 1px solid #CCC;">メール</th>
						<th style="border-right: 1px solid #CCC;">名前</th>
						<th style="border-right: 1px solid #CCC;">カナ</th>
						<th style="border-right: 1px solid #CCC;">住所</th>
						<th style="border-right: 1px solid #CCC;">カード番号</th>
						<th style="border-right: 1px solid #CCC;">OAuth</th>
						<th style="border-right: 1px solid #CCC;">登録日時</th>
						<th style="border-right: 1px solid #CCC;">更新日時</th>
						<th style="border-right: 1px solid #CCC;"></th>

					</tr>


					<s:iterator value="UserList">
						<tr>
							<td align="center" width="100"><s:property value="id"></s:property></td>
							<td align="center" width="100"><s:property value="email"></s:property></td>
							<td align="center" width="100"><s:property value="name"></s:property></td>
							<td align="center" width="100"><s:property value="nameKana"></s:property></td>
							<td align="center" width="100"><s:property value="address"></s:property></td>
							<td align="center" width="100"><s:property value="creditNum"></s:property></td>
							<td align="center" width="100"><s:property value="oauthName"></s:property></td>
							<td align="center" width="100"><s:property value="createdAt"></s:property></td>
							<td align="center" width="100"><s:property value="updatedAt"></s:property></td>
							<td align="center">
								<s:form action="UserDeleteAction">
									<s:hidden name="id" value="%{id}" />
									<s:submit value="削除"  cssClass="btn btn-danger" 
									onclick="return confirm('データベース上からも削除されますが本当によろしいですか？');" onfocus="this.blur();"></s:submit>
								</s:form>
							</td>
						</tr>
					</s:iterator>

				</table>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-xs-5 col-xs-offset-4">
			<ul class="pagination">
				
				<li><a href=user-list?page=0>1</a></li>
				<li><a href=user-list?page=5>2</a></li>
				<li><a href=user-list?page=10>3</a></li>
				<li><a href=user-list?page=15>4</a></li>
				<li><a href=user-list?page=20>5</a></li>
				
	
			</ul>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>