<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
 <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>アレルギーアイコンの説明</title>
   <jsp:include page="base/base.jsp" flush="true" />
 </head>
 <body>
   <jsp:include page="base/header.jsp" flush="true" />
   <jsp:include page="base/nav.jsp" flush="true" />
 <div class="container">
  <h3>アレルギー表示について</h3>
  <p>
    それぞれのメニューについて、含まれるアレルゲンをアイコンで表示しております。<br>アイコンが何の原材料を表現しているかは、下記の対応表をご確認ください。<br>
  </p>
  <h3>アレルギーアイコン対応表</h3>
  <table>
   <tr>
    <th>アイコン</th>
    <th><img src="allergie_img/allergy06_komugi.png" alt="小麦のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy03_tamago.png" alt="卵のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy04_milk.png" alt="乳のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy19_daizu.png" alt="大豆のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy14_gyuniku.png" alt="牛肉のイラスト" class="allergie"></th>
   </tr>
   <tr>
    <th>原材料</th>
    <td>小麦</td>
    <td>卵</td>
    <td>乳</td>
    <td>大豆</td>
    <td>牛肉</td>
   </tr>
   <tr>
    <th>アイコン</th>
    <th><img src="allergie_img/allergy22_butaniku.png" alt="豚肉のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy20_toriniku.png" alt="鶏肉のイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy09_ika.png" alt="いかのイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy02_ebi.png" alt="えびのイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy01_kani.png" alt="かにのイラスト" class="allergie"></th>
   </tr>
   <tr>
    <th>原材料</th>
    <td>豚肉</td>
    <td>鶏肉</td>
    <td>いか</td>
    <td>えび</td>
    <td>かに</td>
   </tr>
   <tr>
    <th>アイコン</th>
    <th><img src="allergie_img/allergy10_ikura.png" alt="いくらのイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy26_ringo.png" alt="りんごのイラスト" class="allergie"></th>
    <th><img src="allergie_img/allergy27_gelatine.png" alt="ゼラチンのイラスト" class="allergie"></th>
   </tr>
   <tr>
    <th>原材料</th>
    <td>いくら</td>
    <td>りんご</td>
    <td>ゼラチン</td>
   </tr>
  </table>
  <br><br>
    <div align="center">
    	<a href="index.jsp"><button type="button" class="btn btn-danger">ホームに戻る</button></a>
    </div><br><br>
</div>
 <jsp:include page="base/footer.jsp" flush="true" />
 </body>
</html>
