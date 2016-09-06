<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート</title>
<jsp:include page="base/base.jsp" flush="true" />
<script type="text/javascript" src="js/cart.js"></script>
<link href="css/cart.css" rel="stylesheet" type="text/css" />
</head>
<body>
<jsp:include page="base/header.jsp" flush="true" />
   <jsp:include page="base/nav.jsp" flush="true" />
<!--ヘッダーにロゴを表示-->
<br><br>
<div align="center">
<div class="form-titel">
  <p>※個数を変更したい場合は変更ボタンを押してください。</p>
  <p>※12ピース1枚となります。</p>
  <p>※削除ボタンで商品はカートから削除されます。</p>
  <p>※全削除ボタンで商品はカートからすべて削除されます。</p>
<div align="right">
<input type="button" class="btn btn-danger" value="全部削除">
<input type="button" class="btn btn-danger" value="削除">
</div>

<div class="form-a">
  <table class="table-test">
    <tr><th colspan="8">
      <div class="form-titel">ご注文内容</div>
      </th>
    </tr>
    <tr><th colspan="8">メインメニュー</th></tr>
    <tr><td>商品名</td><td>枚数</td><td>数量</td><td></td><td>単価</td><td>小計</td><td></td></tr>
    <tr>
     <td>
     ミートピザ
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

 <td>
<input type="button" class="btn btn-danger" value="変更">
</td>

  <td>
       200円
 <td>
 2600円
     </td>

     <td>
     <input type="button" class="btn btn-danger" value="削除">
     </td>

   <td>
   <input type="button" class="btn btn-danger" value="削除">
   </td>

    </tr>


   <tr><th colspan="7">サイドメニュー</th></tr>
   <tr><td>商品名</td><td>個数</td><td>単価</td><td>小計</td></tr>
   <tr>
   <td>
   ドリンク
   </td>
   <td colspan="2">
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
   </td>
   <td>
   100円
   </td>
   <td>
   100円
    <input type="button" class="btn btn-danger" value="変更">
   </td>
   </tr>

   <tr>
     <th colspan="5">クーポン情報</th>
     </tr>
     <tr>
    <td colspan="4">
      <select name="">
        <option value="00">所持クーポン選択</option>
        <option value="01">15%OFFクーポン</option>
        <option value="02">10%OFFクーポン</option>
        <option value="03">5%OFFクーポン</option>
      </select>
    </td>
    <td>
    -405円
    </td>
  </tr>

   <tr><th colspan="5">合計金額</th></tr>
   <tr>
     <td colspan="4">
     <div class="form-total">
       合計:
     </div>
   </td>
   <td>
   2295円
   </td>
   </tr>
   <tr><th colspan="5">お支払い情報</th></tr>
   <tr>
    <td colspan="5">
      <div class="table-bar">
      <input type="radio" name="pay" value="pey"onclick="entry();" />代引き
      <input type="radio" name="pay" value="peycard" onclick="entry();" />クレジットカード払い
    </div>
  </td>
</tr>

  <tr id="payBox">
  <td colspan="5">クレジットカード情報の入力をお願いします。</td>
   </tr>

   <tr id="firstBox">
     <td>カード番号：</td>
     <td colspan="4"><input type=text name="cardNo"></td>
   </tr>

   <tr id="nameBox">
   <td>
    名義人:
   </td>
   <td colspan="4"><input type=text name="name"></td>
   </tr>

   <tr id="payfirstBox">
     <td>有効期限（月/年）：</td>
     <td colspan="4">（月）
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
  <td colspan="4"><input type=password name="cardCo"></td>
</tr>

  <tr><th colspan="5">お届け先</th></tr>
  <tr>
   <td colspan="5">
     <input type="radio" name="adress" value="peycard" onclick="info();">登録住所
     <input type="radio" name="adress" value="peycard" onclick="info();" />その他住所
   </td>
  </tr>

<tr id="a">
    <td colspan="5">新規住所情報を入力してください。</td>
  </tr>

  <tr id="b">
    <td>郵便番号:</td>
    <td colspan="4"><input type="text"></td>
  </tr>

  <tr id="c">
    <td>
      都道府県:
    </td>
    <td colspan="4">
    <input type="text">
    </td>
  </tr>

  <tr id="d">
    <td>
      市町村区:
    </td>
    <td colspan="4">
    <input type="text">
    </td>
  </tr>

  <tr id="e">
    <td>
      番地など:
    </td>

  </tr>
 </table>
 </div>
   <div align="center">
     <a href="cart_check.jsp"><input type="button" class="btn btn-danger" value="購入確認へ"></a>
     <a href="index.jsp"><input type="button" class="btn btn-danger" value="キャンセル"></a>
   </div>
</div>
</div>
 <jsp:include page="base/footer.jsp" flush="true" />
 </body>
</html>