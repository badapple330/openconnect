/**
 *
 */

 $(function()){
   var sclass = new $('.searchClass');
   var sTab = 0;
   switch (sclass) {
     case  title:
       sTab = "タイトル";
       break;
     case author:
       sTab = "著者名";
       break;
     case publish_day:
       sTab = "発売日";
       break;
     default:
       sTab = "全検索";
       break;
   }
   return sTab;
 }
