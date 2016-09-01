$(function(){

	// オープンコネクトのロゴを取得
	var openConnectLogo = $(".openConnect");

	var left = 0;
//	setInterval(move, 100);
//	function move(){
//		left ++;
//		$('.openConnect').css("left", left+'px');
//	}


	// オープンコネクトの位置(左上～右下)を取得
	var logoLeft = openConnectLogo.position().left;
	var logoTop = openConnectLogo.position().top;

	var rndX = Math.random() * 5 - 2.5;
	var rndY = Math.random() * 5 - 2.5;

	setInterval(randomMove, 50);

	function randomMove(){

		rndX = Math.random() * 5 - 2.5;
		rndY = Math.random() * 5 - 2.5;
		openConnectLogo.css('left', logoLeft+rndX );
	}

	// オープンコネクトにマウスが乗っている時
	openConnectLogo.hover(function(){

		openConnectLogo.css('left', logoLeft+rndX );

	});
//
//	$("body").mousemove(function(e){
//
//
//	});
});
