


$(function() {
	$(".modal-delete").click(function(){
		$(".delete").fadeIn();

//		var index2 = $(".modal-delete2").index(this);
//		$('#delete-projectid').val($('.projectIdlist').eq(index).text());

		var index = $('.modal-delete').index($(this));
		var id = $('.projectIdlist').eq(index).val();
		$('#delete-projectid').val( id );

		var index = $('.modal-delete').index($(this));
		var day = $('.projectDaylist').eq(index).val();
		$('#delete-projectday').val( day );

		var index = $('.modal-delete').index($(this));
		var project = $('.projectlist').eq(index).val();
		$('#delete-projectname').val( project );

		var index = $('.modal-delete').index($(this));
		var plan = $('.projectPlanlist').eq(index).val();
		$('#delete-projectplan').val( plan );

		var index = $('.modal-delete').index($(this));
		var result = $('.projectResultlist').eq(index).val();
		$('#delete-projectresult').val( result );

		var index = $('.modal-delete').index($(this));
		var other = $('.otherlist').eq(index).val();
		$('#delete-other').val( other );

		var index = $('.modal-delete').index($(this));
		var abc = $('.projectIdlist').eq(index).val();
		$('#true-delete').val( abc );

	});
	$(".modal-close").click(function(){
		$(".delete").fadeOut();
	});
});


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



$(function() {
	var page = 0, page_last = 0, line = 5;
	// page      : カレントページ番号
	// page_last : ページ総数
	// line      : 表示行数

	// 起動時の処理。
	(function __construct() {

		// ページ総数を算出。
		page_last = Math.ceil($("#list_body tr").length / line) - 1;

		// ページコントローラにページ番号を挿入。
		for (var i = 0; i <= page_last; i++) {
			$("#page_number").append($("<li></li>").html(i + 1));
		}
	})();

	// 現在のページ番号に応じて、ページコントローラのスタイルを変更する関数。
	function set_ctrl_style() {

		// スタイルの初期化。
		$('#page_number').children().removeClass("current_page");
		$('#page_first, #page_prev, #page_next, #page_last')
		.removeClass("terminal");

		// カレントページのスタイル設定。
		$("#page_number li").each(function() {
			if ($(this).html() - 1 == page)
				$(this).addClass("current_page");
		});

		// 先頭ページ・前ページ・次ページ・末ページ移動ボタンのスタイル設定。
		if (page == 0) {
			$('#page_before li').addClass("terminal");
		} else if (page == page_last) {
			$('#page_after li').addClass("terminal");
		}
	}
	// 行を描画する関数。
	function draw() {
		$('#list_body tr').hide();
		$(
				'#list_body tr:first, #list_body tr:gt(' + page * line
				+ '):lt(' + line + ')').show();
		set_ctrl_style();
	}

	// ページ番号をクリックしたときの処理。
	$("#page_number li").click(function() {
		page = $(this).html() - 1;
		draw();
	});

	// 先頭ページ移動ボタンをクリックしたときの処理。
	$('#page_first').click(function() {
		page = 0;
		draw();
	});

	// 末尾ページ移動ボタンをクリックしたときの処理。
	$('#page_last').click(function() {
		page = page_last;
		draw();
	});

	// 前ページ異動ボタンをクリックしたときの処理。
	$('#page_prev').click(function() {
		if (page > 0)
			page--;
		draw();
	});

	// 次ページ移動ボタンをクリックしたときの処理。
	$('#page_next').click(function() {
		if (page < page_last)
			page++;
		draw();
	});
	draw();
});