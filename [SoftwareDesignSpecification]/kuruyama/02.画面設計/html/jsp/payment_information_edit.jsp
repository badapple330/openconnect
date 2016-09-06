<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>決済情報変更</title>
<link rel="stylesheet" type="text/css" href="../css/style.css" media="all" />
<link rel="stylesheet" type="text/css" href="../css/payment_information_edit.css">
</head>
<body>
	<div id="backimg">
		<br>
		<br>
		<br>
		<h1>決済情報変更</h1>
		<br>
		<br>
		<div class="form">
			<p>
				<span>※</span>のついているものは必須入力です。
			</p>
			<table>
				<tr>
					<td><span class="komezirushi">※</span>郵便番号</td>
				</tr>
				<tr>
					<td><input type="password" name="" size="8"></td>
				<tr>
					<td><br></td>
				</tr>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>住所</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>クレジット登録</td>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>カード種別</td>
				</tr>
				<tr>
					<td><select name="ka-do">
							<option value="VISA">VISA</option>
							<option value="JCB">JCB</option>
							<option value="MASTER">MASTER</option>
					</select></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>カード番号</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="20" minlength="1" maxlength="16"></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>有効期限</td>
				</tr>
				<tr>
					<td>MONTH / YEAR</td>
				</tr>
				<tr>
					<td><select name="month">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
					</select> <select name="year">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
					</select></td>
				<tr>
					<td><br></td>
				</tr>
				</tr>

			</table>
		</div>

		<center>
　　　　　　　　　　　　　
			<span class="komezirushi">※</span> カード名義(名前と名字の間には半角スペースを入れて下さい)
		</center>
		<div class="form">
			<table>
				<tr>
					<td><input type="text" name="cardonum" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><span class="komezirushi">※</span>セキュリティコード</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="5" minlength="1" maxlength="4"></td>
				</tr>

			</table>
		</div>
		<br>
		<div align="center">
			<button class="btn" type="submit">変更</button>
		</div>
		<br>
		<br><br>
	</div>
</body>
</html>
