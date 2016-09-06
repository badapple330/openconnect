<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート</title>
<jsp:include page="base/base.jsp" flush="true" />
<script type="text/javascript" src="js/cart.js"></script>
<link href="css/cart.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<jsp:include page="base/nav.jsp" flush="true" />
	<!--ヘッダーにロゴを表示-->
	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1" align="center">
				<table class="table-test">
					<tr>
						<th colspan="7">ご注文内容</th>
					</tr>
					<tr>
						<th colspan="7">メインメニュー</th>
					</tr>
					<tr>
						<td>商品名</td>
						<td>枚数</td>
						<td>ピース数</td>
						<td></td>
						<td>単価/ピース</td>
						<td>小計</td>
						<td></td>
					</tr>
					<tr>
						<td>ミートピザ</td>
						<td><select>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
						</select>枚</td>
						<td><select>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
						</select>ピース</td>
						<td><input type="button" class="btn btn-danger" value="変更">
						</td>
						<td>200円</td>
						<td>2600円</td>
						<td><input type="button" class="btn btn-danger" value="削除">
						</td>
					</tr>
					<tr>
						<th colspan="7">サイドメニュー</th>
					</tr>
					<tr>
						<td>商品名</td>
						<td colspan="2">個数</td>
						<td></td>
						<td>単価</td>
						<td colspan="2">小計</td>
					</tr>
					<tr>
						<td>ドリンク</td>
						<td colspan="2"><select>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
						</select></td>
						<td><input type="button" class="btn btn-danger" value="変更"></td>
						<td>100円</td>
						<td>100円</td>
						<td><input type="button" class="btn btn-danger" value="削除"></td>
					</tr>
				</table>
				<div align="right"><input type="button" class="btn btn-danger" value="全削除"></div>
				<p>※個数を変更したい場合は変更ボタンを押してください。</p>
				<p>※12ピース1枚となります。</p>
				<p>※削除ボタンで商品はカートから削除されます。</p>
				<p>※全削除ボタンで商品はカートからすべて削除されます。</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10 col-md-offset-1" align="center">
				<table class="table-cart">
					<tr>
						<th colspan="2">クーポン情報</th>
					</tr>
					<tr>
						<td><select>
								<option value="00">所持クーポン選択/期限</option>
								<option value="01">15%OFFクーポン&nbsp;&nbsp;2015年3月12日</option>
								<option value="02">10%OFFクーポン&nbsp;&nbsp;2016年4月1日</option>
								<option value="03">5%OFFクーポン&nbsp;&nbsp;2015年2月23日</option>
						</select></td>
						<td><div align="right">-405円</div></td>
					</tr>
					<tr>
						<th colspan="2">合計金額</th>
					</tr>
					<tr>
						<td colspan="2"><div align="right">2295円</div></td>
					</tr>
				</table>
				<table class="table-cart">
					<tr>
						<th colspan="2">お支払い情報</th>
					</tr>
					<tr>
						<td colspan="2">
							<input type="radio" name="pay" value="pey" onclick="entry();" />代引き
							<input type="radio" name="pay" value="peycard" onclick="entry();" />クレジットカード払い</td>
					</tr>
					<tr id="payBox">
						<td colspan="2">クレジットカード情報の入力をお願いします。</td>
					</tr>
					<tr id="cardBox">
						<td>カード番号：</td>
						<td><input type=text name="cardNo"></td>
					</tr>
					<tr id="nameBox">
						<td>名義人:</td>
						<td><input type=text name="name"></td>
					</tr>
					<tr id="dateBox">
						<td>有効期限（月/年）：</td>
						<td>（月） <select name="cardMo">
								<option value="01">--</option>
								<option value="01">1月</option>
								<option value="02">2月</option>
								<option value="03">3月</option>
								<option value="04">4月</option>
								<option value="05">5月</option>
								<option value="06">6月</option>
								<option value="07">7月</option>
								<option value="08">8月</option>
								<option value="09">9月</option>
								<option value="10">10月</option>
								<option value="11">11月</option>
								<option value="12">12月</option>
						</select>（年）
						<select name="yearBox">
								<option value="00">--</option>
								<option value="15">15年</option>
								<option value="16">16年</option>
								<option value="17">17年</option>
								<option value="18">18年</option>
								<option value="19">19年</option>
								<option value="20">20年</option>
								<option value="21">21年</option>
								<option value="22">22年</option>
						</select>
						</td>
					</tr>
					<tr id="codeBox">
						<td>セキュリティコード：</td>
						<td><input type=password name="cardCode"></td>
					</tr>
					<tr id="creditButton">
						<td colspan="2">
							<input type="radio"/>登録<br>
							※チェックして頂くと次回から登録したクレジットカードを利用できます。
						</td>
					</tr>
					<tr>
						<th colspan="2">お届け先</th>
					</tr>
					<tr>
						<td colspan="2">
							<input type="radio" name="address" value="peycard" onclick="info();" />登録住所
							<input type="radio" name="address" value="peycard" onclick="info();" />その他住所
						</td>
					</tr>
					<tr id="a">
						<td colspan="2">新規住所情報を入力してください。</td>
					</tr>

					<tr id="b">
						<td>郵便番号:</td>
						<td><input type="text"></td>
					</tr>

					<tr id="c">
						<td>都道府県:</td>
						<td><input type="text"></td>
					</tr>

					<tr id="d">
						<td>市町村区:</td>
						<td><input type="text"></td>
					</tr>

					<tr id="e">
						<td>番地など:</td>
						<td><input type="text"></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10 col-md-offset-1" align="center">
				<a href="cart_check.jsp"><input type="button" class="btn btn-danger" value="購入確認へ"></a>
				<a href="index.jsp"><input type="button" class="btn btn-danger" value="キャンセル"></a>
			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>