$(function(){
   	var exp = /(\b(https?|ftp|file):\/\/[-A-Z0-9+&@#\/%?=~_|!:,.;]*[-A-Z0-9+&@#\/%=~_|])/ig;
   	$('body').html($('body').html().replace(exp,"<a href='$1' target='_blank'>$1</a>"));
	var exp2 = /(@[A-Za-z0-9\u3040-\u30ff]{1,50})/ig;
	$('body').html($('body').html().replace(exp2, "<a href='ProfileSessionAction?userName=$1'>$1</a>"));
  });