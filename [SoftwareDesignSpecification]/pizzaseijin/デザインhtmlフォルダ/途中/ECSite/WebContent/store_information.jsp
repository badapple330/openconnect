<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>店舗一覧</title>
   <jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
   <jsp:include page="base/nav.jsp" flush="true" />
	<div class="container">
		<div class="cont">
			<div class="main">
				<h2>店舗情報</h2>
				<h4>霞ヶ関店</h4>
				<table class="store">
					<tbody>
						<tr>
							<th>住所</th>
							<td>〒100-0013 東京都千代田区霞が関3-6-15 霞ヶ関MH タワーズ7F</td>
						</tr>
						<tr>
							<th>電話番号</th>
							<td>03-6205-7707</td>
						</tr>
						<tr>
							<th>営業時間</th>
							<td>11:00～23:00</td>
						</tr>
					</tbody>
				</table>
				<h4>池尻店</h4>
				<table class="store">
					<tbody>
						<tr>
							<th>住所</th>
							<td>〒154-0005 東京都世田谷区三宿一丁目8番19号　MBA ビル1F</td>
						</tr>
						<tr>
							<th>電話番号</th>
							<td>03-6205-7708</td>
						</tr>
						<tr>
							<th>営業時間</th>
							<td>16:00～23:00</td>
						</tr>
					</tbody>
				</table>
				<h4>御茶ノ水店</h4>
				<table class="store">
					<tbody>
						<tr>
							<th>住所</th>
							<td>〒154-0005 東京都文京区湯島3-2-12　御茶ノ水天神ビル2F</td>
						</tr>
						<tr>
							<th>電話番号</th>
							<td>03-6205-7709</td>
						</tr>
						<tr>
							<th>営業時間</th>
							<td>9:00～23:00</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<br>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>