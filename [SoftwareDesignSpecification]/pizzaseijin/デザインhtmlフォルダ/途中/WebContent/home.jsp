<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ホーム</title>
   <jsp:include page="base/base.jsp" flush="true" />
   <link rel="stylesheet" type="text/css" href="css/home.css">
   <link rel="stylesheet" href="css/slick-theme.css">
   <script src="js/slick.js"></script>
   <script src="js/jquery-starfield.js"></script>
</head>
<script>
$(function(){
  $('.sample1').slick({
    asNavFor:'.sample',
    autoplay:true,
    sildeToShow:1,
    slideToScroll:1,
    autoplay:true,
    arrows:false,
    fade:true,
    infinite: true,
  });
  $('.sample').slick({
	asNavFor:'.sample1',
	autoplay:true,
	slidesToShow:3,
	arrows:true,
	centerMode:true,
	centerPadding:100,
	autoplaySpeed:3000,
	arrows:true,
	speed:500,
	pauseOnHover:true,
	focusOnSelect: true,
	infinite: true
  });
  $('.star').starfield({
		starDensity: 2.0,
		mouseScale: 1.5,
		seedMovement: true
  });
});
</script>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
  <div class="home star">
    <div class="contener">
      <div class="row">
        <div class="col-md-10 col-md-offset-1">
          <ul class="sample1">
            <li><a href="#"><img src="img/0528nabe31_cs1e1_480x.jpg"></a></li>
            <li><a href="#"><img src="img/1020NABE14_cs1e1_410x.jpg"></a></li>
            <li><a href="#"><img src="img/WS2015WintGset_1_L.jpeg"></a></li>
            <li><a href="#"><img src="img/WS2015WintPset_1_L.jpeg"></a></li>
          </ul>
        </div>
      </div>
      <div class="row">
        <div class="col-md-10 col-md-offset-1">
          <ul class="sample">
            <li><a href="#"><img src="img/WS2015AtmnDbox_1_L.jpeg"></a></li>
            <li><a href="#"><img src="img/WS2015WintDbox_1_L.jpeg"></a></li>
            <li><a href="#"><img src="img/WS2015WintGset_1_L.jpeg"></a></li>
            <li><a href="#"><img src="img/WS2015WintPset_1_L.jpeg"></a></li>
          </ul>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4 col-md-offset-2">
          <table class="table_home">
            <tr><th>新着情報</th></tr>
            <tr><td>新商品○○○○</td></tr>
            <tr><td>新商品○○○○</td></tr>
            <tr><td>新商品○○○○</td></tr>
            <tr><td>新商品○○○○</td></tr>
            <tr><td>新商品○○○○</td></tr>
            <tr><td>新商品○○○○</td></tr>
          </table>
        </div>
        <div class="col-md-4 padding">
          <a class="twitter twitter-timeline" href="https://twitter.com/internousdev" data-widget-id="671917266686971905">@internousdevさんのツイート</a>
          <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
        </div>
      </div>
    </div>
  </div>
  <jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>
