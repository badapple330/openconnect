
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<link rel="stylesheet" href="css/applist.css">
<title>Open Connect</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="js/bootstrap.js"></script>
<script src="js/jquery.min.js"></script>
<script src="js/applist.js"></script>


</head>
<body>
  <jsp:include page="header.jsp" />
    <div class="container">
      <h1 class="page-header">アプリ一覧</h1>
	  <s:iterator value="siteInfoList">
          <ul>
            <s:a href="%{siteUrl}">
              <h1><s:property value="siteName" /></h1>
            </s:a>
          </ul>
      </s:iterator>
      <s:property value="notLoginMsg" />
	</div>


<!-- 天気予報  -->
<div class ="container"><BR><BR>
<table>
<tr>
<td>
<div class="mamewaza_weather"><div><div class="mamewaza_weather_exp">
<span class="mamewaza_assembled">assembled by <a href="http://mamewaza.com/tools/" target="_blank" rel="nofollow">まめわざ</a></span></div></div></div><script type="text/javascript" src="https://mamewaza.net/weather.js?151209"></script>
<script type="text/javascript">mamewaza_weather({layout:"horizontalMicro",when:"7days",explanation:false,region:"130010",css:"div.mamewaza_weather > div{background:transparent;padding:11px;border:1px solid #000000;border-image-slice:1;border-image-repeat:stretch;border-image-outset:0.5px;border-image-source:url(data:image/svg+xml,%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3Csvg%20viewBox%3D%220%200%2018%2018%22%20version%3D%221.1%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%224.5px%22%20height%3D%224.5px%22%3E%3Cpath%20d%3D%22M4%2018l4-2-4-2-2-4-2%204v4h4zm14-4l-2-4-2%204-4%202%204%202h4v-4zM14%204l2%204%202-4V0h-4l-4%202%204%202zM4%204l4-2-4-2H0v4l2%204%202-4z%22%20fill%3D%22%23000000%22%2F%3E%3C%2Fsvg%3E);font-size:14px;}div.mamewaza_weather th,div.mamewaza_weather td,div.mamewaza_weather div.mamewaza_weather_exp{padding:9px;}div.mamewaza_weather,div.mamewaza_weather a{color:#000;}div.mamewaza_weather span.mamewaza_weather_icon{color:inherit;font-size:36px;text-shadow:none;}div.mamewaza_weather div.mamewaza_weather_exp,div.mamewaza_weather div.mamewaza_weather_exp a{color:#000000;font-size:12px;}div.mamewaza_weather td.mamewaza_weather_sat,div.mamewaza_weather td.mamewaza_weather_sat span.mamewaza_weather_icon{color:#00f;}div.mamewaza_weather td.mamewaza_weather_sun,div.mamewaza_weather td.mamewaza_weather_sun span.mamewaza_weather_icon{color:#f00;}",style:"div.mamewaza_weather > div{background:transparent;padding:11px;border:1px solid #000000;border-image-slice:1;border-image-repeat:stretch;border-image-outset:0.5px;border-image-source:url(data:image/svg+xml,%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3Csvg%20viewBox%3D%220%200%2018%2018%22%20version%3D%221.1%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%224.5px%22%20height%3D%224.5px%22%3E%3Cpath%20d%3D%22M4%2018l4-2-4-2-2-4-2%204v4h4zm14-4l-2-4-2%204-4%202%204%202h4v-4zM14%204l2%204%202-4V0h-4l-4%202%204%202zM4%204l4-2-4-2H0v4l2%204%202-4z%22%20fill%3D%22%23000000%22%2F%3E%3C%2Fsvg%3E);font-size:14px;}div.mamewaza_weather th,div.mamewaza_weather td,div.mamewaza_weather div.mamewaza_weather_exp{padding:9px;}div.mamewaza_weather,div.mamewaza_weather a{color:#000;}div.mamewaza_weather span.mamewaza_weather_icon{color:inherit;font-size:36px;text-shadow:none;}div.mamewaza_weather div.mamewaza_weather_exp,div.mamewaza_weather div.mamewaza_weather_exp a{color:#000000;font-size:12px;}div.mamewaza_weather td.mamewaza_weather_sat,div.mamewaza_weather td.mamewaza_weather_sat span.mamewaza_weather_icon{color:#00f;}div.mamewaza_weather td.mamewaza_weather_sun,div.mamewaza_weather td.mamewaza_weather_sun span.mamewaza_weather_icon{color:#f00;}"})</script>
</td>
</tr>
</table>
</div>

<!-- 画像スライドショー

<p id="slideshow">
   <img src="img/top.jpg" alt="画像1" class="active">
   <img src="img/sity.jpg" alt="画像2">
   <img src="img/uchuu.jpg" alt="画像3">
   <img src="photo4.jpg" alt="画像4">
   <img src="photo5.jpg" alt="画像5">
</p>
 -->

</body>
</html>