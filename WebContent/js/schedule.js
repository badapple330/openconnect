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

		//var startdate = $('.scheduleStartdayList').eq(index).val();
		$('.delete-startday').html($('.scheduleStartdayList').eq(index).val());

		//var enddate = $('.scheduleEnddayList').eq(index).val();
		$('.delete-endday').html($('.scheduleEnddayList').eq(index).val());

		//var title = $('.scheduleTitleList').eq(index).val();
		$('.delete-title').html($('.scheduleTitleList').eq(index).val());

		//var content = $('.scheduleContentList').eq(index).val();
		$('.delete-content').html($('.scheduleContentList').eq(index).val());

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
