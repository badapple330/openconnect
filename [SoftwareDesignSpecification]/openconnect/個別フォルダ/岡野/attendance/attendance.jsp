<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<link rel="stylesheet" href="style.css">
</head>

<body>
<style type="text/css">
	.list{
		width:100%;
	}
</style>


<h1 align="center">生徒一覧</h1><br>

	<table border=1 align="center" class="search">
			<tr>
				<td>
					<select>
						<option selected>年度</option>
						<option>2015</option>
						<option>2016</option>
					</select>
				</td>
				<td>
					<select>
						<option selected>月</option>
						<option>1月生</option>
						<option>2月生</option>
						<option>3月生</option>
						<option>4月生</option>
						<option>5月生</option>
						<option>6月生</option>
						<option>7月生</option>
						<option>8月生</option>
						<option>9月生</option>
						<option>10月生</option>
						<option>11月生</option>
						<option>12月生</option>
					</select>
				</td>
				<td><p>日付<input type="date" size="7"/></p></td>
				<td><input type="submit" value="検索"/></td>
			</tr>

	</table><br><br>

	<table border=1 align="center" class="list">
			<tr>
				<td>管理者番号</td>
				<td>生徒氏名</td>
				<td>プロジェクト1</td>
				<td>プロジェクト2</td>
				<td>出欠状況</td>
				<td>理由</td>
				<td>備考</td>
			</tr>


			<tr>
				<td>20160501</td>
				<td>山田太郎</td>
				<td>BaseBallTicket</td>
				<td>OpenConnect</td>
				<td><select>
					<option selected>出席</option>
					<option>欠席</option>
					<option>遅刻</option>
					</select>
				</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>20160502</td>
				<td>田中次郎</td>
				<td>tBOX</td>
				<td>intenrousdev</td>
				<td><select>
					<option selected>出席</option>
					<option>欠席</option>
					<option>遅刻</option>
					</select>
				</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>20160503</td>
				<td>加藤三郎</td>
				<td>ichigoichie</td>
				<td>intenrousdev</td>
				<td><select>
					<option selected>出席</option>
					<option>欠席</option>
					<option>遅刻</option>
					</select>
				</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>20160504</td>
				<td>秋田四郎</td>
				<td>BigGalaxy</td>
				<td>visa</td>
				<td><select>
					<option selected>出席</option>
					<option>欠席</option>
					<option>遅刻</option>
					</select>
				</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>

	</table><br><br>

	<input type="submit" value="更新">

</html>