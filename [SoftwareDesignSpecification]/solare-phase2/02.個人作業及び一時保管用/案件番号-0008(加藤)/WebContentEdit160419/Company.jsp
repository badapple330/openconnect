<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery読み込み -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>

<title>UESUTO.COM-企業情報-</title>

<style type="text/css">
html, body {
	height: 95%;
}

.stickyFooter {
	background: #faff00;
	height: 100;
}

.above-Footer {
	min-height: 100%;
	margin-bottom: -108;
}

.above-Footer:after {
	content: "";
	display: block;
	height: 100;
}

hr.line {
	height: 13px;
	background: url(img/boda.png);
	border: 0px none;
}

hr.line02 {
	height: 65px;
	background: url(img/kiui2.png);
	border: 0px none;

}
a.logo{
outline: none;
}
</style>



</head>
<body>
<!-- ヘッダー -->
	<table style="background-color: #faff00; height: 200; width: 100%">
		<tr>
			<td>
			<a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
			<td valign="bottom"><img src="img/kuma.gif" width="100"
				height="100" align="right"> <img src="img/souryou.png"
				width="340" height="151" align="right"></td>
		</tr>
		<tr>
			<td colspan="2">
				<hr class="line02" /> <jsp:include page="Header.jsp"></jsp:include>
			</td>
		</tr>

	</table>
<!-- ヘッダー -->

	<br>
	<br>
	<br>

	<table class=companytext>
		<tr>
			<th>商号</th>
			<td>株式会社インターノウス</td>
		</tr>
		<tr>
			<th>本社所在地</th>
			<td>東京都千代田区霞ヶ関３－６－１５</td>
		</tr>
		<tr>
		<!-- GOOGLE MAP -->
			<td><iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3241.2072086998946!2d139.74358305068958!3d35.67189958009928!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188b8eebcf1a19%3A0xa6b37f0d62391d8!2z44CSMTAwLTAwMTMg5p2x5Lqs6YO95Y2D5Luj55Sw5Yy66Zye44GM6Zai77yT5LiB55uu77yW4oiS77yR77yV!5e0!3m2!1sja!2sjp!4v1459839248478"
					width="200" height="100" frameborder="1" style="border: 0">
				</iframe></td>
		</tr>
		<tr>
			<th>代表者</th>
			<td>代表取締役社長 柿澤フェルナンデス</td>
		</tr>
		<tr>
			<th>従業員数</th>
			<td>２人</td>
		</tr>
		<tr>
			<th>営業拠点</th>
			<td>東京・大阪・ニューヨーク・プーケット・四川省</td>
		</tr>
		<tr>
			<th>物流拠点</th>
			<td>かきざわんち</td>
		</tr>
		<tr>
			<th>主要取引銀行</th>
			<td>ごみょうんち銀行</td>
		</tr>
	</table>
	<div>
	<!-- 前の画面に戻るボタン -->
		<a href="javascript:history.back();"> <input type="submit"
			value="前画面に戻る" style="background-color: #ffff99"
			onmouseover="this.style.background='#99ccff'"
			onmouseout="this.style.background='#ffff99'" /></a>
	</div>
	<!-- フッダーの宣言 -->
	<div class="stickyFooter">
		<hr class="line" />
		<p align="right">(C) 2015 UESUTO.com. All Rights Reserved.</p>
		<br>
		<br>
	</div>
	<!-- jQuery読み込み -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- BootstrapのJS読み込み -->
	<script src="js/bootstrap.min.js"></script>

</body>
</html>