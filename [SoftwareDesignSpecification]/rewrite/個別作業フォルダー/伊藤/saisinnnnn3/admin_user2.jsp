<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" href="css/admin_user.css">
<script type="text/javascript" src="js/admin_user.js"></script>
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
<title>ユーザー管理</title>
</head>
<script>
$(function() {
	var page = 0, page_last = 0, line = 2;
	( function __construct() {
		page_last = Math.ceil( $("#list_body tr").length / line ) - 1;
		for( var i=0; i<=page_last; i++ ) {
			$("#page_number").append( $("<li></li>").html(i+1) );
		}
	})();
	function set_ctrl_style(){
		$('#page_number').children().removeClass("current_page");
		$('#page_first, #page_prev, #page_next, #page_last').removeClass("terminal");
		$("#page_number li").each(function(){
			if( $(this).html()-1 == page ) $(this).addClass("current_page");
		});
		if( page == 0 ) {
			$('#page_before li').addClass("terminal");
		}
		else if( page == page_last ) {
			$('#page_after li').addClass("terminal");
		}
	}
	function draw() {
		$('#list_body tr').hide();
		$('#list_body tr:first, #list_body tr:gt('+page * line +'):lt('+line+')').show();
		set_ctrl_style();
	}
	$("#page_number li").click(function() {
		page = $(this).html()-1;
		draw();
	});
	$('#page_first').click(function() {
		page = 0;
		draw();
	});
	$('#page_last').click(function() {
		page = page_last;
		draw();
	});
	$('#page_prev').click(function() {
		if (page > 0) page--;
		draw();
	});
	$('#page_next').click(function() {
		if ( page < page_last ) page++;
		draw();
	});
	draw();
});
</script>
<body>
	<P>利用者一覧</P>
	＊チェックボックスに、チェックをいれて編集・削除を行う。
	<s:form id='form' nam='form'>
		<table>
			<tbody id="list_body">
				<tr>
					<th>ユーザーID</th>
					<th>name</th>
					<th>email</th>
					<th>削除/編集</th>
				</tr>
				<s:iterator value="UserList">
					<tr>
						<td><s:property value="user_id" /></td>
						<td><input type="text" name="nameList"
							value="<s:property value="name" />"></td>
						<td><input type="text" name="emailList"
							value="<s:property value="email" />"></td>
						<td><input type="checkbox" name="checkList"
							value="<s:property value="user_id" />"></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<input type="submit" value="削除" onclick="actionA();">
		<input type="submit" value="編集" onclick="actionB();">
	</s:form>
	<div id="page_ctrl">
		<ul id="page_before">
			<li id="page_prev">prev</li>
		</ul>
		<ul id="page_number"></ul>
		<ul id="page_after">
			<li id="page_next">next</li>
		</ul>
	</div>
</body>
</html>