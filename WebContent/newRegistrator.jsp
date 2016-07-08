<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript"
	src="//code.jquery.com/jquery-2.1.0.min.js"></script>
<script type="text/javascript"
	src="//jpostal-1006.appspot.com/jquery.jpostal.js"></script>


<script type="text/javascript">
	$(window).ready(function() {
		$('#postcode1').jpostal({
			click : '#btn',
			postcode : [ '#postcode1', '#postcode2' ],
			address : {
				'#address1' : '%3',
				'#address2' : '%4%5'
			}
		});
	});
</script>

<title>新規登録</title>
</head>
<body>

	<br>
	<br>
	<br>
	<br>
	<br>
	<div align="center">
		<h1>新規登録</h1>

		<table>


			<tr>
				<th bgcolor="orange">名前（漢字）</th>
				<td><input type="text" value="" />姓 <input type="text"
					value="" />名</td>
			</tr>



			<tr>
				<th bgcolor="orange">名前（ふりがな）</th>
				<td><input type="text" value="" />せい <input type="text"
					value="" />めい</td>
			</tr>

			<tr>
				<th bgcolor="orange">郵便番号</th>
				<td><input type="text" id="postcode1" name="postcode1">-
					<input type="text" id="postcode2" name="postcode2"><input
					type="button" id="btn" name="btn" value="検索"></td>
			</tr>

			<tr>
				<th bgcolor="orange">住所</th>
				<td><input type="text" id="address1" name="address1">都道府県
					<input type="text" id="address2" name="address2">市区町村 <input
					type="text" />番地 <input type="text" />建物名等</td>
			</tr>

			<tr>
				<th bgcolor="orange">電話番号</th>
				<td><input type="text" value="" size="4" maxlength=4 />- <input
					type="text" value="" size="4" maxlength=4 />- <input type="text"
					value="" size="4" maxlength=4 /></td>
			</tr>

			<tr>
				<th bgcolor="orange">メールアドレス</th>
				<td><input type="text" value="" /></td>
			</tr>

			<tr>
				<th bgcolor="orange">性別</th>
				<td><input type="radio" name="gender" value="male" checked />男性
					<input type="radio" name="gender" value="female" />女性</td>
			</tr>

			<tr>
				<th bgcolor="orange">生年月日</th>
				<td><input type="text" value="" />年 <input type="text"
					value="" />月 <input type="text" value="" />日</td>
			</tr>

			<tr>
				<th bgcolor="orange">パスワード</th>
				<td><input type="text" value="" /></td>
			</tr>



		</table>
		<br> <input type="submit" value="登録"> <br> <br>
		<input type="submit" value="キャンセル" />
	</div>

</body>
</html>