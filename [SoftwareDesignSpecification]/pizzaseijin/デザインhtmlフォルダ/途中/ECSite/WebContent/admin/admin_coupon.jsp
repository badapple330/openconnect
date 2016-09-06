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
	      		<div class="col-md-10 col-md-offset-2">
	        		<select>
	          			<option>検索内容</option>
	          			<option>クーポン名</option>
	          			<option>割引(%)</option>
	          			<option>開始日時</option>
	          			<option>期間</option>
	        		</select>
	        		<input type="text" size="20">
	        		<input type="submit" class="btn btn-danger" value="検索" /> <br><br>
	        		<div id="check">
	          			<table class="admin_table">
	           				<tr>
	              				<th>選択</th>
	              				<th>クーポン名</th>
	              				<th>割引(％)</th>
	              				<th>開始日時</th>
                  				<th>期間</th>
               				</tr>
	            			<tr>
	              				<td><input type="checkbox" name="box"></td>
	              				<td>2000円以下クーポン券</td>
	              				<td>5</td>
	              				<td>xxxx年xx月xx日</td>
	              				<td>60日</td>
	            			</tr>
	            			<tr>
	              				<td><input type="checkbox" name="box"></td>
	              				<td>5000円以下クーポン券</td>
	              				<td>10</td>
	              				<td>xxxx年xx月xx日</td>
	              				<td>90日</td>
	            			</tr>
	            			<tr>
	              				<td><input type="checkbox" name="box"></td>
	              				<td>10000円以下クーポン券</td>
	              				<td>20</td>
	              				<td>xxxx年xx月xx日</td>
	              				<td>50日</td>
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
	              			<td><label>クーポン名</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40"></td>
	           			</tr>
	            		<tr>
	              			<td><label>割引率</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40" placeholder="(％)数値を記載"></td>
	           			</tr>
	            		<tr>
	              			<td><label>期間</label>&nbsp;&nbsp;</td>
	              			<td><input type="text" size="40" placeholder="(日)で記載"></td>
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