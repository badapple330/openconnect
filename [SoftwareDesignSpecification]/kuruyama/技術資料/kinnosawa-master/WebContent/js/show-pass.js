$(function() {
    $('#passcheck').change(function(){
        if ( $(this).prop('checked') ) {
            $('.password').attr('type','text');
        } else {
            $('.password').attr('type','password');
        }
    });
});
$(function() {
    $('#changePassCheck').change(function(){
        if ( $(this).prop('checked') ) {
            $('.password').attr('type','text');
        } else {
            $('.password').attr('type','password');
        }
    });
});