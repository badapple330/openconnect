<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang=“ja”>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="favicon.ico" href="../img/favicon.ico">
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="js/jquery.flexslider.js"></script>
<script type="text/javascript" src="js/css_browser_selector.js"></script>

<script type="text/javascript">
	(function($) {
		$(document).ready(function() {
			var thumbs = $(".thumb img");
			var top_images = $(".top img");
			thumbs.hover(function() {
				top_images.hide().eq(thumbs.index($(this))).show();
			});
		});
	})(jQuery);
	(function($) {
		$(document).ready(function() {
			var thumbs2 = $(".thumb2 img");
			var top_images2 = $(".top2 img");
			thumbs2.hover(function() {
				top_images2.hide().eq(thumbs2.index($(this))).show();
			});
		});
	})(jQuery);
	$(window).load(function() {
		$('.flexslider').flexslider({
			slideshowSpeed : 5000,
			mousewheel : true,
		});
	});
	jQuery(function() {
		jQuery('a[href^=#]').click(function() {
			var speed = 800;
			var href = jQuery(this).attr("href");
			var target = jQuery(href == "#" || href == "" ? 'html' : href);
			var position = target.offset().top;
			jQuery('body,html').animate({
				scrollTop : position
			}, speed, 'swing');
			return false;
		});
	});
</script>


<style>
#content {
	margin-left: 75px;
	margin-right: 75px
}

#reservbtn {
	margin-left: auto;
	margin-right: auto
}

#resbtn {
	text-align: center;
}

.cube {
	margin: 0;
	border: 0;
	font-size: 18px;
	font-family: margin-top : -25px;
	width: 120px;
	height: 50px;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-user-select: none;
	perspective: 500px;
	float: left;
}

.cube span {
	position: absolute;
	text-align: center;
	width: 120px;
	height: 50px;
	padding: 10px;
	border: #000000 solid 1px;
	pointer-events: none;
	box-sizing: border-box;
}

.cube span:nth-child(1) {
	color: #000000;
	background-color: #000000;
	transform: rotateX(90deg);
	transition: all 0.2s ease;
	transform-origin: 50% 50% -25px;
}

.cube span:nth-child(2) {
	color: #000000;
	background-color: #ffffff;
	transform: rotateX(0deg);
	transition: all 0.2s ease;
	transform-origin: 50% 50% -25px;
}

.cube:hover span:nth-child(1) {
	color: #ffffff;
	transition: all 0.2s ease;
	transform: rotateX(0deg);
}

.cube:hover span:nth-child(2) {
	background-color: #000000;
	transition: all 0.2s ease;
	transform: rotateX(-90deg);
}

.safaribtn {
	display: none
}

.safari .safaribtn {
	display: inline
}

.safari a {
	text-decoration: none
}

.safari a, a:hover, a:visited, a:link, a:active {
	color: black
}

.safari a.safaribtn {
	font-size: 1em;
	display: block;
	width: 100px;
	padding-top: 10px;
	padding-bottom: 10px;
	text-align: center;
	border: 2px solid;
	border-color: #aaaaaa #444444 #444444 #aaaaaa;
	background: white;
}

.safari a.safaribtn:hover {
	background: #777777;
}

#safarimenu_countainer {
	text-align: center;
	width: 800px;
	margin-left: auto;
	margin-right: auto;
	margin-bottom: 50px
}

/*

.safari .safaribtn {
    margin: 0;
	border: 0;
	font-size: 19px;
	font-family: margin-top : -25px;
	width: 120px;
	height: 50px;

}


.safari .safaribtn span{
    border-top: 1px solid #ccc;
    border-right: 1px solid #999;
    border-bottom: 1px solid #999;
    border-left: 1px solid #ccc;
    padding: 5px 20px;
    font-weight: bold;
    cursor: pointer;
    color: #666;
    background-color:white

	}

*/
.safari #info {
	claer: both
}

.safari .cube span {
	display: none
}

.safari3 .cube span:nth-child(1) {
	display: none
}

.safari3 .cube span:nth-child(2) {
	cdisplay: none
}

.safari3 .cube:hover span:nth-child(1) {
	display: none
}

.safari3 .cube:hover span:nth-child(2) {
	display: none
}

* /

#infobtn {
	margin-left: 300px
}
</style>
<link href="css/css.css" rel="stylesheet" type="text/css">
<title>Solare</title>
</head>

