<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/jquery.fancybox.css" type="text/css" media="screen" />
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/jquery.fancybox.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".fancybox").fancybox();
	});
</script>
</head>
<body>
<div id="container">

	<s:form style="display:inline" action="GoMySQLAction"><s:submit cssClass="btn" value="%{getText('MySQL')}"/></s:form>
	<s:form style="display:inline"  action="GoMongoAction"><s:submit cssClass="btn" value="%{getText('Mongo')}"/></s:form>
	<s:form style="display:inline"  action="GoGraphAction"><s:submit cssClass="btn"  value="%{getText('Graph')}"/></s:form>
	<s:form style="display:inline"  action="GoLoginAction"><s:submit cssClass="btn"  value="%{getText('Logout')}"/></s:form>

<ul class="fancy">
<li><a class="fancybox" rel="group" href="img/dog01_large.jpg"><img src="img/dog01_small.jpg" alt="" /></a></li>
<li><a class="fancybox" rel="group" href="img/dog02_large.jpg"><img src="img/dog02_small.jpg" alt="" /></a></li>
<li><a class="fancybox" rel="group" href="img/dog03_large.jpg"><img src="img/dog03_small.jpg" alt="" /></a></li>
<li><a class="fancybox" rel="group" href="img/dog04_large.jpg"><img src="img/dog04_small.jpg" alt="" /></a></li>
</ul>

<div class="google">
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3240.4068720974983!2d139.80321661525906!3d35.691603980191914!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x601889256d942cf1%3A0xaf5059540398ac79!2z54qs6Iy25bGL5pys6IiX!5e0!3m2!1sja!2sjp!4v1469080678990" width="830" height="500" frameborder="0" style="border:0" ></iframe>
</div>

</div><!-- /#container -->
</body>
</html>