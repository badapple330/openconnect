<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>購入確認 - BigGalaxy </title>
<link rel="stylesheet" href="style.css">
</head>
<body id="login">

<header>
<h1><a href="main.jsp"><img src="image/logo.png" alt="">BigGalaxy</a></h1>
<nav>
<ul>
<li><a href="main.jsp">トップ</a></li>
<li><a href="Product.jsp">上映作品一覧</a></li>
<li><a href="login.jsp">ログイン</a></li>
<li><a href="http://jp.finalfantasyxiv.com/lodestone/">18歳未満の方はこちら</a></li>
</ul>
</nav>
</header>
<Div align="center">
<article>
<h3>購入確認</h3>

チケット名：　Ａチケット<br>
日程：　10月31日<br>
時間：　10時～<br>
枚数：　3枚<br>
お支払い：　カード払い<br>
値段：　3000円

</article>

<h1>以上の内容でご購入いたしますか？</h1><br>
</Div>
<Div align="center">

		<input type="submit" value="購入確定" />
		<input type="submit" value="戻る" />

</Div>

<footer>
<small>Copyright &copy; PlanetariumTicket, all rights
reserved.</small>
</footer>

</body>
</html>