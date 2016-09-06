<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>クーポン情報</title>
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
	      		<div class="col-md-7 col-md-offset-3">
	        		<div class="x_scroll">
	        			<div id="check">
	          				<table class="sctable">
	           					<tr>
	              					<th>選択</th>
	              					<th>クーポン名</th>
	              					<th>割引(％)</th>
	              					<th>配布条件</th>
	              					<th>配布開始日</th>
	              					<th>配布終了日</th>
                  					<th>有効期限</th>
               					</tr>
	            				<tr>
	              					<td><input type="checkbox" name="box"></td>
	              					<td>2000円以下クーポン券</td>
	              					<td>5</td>
	              					<td>○○円以上</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>60日</td>
	            				</tr>
	            				<tr>
	              					<td><input type="checkbox" name="box"></td>
	              					<td>5000円以下クーポン券</td>
	              					<td>10</td>
	              					<td>○○円以上</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>90日</td>
	            				</tr>
	            				<tr>
	              					<td><input type="checkbox" name="box"></td>
	              					<td>10000円以下クーポン券</td>
	              					<td>20</td>
	              					<td>○○円以上</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>xxxx年xx月xx日</td>
	              					<td>50日</td>
	            				</tr>
	          				</table>
	        			</div>
	      			</div>
	    		</div>
	    	</div>
	    	
	    	<br><br>
	    	<div class="row">
	      		<div class="col-md-7 col-md-offset-3" align="right">
	        		<input type="submit" id="delete" class="btn btn-danger" value="削除">
	     		</div>
	    	</div>
	    	<br><br>
	    	<div class="row">
	      		<div class="col-md-7 col-md-offset-3">
	          		<table class="line_del">
	            		<tr>
	              			<td><label>クーポン名</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40"></td>
	           			</tr>
	            		<tr>
	              			<td><label>割引率</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40" placeholder="(％)数値を記載"></td>
	           			</tr>
	            		<tr>
	              			<td><label>配布条件</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40" placeholder="○○円以上"></td>
	            		</tr>
	            		<tr>
	              			<td><label>配布開始日</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="10" placeholder="××××">年
	              				<input type="text" size="5" placeholder="××">月
	              				<input type="text" size="5" placeholder="××">日</td>
	            		</tr>
	            		<tr>
	              			<td><label>配布終了日</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="10" placeholder="××××">年
	              				<input type="text" size="5" placeholder="××">月
	              				<input type="text" size="5" placeholder="××">日</td>
	            		</tr>
	            		<tr>
	              			<td><label>有効期限</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40" placeholder="(日)で記載"></td>
	            		</tr>
	            	</table>
	            	<div align="right">
	              		<input type="submit" id="create" class="btn btn-danger padding" value="追加" />
	              		<input type="submit" id="edit" class="btn btn-danger" value="編集" />
	          		</div>
	          		<br><br>
	      		</div>
        	</div>
      	</div>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
	</body>
</html>