<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>店舗情報</title>
		<jsp:include page="admin_base/admin_base.jsp" flush="true" />
		<script src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js" charset="UTF-8"></script>
	</head>
	<body>
		<jsp:include page="admin_base/admin_header.jsp" flush="true" />
    	<jsp:include page="admin_base/admin_nav.jsp" flush="true" />
	  <br><br><br>
	  <div class="container">
	    <div class="row">
	      <div class="col-md-10 col-md-offset-1">
	      <s:form class="menu">
	        <s:select list="#{0: '検索内容',1: '店舗名',2: '住所' }" />
	        <s:textfield size="20" name="search" />
	        <s:submit class="btn btn-danger" value="検索" /> <br><br>
	        </s:form>
	        <div id="check">
	          <table class="admin_table store_table">
	            <tr>
	              <th>選択</th>
	              <th>店舗名</th>
	              <th>郵便番号</th>
	              <th>住所</th>
	              <th>電話番号</th>
                  <th>営業時間</th>
                </tr>
				<%--<s:iterator value="adminStoreList"> --%>
	            <tr>
	              <td><s:form><s:textfield type="checkbox" name="box" /></s:form></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	            <tr>
	              <td><s:form><s:textfield type="checkbox" name="box" /></s:form></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	            <tr>
	              <td><s:form><s:textfield type="checkbox" name="box" /></s:form></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	            <tr>
	              <td><s:form><s:textfield type="checkbox" name="box" /></s:form></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	            <tr>
	              <td><s:form><s:textfield type="checkbox" name="box" /></s:form></td>
	              <td>テスト1号店</td>
	              <td>111-1111</td>
	              <td>東京都xx区xx町xxxxxx1111-11</td>
	              <td>090-xxxx-xxxx</td>
	              <td>9:00～20:00</td>
	            </tr>
	           <%--  </s:iterator> --%> 
	          </table>
	        </div>
	      </div>
	    </div>
	    <br><br>
	    <div class="row">
	      <div class="col-md-10 col-md-offset-1" align="center">
	     	<ul class="pagination bg-danger">
			  <li class="disabled"><a href="#">«</a></li>
			  <li class="active"><a href="#">1</a></li>
			  <li><a href="#">2</a></li>
			  <li><a href="#">3</a></li>
			  <li><a href="#">4</a></li>
			  <li><a href="#">5</a></li>
			  <li><a href="#">»</a></li>
			</ul>
	       </div>
	    </div>
	    <div class="row">
	    	<div class="col-md-10 col-md-offset-1" align="right">
	        	<s:submit id="delete" class="btn btn-danger" value="削除" />
	        </div>
	    </div>
	    <br><br>
	    <div class="row">
	      <div class="col-md-10 col-md-offset-1">
	      	<s:form class="menu">
	          <table class="line_del">
	            <tr>
	              <td><label>店舗名</label></td>
	              <td><s:textfield type="text" size="40" placeholder="xx店" /></td>
	            </tr>
	            <tr>
	              <td><label>郵便番号</label></td>
	              <td><s:textfield name="zip11" size="10" maxlength="8" onKeyUp="AjaxZip3.zip2addr(this,'','addr11','addr11');" /></td>
	            </tr>
	            <tr>
	              <td><label>住所</label></td>
	              <td><s:textfield name="addr11" size="40" /></td>
	            </tr>
	            <tr>
	              <td><label>ビル名</label></td>
	              <td><s:textfield type="text" size="40" /></td>
	            </tr>
	            <tr>
                  <td><label>電話番号</label></td>
	              <td><s:textfield type="text" size="40" placeholder="xxx-xxxx-xxxx" /></td>
	            </tr>
	            <tr>
                  <td><label>営業時間</label></td>
	              <td><s:textfield type="time" />～<s:textfield type="time" />
	                  <s:textfield type="checkbox" name="box" /><label>24時間営業</label></td>
	            </tr>
	           </table>
	            <div align="right">
	              <s:submit id="create" class="btn btn-danger padding" value="追加" />
	              <s:submit id="edit" class="btn btn-danger" value="編集" />
	            </div>
	          </s:form> 
	          <br><br>
	      </div>
        </div>
      </div>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
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
	</body>
</html>