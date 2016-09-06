<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/logout.css">
<!-- jQuery読み込み -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>


<meta name="GENERATOR"
	content="IBM HomePage Builder 2001 V5.0.2 for Windows">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UESUTO.COM-ログアウト確認-</title>
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
outline:none;
}
</style>
</head>
<body>


					<!-- ヘッダー -->
	<table style="background-color: #faff00; height: 200; width: 100%">
		<tr>
			<td><a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
			<td valign="bottom"><img src="img/kuma.gif" width="100"
				height="100" align="right"> <img src="img/souryou.png"
				width="340" height="151" align="right"></td>
		</tr>
		<tr>
			<td colspan="2">
				<hr class="line02" /> <jsp:include page="Header.jsp"></jsp:include></td>
		</tr>
	</table>
						<!-- ヘッダー -->


	<div id="main">
		<h1>
			<s:text name="ログアウトしますか？" />
		</h1>
		<!-- ログアウト判別  [ログアウトしてメインページに遷移するボタン] -->
		<div align="center">
			<s:a href="LogoutAction">
				<button class="btn1" type="submit">
					<s:text name="ログアウトする" />
				</button>
				<br>
			</s:a>
			<s:a href="CartClearAction">
				<button class="btn2" type="submit">
					<s:text name="ログアウトしない" />
				</button>
			</s:a>
		</div>
		</div>


					<!-- 前の画面に戻るボタン -->

		<div>
		<a href="javascript:history.back();">
<input type="submit" value="前画面に戻る" style="background-color:#ffff99"
				onmouseover="this.style.background='#99ccff'"
				onmouseout="this.style.background='#ffff99'" /></a></div>


					<!-- フッダー -->
		<div class="stickyFooter">
			<hr class="line" />
			<p align="right">(C) 2015 UESUTO.com. All Rights Reserved.</p>
			<br> <br>
		</div>
		<!-- jQuery読み込み -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- BootstrapのJS読み込み -->
		<script src="js/bootstrap.min.js"></script>
</body>
</html>