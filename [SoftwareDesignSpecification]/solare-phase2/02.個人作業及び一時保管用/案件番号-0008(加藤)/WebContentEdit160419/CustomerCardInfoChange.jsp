
<!-- クレジットカードの情報を入力する画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UESUTO.COM-クレジットカード情報の登録-</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

hr.line {
	height: 13px;
	background: url(img/boda.png);
	border: 0px none;
}

hr.line02 {
	height: 65px;
	l background: url(img/kiui2.png);
	border: 0px none;
}

a.logo {
	outline: none;
}

ul {
	list-style: none;
	margin: 1em 0 0 1em;
	padding: 0;
}

#explaination {
	height: 50px;
	width: 250px;
	border: 1px solid black;
	background-color: #FFFF99;
	text-align: center;
}

#input {
	width: 500px;
	border: 1px solid black;
	"
}
</style>
<script>
	window.onload = message;

	function message() {
		if (document.getElementById("errmsg").innerText.length == 0) {
			document.getElementById('errmsgtd').style.display = "none";
		}
		if (document.getElementById("errmsg2").innerText.length == 0) {
			document.getElementById('errmsgtd2').style.display = "none";
		}

	}
</script>

<script
	src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js"
	charset="UTF-8"></script>

</head>
<body>
	<!-- ヘッダー -->
	<table style="background-color: #faff00; height: 200; width: 100%">
		<tr>
			<td><a class="logo" href="BackMenuAction"><img
					src="img/log.png" alt="uesto.com"></a>
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
	<!-- ヘッダーここまで -->

	<br>
	<br>
	<br>

	<div align="center">
		<b>クレジットカード情報の登録フォーム</b>
	</div>
	<hr color="#32cd32" width="20%">
	<br>
	<div align="center">
		<font size="-1">お客様のクレジットカード情報をご入力後、「登録をする」ボタンを押して下さい。</font>
	</div>
	<br>

	<div style="width: 750px; margin: 0 auto;">
		<s:form action="CustomerCardInfoChangeAction">
			<!-- クレジットカードの入力内容のテーブル -->
			<table style="border: 1px solid black; border-collapse: collapse;">
				<!-- テーブルヘッダー -->
				<tr>
					<th id="explaination">クレジットカードの登録内容</th>
					<th style="width: 500px; border: 1px solid black;">
						正確に入力をして下さい</th>
				</tr>

				<!-- 有効期限の入力 -->
				<tr>
					<td id="explaination">有効期間</td>
					<td id="input">
						<table>
							<tr>
								<td align="center">MONTH / YEAR</td>
							</tr>
							<tr>
								<td align="center"><select name="cardMonth">
										<option value=""></option>
										<option value="1">01</option>
										<option value="2">02</option>
										<option value="3">03</option>
										<option value="4">04</option>
										<option value="5">05</option>
										<option value="6">06</option>
										<option value="7">07</option>
										<option value="8">08</option>
										<option value="9">09</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
								</select> / <select name="cardYear">
										<option value=""></option>
										<option value="16">16</option>
										<option value="17">17</option>
										<option value="18">18</option>
										<option value="19">19</option>
										<option value="20">20</option>
										<option value="21">21</option>
										<option value="22">22</option>
								</select></td>
							</tr>
						</table>
					</td>
				</tr>

				<!-- カード番号の入力 -->
				<tr>
					<td id="explaination">カード番号</td>
					<td id="input"><input type="text" name="cardNumber" size="20"
						maxlength="16" /><font size="-1"> (16桁で間は空けないでください)</font> <font
						size="-1" color="red"> <s:fielderror>
								<s:param value="%{'cardNumber'}" />
							</s:fielderror>
					</font></td>
				</tr>

				<!-- カード名義の入力 -->
				<tr>
					<td id="explaination">カード名義</td>
					<td id="input"><input type="text" name="cardHolder" size="20"
						maxlength="20" /><font size="-1">
							(名前と名字の間には半角スペースを入れてください)</font><font
									size="-1" color="red">
											<s:fielderror><s:param value="%{'cardHolder'}" /></s:fielderror>
										</font></td>
				</tr>

				<!-- セキュリティーコードの入力 -->
				<tr>
					<td id="explaination">セキュリティーコード</td>
					<td id="input"><input type="text" name="securityCode" size="4"
						maxlength="4" /><font size="-1">&nbsp; (カード裏にある3桁又は4桁の数字)</font><font
									size="-1" color="red">
											<s:fielderror><s:param value="%{'securityCode'}" /></s:fielderror>
										</font></td>
				</tr>
			</table>

			<br>
			<br>
			<br>

			<div align="center">
				<!-- 入力されたクレジット情報を確認する画面に遷移するアクション -->
				<INPUT type="submit" value="確定" style="background-color: #ffff99"
					onmouseover="this.style.background='#99ccff'"
					onmouseout="this.style.background='#ffff99'" />
			</div>
		</s:form>
	</div>

	<div>
		<!-- 一つ前の画面に戻るための亜遷移ボタン -->
		<a href="javascript:history.back();"> <input type="submit"
			value="前画面に戻る" style="background-color: #ffff99"
			onmouseover="this.style.background='#99ccff'"
			onmouseout="this.style.background='#ffff99'" /></a>
	</div>

	<!-- フッター -->
	<div style="background-color: #faff00; height: 120; width: 100%">
		<hr class="line" />
		<p align="right">(C) 2015 UESUTO.com All Rights Reserved.</p>
		<br> <br>
	</DIV>
	<!-- jQuery読み込み -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- BootstrapのJS読み込み -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>