$(function(){
  function changeImage($click){
    //console.log($click);
    var $current = $click.siblings('.container').children('.current');
    console.log($current);
    var $new;
    var findSelector = '';
    
    if($click.hasClass('next')){
      $new = $current.next();
      findSelector = ':first-child';
    }else{
      $new = $current.prev();
      findSelector = ':last-child';
    }
    
    if($new.length == 0){
      $new = $current.siblings(findSelector);
    }
    $current.removeClass('current');
    $new.addClass('current');
  }
  
  $('.slide')
  .on('click','a',function(event){
    event.preventDefault();
    changeImage($(this));
  });
});