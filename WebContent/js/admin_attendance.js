
$(function(){
//一覧印刷をクリックしたら
	$("#modal-open").click(function(){
		//キーボード操作などにより、オーバーレイが多重起動するのを防止する
		 $( this ).blur() ; //ボタンからフォーカスを外す
		 if( $( "#modal-overlay" )[0] ) return false ;
		//オーバーレイ用のHTMLコードを、[body]内の最後に生成する
		$("body").append('<div id="modal-overlay"></div>');

		$('html, body').addClass('lock');

		centeringModalSyncer();
		//モーダルをフェードインさせる
		$("#modal-overlay,#modal-atlist").fadeIn("slow");

		//モーダル内移入れたい値を入力


		//
		$("#modal-overlay,#modal-close").unbind().click(function(){
			$("#modal-atlist,#modal-overlay").fadeOut("slow",function(){
			$("#modal-overlay").remove();
			$('html, body').removeClass('lock');
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
				"top": "10%"
				});

		}
	});
	 //個別印刷
    $('.print-btn').on('click', function(){
        var printPage = $(this).closest('.print-page').html();
        $('body').append('<div id="print"></div>');
        $('#print').append(printPage);
        $('body > :not(#print)').addClass('print-off');
        window.print();
        $('#print').remove();
        $('.print-off').removeClass('print-off');
    });

});




