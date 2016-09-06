$(function(){
	var $interval = 5000;
	var $fade_speed = 1500;
	$("#slide ul li").css({"position":"relative","overflow":"hidden","width":"100%","height":"100%"});
	$("#slide ul li").hide().css({"position":"absolute","top":0,"left":0});
	$("#slide ul li:first").addClass("active").show();
	setInterval(function(){
	var $active = $("#slide ul li.active");
	var $next = $active.next("li").length?$active.next("li"):$("#slide ul li:first");
	$active.fadeOut($fade_speed).removeClass("active");
	$next.fadeIn($fade_speed).addClass("active");
	},$interval);
	});
