<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/create_user.css">
<title>新規登録</title>
</head>
<body>
	<div id="backimg">
		<br>
		<br>
		<br>
		<h1></h1>
		<div class="form">
			<h1>新規登録</h1>
			<br>
			<br>
			<br>
			<p>
				<span>※</span>のついているものは必須入力です。
			</p>
			<table>
				<tr>
					<td><span>※</span>お名前</td>
				</tr>
				<tr>
					<td><input type="text" name="name" size="50" minlength="1"
						maxlength="256"></td>
				</tr>
				<tr>
					<td><span>※</span>パスワード(8文字以上、16文字以内)</td>
				</tr>
				<tr>
					<td><input type="password" name="password" size="20" minlength="8" maxlength="16"></td>
				</tr>
				<tr>
					<td><span>※</span>パスワード(確認用)</td>
				</tr>
				<tr>
					<td><input type="password" name="saipassword" size="20" minlength="8" maxlength="16"></td>
				</tr>
				<tr>
					<td><input type="checkbox">パスワードを表示</td>
				</tr>
				<tr>
					<td><span>☆メールアドレスはIDとして使用します。</span></td>
				</tr>
				<tr>
					<td><span>※</span>メールアドレス(1文字以上、256文字以内)</td>
				</tr>
				<tr>
					<td><input type="text" name="mail" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td><span>※</span>メールアドレス(確認用)</td>
				</tr>
				<tr>
					<td><input type="text" name="saimail" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td>配送先設定</td>
				</tr>
				<tr>
					<td>郵便番号（ハイフンはなしで入力してください）</td>
				</tr>
				<tr>
					<td><input type="text" name="postalcode" size="7" minlength="1" maxlength="7"></td>
				</tr>
				<tr>
					<td><span>※</span>ご住所</td>
				</tr>
				<tr>
					<td><input type="text" name="adress" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td><span>※</span>お電話番号</td>
				</tr>
				<tr>
					<td><input type="text" name="telnum" size="50" minlength="1" maxlength="11"></td>
				</tr>
				<tr>
					<td>クレジットカード登録</td>
				</tr>
				<tr>
					<td><span>☆メールアドレスはIDとして使用します。</span></td>
				</tr>
				<tr>
					<td>クレジットカード種別</td>
				</tr>
				<tr>
					<td><select name="cardtype">
							<option value="VISA">VISA</option>
							<option value="JCB">JCB</option>
							<option value="MASTER">MASTER</option>
					</select></td>
				</tr>
				<tr>
					<td>クレジットカード番号</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="20" minlength="1" maxlength="16"></td>
				</tr>
				<tr>
					<td>有効期間</td>
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
					</select> / <select name="year">
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>

					</select></td>
				</tr>
				<tr>
					<td>クレジットカード名義（名前と名字の間には半角スペースを入れてください）</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="50" minlength="1" maxlength="256"></td>
				</tr>
				<tr>
					<td>セキュリティコード</td>
				</tr>
				<tr>
					<td><input type="text" name="cardonum" size="5" minlength="1" maxlength="4"></td>
				</tr>
			</table>
			<input type="checkbox" name="riyu" value="1">利用規約に同意する
		</div>
		<br>
		<div align="center">
			<button class="btn" type="submit">確定</button>
		</div>
		<br>
		<br>
		<br>
	</div>
</body>
</html>
