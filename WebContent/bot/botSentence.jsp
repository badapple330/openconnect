<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>botくんメンテナンス</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Stylesheet
    ================================================== -->
	<link rel="stylesheet" href="../css/bootstrap.css" />
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	<link rel="stylesheet" href="../css/style2.css">
	<link rel="stylesheet" href="../css/Bfooter.css">
	<link rel="stylesheet" href="../css/jquery.bootgrid.min.css">


	<!-- Javascripts
    ================================================== -->
    <script src="../js/jquery-3.2.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/jquery.bootgrid.min.js"></script>
	<script>
$(function() {
	$("#grid-basic").bootgrid();
});
</script>

</head>

<body>
<header><jsp:include page="botHeader.jsp" /></header>


<div class="outline">
<br>
<h3>覚えさせた文章</h3>
<table id="grid-data" class="table table-condensed table-hover table-striped">
<thead>
  <tr>
    <th data-column-id="id" data-type="numeric">ID</th>
    <th data-column-id="namae">名前</th>
    <th data-column-id="received" data-order="desc">メール</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>1</td>
    <td>たろう</td>
    <td>taro@gmail.co</td>
  </tr>
  <tr>
    <td>2</td>
    <td>じろう</td>
    <td>jiro@gmail.co</td>
  </tr>
  <tr>
    <td>3</td>
    <td>さぶろう</td>
    <td>36@gmail.co</td>
  </tr>
  <tr>
    <td>4</td>
    <td>たけし</td>
    <td>take@gmail.co</td>
  </tr>
  <tr>
    <td>5</td>
    <td>佐藤</td>
    <td>suger@icloud.com</td>
  </tr>
  <tr>
    <td>6</td>
    <td>高橋</td>
    <td>taka@gmail.co</td>
  </tr>
  <tr>
    <td>7</td>
    <td>伊藤</td>
    <td>i10@gmail.co</td>
  </tr>
  <tr>
    <td>8</td>
    <td>渡辺</td>
    <td>watanabe@gmail.co</td>
  </tr>
  <tr>
    <td>8</td>
    <td>渡辺</td>
    <td>watanabe@gmail.co</td>
  </tr>
  <tr>
    <td>9</td>
    <td>小林</td>
    <td>koba@gmail.co</td>
  </tr>
  <tr>
    <td>10</td>
    <td>吉田</td>
    <td>yosi@gmail.co</td>
  </tr>
  <tr>
    <td>11</td>
    <td>松本</td>
    <td>mat@gmail.co</td>
  </tr>
  <tr>
    <td>13</td>
    <td>佐々木</td>
    <td>s@gmail.co</td>
  </tr>
</tbody>
</table>

</div>



</body>
</html>