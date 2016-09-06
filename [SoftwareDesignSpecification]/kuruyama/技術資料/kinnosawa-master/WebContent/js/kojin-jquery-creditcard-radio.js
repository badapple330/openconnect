$(

    function() {
    $('#creditCardInput').change(function() {
        $('#tr1,#tr2').removeClass('purchaseInvisible');

        if ($("input:radio[name='creditCardInput']:checked").val() == "1") {
            $('#tr2,#tr3').addClass('purchaseInvisible');
        } else if($("input:radio[name='creditCardInput']:checked").val() == "2") {
            $('#tr1,#tr3').addClass('purchaseInvisible');
        } else if($("input:radio[name='creditCardInput']:checked").val() == "3") {
        	$('#tr1,#tr2').addClass('purchaseInvisible');
            }
        }
        ).trigger('change'); //←(1)
}


);