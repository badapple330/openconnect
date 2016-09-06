
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8" />
<title>test</title>
<style>
#page-top {
	position: fixed;
	bottom: 20px;
	right: 20px;
	font-size: 77%;
}

#page-top a {
	background: #666;
	text-decoration: none;
	color: #fff;
	width: 100px;
	padding: 30px 0;
	text-align: center;
	display: block;
	border-radius: 5px;
}

#page-top a:hover {
	text-decoration: none;
	background: #999;
}

table {
 margin-left: auto;
 margin-right: auto;
}

h1 { 
	text-align: center; 
}

.topbtn {
	text-align: center;
	margin-top: 100px
}


</style>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		var topBtn = $('#page-top');
		topBtn.hide();
		//スクロールが100に達したらボタン表示
		$(window).scroll(function() {
			if ($(this).scrollTop() > 100) {
				topBtn.fadeIn();
			} else {
				topBtn.fadeOut();
			}
		});
		//スクロールしてトップ
		topBtn.click(function() {
			$('body,html').animate({
				scrollTop : 0
			}, 500);
			return false;
		});
	});
</script>
</head>
<body>

	<p class="centerdesign"><h1>管理画面</h1></p>
	<s:form action="アクションの名前">
		<table>
			<tbody>
				<tr>
					<td><h2>商品追加</h2></td>
				</tr>
				<tr>

					<td>商品名：<input type="text" name="goodsName" size="20"
						maxlength="20"></td>
					<td>在庫数：<input type="text" name="goodsStock" size="20"
						maxlength="20"></td>
					<td>金 額：<input type="text" name="goodsValue" size="20"
						maxlength="20"></td>
					<td><input type="submit" value="追加"></td>
				</tr>
			</tbody>
		</table>
	</s:form>
	<s:form action="アクションの名前">
		<table>
			<tbody>
				<tr>
					<td><h2>商品削除</h2></td>
				</tr>
				<tr>
					<td>商品ID：<input type="text" name="goodsName" size="20"
						maxlength="20"></td>
					<td><input type="submit" value="削除"></td>
				</tr>
			</tbody>
		</table>
	</s:form>
	<s:form action="アクションの名前">
		<table>
			<tbody>
				<tr>
					<td><h2>商品変更</h2></td>
				</tr>
				<tr>

					<td>商品名：<input type="text" name="goodsName" size="20"
						maxlength="20"></td>
					<td>在庫数：<input type="text" name="goodsStock" size="20"
						maxlength="20"></td>
					<td>金 額：<input type="text" name="goodsValue" size="20"
						maxlength="20"></td>
					<td><input type="submit" value="変更"></td>
				</tr>
			</tbody>
		</table>
	</s:form>
	<div class="topbtn">
	<s:form action="アクション名">
		<input type="submit" value="商品一覧情報取得">
	</s:form>
	</div>

	<table>
		<tbody>
		<tr>
			<td><h2>商品一覧</h2></td>
		</tr>
			<tr>
				<th>商品ID</th>
				<th>商品名</th>
				<th>在庫</th>
			</tr>
			<tr>
				<td>No.1</td>
				<td>レビュー用</td>
				<td>072</td>
			</tr>
		</tbody>
	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<p id="page-top">
		<a href="#wrap">PAGE TOP</a>
	</p>
</body>
</html>
</body>
</html>