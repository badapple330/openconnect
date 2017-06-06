$(document).ready(function(){


	var start = '2017-06-07';
	var end = '2017-06-10';

	$('#memo').hide();

	$('#calendar').fullCalendar({

		header: {
			left: 'prev,next today',
			center: 'title',
			right: 'month,listYear'
		},

		//タイトルと日別リストの日付のフォーマット
		titleFormat:'MMMM',
		listDayFormat:'MMMM D日',

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

        allDaySlot: false,

        // 日本の祝日を表示
        events:'http://www.google.com/calendar/feeds/ja.japanese%23holiday%40group.v.calendar.google.com/public/full/',

        // ボタン文字列
        buttonText: {
            prev:     '先月',
            next:     '来月',
            today:    '今日',
            month:    '月',
            week:     '週',
            day:      '日',
            listYear: '日別'
        },

        dayClick: function() {
            alert('a day has been clicked!');
        },


        	events:[
        	        {
        	        	title:	'実装',
        	        	start:start,
        	        	end:end
        	        }
        	        ]

	});

	$('#calendar').addTouch();
});

// フォームに表示されるカレンダーの処理
$(function() {
	//日本語化
	 $.datepicker.setDefaults( $.datepicker.regional[ "ja" ] );

	//日付を押すと年-月-日の形でフォームに出力されるようにする
    $('.textcalendar').datepicker({ dateFormat: 'yy-mm-dd' });;
});
