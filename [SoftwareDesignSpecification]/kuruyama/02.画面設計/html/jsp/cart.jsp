<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/cart.css">
<title>カート</title>
</head>
<body>
	<div id="backimg">

		
		<br>
			<br>
			<br>
			<h1>カート</h1>

		<div id="cart_content">
			<table>

				<tr>
					<td>しょうゆラーメン</td>
					<td>800円</td>
					<td><input type="text" name="itemnum" size="1" minlength="1" maxlength="256"></td>
					<td>個</td>
				</tr>
				<tr>
					<td>みそラーメン</td>
					<td>800円</td>
					<td><input type="text" name="itemnum" size="1" minlength="1" maxlength="256"></td>
					<td>個</td>
				</tr>
				<tr>
					<td>とんこつラーメン</td>
					<td>800円</td>
					<td><input type="text" size="1" ></td>
					<td>個</td>
				</tr>
				</table>
				<table>
				<tr>
					<td><input type="radio" name="choiceadress" value="currentaddress" checked="checked"  />現在の住所を使う</td>
				</tr>
				<tr>
					<td><input type="radio" name="choiceadress" value="otheraddress" />他の住所を使う</td>
				</tr>
			</table>
		</div>

			<table class="cart_button">
				<tr>
					<td><button class="btn" type="submit">カート内容の更新</button></td>
					<td><button class="btn" type="submit">戻る</button></td>
					<td><button class="btn" type="submit">購入確認</button></td>
				</tr>
			</table>
			<br>
			<br>
			<br>

</div>

</body>
</html>