<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>管理者HOME</title>
		<jsp:include page="admin_base/admin_base.jsp" flush="true" />
	</head>
	<body>
		<jsp:include page="admin_base/admin_header.jsp" flush="true" />
    	<jsp:include page="admin_base/admin_nav.jsp" flush="true" />
		<br><br>
		<div class="container">
			<div class="row">
				<s:if test="false">
					<div class="col-md-4 col-md-offset-4">
						<table class="admin_table">
							<tr>
								<th colspan="3">管理者ログイン</th>
							</tr>
							<tr>
								<td align="center" class="danger">ID</td>
								<td colspan="2"><input type="text" placeholder="IDを入力"></td>
							</tr>
							<tr>
								<td align="center" class="danger">パスワード</td>
								<td colspan="2"><input type="text" placeholder="パスワードを入力"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="button" class="btn btn-danger" value="ログイン"></td>
							</tr>
						</table>
					</div>
				</s:if>
				<s:if test="true">
					<div class="col-md-6 col-md-offset-3">
						<table class="line_del">
							<tr>
								<td>管理者HOME</td>
								<td>管理者ログインの入力フォームを表示</td>
							</tr>
							<tr>
								<td>売り上げ情報</td>
								<td>お客様が購入したピザの売り上げ情報をグラフ表示</td>
							</tr>
							<tr>
								<td>クーポン情報</td>
								<td>現在配布しているクーポン情報の表示、編集</td>
							</tr>
							<tr>
								<td>レビュー情報</td>
								<td>お客様が投稿したレビューの削除</td>
							</tr>
							<tr>
								<td>商品情報</td>
								<td>販売している商品情報の表示、編集</td>
							</tr>
							<tr>
								<td>店舗情報</td>
								<td>店舗情報の表示、編集</td>
							</tr>
						</table>
					</div>
				</s:if>
			</div>
		</div>
		<br><br>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
	</body>
</html>