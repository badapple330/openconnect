/**
 *
 */
$(function() {
	$(".delete-true").click(function(){
		$(".delete-prepare").fadeIn();
	});
});

$(function() {
	$(".modal-close").click(function(){
		$(".delete-prepare").fadeOut();
	});
});


$(function(){
	  //テキストリンクをクリックしたら
	    $(".modal-open").click(function(){
	      //body内の最後に<div id="modal-bg"></div>を挿入
	        $("body").append('<div id="modal-bg"></div>');
	    //画面中央を計算する関数を実行
	    modalResize();
	    //モーダルウィンドウを表示
	    $(".delete-prepare").hide();
	        $("#modal-bg,#modal-main").fadeIn("slow");

	        var index = $('.modal-open').index($(this));

			$('.deleteUserId').html( $('.userId').eq(index).val() );

			$('.deleteYear').html( $('.year').eq(index).val() );

			$('.deleteMonth').html( $('.month').eq(index).val() );

			$('.deleteFamilyName').html( $('.familyNameKanji').eq(index).val() );

			$('.deleteGivenName').html( $('.givenNameKanji').eq(index).val() );

			$('.deleteUserId').val( $('.userId').eq(index).val() );

	        $(".modal-close").click(function(){
	            $("#modal-main,#modal-bg").fadeOut("slow",function(){
	          //挿入した<div id="modal-bg"></div>を削除
	                $('<div id="modal-bg"></div>').remove() ;
	            });
	        });

	    //画面の左上からmodal-mainの横幅・高さを引き、その値を2で割ると画面中央の位置が計算できます
	        $(window).resize(modalResize);
	        function modalResize(){
	            var w = $(window).width();
	            var h = $(window).height();
	            var cw = $("#modal-main").outerWidth();
	            var ch = $("#modal-main").outerHeight();

	            //取得した値をcssに追加する
	                $("#modal-main").css({
	                    "left": ((w - cw)/2) + "px",
	                    "top": "100px"
	            });
	        }
	    });
	});


