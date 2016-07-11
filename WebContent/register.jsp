<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	<div align="center">
		<s:form action="registerAction">

			<br>
			<br>
			<br>
			<br>
			<br>
			<h1>新規登録</h1>

			<table>


				<tr>
					<th bgcolor="orange">名前（漢字）</th>
					<td><input type="text" value="" placeholder="山田" required />姓
						<input type="text" value="" placeholder="太郎" required />名</td>
				</tr>



				<tr>
					<th bgcolor="orange">名前（ふりがな）</th>
					<td><input type="text" value="" placeholder="やまだ" required />せい
						<input type="text" value="" placeholder="たろう" required />めい</td>
				</tr>

				<tr>
					<th bgcolor="orange">郵便番号</th>
					<td><input type="text" id="postcode1" name="postcode1"
						placeholder="半角数字で入力してください" maxlength=3 required title="半角数字で入力してください">-
						<input type="text" id="postcode2" name="postcode2"
						placeholder="半角数字で入力してください" maxlength=4 required title="半角数字で入力してください"><input
						type="button" id="btn" name="btn" value="検索"></td>
				</tr>

				<tr>
					<th bgcolor="orange">住所</th>
					<td><input type="text" id="address1" name="address1" required>都道府県
						<input type="text" id="address2" name="address2" required>市区町村
						<input type="text" required />番地 <input type="text" />建物名等</td>
				</tr>

				<tr>
					<th bgcolor="orange">電話番号</th>
					<td><input type="text" value="" size="4" maxlength=4
						pattern="^[0-9]+$" required title="半角数字で入力してください" />- <input
						type="text" value="" size="4" maxlength=4 pattern="^[0-9]+$"
						required title="半角数字で入力してください" />- <input type="text" value=""
						size="4" maxlength=4 pattern="^[0-9]+$" required
						title="半角数字で入力してください" /></td>
				</tr>

				<tr>
					<th bgcolor="orange">メールアドレス</th>
					<td><input type="text" value=""
						pattern="^[a-zA-Z]{1}[0-9a-zA-Z]+[\w\.-]+@[\w\.-]+\.\w{2,}+$"
						required title="○○@○○" /></td>
				</tr>

				<tr>
					<th bgcolor="orange">性別</th>
					<td><input type="radio" name="gender" value="male" checked />男性
						<input type="radio" name="gender" value="female" />女性</td>
				</tr>

				<tr>
					<th bgcolor="orange">生年月日</th>
					<td><input type="date" name="date" />生年月日
				</tr>

				<tr>
					<th bgcolor="orange">パスワード</th>
					<td><input type="text" value="" maxlength=16 size=50
						placeholder="８～１６文字の半角英数字で入力してください"
						pattern="^([a-zA-Z0-9]{8,16})+$" title="８～１６文字の半角英数字で入力してください" /></td>
				</tr>



			</table>
			<td><input type="submit" value="送信"></td>
			<br>
			<br>
			<td><input type="reset" value="リセット"></td>
		</s:form>
		<p>
			<a href="index.jsp"><button>キャンセル</button></a>
		</p>
	</div>



</body>
</html>