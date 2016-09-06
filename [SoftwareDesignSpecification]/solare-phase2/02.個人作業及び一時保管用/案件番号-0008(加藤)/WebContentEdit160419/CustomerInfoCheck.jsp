
<!-- 新規登録画面で入力された内容を確認する画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UESUTO.COM-登録内容確認-</title>

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

table.table {
	word-break: break-all;
}

p.example {
	line-height: 1.5em;
	margin: 1em 1em;
}

#explaination {
	height: 50px;
	width: 250px;
	border: 1px solid black;
	background-color: #FFFF99;
	text-align:;
}

#input {
	width: 300px;
	border: 1px solid black;
	"
}
</style>


</head>
<body>
	<!-- ヘッダー -->
	<table style="background-color: #faff00; height: 200; width: 100%">
		<TR>
			<td><a class="logo" href="BackMenuAction"><img
					src="img/log.png" alt="uesto.com"></a>
			<td valign="bottom"><IMG src="img/kuma.gif" width="100"
				height="100" align="right"> <IMG src="img/souryou.png"
				width="340" height="151" align="right"></td>
		</TR>
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
		<b>登録内容確認</b>
	</div>
	<hr color="#32cd32" width="20%">
	<br>
	<div align="center">
		<font size="-1">以下の内容で登録を行います。よろしければ登録ボタンをクリックしてください</font>
	</div>
	<br>

	<div style="width: 550px; margin: 0 auto;">
		<!-- 新規登録での入力内容を表示するテーブル -->
		<table style="border: 1px solid black; border-collapse: collapse;">
			<!-- ログインＩＤを表示 -->
			<tr>
				<td id="explaination">ログインID</td>
				<td id="input"><font size="-1"> <s:property
							value="userid" /></font></td>
			</tr>

			<!-- パスワードを表示 -->
			<tr>
				<td id="explaination">パスワード</td>
				<td id="input"><font size="-1"> <s:property
							value="password" /></font></td>
			</tr>

			<!-- 名前を表示 -->
			<tr>
				<td id="explaination">お名前</td>
				<td id="input"><font size="-1"> <s:property
							value="familyname" /> <s:property value="firstname" /></font></td>
			</tr>

			<!-- メールアドレスを表示 -->
			<tr>
				<td id="explaination">メールアドレス</td>
				<td id="input"><font size="-1"> <s:property
							value="mailaddress" /></font></td>
			</tr>

			<!-- 住所を表示 -->
			<tr>
				<td id="explaination">ご住所</td>
				<td id="input"><p class="example">
						<font size="-1"><s:property value="postal" /><br> <s:property
								value="address" /></font>
					</p></td>
			</tr>

			<!-- 電話番号を入力 -->
			<tr>
				<td id="explaination">電話番号</td>
				<td id="input"><font size="-1"> <s:property
							value="telnumber" /></font></td>
			</tr>

			<!-- 有効期間の表示 -->
			<tr>
				<td id="explaination">有効期間</td>
				<td id="input"><font size="-1"> <s:property
							value="cardMonth" /></font> / <font size="-1"> <s:property
							value="cardYear" /></font></td>
			</tr>

			<!-- カード番号の表示 -->
			<tr>
				<td id="explaination">カード番号</td>
				<td id="input"><font size="-1"> <s:property
							value="cardNumber" /></font></td>
			</tr>

			<!-- カード名義の表示 -->
			<tr>
				<td id="explaination">カード名義</td>
				<td id="input"><font size="-1"> <s:property
							value="cardHolder" /></font></td>
			</tr>

			<!-- セキュリティーコードの表示 -->
			<tr>
				<td id="explaination">セキュリティーコード</td>
				<td id="input"><font size="-1"> <s:property
							value="securityCode" /></font></td>
			</tr>
		</table>
		<!-- テーブルここまで -->

		<s:hidden name="userid" value="%{userid}"></s:hidden>
		<s:hidden name="password" value="%{password}"></s:hidden>


		<br>
		<br>

		<!-- 登録完了画面に遷移するアクションボタン -->
		<s:form action="CustomerInfoCheckAction">
			<div align="center">
				<INPUT type="submit" value="登録" style="background-color: #ffff99"
					onmouseover="this.style.background='#99ccff'"
					onmouseout="this.style.background='#ffff99'" />
			</div>
		</s:form>

	</div>

	<div>
		<!--一つ前の画面に戻る遷移ボタン  -->
		<a href="javascript:history.back();"> <input type="submit"
			value="前画面に戻る" style="background-color: #ffff99"
			onmouseover="this.style.background='#99ccff'"
			onmouseout="this.style.background='#ffff99'" /></a>
	</div>

	<br>
	<br>
	<br>

	<!-- フッター -->
	<div style="background-color: #faff00; height: 100; width: 100%">
		<hr class="line" />
		<p align="right">(C) 2015 UESUTO.com. All Rights Reserved.</p>
		<br> <br>
	</DIV>

	<!-- jQuery読み込み -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- BootstrapのJS読み込み -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>