<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>売り上げ情報</title>
		<jsp:include page="admin_base/admin_base.jsp" flush="true" />
		<script>
		  $(function(){
			  $("#delete").attr('disabled','disabled');
			  $("#check").click(function(){
				  var count = $('#check :checked').length;
				  if(count == 0){
					  $("#delete").attr('disabled','disabled');
				  } else {
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
				<div class="col-md-10 col-md-offset-1">
				    <select>
	          			<option>検索内容</option>
	          			<option>ユーザー名</option>
	         			<option>商品名</option>
	        		</select>
	       			<input type="text" size="20">
	        		<input type="submit" class="btn btn-danger" value="検索" /> <br><br>
					<div class="x_scroll">
						<div id="check">
							<table class="sctable">
								<tr>
									<th>選択</th>
									<th>ユーザー名</th>
									<th>商品名</th>
									<th>評価</th>
									<th>レビュー内容</th>
								</tr>
								<tr>
									<td><input type="checkbox" name="box"></td>
									<td>山田花子</td>
									<td>熟成ビーフ</td>
									<td>4</td>
									<td>牛バラ肉をじっくり熟成させて旨味を凝縮がされていて、お肉と相性抜群のBBQソースが、熟成ビーフのおいしさを引き立ててました。</td>
								</tr>
								<tr>
									<td><input type="checkbox" name="box"></td>
									<td>竹下隆</td>
									<td>イベリコ豚のトマトソース</td>
									<td>3.5</td>
									<td>大きめにカットしたイベリコ豚をふんだんに使い、トマトソースで仕上げていました。</td>
								</tr>
								<tr>
									<td><input type="checkbox" name="box"></td>
									<td>斉藤隆</td>
									<td>ギガ･ミート</td>
									<td>5</td>
									<td>ボリューム満点、おいしさギガクラスのミートミックス。もりもり食べて、みんな大満足でした。</td>
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
		</div>
	  	<jsp:include page="admin_base/admin_footer.jsp" flush="true" />
	</body>
</html>