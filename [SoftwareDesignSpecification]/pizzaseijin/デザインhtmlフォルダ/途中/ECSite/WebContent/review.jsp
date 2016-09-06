<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>レビュー</title>
	<jsp:include page="base/base.jsp" flush="true" />
   	<script type="text/javascript" src="js/jquery.raty.js"></script>
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
<div class="container">
<h1 class="text-center">レビューページ</h1>
<hr>
<h3>ピザ星人スペシャル</h3>
<div class="container">
		<table class="item_table">
			<tr>
				<td rowspan="4"><img alt="" src="./img/pizza01.jpg"/></td>
				<td>商品名:</td><td>ピザ星人スペシャル</td>
			</tr>
			<tr>
				<td>購入日:</td><td>2015年12月12日10時20分</td>
			</tr>
			<tr>
				<td>値段:</td><td>2900円/枚</td>
			</tr>
			<tr>
				<td></td><td>300円/ピース</td>
			</tr>
		</table>
	</div>
	<hr>
			<h3>レビューする</h3>
				<div id="raty"></div>
				<script type="text/javascript">
                  $(function() {
                    $('#raty').raty({
		              readOnly : false, //閲覧者によるスコアの変更不可  
	              	  score : function() {
		              return $(this).attr('data-score');
		            },
		            path : './img/' //サーバ上のRaty画像のパス
	              });
                });
              </script>
			  <textarea placeholder="コメントを入力してください" rows="5" cols="50"></textarea>
			  <br>
			<input type="button" class="btn btn-danger" value="コメントを送信" />
		<hr>
		<h3>新着レビュー</h3>
		<div class="row">
		  <div class="col-md-6 col-md-offset-3">
		<div id="review1"></div>
		<script type="text/javascript">
		  $('#review1').raty({
			  readOnly : true,
			  score: 3 ,
			  path : './img/'
		  });
		</script>
			<table class="review_table">
				<tr>
					<td>名前:</td>
					<td>ピザ星人A</td>
				</tr>
				<tr>
					<td>コメント:</td>
					<td>チーズが美味しかった</td>
				</tr>
		</table>
		  </div>
		</div>
	<hr>
	<div align="center">
	<a href="mypage.jsp"><input type="button" class="btn btn-danger" value="マイページに戻る"/></a>
	</div>
</div>
	<br>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>