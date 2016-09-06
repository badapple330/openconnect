<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ヘルプ</title>
 <jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
	<div class="container text-left">
		<h1>ヘルプ</h1>
		<hr>
		<div>
			<h3>よくある質問</h3>
			<hr>
	</div>
	<div align="center">
			<table class="table_size">
			  <tr>
	  		    <th colspan="2"><h2>配達についてのご質問</h2></th>
			  </tr>
			  <tr>
			    <td>配達時間はどの程度かかりますか？</td>
			    <td>ご注文いただきましてから焼き始めますので配達完了まで1時間程お時間をいただきます。</td>
			  </tr>
			  <tr>
			    <td>配達はドローンだけではなくバイク注文もありますか？</td>
			    <td>配達先との距離感によってはバイクにて配達いたします。</td>
			  </tr>
			</table>
			<hr>
			<table class="table_size">
			  <tr>
				<th colspan="2"><h2>ドローンについてのご質問</h2></th>
			  </tr>
			  <tr>
			    <td>ドローンでの配達とありますが安全性は大丈夫ですか？</td>
                <td>最新鋭のドローンを採用し、安全面に関しても細心の注意を払っております。</td>
			  </tr>
              <tr>
			    <td>ドローンがピザを持たずに配送されてきた場合はどうすればよいでしょうか？</td>
			    <td>お問い合わせ先にあります電話番号にご連絡ください。早急に再配送いたします。</td>
			  </tr>
              <tr>
			    <td>配送後のドローンはどうすればよいでしょうか？</td>
				<td>ピザをお取りいただきましたら自動的に戻りますのでご安心ください。</td>
			  </tr>
              <tr>
			    <td>配送中にドローンからピザを盗まれませんか？</td>
				<td>目的地に到着するまで可能な限り高所飛行を行い、確認カメラもついており常時確認しておりますのでご安心ください。</td>
			  </tr>
			</table>
			<hr>
			<table class="table_size">
			  <tr>
			    <th colspan="2"><h2>クーポンについてのご質問</h2></th>
			  </tr>
			  <tr>
				<td>クーポンは併用して利用できますか？</td>
				<td>申し訳ありませんが一回の注文につき一回のみとなっております。</td>
			  </tr>
			</table>
			<br><br>
			<a href="index.jsp"><button type="button" class="btn btn-danger">ホームに戻る</button></a><br><br>
	    </div>
	  </div>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>
