<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>商品情報</title>
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
	  	<br><br><br>
	  	<div class="container">
	   		<div class="row">
	      		<div class="col-md-10 col-md-offset-1">
	        		<select>
	          			<option>検索内容</option>
	          			<option>商品名</option>
	          			<option>値段</option>
	          			<option>材料</option>
	        		</select>
	        		<input type="text" size="20">
	        		<input type="submit" class="btn btn-danger" value="検索" /> <br><br>
	        		<div class="x_scroll">
	          			<div id="check">
	            			<table class="sctable">
	              				<tr>
	                				<th>選択</th>
	                				<th>商品名</th>
	                				<th>値段(円)</th>
	                				<th>材料</th>
	                				<th>詳細</th>
	              				</tr>
	              				<tr>
	                				<td><input type="checkbox" name="box"></td>
	                				<td>熟成ビーフ</td>
	                				<td>3950</td>
	                				<td>オニオン、熟成ビーフ、BBQソース、アスパラガス</td>
	                				<td>牛バラ肉をじっくり熟成させて旨味を凝縮。お肉と相性抜群のBBQソースが、熟成ビーフのおいしさを引き立てます。</td>
	              				</tr>
	              				<tr>
	                				<td><input type="checkbox" name="box"></td>
	                				<td>イベリコ豚のトマトソース</td>
	                				<td>3800</td>
	                				<td>イベリコ豚トマトソース、ブラックオリーブ、チェリートマト、パセリフレーク、パルメザンチーズ</td>
	                				<td>大きめにカットしたイベリコ豚をふんだんに使い、トマトソースで仕上げました。</td>
	              				</tr>
	              				<tr>
	                				<td><input type="checkbox" name="box"></td>
	                				<td>ギガ･ミート</td>
	                				<td>3300</td>
	                				<td>ペパロニ、粗挽きソーセージ、イタリアンソーセージ、スライスベーコン</td>
	                				<td>ボリューム満点、おいしさギガクラスのミートミックス。もりもり食べて、みんな大満足。</td>
	              				</tr>
	            			</table>
	            		</div>
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
	              			<td><label>商品名</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40"><br><br></td>
	            		</tr>
	            		<tr>
	              			<td><label>値段</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40"><br><br></td>
	            		</tr>
	            		<tr>
	              			<td><label>画像ファイル</label>&nbsp;&nbsp;</td>
	              			<td><input type="file" name="ファイル選択"><br><br></td>
	            		</tr>
	            		<tr>
	              			<td><label>カテゴリー</label>&nbsp;&nbsp;</td>
	              			<td>
	              				<select>
	                    			<option>ミート</option>
	                    			<option>シーフード</option>
	                    			<option>ベジタブル</option>
	                    			<option>和風</option>
	                    			<option>サイド</option>
	                 			</select><br><br>
	              			</td>
	            		</tr>
	            		<tr>
	              			<td><label>商品詳細</label>&nbsp;&nbsp;</td>
	              			<td><textarea cols="40" rows="4" maxlength="100" placeholder="詳細"></textarea><br><br></td>
	            		</tr>
	            		<tr>
	              			<td><label>材料選択</label>&nbsp;&nbsp;</td>
	              			<td>
	              				<input type="checkbox">&nbsp;小麦&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;卵&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;乳&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;大豆&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;牛肉&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;豚肉&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;鶏肉<br>
	                  			<input type="checkbox">&nbsp;いか&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;エビ &nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;かに&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;いくら&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;りんご&nbsp;&nbsp;
	                  			<input type="checkbox">&nbsp;ゼラチン<br><br>
	              			</td>
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