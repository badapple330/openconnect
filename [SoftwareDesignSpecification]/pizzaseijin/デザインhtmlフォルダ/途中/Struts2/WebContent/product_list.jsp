<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>メニュー一覧</title>
   <jsp:include page="base/base.jsp" flush="true" />
   <link href="css/menu.css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery.plainmodal.min.js"></script>
	<script type="text/javascript" src="js/jquery.raty.js"></script>
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<jsp:include page="base/nav.jsp" flush="true" />
   <div align="center">
   		<table>
			<tr>
	  			<th colspan="2"><h2>ピザのサイズについて</h2></th>
			</tr>
			<tr>
				<td><h3>ピース売り</h3></td>
				<td><h3>一枚売り</h3></td>
			</tr>
			<tr>
				<td><a title="12分の1ピースです"><img src="./img/pizza-piece.png"/></a></td>
				<td><a title="33ｃｍです"><img src="./img/full-pizza.png"/></a></td>
			</tr>
		</table>
	</div>
	<div id="test-window">
        <table>
			<tr>
				<td rowspan="5"><img src="img/ピザ画像.jpg" alt=""><br><br>


				※このメニューは以下の原材料を含みます。<br>
<a title="カニを使用しています"><img class="allergy_img" src="./allergie_img/allergy01_kani.png"/></a>
<a title="エビを使用しています"><img class="allergy_img" src="./allergie_img/allergy02_ebi.png"/></a>
<a title="卵を使用しています"><img class="allergy_img" src="./allergie_img/allergy03_tamago.png"/></a>
<a title="牛乳を使用しています"><img class="allergy_img" src="./allergie_img/allergy04_milk.png"/></a>
<a title="小麦を使用しています"><img class="allergy_img" src="./allergie_img/allergy06_komugi.png"/></a>
<a title="イカを使用しています"><img class="allergy_img" src="./allergie_img/allergy09_ika.png"/></a>
<a title="イクラを使用しています"><img class="allergy_img" src="./allergie_img/allergy10_ikura.png"/></a>
			</td>
				<td colspan="2"><h2>ピザ星人オリジナル</h2></td>
			</tr>

			<tr>
				<td colspan="2">評価:4人がレビューしています。<div id="review1"></div>
						<script type="text/javascript">
						    $('#review1').raty({
						    	readOnly : true,
						    	score: 5 ,
						    	path : './img/'
						    });
						</script>

			</tr>
			<tr>
				<td colspan="2">商品紹介:<br>
				ピザ星人イチオシの人気商品です。
				お子様でも大人でも楽しめるピザです。
				ぜひ、ご賞味ください。
				</td>
			</tr>

			<tr>
					<td colspan="2">
					数量(枚/ピース):&nbsp;&nbsp;&nbsp;&nbsp;
					<img src="img/pizza1.jpeg">
					<select>
						<option>枚数を選択</option>
						<option>1枚</option>
						<option>2枚</option>
						<option>3枚</option>
						<option>4枚</option>
						<option>5枚</option>
					</select>&nbsp;&nbsp;&nbsp;&nbsp;
					<img src="img/pizza12.jpeg">
					<select>
						<option>ピース数を選択</option>
						<option>1ピース</option>
						<option>2ピース</option>
						<option>3ピース</option>
						<option>4ピース</option>
						<option>5ピース</option>
						<option>6ピース</option>
						<option>7ピース</option>
						<option>8ピース</option>
						<option>9ピース</option>
						<option>10ピース</option>
						<option>11ピース</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<div align="center"><a href="cart.jsp"><input class="btn btn-danger"type="button" value="カートに入れる"/></a></div>
				</td>
			</tr>
        </table>
	</div>
  <div class="menu">
    <ul>
      <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        	<script>
		$('#modal-open').click(function() {
			$('#test-window').plainModal('open', {
				overlay : {
					color : '#fff',
					opacity : 0.5
				}
			});
		});
	</script>
        <h4>ピザ星人オリジナル</h4>
      </li>
      <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
                  <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
                  <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
                  <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>            <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>            <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
      <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
      <li data-tutor="tutor1">
        <img id="modal-open" src="img/ピザ画像.jpg" alt="ピザの画像">
        <h4>ピザ星人オリジナル</h4>
      </li>
    </ul>
  </div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>
