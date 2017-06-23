
$(function(){
//一覧印刷をクリックしたら
$("#modal-open").click(function(){
		//オーバーレイ用のHTMLコードを、[body]内の最後に生成する
		$("body").append('<div id="modal-overlay"></div>');


		centeringModalSyncer();
		//モーダルをフェードインさせる
		$("#modal-overlay,#modal-atlist").fadeIn("slow");


		$(window).resize(centeringModalSyncer);

		function centeringModalSyncer(){
			var w = $(window).width();
			var h = $(window).height();
			var cw = $("#modal-atlist").outerWidth({margin:true});
			var ch = $("#modal-atlist").outerHeight({margin:true});
			//（画面幅－コンテンツ幅）/2で余白を指定し、コンテンツを中心に表示
			var pxleft = ((w - cw)/2);
			var pxtop = ((h - ch)/2);
			//[#modal-atlist]のCSSに[left]の値(pxleft)を設定
			$("#modal-atlist").css({"left": pxleft + "px"});
			//[#modal-atlist]のCSSに[top]の値(pxtop)を設定
			$("#modal-atlist").css({"top": pxtop + "px"});

		}
	}
);
});

$(function(){
	$("#modal-overlay,#modal-close").click(function(){
		$("#modal-atlist,#modal-overlay").fadeOut("slow",function(){
		$("#modal-overlay").remove();
		});
	});
});


