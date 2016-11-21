<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/jquery.fullPage.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.fullPage.js"></script>
<script>
$(document).ready(function() {
    $('#fullpage').fullpage({
    	scrollingSpeed: 1000,
    	loopBottom: true,
    	navigation: true,
        navigationPosition: 'right',
        slidesNavigation: true,
        onLeave: function(index, nextIndex, direction){
        	if(index == 2 && direction =='down'){
        		$('#sec3 p').animate({'left':'250px'},{duration:1000});
        	}
        }
    });
});
</script>
</head>
<body>
<div id="fullpage">
	<div id="sec1" class="section">
		<p>fullPage.js</p>
	</div>
	<div id="sec2" class="section">
		<div class="slide slide1">
			<p>Good Morning, World!</p>
		</div>
		<div class="slide slide2">
			<p>Hello, World!</p>
		</div>
		<div class="slide slide3">
			<p>Good Evening, World!</p>
		</div>
	</div>
	<div id="sec3" class="section">
		<p>Third</p>
	</div>
</div>
</body>
</html>