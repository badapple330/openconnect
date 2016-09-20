/**
 *
 */

$(function() {
	$(".modal-delete").click(function(){
		$("#delete").fadeIn();

		var index = $(".modal-delete").index(this);
		$("#delete-projectid").val($(".projectid").eq(index).text());
	});
	$(".modal-close").click(function(){
		$("#delete").fadeOut();
	});
});

$(function(){
	$(".modal-edit").click(function(){
$("#edit").fadeIn();

var index=$(".modal-edit").index(this);
$("#edit-projectid").val($(".projectid").eq(index).text());
$("#edit-projectday").val($(".projectDay").eq(index).text());
$("#edit-project").val($(".project").eq(index).text());
$("#edit-projectplan").val($(".projectPlan").eq(index).text());
$("#edit-projectresult").val($(".projectResult").eq(index).text());
$("#edit-other").val($(".other").eq(index).text());

	});
	$(".modal-close").click(function(){
		$("#edit").fadeOut();
	});

});



