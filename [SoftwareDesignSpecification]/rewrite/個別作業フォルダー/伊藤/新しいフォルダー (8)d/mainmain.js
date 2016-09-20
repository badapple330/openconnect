/**
 *
 */
$(function() {
	$('.multiple-item').slick({
		infinite : true,
		arrows:true,
		dots : false,
		//オートプレイの有/無
		autoplay:true,
		//スライド切り替わり時間(ms)1000bunnno 1byou
		autoplaySpeed:9000,
		//いくつスライドが見えている状態にするか
		slidesToShow : 6,
		//スライドする数
		slidesToScroll : 1,
		//ドラッグの有り無し
		draggable:true,
		swipe:true,
		centerMode: true,
		responsive : [ {
			breakpoint : 768,
			settings : {
				slidesToShow : 3,
				slidesToScroll : 3,
			}
		}, {
			breakpoint : 480,
			settings : {
				slidesToShow : 2,
				slidesToScroll : 2,
			}
		} ]
	});
});