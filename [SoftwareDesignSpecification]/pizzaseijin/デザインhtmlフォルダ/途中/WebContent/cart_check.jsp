<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート確認</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1" align="center">
				<h1>購入確認</h1>
				<hr>
				<table class="store">
					<tr>
						<th colspan="5">購入商品</th>
					</tr>
					<tr>
						<td colspan="5" class="sub_title">メインメニュー</td>
					</tr>
					<tr class="cart_title">
						<td>商品名</td>
						<td>枚数</td>
						<td>ピース数</td>
						<td>単価</td>
						<td>小計</td>
					</tr>
					<tr class="cart_name">
						<td>ミートピザ</td>
						<td>2枚</td>
						<td>6ピース</td>
						<td>200円</td>
						<td>4000円</td>
					</tr>
					<tr class="cart_name">
						<td>ミートピザ</td>
						<td>2枚</td>
						<td>6ピース</td>
						<td>100円</td>
						<td>3800円</td>
					</tr>
					<tr>
						<td colspan="5" class="sub_title">サイドメニュー</td>
					</tr>
					<tr class="cart_title">
						<td>商品名</td>
						<td colspan="2">個数</td>
						<td>単価</td>
						<td>小計</td>
					</tr>
					<tr class="cart_name">
						<td>ドリンク</td>
						<td colspan="2">1個</td>
						<td>200円</td>
						<td>200円</td>
					</tr>
					<tr>
						<th colspan="5">クーポンご利用</th>
					</tr>
					<tr>
						<td colspan="4">15%OFFクーポン</td>
						<td>-405円</td>
					</tr>
					<tr>
						<th colspan="5">お支払い情報</th>
					</tr>
					<tr>
						<td colspan="5" class="cart_title">クレジットカード払い</td>
					</tr>
					<tr>
						<td>カード番号</td>
						<td colspan="4">************1234</td>
					</tr>
					<tr>
						<th colspan="5">住所情報</th>
					</tr>
					<tr>
						<td>郵便番号</td>
						<td colspan="4">000-0000</td>
					</tr>
					<tr>
						<td>住所</td>
						<td colspan="4">東京都○○区○○町1234-4</td>
					</tr>
					<tr>
						<td></td>
						<td colspan="4">xxxxxビルxx階xxx号室</td>
					</tr>
					<tr>
						<td colspan="4">合計</td>
						<td>7800円</td>
				</table>
				<a href="cart_end.jsp"><input type="button" class="btn btn-danger" value="完了"></a>
   				<a href="cart.jsp"><input type="button" class="btn btn-danger" value="戻る"></a>
			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>

