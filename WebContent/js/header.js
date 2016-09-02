$(function(){

	// オープンコネクトのロゴを取得
	var openConnectLogo = $(".openConnect");

	var left = 0;
//	setInterval(move, 100);
//	function move(){
//	left ++;
//	$('.openConnect').css("left", left+'px');
//	}


	// オープンコネクトの位置(左上～右下)を取得
	var logoLeft = openConnectLogo.position().left;
	var logoTop = openConnectLogo.position().top;
	var logoRight = logoLeft + openConnectLogo.outerWidth();
	var logoButtom = logoTop + openConnectLogo.outerHeight();

	// マウスの座標
	var mouseX;
	var mouseY;

	// ランダム移動
	setInterval(randomMove, 50);

	function randomMove(){

		if( mouseX >= logoLeft && mouseX <= logoRight &&
				mouseY >= logoTop && mouseY <= logoButtom ){

			var rndX = Math.random() * 5 - 2.5;
			var rndY = Math.random() * 5 - 2.5;
			openConnectLogo.css('left', rndX );
		}
	}

	// マウス移動時
	$("body").mousemove(function(e){

		// 座標を保存
		mouseX = e.pageX;
		mouseY = e.pageY;
	});

});
