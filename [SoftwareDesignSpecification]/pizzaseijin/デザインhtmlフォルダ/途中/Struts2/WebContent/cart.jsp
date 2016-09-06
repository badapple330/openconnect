<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート</title>
<jsp:include page="base/base.jsp" flush="true" />
<script type="text/javascript" src="js/cart.js"></script>
</head>
<body>
<jsp:include page="base/header.jsp" flush="true" />
   <jsp:include page="base/nav.jsp" flush="true" />
<!--ヘッダーにロゴを表示-->
<br><br>
<div align="center">
<div class="form-titel">
  <table class="table-test">
    <tr><th colspan="4">
      <div class="form-titel">カート</div>
    </th></tr>
    <tr><th colspan="4">ご注文内容</th></tr>
    <tr><td>商品名</td><td>金額</td><td>枚数</td><td>ピース数</td></tr>
    <tr>
     <td>
     piza1
     </td>

     <td>
       <div class="form-text">
       subtotal円
     </div>
     </td>
    <td>
     <div class="form-text">
       <select class="list">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
    </select>
    枚
   </div>
 </td>
     <td>
     <div class="form-text">
       <select class="list">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
    </select>
    ピース
   </div>
 </td>
   </tr>

   <tr>
     <td>クーポン情報:</td>
    <td colspan="3">
      <input type="checkbox">クーポンID1
      <input type="checkbox">クーポンID2
      <input type="checkbox">クーポンID3
      <input type="checkbox">クーポンID4
      <input type="checkbox">クーポンID5
    </td>
  </tr>

   <tr><th colspan="4">合計金額</th></tr>
   <tr>
     <td colspan="3">
     <div class="form-total">
       合計:
     </div>
   </td>
   <td>
   total円
   </td>
   </tr>
   <tr><th colspan="4">お支払い情報</th></tr>
   <tr>
    <td colspan="4">
      <div class="table-bar">
      <input type="radio" name="pay" value="pey"onclick="entry();" />店頭払い
      <input type="radio" name="pay" value="peycard" onclick="entry();" />クレジットカード払い
    </div>
  </td>
</tr>

  <tr id="payBox">
     <td colspan="4">クレジットカード情報の入力をお願いします</td>
   </tr>

   <tr id="firstBox">
     <td>カード番号：</td>
     <td colspan="3"><input type=text name="cardNo"></td>
   </tr>
   <tr id="payfirstBox">
     <td>有効期限（月/年）：</td>
     <td colspan="3">（月）
      <select name="cardMo">
        <option value="01">--</option>
        <option value="01">1月</option>
        <option value="02">2月</option>
        <option value="03">3月</option>
        <option value="04">4月</option>
        <option value="05">5月</option>
        <option value="06">6月</option>
        <option value="07">7月</option>
        <option value="08">8月</option>
        <option value="09">9月</option>
        <option value="10">10月</option>
        <option value="11">11月</option>
        <option value="12">12月</option>
      </select>
      （年）
    <select name="cardYe">
      <option value="00">--</option>
      <option value="15">15年</option>
      <option value="16">16年</option>
      <option value="17">17年</option>
      <option value="18">18年</option>
      <option value="19">19年</option>
      <option value="20">20年</option>
      <option value="21">21年</option>
      <option value="22">22年</option>
    </select>
  </td>
</tr>

<tr id="paysecoudBox">
  <td>セキュリティコード：</td>
  <td colspan="3"><input type=password name="cardCo"></td>
</tr>

  <tr><th colspan="4">お届け先</th></tr>
  <tr>
   <td colspan="4">
     <input type="radio" name="adress" value="peycard" onclick="info();">既存住所
     <input type="radio" name="adress" value="peycard" onclick="info();" />新規住所
   </td>
  </tr>

<tr id="a">
    <td colspan="4">新規住所情報を入力してください。</td>
  </tr>

  <tr id="b">
    <td>郵便番号:</td>
    <td colspan="3"><input type="text"></td>
  </tr>

  <tr id="c">
    <td>
      都道府県:
    </td>
    <td colspan="3">
    <input type="text">
    </td>
  </tr>

  <tr id="d">
    <td>
      市町村区:
    </td>
    <td colspan="3">
    <input type="text">
    </td>
  </tr>

  <tr id="e">
    <td>
      番地など:
    </td>
    <td colspan="3">
    <input type="text">
    </td>
  </tr>
 </table>
 
   <div align="center">
     <a href="cart_check.jsp"><input type="button" class="btn btn-danger" value="購入確認へ"></a>
     <a href="index.jsp"><input type="button" class="btn btn-danger" value="キャンセル"></a>
   </div>

   <br><br>
</div>
</div>
 <jsp:include page="base/footer.jsp" flush="true" />
 </body>
</html>