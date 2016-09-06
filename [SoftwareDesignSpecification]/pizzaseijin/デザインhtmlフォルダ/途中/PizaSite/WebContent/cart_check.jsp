<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート確認</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
  <script type="text/javascript">
function entry(){
	radio = document.getElementsByName('pay')
if(radio[1].checked){
  document.getElementById('payBox').style.display = "";
  document.getElementById('firstBox').style.display = "";
  document.getElementById('payfirstBox').style.display = "";
  document.getElementById('paysecoudBox').style.display = "";

}else{
  document.getElementById('payBox').style.display = "none";
  document.getElementById('firstBox').style.display = "none";
  document.getElementById('payfirstBox').style.display = "none";
  document.getElementById('paysecoudBox').style.display = "none";

}
}
function info(){
radio = document.getElementsByName('adress')
if(radio[1].checked) {
  document.getElementById('a').style.display = "";
  document.getElementById('b').style.display = "";
  document.getElementById('c').style.display = "";
  document.getElementById('d').style.display = "";
  document.getElementById('e').style.display = "";

}else{
  document.getElementById('a').style.display = "none";
  document.getElementById('b').style.display = "none";
  document.getElementById('c').style.display = "none";
  document.getElementById('d').style.display = "none";
  document.getElementById('e').style.display = "none";

}
}
</script>
   <jsp:include page="base/nav.jsp" flush="true" />
    <br><br>
    <div align="center">
    <table class="form-check">
    <tr>
    <th colspan="4">購入確認画面</th>
    </tr>

    <tr><td>商品名</td><td>金額</td><td>枚数</td><td>ピース数</td></tr>
    <tr>
    <td>
      ミートピザ
    </td>
    <td>
    4000円
    </td>
    <td>
    2枚
    </td>
    <td>
    6ピース
    </td>
    </tr>
    <tr>
    <td>
      ミートピザ
    </td>
    <td>
    3800円
    </td>
    <td>
    1枚
    </td>
    <td>
    3ピース
    </td>
    </tr>
    <tr>
    <td colspan="3">
    <div class="form-total">
    合計:
    </div>
    </td>
    <td>
    円
    </td>
   </table>
    <a href="cart_end.jsp"><input type="button" class="btn btn-danger" value="完了"></a>
    <a href="cart.jsp"><input type="button" class="btn btn-danger" value="戻る"></a>
    </div>
	<br><br>
	<jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>

