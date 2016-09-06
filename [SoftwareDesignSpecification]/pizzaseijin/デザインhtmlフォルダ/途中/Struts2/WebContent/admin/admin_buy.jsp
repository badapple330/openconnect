<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>売り上げ情報</title>
		<jsp:include page="admin_base/admin_base.jsp" flush="true" />
		<script>
		  $( function(){
			  $("#mouth").attr('disabled','disabled');
			  $("#year").attr('disabled','disabled');
			  $("#serch").change( function(){
				  var select = $("#serch").val();
				  if(select == 1){
					  $("#mouth").removeAttr('disabled');
					  $("#year").removeAttr('disabled');
				  }else if(select == 2){
					  $("#mouth").val("0").attr('disabled','disabled');
					  $("#year").removeAttr('disabled');
				  }else {
					  $("#mouth").val("0").attr('disabled','disabled');
					  $("#year").val("").attr('disabled','disabled');
				  }
			  });
		  });
		  history.forward();
		</script>
	</head>
	<body>
		<jsp:include page="admin_base/admin_header.jsp" flush="true" />
    	<jsp:include page="admin_base/admin_nav.jsp" flush="true" />
		<br><br><br>
	    <div class="container">
	    	<div class="row">
	        	<div class="col-md-10 col-md-offset-2">
	        		<select id="serch">
	         			<option value="0">検索内容</option>
	          			<option value="1">月別</option>
	        			<option value="2">年別</option>
	          			<option value="3">全て</option>
	        		</select>
	        		<input type="text" size="8" placeholder="2015" id="year">
	        		<select id="mouth">
	          			<option value="0">月選択</option>
	          			<option>1月</option>
	         			 <option>2月</option>
	         			 <option>3月</option>
	         			 <option>4月</option>
	         			 <option>5月</option>
	         			 <option>6月</option>
	         			 <option>7月</option>
	        			 <option>8月</option>
	         			 <option>9月</option>
	         			 <option>10月</option>
	         			 <option>11月</option>
	        			 <option>12月</option>
	       			</select>
	      		    <input type="submit" class="btn btn-danger" value="検索" /> <br><br>
	      		</div>
	    	</div>
	   		<div class="row">
	       		<div class="col-md-offset-2">
	        		<img src="img/testgurahu.png">
	      		</div>
	      		<br><br>
	    	</div>
	  	</div>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
	</body>
</html>