<body>
	<h1 id="top">Solare</h1>
	<p id="sub">~Italian＆French Restaurant~</p>
	<br>
	<hr>

	<div class="cubeconteiner">
		<a class="cube menu" href="#info"> <span>Go</span> <span>Info</span>
		</a> <a class="cube menu" href="#menu"> <span>Go</span> <span>Menu</span>
		</a> <a class="cube menu" href="#course"> <span>Go</span> <span>Course</span>
		</a> <a class="cube menu" href="GoToReservationPageAction"> <span>Go</span>
			<span>Reservation</span>
		</a> <a class="cube menu" href="#aboutus"> <span>Go</span> <span>AboutUs</span>
		</a> <a class="cube menu" href="#shopinfo"> <span>Go</span> <span>ShopInfo</span>
		</a> <a class="cube menu" href="GoToMyPageAction"> <span>Go</span> <span>MyPage</span>
		</a>
	</div>


	<div id="safarimenu_countainer">
		<a class="safaribtn menu" href="#info"> Info </a> <a
			class="safaribtn menu" href="#menu"> Menu </a> <a
			class="safaribtn menu" href="#course">Course </a> <a
			class="safaribtn menu" href="GoToReservationPageAction">
			Reservation </a> <a class="safaribtn menu" href="#aboutus">AboutUs </a> <a
			class="safaribtn menu" href="#shopinfo">ShopInfo </a> <a
			class="safaribtn menu" href="GoToMyPageAction">MyPage </a>
	</div>


	<br>
	<br>
	<br>
	<br>

	<h2 id="info">1,Information</h2>
	<hr>
	<div class="flexslider">
		<ul class="slides">
			<li><img src="img/info1.jpg" alt="" width="840" height="430" />
				<p class="flex-caption">温かみ溢れる落ち着いた店内</p></li>
			<li><img src="img/info2.jpg" alt="" width="840" height="430" />
				<p class="flex-caption">煉瓦造りの外観が目印</p></li>
			<li><img src="img/info3.jpg" alt="" width="840" height="430" />
				<p class="flex-caption">仔牛のフィレステーキ オーロラ風</p></li>
			<li><img src="img/info4.jpg" alt="" width="840" height="430" />
				<p class="flex-caption">苺のドルチェ</p></li>
			<li><img src="img/info5.jpg" alt="" width="840" height="430" />
				<p class="flex-caption">多種のワインを取り揃えております</p></li>
		</ul>
	</div>
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
	<h2 id="menu">2,menu</h2>
	<hr size="2" color="#000000">
	<p id="menuex">
		国産の食材のみを使用したしたイタリアン・フレンチ料理の数々<br> その一部をご紹介致します。<br>
		季節や仕入れ状況によってメニューが異なりますので、<br> 詳しくはご来店いただいて店内メニューでご確認ください。<br>
		<br> <br>
	<div class="images_area">
		<ul class="thumb">
			<li><img src="img/01.jpg" alt="thumbnail A"></li>
			<li><img src="img/02.jpg" alt="thumbnail B"></li>
			<li><img src="img/03.jpg" alt="thumbnail C"></li>
			<li><img src="img/04.jpg" alt="thumbnail D"></li>
			<li><img src="img/05.jpg" alt="thumbnail C"></li>
			<li><img src="img/06.jpg" alt="thumbnail D"></li>
			<li><img src="img/07.jpg" alt="thumbnail A"></li>
			<li><img src="img/08.jpg" alt="thumbnail B"></li>
			<li><img src="img/09.jpg" alt="thumbnail C"></li>
			<li><img src="img/10.jpg" alt="thumbnail D"></li>
			<li><img src="img/11.jpg" alt="thumbnail C"></li>
			<li><img src="img/12.jpg" alt="thumbnail D"></li>
			<li><img src="img/13.jpg" alt="thumbnail A"></li>
			<li><img src="img/14.jpg" alt="thumbnail B"></li>
			<li><img src="img/15.jpg" alt="thumbnail C"></li>
			<li><img src="img/16.jpg" alt="thumbnail D"></li>
			<li><img src="img/17.jpg" alt="thumbnail C"></li>
			<li><img src="img/18.jpg" alt="thumbnail D"></li>
			<li><img src="img/19.jpg" alt="thumbnail A"></li>
			<li><img src="img/20.jpg" alt="thumbnail B"></li>
			<li><img src="img/21.jpg" alt="thumbnail C"></li>
			<li><img src="img/22.jpg" alt="thumbnail D"></li>
			<li><img src="img/23.jpg" alt="thumbnail C"></li>
			<li><img src="img/24.jpg" alt="thumbnail D"></li>
		</ul>
		<ul class="top">
			<li><img src="img/01.jpg" alt="top image A"></li>
			<li><img src="img/02.jpg" alt="top image B"></li>
			<li><img src="img/03.jpg" alt="top image C"></li>
			<li><img src="img/04.jpg" alt="top image D"></li>
			<li><img src="img/05.jpg" alt="thumbnail C"></li>
			<li><img src="img/06.jpg" alt="thumbnail D"></li>
			<li><img src="img/07.jpg" alt="thumbnail A"></li>
			<li><img src="img/08.jpg" alt="thumbnail B"></li>
			<li><img src="img/09.jpg" alt="thumbnail C"></li>
			<li><img src="img/10.jpg" alt="thumbnail D"></li>
			<li><img src="img/11.jpg" alt="thumbnail C"></li>
			<li><img src="img/12.jpg" alt="thumbnail D"></li>
			<li><img src="img/13.jpg" alt="thumbnail A"></li>
			<li><img src="img/14.jpg" alt="thumbnail B"></li>
			<li><img src="img/15.jpg" alt="thumbnail C"></li>
			<li><img src="img/16.jpg" alt="thumbnail D"></li>
			<li><img src="img/17.jpg" alt="thumbnail C"></li>
			<li><img src="img/18.jpg" alt="thumbnail D"></li>
			<li><img src="img/19.jpg" alt="thumbnail A"></li>
			<li><img src="img/20.jpg" alt="thumbnail B"></li>
			<li><img src="img/21.jpg" alt="thumbnail C"></li>
			<li><img src="img/22.jpg" alt="thumbnail D"></li>
			<li><img src="img/23.jpg" alt="thumbnail C"></li>
			<li><img src="img/24.jpg" alt="thumbnail D"></li>
		</ul>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<h2 id="course">3,cource</h2>
	<hr size="2" color="#000000">

	<p id="coursetxt">
		季節の食材の味を最大限に引き出した当店自慢のコース料理<br>
		本場フランスで腕を磨いたシェフが腕を振るった珠玉の料理をご堪能ください。<br> <strong>※コースメニューは事前に予約が必要になります。<br>
			&nbsp;&nbsp;&nbsp;お電話、またはホームページのReservationよりご予約をお願い致します。
		</strong>
	</p>
	<br>
	<br>
	<br>


	<div id="coursemenu">
		<table id="courselist" border="1">
			<caption>Course Menu</caption>
			<tr>
				<th class="a">Course A</th>
				<th class="b">Course B</th>
				<th class="c">Course C</th>
			</tr>

			<tr>
				<th class="a">2hour</th>
				<th class="b">3hour</th>
				<th class="c">3hour</th>
			</tr>

			<tr>
				<th class="a">5,000yen</th>
				<th class="b">7,500yen</th>
				<th class="c">10,000yen</th>
			</tr>

			<tr>
				<th class="a">1,シザーサラダ</th>
				<th class="b">1,白身魚のカルパッチョ</th>
				<th class="c">1,新鮮野菜のサラダ "オーロラ風”</th>
			</tr>

			<tr>
				<th class="a">2,グラタンスープ</th>
				<th class="b">2,野菜ミネストローネ</th>
				<th class="c">2,ヴィシソワーズ</th>
			</tr>

			<tr>
				<th class="a">3,ホエー豚の香草焼き</th>
				<th class="b">3,車えびのトマトクリーム煮</th>
				<th class="c">3,牛フィレとトリュフのファンタジー</th>
			</tr>

			<tr>
				<th class="a">4,ペペロンチーノ</th>
				<th class="b">4,カルボナーラ</th>
				<th class="c">4,えびとブロッコリーのパスタ</th>
			</tr>

			<tr>
				<th class="a">5,ガトーショコラ</th>
				<th class="b">5,紅茶のシフォンケーキ</th>
				<th class="c">5,三種のチーズリゾット</th>
			</tr>

			<tr>
				<th class="a"></th>
				<th class="b"></th>
				<th class="c">6,濃厚ティラミス</th>
			</tr>
		</table>

		<br> <br> <br>

		<div id="resbtn">
			<p>ご予約、ご予約状況のご確認はこちらから</p>
			<s:form action="GoToReservationPageAction">
				<button data-icon="♛" class="button pink serif round glass">Reservation</button>
			</s:form>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<h2 id="aboutus">4,About Us</h2>
	<hr size="2" color="#000000">
	<div id="about">
		<img src="img/info1.jpg" alt="" width="440" height="250" />
	</div>
	<p>
		<strong>大切な人と大切なひと時を・・・</strong>
	</p>
	<p>
		当ホームページをご覧戴き誠に有難うございます。<br> オーナーシェフの半田と申します。<br>
		当店は水道橋の片隅で2015年初春に、都会にひっそりとたたずむオアシスの場としてオープン致しました。<br>
		四季折々の料理をオーナーシェフが表現することをテーマとしております。<br>
		野菜果実をよりおいしく食べていただけるよう、あらゆる調理技法を駆使し、<br> 他に比類ない一品を皆様方にご提供したいと存じます。
	</p>
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
	<h2 id="shopinfo">5,shopinfo</h2>
	<hr size="2" color="#000000">
	<table id="shopinfotable" border="1">
		<tr>
			<td>Access</td>
			<td>東京都文京区水道橋99-99</td>
		</tr>
		<tr>
			<td>Phone</td>
			<td>01-2345-6789</td>
		</tr>
		<tr>
			<td>Lunch<br>Dinner
			</td>
			<td>12:30～15:00<br>18:00～24:00
			</td>
		</tr>
	</table>
	<div class="shop-map">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3239.9146213009653!2d139.7649220145206!3d35.703718580189054!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b7811e9f%3A0x795eee1c1c4fa30d!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77yS!5e0!3m2!1sja!2sjp!4v1458699679565" style="border:0">
</iframe>
    </div>
	<div id="topbtn">
		<a href="#top" data-icon="♛" class="button pink serif round glass">Top</a>
	</div>

	<br>
	<br>
	<hr class="foot">
	<p class="copy">
		<small>Copyright © 2015 Solare. All Rights Reserved.</small>
	</p>
</body>
</html>