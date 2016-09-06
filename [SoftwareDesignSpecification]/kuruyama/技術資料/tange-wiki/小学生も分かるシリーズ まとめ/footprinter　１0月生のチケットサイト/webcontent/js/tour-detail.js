$(function() {
	var url = location.protocol;
	url += "/footprinter/comment-action"
	$('#test').on('click', function(event) {
		event.preventDefault();
		var data = {
				comment : $("#formText").val()
		};
		$.ajax({
			url : url,
			type : 'post',
			data : data,
			datatype : 'json'
		}).done(function(data) {
			// alert(data[85]);
			$("#comment").empty();
			$("#formText").val("");
			for (var i = 0; i < data.length; i++) {
				$("#comment").append(
						'<tr><td style="width: 50px;word-break: break-all;"><br><br>名前: '+data[i].userName+
						'</td></tr><tr><td style="width: 500px;word-break: break-all;">コメント: '+data[i].comment+'</td></tr><tr></tr>'
				);
			}
		});
		if (data === false) {
			return;
		}
	});
});