$(function(){
//	document.getElementById("checkButton").onclick = function(){
//		var radioList = document.getElementsByName("attendance");
//		var str = "選択されていません";
//		for(var i=0; i<radioList.length; i++){
//			if (radioList[i].checked) {
//				str = radioList[i].value + "が選択されています";
//				break;
//			}
//		}
//		alert(str);
//		document.getElementById("result").innerHTML = str;
//	}

	//通信が遅いときに二重送信を防止
	$(function () {
		  $('form').submit(function () {
		    $(this).find(':submit').attr('disabled', 'disabled');
		  });
		});


	//テキストリンクをクリックしたら
	$(".modal-open").click(function(){

		var year = $('.inputYear').val();
		var month = $('.inputMonth').val();

		// 入力が空白、指定文字数以外なら終了
		if( year == "" || month == "" || year.length != 4 || month.length != 2 ){
			return;
		}

		//body内の最後に<div id="modal-bg"></div>を挿入
		$("body").append('<div id="modal-bg"></div>');

		//画面中央を計算する関数を実行
		modalResize();

		//モーダルウィンドウを表示
		$("#modal-bg,#modal-main").fadeIn("slow");

		$('#year').html( year );
		$('#month').html( month );

		$('#attendanceYear').val( year );
		$('#attendanceMonth').val( month );

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