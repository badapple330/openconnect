<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<HTML>
<HEAD>
<TITLE>UESUTO.COM-ログイン画面-</TITLE>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">


<style type="text/css">

body {
	margin: 0;
	padding: 0;
}

html, body {
	height: 100%;
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
</HEAD>
<BODY>

<!-- ヘッダー -->
	<div class="above-Footer">
		<div>
			<table style="background-color: #faff00; height: 200; width: 100%">
				<TR>
					<td><a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
					<td valign="bottom"><IMG src="img/kuma.gif" width="100"
						height="100" align="right"> <IMG src="img/souryou.png"
						width="340" height="151" align="right"></td>
				</TR>
				<tr>
					<td colspan="2">
						<hr class="line02" />
						<jsp:include page="Header.jsp"></jsp:include>
					</td>
				</tr>
			</table>

<!-- ヘッダー -->


			<div align="center">
				<BR> <BR> <BR> <BR> <b>ログイン</B>
				<Hr Size="3" Color="#32CD32" width="200">

				<s:form action="LoginAction">
					<BR>

					<!-- ID、パスワードのフォーム -->
					<table>
						<tr>
							<TD>ログインID<span style="color:red"><s:textfield label="ログインID" name="userid" /></span></TD>
						</tr>
						<tr>
							<TD>パスワード<s:password label="パスワード" name="password" /></TD>
						</tr>
						<font color="red"><s:property value="msg" /></font>
					</table>
					<br>
					<br>


					<!-- 購入確認画面へ遷移するボタン -->
					<s:submit align="center" value="購入確認→"
						style="background-color:#ffff99"
						onmouseover="this.style.background='#99ccff'"
						onmouseout="this.style.background='#ffff99'"></s:submit>
				</s:form>


					<!-- 商品一覧へ遷移するボタン -->
				<s:form action="BackMenuAction">
					<s:submit value="← 商品一覧に戻る" style="background-color:#ffff99"
						onmouseover="this.style.background='#99ccff'"
						onmouseout="this.style.background='#ffff99'"></s:submit>
				</s:form>


					<!-- 新規登録画面へ遷移するボタン -->
				<s:form action="GoCustomerInfoAction">
					<s:submit value="新規顧客情報入力→" style="background-color:#ffff99"
						onmouseover="this.style.background='#99ccff'"
						onmouseout="this.style.background='#ffff99'">
					</s:submit>
				</s:form>

					<!-- OAuth認証へ遷移 -->
				<s:url var="twitter" action="login-twitter" />
				<s:a href="GoTwitterAction">
					<img src="img/Twitter.png">
				</s:a>

				<s:url var="google" action="login-google" />
				<s:a href="GoGoogleAction">
					<img src="img/Google.png">
				</s:a>
			</div>
		</div>
	</div>

					<!-- 前の画面に戻るボタン -->>
	<div>
		<a href="javascript:history.back();">
<input type="submit" value="前画面に戻る" style="background-color:#ffff99"
				onmouseover="this.style.background='#99ccff'"
				onmouseout="this.style.background='#ffff99'" /></a></div>


				<!-- フッダー -->
	<div class="stickyFooter">

		<hr class="line" />
		<p align="right">(C) 2015 UESUTO.com. All Rights Reserved.</p>
	</div>
	<!-- jQuery読み込み -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
