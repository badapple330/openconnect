$(function() {
	$(".modal-delete").click(function(){
		$("#delete-prepare").fadeIn();
	});
	$(".modal-close").click(function(){
		$("#delete-prepare").fadeOut();
	});
});

$(function() {
	$(".delete-true").click(function(){
		$("#delete-prepare").fadeOut();
		$("#delete").fadeIn();

		var index = $(".modal-delete").index(this);
		$("#delete-projectid").val($(".projectid").eq(index).text());
	});
	$(".modal-close").click(function(){
		$("#delete").fadeOut();
	});
});
