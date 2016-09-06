
<!--  新規会員登録画面-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UESUTO.COM-新規登録画面-</title>

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
	background: url(img/kiui2.png);
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
	text-align:;
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
		<b>新規会員登録フォーム</b>
	</div>
	<hr color="#32cd32" width="20%">
	<br>
	<div align="center">
		<font size="-1">お客様の情報をご入力後、「会員登録をする」ボタンを押して下さい。</font>
	</div>
	<br>
	<div style="width: 750px; margin: 0 auto;">
		<s:form action="CustomerInfoAction">
			<!-- 会員情報入力テーブル -->
			<table style="border: 1px solid black; border-collapse: collapse;">
				<!-- ログインＩＤを入力 -->
				<tr>
					<td id="explaination">ログインID</td>
					<td style="width: 500px; border: 1px solid black;"><INPUT
						type="text" name="userid" size="15"
						value="<s:property value="userid"/>"><font size="-1">
							(半角英数字) </font> <font size="-1" color="red"><s:fielderror>
								<s:param value="%{'userid'}" />
							</s:fielderror></font>
						<div id="errmsgtd">
							<br>
							<div id="errmsg">
								<font size="-1" color="red"><s:property value="message" /></font>
							</div>
						</div></td>
				</tr>

				<!-- パスワードの入力 -->
				<tr>
					<td id="explaination">パスワード</td>
					<td id="input"><INPUT type="password" name="password"
						size="15"><font size="-1"> (半角英数字4～16桁) </font> <br>
						<br> <INPUT type="password" name="password2" size="15"><font
						size="-1"> (確認のためもう一度ご入力ください) </font> <font size="-1" color="red"><s:fielderror>
								<s:param value="%{'password'}" />
							</s:fielderror></font>
						<div id="errmsgtd2">
							<br>
							<div id="errmsg2">
								<font size="-1" color="red"><s:property value="message2" /></font>
							</div>
						</div></td>
				</tr>

				<!-- 名前の入力 -->
				<tr>
					<td id="explaination">お名前</td>
					<td id="input"><font size="-1">姓：</font><INPUT type="text"
						name="familyname" size="10"
						value="<s:property value="familyname" />"> <font size="-1">名：</font><INPUT
						type="text" name="firstname" size="10"
						value="<s:property value="firstname"/>"><font size="-1">
							(全角) 例：山田花子</font> <font size="-1" color="red"><s:fielderror>
								<s:param value="%{'familyname'}" />
							</s:fielderror> <s:fielderror>
								<s:param value="%{'firstname'}" />
							</s:fielderror></font></td>
				</tr>

				<!-- メールアドレスの入力 -->
				<tr>
					<td id="explaination">メールアドレス</td>
					<td id="input"><INPUT type="text" name="mailaddress" size="15"
						value="k@gmail.com"><font size="-1"> (半角英数字)</font><font
						size="-1" color="red"><s:fielderror>
								<s:param value="%{'mailaddress'}" />
							</s:fielderror></font></td>
				</tr>

				<!-- 住所を入力 -->
				<tr>
					<td id="explaination">ご住所</td>
					<td id="input">

						<table>
							<tr>
								<td valign="top"><font size="-1">郵便番号</font></td>
								<td><INPUT type="text" name="postal" size="10"
									maxlength="7"
									onKeyUp="AjaxZip3.zip2addr(this,'','address','address');"
									value="<s:property value="postal"/>"><font size="-1">
										(半角数字、ハイフンなし)</font><font size="-1" color="red"><s:fielderror>
											<s:param value="%{'postal'}" />
										</s:fielderror></font></td>
							</tr>
							<tr height="10">
							</tr>
							<tr>
								<td valign="top"><font size="-1">ご住所</font></td>
								<td><INPUT type="text" name="address" size="45"
									maxlength="50" value="<s:property value="address"/>"><font
									size="-1" color="red"><s:fielderror>
											<s:param value="%{'address'}" />
										</s:fielderror></font></td>
							</tr>
						</table>
					</td>
				</tr>

				<!-- 電話番号の入力 -->
				<tr>
					<td id="explaination">電話番号</td>
					<td id="input"><INPUT type="text" name="telnumber"
						maxlength="11" size="15" value="<s:property value="telnumber"/>"><font
						size="-1"> (半角数字、ハイフンなし) 例：0312345678</font><font size="-1"
						color="red"><s:fielderror>
								<s:param value="%{'telnumber'}" />
							</s:fielderror></font></td>
				</tr>
			</table>
			<!-- 会員情報入力テーブルここまで -->

			<!-- 利用規約に同意するかの確認チェックボックス -->
			<s:checkbox name="termOfService" />
			<s:text name="利用規約に同意する" />

			<br>
			<br>
			<br>
			<br>

			<!-- ここからクレジット情報入力 -->
			<s:text name="・以下の項目はクレジットカードの情報を登録する方だけが入力をして下さい。" />
			<br>
			<s:text name="・クレジットカードの情報を登録されない方は入力せずに登録完了ボタンをクリックして下さい。" />

			<!-- クレジット情報入力テーブル -->
			<table style="border: 1px solid black; border-collapse: collapse;">
				<tr>
					<th id="explaination">クレジットカードの登録内容</th>
					<th style="width: 500px; border: 1px solid black;">*新規登録の段階では任意となりますが<br>
						購入の際は必ず登録していただきます
					</th>
				</tr>

				<!-- 有効期間の入力 -->
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
										<option value="01">01</option>
										<option value="02">02</option>
										<option value="03">03</option>
										<option value="04">04</option>
										<option value="05">05</option>
										<option value="06">06</option>
										<option value="07">07</option>
										<option value="08">08</option>
										<option value="09">09</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
								</select> / <select name="cardYear">
										<option value=" "></option>
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

				<!-- カード情報の入力 -->
				<tr>
					<td id="explaination">カード番号</td>
					<td id="input"><input type="text" name="cardNumber" size="20"
						maxlength="16" /><font size="-1"> (16桁で間は空けないでください)</font><font
									size="-1" color="red">
											<s:fielderror><s:param value="%{'cardNumber'}" /></s:fielderror>
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
						maxlength="4" /><font size="-1">&nbsp; (半角数字でカード裏にある3桁又は4桁の数字)</font><font
									size="-1" color="red">
											<s:fielderror><s:param value="%{'securityCode'}" /></s:fielderror>
										</font></td>
				</tr>
			</table>

			<!-- クレジットカード利用の同意のチェックボックス -->
			<s:checkbox name="termOfCard" />
			<s:text name="今回クレジットカードの内容も登録の方はこちらにチェックをしてください。" />
			<br>



			<br>
			<br>

			<div align="center">
				<!-- 入力内容の送信ボタン -->
				<INPUT type="submit" value="会員登録をする"
					style="background-color: #ffff99"
					onmouseover="this.style.background='#99ccff'"
					onmouseout="this.style.background='#ffff99'" />
			</div>
		</s:form>
	</div>

	<div>
		<!-- 一つ前の画面に戻るボタン -->
		<a href="javascript:history.back();"> <input type="submit"
			value="前画面に戻る" style="background-color: #ffff99"
			onmouseover="this.style.background='#99ccff'"
			onmouseout="this.style.background='#ffff99'" /></a>
	</div>

	<br>
	<br>
	<br>


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