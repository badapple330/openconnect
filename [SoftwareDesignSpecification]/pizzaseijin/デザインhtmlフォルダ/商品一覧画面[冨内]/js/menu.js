$(function(){
  $('.main ul li ').click(function(){
    $('body').append('<div class="overlay"></div>');
    $('overlay').fadeIn('slow');
  });
});
