/**
 *
 */
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
	//削除ボタンをクリックしたら
	$(".modal-delete").click(function(){
		//body内の最後に<div id="modal-bg"></div>を挿入
		$("body").append('<div id="modal-bg"></div>');
		//画面中央を計算する関数を実行
		modalResize();
		//モーダルウィンドウを表示
		$(".delete-prepare").hide();
		$("#modal-bg,#modal-deleteMain").fadeIn("slow");

		var index = $('.modal-delete').index($(this));

		$('.deleteUserId').html( $('.userId').eq(index).val() );

		$('.deleteYear').html( $('.year').eq(index).val() );

		$('.deleteMonth').html( $('.month').eq(index).val() );

		$('.deleteFamilyName').html( $('.familyNameKanji').eq(index).val() );

		$('.deleteGivenName').html( $('.givenNameKanji').eq(index).val() );

		$('.deleteUserId').val( $('.userId').eq(index).val() );

		$(".modal-close").click(function(){
			$("#modal-deleteMain,#modal-bg").fadeOut("slow",function(){
				//挿入した<div id="modal-bg"></div>を削除
				$('<div id="modal-bg"></div>').remove() ;
			});
		});

		$(window).resize(modalResize);

		function modalResize(){
			var w = $(window).width();
			var h = $(window).height();
			var cw = $("#modal-deleteMain").outerWidth();
			var ch = $("#modal-deleteMain").outerHeight();

			//取得した値をcssに追加する
			$("#modal-deleteMain").css({
				"left": ((w - cw)/2) + "px",
				"top": "100px"
			});
		}

	});

	// 編集ボタンをクリックしたら
	$(".modal-update").click(function(){
		//body内の最後に<div id="modal-bg"></div>を挿入
		$("body").append('<div id="modal-bg"></div>');
		//画面中央を計算する関数を実行
		modalResize();
		//モーダルウィンドウを表示
		$(".delete-prepare").hide();
		$("#modal-bg,#modal-updateMain").fadeIn("slow");

		var index = $('.modal-update').index($(this));

		// 表示文字
		$('.updateUserId').html( $('.userId').eq(index).val() );
		$('.updateYear').html( $('.year').eq(index).val() );
		$('.updateMonth').html( $('.month').eq(index).val() );
		$('.updateFamilyName').html( $('.familyNameKanji').eq(index).val() );
		$('.updateGivenName').html( $('.givenNameKanji').eq(index).val() );
		$('.updateTeamName').html( $('.TeamName').eq(index).val() );


		// hiddenのvalue
		$('.updateUserId').val( $('.userId').eq(index).val() );
		$('.updateYear').val( $('.year').eq(index).val() );
		$('.updateMonth').val( $('.month').eq(index).val() );
		$('.updateFamilyName').val( $('.familyName').eq(index).val() );
		$('.updateGivenName').val( $('.givenName').eq(index).val() );
		$('.updateFamilyNameKanji').val( $('.familyNameKanji').eq(index).val() );
		$('.updateFamilyNameKana').val( $('.familyNameKana').eq(index).val() );
		$('.updateGivenNameKanji').val( $('.givenNameKanji').eq(index).val() );
		$('.updateGivenNameKana').val( $('.givenNameKana').eq(index).val() );
		$('.updateTeamName').val( $('.TeamName').eq(index).val() );
		$('.updatePostal').val( $('.postal').eq(index).val() );
		$('.updateAddress').val( $('.address').eq(index).val() );
		$('.updatePhoneNumber').val( $('.phoneNumber').eq(index).val() );
		$('.updatePhoneEmail').val( $('.phoneEmail').eq(index).val() );
		$('.updateMobileNumber').val( $('.mobileNumber').eq(index).val() );
		$('.updateMobileEmail').val( $('.mobileEmail').eq(index).val() );
		$('.updateSex').val( $('.sex').eq(index).val() );
		$('.updateBirthday').val( $('.birthday').eq(index).val() );
		$('.updateUserdelFlg').val( $('.userdelFlg').eq(index).val() );
		$('.updateLoginFlg').val( $('.loginFlg').eq(index).val() );
		$('.updateUserFlg').val( $('.userFlg').eq(index).val() );
		$('.updatePassword').val( $('.password').eq(index).val() );

		$(".modal-close").click(function(){
			$("#modal-updateMain,#modal-bg").fadeOut("slow",function(){
				//挿入した<div id="modal-bg"></div>を削除
				$('<div id="modal-bg"></div>').remove() ;
			});
		});

		$(window).resize(modalResize);

		function modalResize(){
			var w = $(window).width();
			var h = $(window).height();
			var cw = $("#modal-updateMain").outerWidth();
			var ch = $("#modal-updateMain").outerHeight();

			//取得した値をcssに追加する
			$("#modal-updateMain").css({
				"left": ((w - cw)/2) + "px",
				"top": "100px"
			});
		}
	});


});


