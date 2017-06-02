$(document).ready(function(){

	var start1 = $(':text[name="start"]').val();

	var end1 = $(':text[name="end"]').val();


	var start = '2017-06-07';
	var end = '2017-06-10';

	$('#memo').hide();

	$('#calendar').fullCalendar({
		// 週を月曜日からにする(０→日、１→月、２→火、３→水、４→木、５→金、６→土)
		firstDay: 1,

		// 日本語化
		// 月名称
		monthNames: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
        // 月略称
        monthNamesShort: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
        // 曜日名称
        dayNames: ['日曜日', '月曜日', '火曜日', '水曜日', '木曜日', '金曜日', '土曜日'],
        // 曜日略称
        dayNamesShort: ['日', '月', '火', '水', '木', '金', '土'],


        	events:[
        	        {
        	        	title:	'実装',
        	        	start:	start,
        	        	end:	end
        	        },

        	        {
        	        	title: '実装2',
        	        	start: '2017-06-09',
        	        	end:	'2017-06-12'
        	        }
        	        ]

	});
});

$(function() {
	$.datepicker.setDefaults($.datepicker.regional['ja']);
    $('.textcalendar').datepicker({ dateFormat: 'yy-mm-dd' });;
});

