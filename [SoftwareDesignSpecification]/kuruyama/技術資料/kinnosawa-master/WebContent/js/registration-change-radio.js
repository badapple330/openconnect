$(

    function() {
    $('input[type=radio]').change(function() {
        $('#tr1,#tr2').removeClass('purchaseInvisible');

        if ($("input:radio[name='creditInput']:checked").val() == "1") {
            $('#tr2').addClass('purchaseInvisible');
        } else if($("input:radio[name='creditInput']:checked").val() == "2") {
            $('#tr1').addClass('purchaseInvisible');
        }
    }).trigger('change'); //←(1)
}


);