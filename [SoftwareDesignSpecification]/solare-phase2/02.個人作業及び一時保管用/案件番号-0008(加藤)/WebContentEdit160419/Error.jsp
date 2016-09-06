<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">


<TITLE>UESUTO.COM-　エラー　-</TITLE>
<style type="text/css">
body{ margin:0; padding:0; }
html, body { height: 95%;}
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

	<table style="background-color:#faff00;height:200;width:100%">
<TR>
<td>
<a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
<td valign="bottom">
<IMG onMouseDown="return false;" src="img/kuma.gif" width="100" height="100" align="right">
<IMG onMouseDown="return false;" src="img/souryou.png" width="340" height="151" align="right">
</td>
</TR>
<tr>
<td colspan="2">
<hr class="line02"/>
<jsp:include page="Header.jsp"></jsp:include>
</td></tr>
</table>
<!-- ヘッダー -->


<br><br><br><br>
<div align="center">
<br><br>
<font color="red" size="+3">
カートの中身に何も入っていません<br><br>
商品一覧画面からやり直してください<br><br><br><br>
</font>
<br><br><br><br>


<!-- 商品一覧に戻るボタン -->
<s:form action="CartClearAction">
<input type="submit" value="商品一覧画面に移動します" style="background-color:#ffff99"
onmouseover="this.style.background='#99ccff'" onmouseout="this.style.background='#ffff99'"/>
</s:form>

</div>
</div>


<!-- 前の画面に戻るボタン -->
<div>
		<a href="javascript:history.back();">
<input type="submit" value="前画面に戻る" style="background-color:#ffff99"
				onmouseover="this.style.background='#99ccff'"
				onmouseout="this.style.background='#ffff99'" /></a></div>

<!-- フッダーの宣言 -->

<div class="stickyFooter">
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