$(function(){
	var no=1;	// 操作対象の画像番号
	var max=5;	// 画像の最大数

	setInterval(function(){

		//変数noの値を元に現在表示されている画像を非表示にする
		$("#slide"+no).animate({
			"opacity":0
		},1500);

		//変数の値を＋１して次の画像に切り替える
		no++;

		//変数noがmaxを越えていれば1に戻す
		if(no > max){
			no=1;
		}

		//変数noの値にを使用し画像を表示する
		$("#slide"+no).animate({
			"opacity":1
		},1500);

	},3000);	// ← の「1000」が実行の間隔です。

});

$(function($) {
    $('.li').pagination({
        pager        : $('.pager'),
        prevText     : '＜',
        nextText     : '＞',
        firstText    : '≪',
        lastText     : '≫',
        viewNum      : 5,
        pagerNum     : 5,
        ellipsis     : false,
        linkInvalid  : true,
        goTop        : true,
        firstLastNav : true,
        prevNextNav  : true
    });
});


$(function() {
    $('#passcheck').change(function(){
        if ( $(this).prop('checked') ) {
            $('.password').attr('type','text');
        } else {
            $('.password').attr('type','password');
        }
    });
});
