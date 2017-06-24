
$(function(){
//一覧印刷をクリックしたら
$("#modal-open").click(function(){
		//オーバーレイ用のHTMLコードを、[body]内の最後に生成する
		$("body").append('<div id="modal-overlay"></div>');

		var current_scrollY;

		current_scrollY = $( window ).scrollTop();

		$( '#wrapper' ).css( {
			position: 'fixed',
		    width: '100%',
		    top: -1 * current_scrollY
		  } );

		centeringModalSyncer();
		//モーダルをフェードインさせる
		$("#modal-overlay,#modal-atlist").fadeIn("slow");

		//モーダル内移入れたい値を入力


		//
		$("#modal-overlay,#modal-close").click(function(){
			$("#modal-atlist,#modal-overlay").fadeOut("slow",function(){
			$("#modal-overlay").remove();
			});
		});


		$(window).resize(centeringModalSyncer);

		function centeringModalSyncer(){
			var w = $(window).width();
			var h = $(window).height();
			var cw = $("#modal-atlist").outerWidth();
			var ch = $("#modal-atlist").outerHeight();
			//（画面幅－コンテンツ幅）/2で余白を指定し、コンテンツを中心に表示
			var pxleft = ((w - cw)/2);
			var pxtop = ((h - ch)/2);

			$("#modal-atlist").css({
				"left": pxleft + "px",
				"top": pxtop + "px"
				});

		}
	});
});



