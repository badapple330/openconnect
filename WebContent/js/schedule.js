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

    // 「.modal-open」をクリック

    $('.modal-open').click(function(){

        // オーバーレイ用の要素を追加

        //$('body').append('<div class="modal-overlay"></div>');

        // オーバーレイをフェードイン

        $('.modal-overlay').fadeIn('slow');




        // モーダルコンテンツのIDを取得

        //var modal = '#' + $(this).attr('data-target');

        // モーダルコンテンツの表示位置を設定

        modalResize();

         // モーダルコンテンツフェードイン

        $("#modal-main").fadeIn('slow');

        var index = $('.modal-open').index($(this));
		var id = $('.scheduleIdList').eq(index).val();
		$('#delete-scheduleid').val( id );

		var startdate = $('.scheduleStartdayList').eq(index).val();
		$('#delete-startday').val( startdate );

		var enddate = $('.scheduleEnddayList').eq(index).val();
		$('#delete-endday').val( enddate );

		var title = $('.scheduleTitleList').eq(index).val();
		$('#delete-title').val( title );

		var content = $('.scheduleContentList').eq(index).val();
		$('#delete-content').val( content );

		var index = $('.modal-open').index($(this));
		var abc = $('.scheduleIdList').eq(index).val();
		$('.true-delete').val( abc );

        $(".modal-close").click(function(){
            $("#modal-main,#modal-bg").fadeOut("slow",function(){
          //挿入した<div id="modal-bg"></div>を削除
                $('<div id="modal-bg"></div>').remove() ;
            });
        });

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
$(function(){

            // 「.modal-open2」をクリック

            $('.modal-open2').click(function(){

                // オーバーレイ用の要素を追加

                $('body').append('<div class="modal-overlay"></div>');

                // オーバーレイをフェードイン

                $('.modal-overlay').fadeIn('slow');




                // モーダルコンテンツのIDを取得

                //var modal = '#' + $(this).attr('data-target');

                // モーダルコンテンツの表示位置を設定

                modalResize();

                 // モーダルコンテンツフェードイン

                $("#modal-main").fadeIn('slow');

                var index = $('.modal-open2').index($(this));
        		var id = $('.delscheduleIdList').eq(index).val();
        		$('#delete-scheduleid').val( id );

        		var startdate = $('.delscheduleStartdayList').eq(index).val();
        		$('#delete-startday').val( startdate );

        		var enddate = $('.delscheduleEnddayList').eq(index).val();
        		$('#delete-endday').val( enddate );

        		var title = $('.delscheduleTitleList').eq(index).val();
        		$('#delete-title').val( title );

        		var content = $('.delscheduleContentList').eq(index).val();
        		$('#delete-content').val( content );

        		var index = $('.modal-open').index($(this));

        		var abc = $('.delscheduleIdList').eq(index).val();
        		$('.true-delete').val( abc );

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

