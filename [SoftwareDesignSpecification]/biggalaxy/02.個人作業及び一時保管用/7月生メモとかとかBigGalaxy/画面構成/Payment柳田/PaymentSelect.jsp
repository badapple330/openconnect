<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>お支払い方法 - BigGalaxy</title>
<link rel="stylesheet" href="style.css">
</head>
<body id="login">

	<header>
	<h1>
		<a href="index.html"><img src="image/logo.png" alt="">BigGalaxy</a>
	</h1>
	<nav>
	<ul>
		<li><a href="main.jsp">トップ</a></li>
		<li><a href="ticket.jsp">上映作品一覧</a></li>
		<li><a href="login.jsp">ログイン</a></li>
		<li><a href="http://www.yahoo.co.jp/">18歳未満の方はこちら</a></li>
	</ul>
	</nav> </header>
<div align="center">
<h3>カート内容</h3>
<article>
～～～チケット
<br>
10月31日
<br>
10時～
<br>
3枚
<br>
3000円

<br>

<input type="submit" value="削除" />

</article>
</div>
<div align ="center">
	<p>お支払い方法選択</p>

	<form action="mypage.jsp">

		<input type="checkbox" name="select1" value="select1" checked="checked">カード支払い
		<br>
		<br>
<article>
			<input type="radio" name="card1" value="card1" checked="checked">mastarcard

			<input type="radio" name="card2" value="card2">VISA

			<input type="radio" name ="card3" value="card3">JCB
			 <br>


			氏名
				<fmt:message key="enter.username" bundle="${lang}"/> <br>
				<input type="text" name="userid" size="30"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>

			カード番号
				<fmt:message key="enter.username" bundle="${lang}"/> <br>
				<input type="text" name="userid" size="30"
					maxlength="16">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>

				有効期限
				<fmt:message key="enter.username" bundle="${lang}"/> <br>

				<input type="text" name="userid" size="2" maxlength="2">
				年
					<input type="text" name="userid" size="2" maxlength="2">
				月
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>

				セキュリティーコード
				<fmt:message key="enter.security" bundle="${lang}"/> <br>
				<input type="text" name="security" size="4"
					maxlength="4">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'security'}" />
					</s:fielderror></font>
</article>



<br>
		<input type="checkbox" name="select2" value="select2">代金引換え
		<br>
		<br>
<article>
				メールアドレス
				<fmt:message key="enter.username" bundle="${lang}"/> <br>
				<input type="text" name="userid" size="30"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>

				氏名
				<fmt:message key="user.placeholder" bundle="${lang}"/><br>
				<input type="text" name="name" size="30"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'name'}" />
					</s:fielderror></font>


				性別
				<br>
				<form name="Myform">
					<select name="gender">
						<option value="man">男性</option>
						<option value="woman">女性</option>
					</select>
				</form>
				<br>
				年齢
				<fmt:message key="age.placeholder" bundle="${lang}"/><br>
				<input type="text" name="age" size="3"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'age'}" />
					</s:fielderror></font>

				郵便番号
				<fmt:message key="enter.code" bundle="${lang}"/> <br>
				<input type="text" name="code" size="30"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>


				住所
				<fmt:message key="enter.adress" bundle="${lang}"/> <br>
				<input type="text" name="adress" size="30"
					maxlength="30">
				<br>
				<font color="red"><s:fielderror>
						<s:param value="%{'username'}" />
					</s:fielderror></font>


		<br>
</article>

		<input type="submit" value="購入確認へ" />
		<input type="submit" value="戻る" />



	</form>



	<footer> <small>Copyright &copy; PlanetariumTicket,
		all rights reserved.</small> </footer>
</div>
</body>
</html>
