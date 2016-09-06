<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
    <jsp:include page="base/base.jsp" flush="true" />
	<script type="text/javascript" src="js/jquery.plainmodal.min.js"></script>
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
	<div id="usermod-window">
		<form>
			<table>
				<tr>
					<th colspan="2">登録内容変更</th>
				</tr>
				<tr>
					<td>名前:</td>
					<td><input type="text" placeholder="名前を入力してください" /></td>
				</tr>
				<tr>
					<td>フリガナ:</td>
					<td><input type="text" placeholder="フリガナを入力してください" /></td>
				</tr>
				<tr>
					<td>郵便番号:</td>
					<td><input type="text" placeholder="郵便番号を入力してください" /></td>
				</tr>
				<tr>
					<td>住所:</td>
					<td><input type="text" placeholder="住所を入力してください" /></td>
				</tr>
				<tr>
					<td>電話番号:</td>
					<td><input type="text" placeholder="TELを入力してください" /></td>
				</tr>
				<tr>
					<td>メール:</td>
					<td><input type="text" placeholder="メールアドレスを入力してください" /></td>
				</tr>
			</table>
			<a href="mypage.jsp"><input type="button" class="btn btn-danger" value="変更を登録する" /></a>
		</form>
	</div>
	<div id="creditmod-window">
		<form>
			<table>
				<tr>
					<th colspan="2">登録内容変更</th>
				</tr>
				<tr>
					<td>カード番号:</td>
					<td id="name"><input type="text" placeholder="カード番号を入力してください" /></td>
				</tr>
				<tr>
					<td>カード名義:</td>
					<td><input type="text" placeholder="カード名義を入力してください" /></td>
				</tr>
				<tr>
					<td>有効期限:</td>
					<td><input type="text" placeholder="有効期限を入力してください" /></td>
				</tr>
				<tr>
					<td>セキュリティコード:</td>
					<td><input type="text" placeholder="セキュリティコードを入力してください" /></td>
				</tr>
			</table>
			<a href="mypage.jsp"><input type="button" class="btn btn-danger" value="変更を登録する" /></a>
		</form>
	</div>
	<div class="container">
			<h1 class="text-center">マイページ</h1>
			  <div class="row">
			    <hr>
				<h3>登録情報</h3>
			    <div class="col-md-3">
				<table class="mypage_table">
					<tr>
						<th colspan="2">基本情報</th>
					</tr>
					<tr>
						<td>名前:</td>
						<td>ピザ星人A</td>
					</tr>
					<tr>
						<td>フリガナ:</td>
						<td>ピザセイジンA</td>
					</tr>
					<tr>
						<td>郵便番号:</td>
						<td>000-0000</td>
					</tr>
					<tr>
						<td>住所:</td>
						<td>埼玉県川口市○○町２−５</td>
					</tr>
					<tr>
						<td>電話番号:</td>
						<td>09017861111</td>
					</tr>
					<tr>
						<td>メール:</td>
						<td>pizza01@test.com</td>
					</tr>
				</table>
				<input type="button" id="user-modal-open" class="btn btn-danger" value="基本情報を変更する" />
				<script>
					$('#user-modal-open').click(function() {
						$('#usermod-window').plainModal('open', {
							overlay : {
								color : '#fff',
								opacity : 0.5
							}
						});
					});
				</script>
			</div>
			<div class="col-md-3 col-md-offset-1">
			<table class="mypage_table">
				<tr>
					<th colspan="2">クレジットカード情報</th>
				</tr>
				<tr>
					<td>カード番号:</td>
					<td>3333</td>
				</tr>
			</table>
			<input type="button" id="credit-modal-open" class="btn btn-danger" value="クレジット情報を変更する" />
			<script>
				$('#credit-modal-open').click(function() {
					$('#creditmod-window').plainModal('open', {
						overlay : {
							color : '#fff',
							opacity : 0.5
						}
					});
				});
			    </script>
			</div>
		</div>
		<div class="row">
		<hr>
			<h3>購入履歴</h3>
			<div class="x_scroll">
			<table class="sctable">
				<tr>
					<td colspan="2"><img alt="" src="./img/pizza01.jpg" /></td>
					<td colspan="2"><img alt="" src="./img/pizza02.jpg" /></td>
					<td colspan="2"><img alt="" src="./img/pizza03.jpg" /></td>
					<td colspan="2"><img alt="" src="./img/pizza04.jpg" /></td>
					<td colspan="2"><img alt="" src="./img/pizza05.jpg" /></td>
				</tr>
				<tr>
					<td>商品名:</td>
					<td>ピザ星人スペシャル</td>
					<td>商品名:</td>
					<td>ピザ星人スペシャル</td>
					<td>商品名:</td>
					<td>ピザ星人スペシャル</td>
					<td>商品名:</td>
					<td>ピザ星人スペシャル</td>
					<td>商品名:</td>
					<td>ピザ星人スペシャル</td>
				</tr>
				<tr>
					<td>購入日:</td>
					<td>2015年12月12日10時20分</td>
					<td>購入日:</td>
					<td>2015年12月12日10時20分</td>
					<td>購入日:</td>
					<td>2015年12月12日10時20分</td>
					<td>購入日:</td>
					<td>2015年12月12日10時20分</td>
					<td>購入日:</td>
					<td>2015年12月12日10時20分</td>
				</tr>
				<tr>
					<td>値段:</td>
					<td>2900円</td>
					<td>値段:</td>
					<td>2900円</td>
					<td>値段:</td>
					<td>2900円</td>
					<td>値段:</td>
					<td>2900円</td>
					<td>値段:</td>
					<td>2900円</td>
				</tr>
				<tr>
					<td>数量:</td>
					<td>1枚</td>
					<td>数量:</td>
					<td>6ピース</td>
					<td>数量:</td>
					<td>6ピース</td>
					<td>数量:</td>
					<td>2枚</td>
					<td>数量:</td>
					<td>1枚</td>
				</tr>
				<tr>
					<td colspan="2"><a href="review.jsp"><input type="button" class="btn btn-danger" value="レビューを書く" /></a></td>
					<td colspan="2"><a href="review.jsp"><input type="button" class="btn btn-danger" value="レビューを書く" /></a></td>
					<td colspan="2"><a href="review.jsp"><input type="button" class="btn btn-danger" value="レビューを書く" /></a></td>
					<td colspan="2"><a href="review.jsp"><input type="button" class="btn btn-danger" value="レビューを書く" /></a></td>
					<td colspan="2"><a href="review.jsp"><input type="button" class="btn btn-danger" value="レビューを書く" /></a></td>
				</tr>
			</table>
	      </div>
	    </div>
		<div class="row">
		<hr>
			<h3>お手持ちのクーポン</h3>
			<table>
				<tr>
					<th>クーポン内容</th>
					<th>数量</th>
					<th>クーポン番号</th>
					<th>使用期限</th>
				</tr>
				<tr>
					<td>全品10%OFFクーポン</td>
					<td>1枚</td>
					<td>D-1230</td>
					<td>2015年12月31日</td>
				</tr>
			</table>
		</div>
		<div class="row">
		<hr>
			<h3>退会</h3>
			<div class="col-md-3">
				<a href="withdrawal.jsp"><input type="button" class="btn btn-danger" value="退会処理へ進む" /></a>
			</div>
		</div>
		<div class="row">
			<hr>
		</div>
		<div align="center">
			<a href="index.jsp"><input type="button" class="btn btn-danger" value="ホームに戻る" /></a>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>