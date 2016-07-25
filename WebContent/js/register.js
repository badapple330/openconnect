	$(window).ready(function() {
		$('#postcode1').jpostal({
			click : '#btn',
			postcode : [ '#postcode1', '#postcode2' ],
			address : {
				'#address1' : '%3',
				'#address2' : '%4%5'
			}
		});
	});
