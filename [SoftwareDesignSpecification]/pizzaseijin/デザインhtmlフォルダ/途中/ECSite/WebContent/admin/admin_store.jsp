<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>店舗情報</title>
		<jsp:include page="admin_base/admin_base.jsp" flush="true" />
		<script>
		  $(function(){
			  $("#edit").attr('disabled','disabled');
			  $("#delete").attr('disabled','disabled');
			  $("#check").click(function(){
				  var count = $('#check :checked').length;
				  if(count == 0){
					  $("#create").removeAttr('disabled');
					  $("#edit").attr('disabled','disabled');
					  $("#delete").attr('disabled','disabled');
				  } else if(count == 1){
					  $("#create").attr('disabled','disabled');
					  $("#edit").removeAttr('disabled');
					  $("#delete").removeAttr('disabled');
				  } else {
					  $("#create").attr('disabled','disabled');
					  $("#edit").attr('disabled','disabled');
					  $("#delete").removeAttr('disabled');
				  }
			  });
		  });
		</script>
	</head>
	<body>
		<jsp:include page="admin_base/admin_header.jsp" flush="true" />
    	<jsp:include page="admin_base/admin_nav.jsp" flush="true" />
	  </div>
	  <br><br><br>
	  <div class="container">
	    <div class="row">
	      <div class="col-md-10 col-md-offset-2">
	        <select>
	          <option>検索内容</option>
	          <option>店舗名</option>
	          <option>郵便番号</option>
	          <option>住所</option>
	        </select>
	        <input type="text" size="20">
	        <input type="submit" class="btn btn-danger" value="検索" /> <br><br>
	        <div id="check">
	          <table class="admin_table">
	            <tr>
	              <th>選択</th>
	              <th>店舗名</th>
	              <th>郵便番号</th>
	              <th>住所</th>
	              <th>電話番号</th>
                  <th>営業時間</th>
                </tr>
	            <tr>
	              <td><input type="checkbox" name="box"></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	            <tr>
	              <td><input type="checkbox" name="box"></td>
	              <td>テスト2号店</td>
	              <td>222-2222</td>
	              <td>神奈川県xx市xx町xxxxxx2222-22</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～18:00</td>
	            </tr>
	            <tr>
	              <td><input type="checkbox" name="box"></td>
	              <td>テスト3号店</td>
	              <td>333-3333</td>
	              <td>千葉県xx市xx町xxxxxx3333-33</td>
	              <td>090-xxxx-xxxx</td>
	              <td>10:00～21:00</td>
	            </tr>
	          </table>
	        </div>
	      </div>
	    </div>
	    <br><br>
	    <div class="row">
	      <div class="col-md-offset-1">
	        <input type="submit" id="delete" class="btn btn-danger" value="削除">
	      </div>
	    </div>
	    <br><br>
	    <div class="row">
	      <div class="col-md-7 col-md-offset-3">
	          <table class="line_del">
	            <tr>
	              <td><label>店舗名</label>&nbsp;&nbsp;</td>
	              <td><input type="text" size="40" placeholder="xx店"><br><br></td>
	            </tr>
	            <tr>
	              <td><label>郵便番号</label>&nbsp;&nbsp;</td>
	              <td><input type="text" size="40" placeholder="xxx-xxxx"><br><br></td>
	            </tr>
	            <tr>
	              <td><label>住所</label>&nbsp;&nbsp;</td>
	              <td><input type="text" size="40"><br><br></td>
	            </tr>
	            <tr>
                  <td><label>電話番号</label>&nbsp;&nbsp;</td>
	              <td><input type="text" size="40" placeholder="xxx-xxxx-xxxx"><br><br></td>
	            </tr>
	            <tr>
                  <td><label>営業時間</label>&nbsp;&nbsp;</td>
	              <td><input type="text" size="40" placeholder="xx:xx～xx:xx"><br><br></td>
	            </tr>
	            <tr>
	              <td><input type="submit" id="create" class="btn btn-danger" value="追加" /></td>
	              <td><input type="submit" id="edit" class="btn btn-danger" value="編集" /></td>
	            </tr>
	          </table>
	          <br><br>
	      </div>
        </div>
      </div>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
	</body>
</html>