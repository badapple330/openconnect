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
	        $("#modal-bg,#modal-main").fadeIn("slow");


	        var index = $('.modal-open').index($(this));


			$('#delete-projectid').val($('.decision_id').eq(index).text());

			$('#delete-projectname').val($('.decision_name').eq(index).text());

			$('#decision-classify').val($('.decision_type').eq(index).text());

			$('#decision-status').val($('.decision_status').eq(index).text());

			$('#true-delete').val($('.decision_detail_id').eq(index).text());

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
	                    "top": ((h - ch)/2) + "px"
	            });
	        }
	    });
	});