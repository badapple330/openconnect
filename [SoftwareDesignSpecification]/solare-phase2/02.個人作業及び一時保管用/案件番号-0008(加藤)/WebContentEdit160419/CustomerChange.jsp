<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script
	src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js"
	charset="UTF-8">
	</script>
<meta name="GENERATOR" content="IBM HomePage Builder 2001 V5.0.2 for Windows">
<TITLE>UESUTO.COM-登録変更-</TITLE>
<style type="text/css">
body{ margin:0; padding:0; }
html, body { height: 100%; }
.stickyFooter{ background:#faff00; height:100; }
.above-Footer{
	min-height: 100%;
	margin-bottom: -150;
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

.errormessage {
	color: red;
	font-size:small;
}
ul{
color:red;}
</style>
</head>
<body>
	<div class="above-Footer">
		<div>

			<table style="background-color:#faff00;height:200;width:100%">
<TR>
<td>
<a class="logo" href="BackMenuAction"><img src="img/log.png"
					alt="uesto.com"></a>
<td valign="bottom">
<IMG src="img/kuma.gif" width="100" height="100" align="right">
<IMG src="img/souryou.png" width="340" height="151" align="right" width="340" height="151" align="right">
</td>
</TR>
<tr>
<td colspan="2">
<hr class="line02"/>
<jsp:include page="Header.jsp"></jsp:include>
</td>
</tr>
</table>
<br><br><br>
<div align="center"><b>お客様情報変更</b></div>
<hr color="#32cd32" width="20%">
<br>
<div align="center"><font size="-1">お客様の情報をご入力後、「変更をする」ボタンを押して下さい。</font></div><br>
<s:form action="CustomerChangeAction">
<div align="center"><FONT color="red"><s:property value="errormessage"/></FONT></div>
<table align="center" width="50%" cellspacing="2" bgcolor="#cccccc">
<tr>

<td align="center" height="50" width="250" bgcolor="FFFF99">メールアドレス</td>
<td bgcolor="#ffffff">

<input type="email" name="mailaddress" value="<s:property value='mailaddress'/>" size="49" maxlength="50"/><font size="-1">　(半角英数字)</font><s:fielderror><s:param value="%{'mailaddress'}"></s:param></s:fielderror></td>


</tr>

<tr>
			<td align="center" height="70" width="250" bgcolor="FFFF99">ご住所</td>
			<td bgcolor="#ffffff"><p class="example">
					<font size="-1">郵便番号

					 <input type="text" name="postcode" value="<s:property value='postcode'/>" size="10" maxlength="8" onKeyUp="AjaxZip3.zip2addr(this,'','address','address');"></input><br>
<s:fielderror><s:param value="%{'postcode'}"></s:param></s:fielderror>

					居住所 <input type="text" name="address" value="<s:property value='address'/>"size="45" maxlength="50"/></font>
<s:fielderror><s:param value="%{'address'}"></s:param></s:fielderror>

				</p></td>
		</tr>
<tr>
<td align="center" height="50" width="250" bgcolor="FFFF99">電話番号</td>
<td bgcolor="#ffffff">　

<input type="stringlength" name="telnumber" value="<s:property value='telnumber'/>" size="15"  maxlength="11" /><font size="-1">(半角数字、ハイフンなし)　</font><s:fielderror><s:param value="%{'telnumber'}"></s:param></s:fielderror>
</td>

</tr>
  </table>
<br><br>
<div align="center"><INPUT type="submit" value="変更をする" style="background-color:#ffff99" onmouseover="this.style.background='#99ccff'" onmouseout="this.style.background='#ffff99'"></div>
</s:form>
<div>
		<a href="javascript:history.back();">
<input type="submit" value="前画面に戻る" style="background-color:#ffff99"
				onmouseover="this.style.background='#99ccff'"
				onmouseout="this.style.background='#ffff99'" /></a></div>


</div>

<br><br><br><br>


		</div>

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
