<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>UESUTO.COM-購入確認画面-</title>

<style type="text/css">

body{ margin:0; padding:0; }
html, body { height: 95%; }
.stickyFooter{ background:#faff00; height:100; }
.above-Footer{
	min-height: 100%;
	margin-bottom: -108;
}
.above-Footer:after {
	content: "";
	display: block;
	height: 100;
}
hr.line {
  height: 13px;
  background : url(img/boda.png);
  border: 0px none;
}

hr.line02 {
  height: 65px;
  background : url(img/kiui2.png);
  border: 0px none;
}

a.logo{
outline:none;
}
</style>
</head>
<body>

<!-- ヘッダー -->
	<div class="above-Footer">
		<div>

			<table style="background-color:#faff00;height:200;width:100%">

    <tr>
      <td>
<a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
<td>
<img src="img/kuma.gif" width="100" height="100" align="right">
<img src="img/souryou.png" width="340" height="151" align="right">
</td>
    </tr>
<tr><td colspan="2">
<hr class="line02"/>
<jsp:include page="Header.jsp"></jsp:include>
</td>
</tr>
</table>
<!-- ヘッダー -->


<br><br><br>
<div align="center"><b>UESUTO.COM-購入確認-</b></div>
<Hr Size="3" Color="#32CD32" width="200" >

<br>

<!-- 購入商品のテーブル -->
<table align="center" width="750" cellspacing="2" bgcolor="#cccccc" style="table-layout: fixed;">
  <tr>
      <td width="400" align="center" bgcolor="#FFFF99" bordercolor="#cccccc" height="40"> 商品名</td>
      <td align="center" bgcolor="#FFFF99" bordercolor="#cccccc" height="40">単価</TD>
      <td width="80" align="center" bgcolor="#FFFF99" bordercolor="#cccccc" height="40">数量</td>
      <td align="center" bgcolor="#FFFF99" bordercolor="#cccccc" height="40">小計</td>
    </tr>

    <s:iterator value="cartList">
    <tr bordercolor="#cccccc">
    <td align="center"  width="158" bgcolor="#ffffff" bordercolor="#cccccc"  height="37"><s:property value="goods_name"/></td>
    <td align="center"  width="79" bgcolor="#ffffff" bordercolor="#cccccc"  height="37"><s:property value="price"/>円</td>
    <td align="center" bgcolor="#ffffff" bordercolor="#cccccc" height="37"><s:property value="order_count"/>個</td>
    <td align="center" bgcolor="#ffffff" bordercolor="#cccccc" height="37"><s:property value="price*order_count"/>円</td>
    </tr>
</s:iterator>

<tr>
<td align="right"  colspan="3"  bgcolor="#ffffff" height="37"  bordercolor="#cccccc">合計</td>
<td align="center"  bgcolor="#ffffff" height="37"  bordercolor="#cccccc">
<s:property value="#session.total_yen"/>円</td>
</tr>

</table>

<br><br>
<div align="center">

<!-- 商品一覧に戻るボタン -->
<s:form action="BackMenuAction">
<INPUT type="submit" value="← 商品一覧に戻る" style="background-color:#ffff99"
onmouseover="this.style.background='#99ccff'" onmouseout="this.style.background='#ffff99'">
</s:form>
<br>


<!-- 注文完了画面に遷移するボタン -->
<s:form action="CompleteAction">
<INPUT type="submit" value="購入完了" style="background-color:#ffff99"
onmouseover="this.style.background='#99ccff'" onmouseout="this.style.background='#ffff99'">
</s:form>
<br>

<!-- 登録変更画面に遷移するボタン -->
<s:if test="#session.ID!=null">
<s:form action="GoChangeAction">
<INPUT type="submit" value="登録変更→" style="background-color:#ffff99"
onmouseover="this.style.background='#99ccff'" onmouseout="this.style.background='#ffff99'">
</s:form>
</s:if>
</div>
</div>
</div>


<!-- 前の画面に戻るボタン -->
<div>
		<a href="javascript:history.back();">
<input type="submit" value="前画面に戻る" style="background-color:#ffff99"
				onmouseover="this.style.background='#99ccff'"
				onmouseout="this.style.background='#ffff99'" /></a></div>

<!-- フッダー -->
	<div class="stickyFooter" >

	<hr class="line"/>
<p  align="right">(C) 2015 UESUTO.com. All Rights Reserved.</p>
<br><br>
	</div>
	<!-- jQuery読み込み -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>