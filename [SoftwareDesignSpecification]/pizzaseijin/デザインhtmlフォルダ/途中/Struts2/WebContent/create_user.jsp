<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新規登録</title>
  <jsp:include page="base/base.jsp" flush="true" />
  </head>
  <jsp:include page="base/header.jsp" flush="true" />
  <body>
   <div align="center">
   <br><br>
    <table class="table_user">
  <tr><th colspan="3"><font size="4">新規登録</font></th></tr>
   <tr>
   <td>メールアドレス</td>
   <td colspan="2"><input type=email name="mail" placeholder="記入例　abcd@efg.com"></td>
  </tr>
   <tr>
   <td>パスワード</td>
   <td colspan="2"><input type=password name="password"></td>
  </tr>
  <tr>
   <td>氏名</td>
   <td colspan="2"><input type=text name="namae"  placeholder="記入例　御茶ノ水　太郎"></td>
  </tr>
  <tr>
   <td>氏名フリガナ</td>
   <td colspan="2"><input type=text name="kana"  placeholder="記入例　オチャノミズ　タロウ"></td>
  </tr>
  <tr>
   <td>郵便番号</td>
   <td colspan="2"><input type=text name="postal"  placeholder="000-0000"></td>
  </tr>
  <tr>
   <td>都道府県</td>
   <td colspan="2"><input type=text name="postFirst" placeholder="記入例　東京都"></td>
  </tr>
  <tr>
   <td>市町村区</td>
   <td colspan="2"><input type=text name="postSecond" placeholder="記入例　千代田区"></td>
  </tr>
  <tr>
   <td>番地など</td>
   <td colspan="2"><input type=text name="postThird" placeholder="記入例　霞ヶ関3-6-15"></td>
  </tr>
  <tr>
   <td>電話番号</td>
   <td colspan="2"><input type=text name="telnum" placeholder="記入例　090-0000-0000"></td>
  </tr>
 </table>
     <a href="index.jsp"><input type="button" onclick="" class="btn btn-danger" value=" 取消 "></a>
     <a href="create_user_check.jsp"><input type="button" onclick="" class="btn btn-danger" value=" 登録 "></a>
  </div>
	<br><br>
    <jsp:include page="base/footer.jsp" flush="true" />
  </body>
</html>
