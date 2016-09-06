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
   <jsp:include page="base/nav.jsp" flush="true" />
    <br><br>
    <div align="center">
    <table class="form-check">
    <tr>
    <th colspan="5">購入確認画面</th>
    </tr>

    <tr><td>商品名</td><td>枚数</td><td>数量</td><td>単価</td><td>小計</td></tr>
    <tr>
    <td>
      ミートピザ
    </td>
    <td>
    2枚
    </td>
    <td>
    6ピース
    </td>
    <td>
    円
    </td>
    <td>
    4000円
    </td>
    </tr>

    <tr>
    <td>
      ミートピザ
    </td>
    <td>
    1枚
    </td>
    <td>
    3ピース
    </td>
    <td>
    円
    </td>
    <td>
    3800円
    </td>
    </tr>

    <tr>
    <td>
    ドリンク
    </td>
    <td colspan="2">
    個
    </td>
    <td>
    円
    </td>
    <td>
    円
    </td>
    </tr>

    <tr>
     <td>クーポン情報:</td>
    <td colspan="3">
    </td>
    <td>
    -円
    </td>
  </tr>


    <tr>
    <td colspan="4">
    <div class="form-total">
    合計:
    </div>
    </td>
    <td>
    7800円
    </td>
    </tr>

   </table>
    <a href="cart_end.jsp"><input type="button" class="btn btn-danger" value="完了"></a>
    <a href="cart.jsp"><input type="button" class="btn btn-danger" value="戻る"></a>
    </div>
	<br><br>
	<jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>

