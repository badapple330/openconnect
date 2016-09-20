//modal
$(function(){

	//モーダルウインドウ①
	$(".modal-open-new").click(function(){
		$("body").append('<div id="modal-bg"></div>');
		modalResize();

		//モーダルウィンドウを表示　
		$("#modal-bg,#modal-new").fadeIn("slow");

		//閉じるボタンを押下でモーダルを閉じる
		$("#modal-bg,#modal-new-close").unbind().click(function(){
			$("#modal-new,#modal-bg").fadeOut("slow",function(){
				$("#modal-bg").remove();
			});
		});

		//画面の左上からmodal-mainの横幅・高さを引き、その値を2で割ると画面中央の位置が計算できます
		$(window).resize(modalResize);
		function modalResize(){

			var w = $(window).width();
			var h = $(window).height();

			var cw = $("#modal-new").outerWidth();
			var ch = $("#modal-new").outerHeight();

			//取得した値をcssに追加する
			$("#modal-new").css({
				"left": ((w - cw)/2) + "px",
				"top": ((h - ch)/2) + "px"
			});
		}
	});

	//モーダルウインドウ②
	$(".modal-open-edit").click(function(){
		$("body").append('<div id="modal-bg"></div>');
		modalResize();

		//モーダルウィンドウを表示　
		$("#modal-bg,#modal-edit").fadeIn("slow");


		//閉じるボタンを押下でモーダルを閉じる
		$("#modal-bg,#modal-edit-close").unbind().click(function(){
			$("#modal-edit,#modal-bg").fadeOut("slow",function(){
				$("#modal-bg").remove();
			});
		});

		//画面の左上からmodal-mainの横幅・高さを引き、その値を2で割ると画面中央の位置が計算できます
		$(window).resize(modalResize);
		function modalResize(){

			var w = $(window).width();
			var h = $(window).height();

			var cw = $("#modal-edit").outerWidth();
			var ch = $("#modal-edit").outerHeight();

			//取得した値をcssに追加する
			$("#modal-edit").css({
				"left": ((w - cw)/2) + "px",
				"top": ((h - ch)/2) + "px"
			});
		}
	});

	//モーダルウインドウ③
	$(".modal-open-delete").click(function(){
		$("body").append('<div id="modal-bg"></div>');
		modalResize();

		//モーダルウィンドウを表示　
		$("#modal-bg,#modal-delete").fadeIn("slow");


		//閉じるボタンを押下でモーダルを閉じる
		$("#modal-bg,#modal-delete-close").unbind().click(function(){
			$("#modal-delete,#modal-bg").fadeOut("slow",function(){
				$("#modal-bg").remove();
			});
		});

		//画面の左上からmodal-mainの横幅・高さを引き、その値を2で割ると画面中央の位置が計算できます
		$(window).resize(modalResize);
		function modalResize(){

			var w = $(window).width();
			var h = $(window).height();

			var cw = $("#modal-delete").outerWidth();
			var ch = $("#modal-delete").outerHeight();

			//取得した値をcssに追加する
			$("#modal-delete").css({
				"left": ((w - cw)/2) + "px",
				"top": ((h - ch)/2) + "px"
			});
		}
	});
});/**
 *
 */