/**
 *
 */



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


			var id = $('.bookId').eq(index).text();
			$('#book_id').text( id );


			var title = $('.bookTitle').eq(index).val();
			$('#title').text( title );


			var abc = $('.bookId').eq(index).text();
			$('#true-delete').val( abc );

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




//イニシャルサーチ項目リンクの生成
//アスキーコードからアルファベット抽出
function eigo() {
    document.write('<div><table class="center"><tr>');
  for(var i = 65; i<=90; i++) {

      var str1 = String.fromCharCode(i);
      document.write('<td><a href="#' + str1 + '">' + str1 + "</a></td>");
      if(i == 12 + 65) {
          document.write("</tr><tr>");
      }

  }
    document.write("</tr>");
}
//カナ
  function kana() {
      document.write("<tr>");
  for(var i = 0; i<=9; i++) {
      var str2 = new Array("ア","カ","サ","タ","ナ","ハ","マ","ヤ","ラ","ワ");

      document.write('<td><a href="#' + str2[i] + '">' + str2[i] + "</a></td>");

  }
  document.write('<td colspan="3"><a href="#その他">その他</a></td></tr></div>');
}

