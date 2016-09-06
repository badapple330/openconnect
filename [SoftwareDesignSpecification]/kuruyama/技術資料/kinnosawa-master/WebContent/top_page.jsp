<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="top_page.title" /></title>

<!-- Bootstrap -->

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
<script src="js/forSlide.js"></script>
</head>
<body background="images/washi.jpg">
<jsp:include page="header.jsp" />
<div class="container" style="width:1170px;">
<jsp:include page="side_bar.jsp" />

<div class="main">
		<form name="form10" action="GoItemDetailsAction" method="post">
			<input type="hidden" name="name" value="練切">
		</form>
		<form name="form20" action="GoItemDetailsAction" method="post">
			<input type="hidden" name="name" value="どら焼き">
		</form>
		<form name="form30" action="GoItemDetailsAction" method="post">
			<input type="hidden" name="name" value="みたらし団子">
		</form>
		<form name="form40" action="GoItemDetailsAction" method="post">
			<input type="hidden" name="name" value="いちご大福">
		</form>
		<form name="form50" action="GoItemDetailsAction" method="post">
			<input type="hidden" name="name" value="くず切り餅">
		</form>

	<div id="slide">
		<ul>
			<li><a href="javascript:document.form10.submit()" ><img src="images/slide/item01.jpg" alt="" /></a></li>
			<li><a href="javascript:document.form20.submit()" ><img src="images/slide/item02.jpg" alt=""/></a></li>
			<li><a href="javascript:document.form30.submit()" ><img src="images/slide/item09.jpg" alt=""/></a></li>
			<li><a href="javascript:document.form40.submit()" ><img src="images/slide/item07.jpg" alt=""/></a></li>
			<li><a href="javascript:document.form50.submit()" ><img src="images/slide/item10.jpg" alt=""/></a></li>
		</ul>
	</div>
	<div class="news">
		<hr>
			<div style="text-align:center">
				<h2><s:text name="top_page.news" /></h2>
			</div>
		<hr>
	</div>

		<div class="mainMenu">
			<s:iterator value="itemList" status="rs">
				<form name="form<s:property value="#rs.count" />" action="GoItemDetailsAction" method="post">
					<input type="hidden" name="name" value="<s:property value="name" />">
				</form>
			<div class="menu">
				<a href="javascript:document.form<s:property value="#rs.count"/>.submit()">
					<img src="<s:property value="imgPath" />" alt="" class="mainImage"/>
					<h2><s:property value="name" /></h2>
				</a>
			</div>
			</s:iterator>
		</div>
</div>

</div>
<jsp:include page="footer.jsp" />
</body>
</html>