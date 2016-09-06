<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<script type="text/javascript">
window.onload = outline;
function outline (){
 var tgt = function (){ this.blur() };
 for (var i = 0; i < document.links.length; i++)
 document.links[i].onfocus = tgt;
}
</script>

<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<jsp:include page="base/navi.jsp" flush="true" />
	<div class="conntainer">
		<div class="row">
			<div class="col-xs-5">
			<s:form action ="event-list" method="get" cssClass="form-inline">
			<label class="text-info">イベント名で検索ができます(部分一致検索可)</label>
				<s:textfield  placeholder="イベント名を入力" name="name" cssClass="form-control" />
				<INPUT type="submit"value="検索" class="btn btn-info" onfocus="this.blur();" />
			</s:form>
			</div><!-- col-xs-5 col-xs-offset-3 -->
		</div><!-- row -->
		<div class="row">
			<div>
				<table class="table table-striped table-bordered table-hover table-condensed table-responsive">
					<tr>
						<th>イベントID</th>
						<th>イベント名</th>
						<th>イベント日</th>
						<th>イベント詳細</th>
						<th>イベント価格</th>
						<th>申し込み限度</th>
						<th>申し込み残数</th>
						<th>イベント登録日</th>
						<th>イベント更新日</th>
						<th>カテゴリID</th>
						<th>画像パス</th>
						<th width="20">削除</th>
					</tr>
					<s:iterator value="adminEventList">
						<tr>
							<td align="center" width="100"><s:property value="id" /></td>
							<td align="center" width="100" class="info"><s:property value="name" /></td>
							<td align="center" width="100"><s:property value="eventDate" /></td>
							<td align="center" width="100"><s:property value="detail" /></td>
							<td align="center" width="100"><s:property value="price" /></td>
							<td align="center" width="100"><s:property
									value="numOfTickets" /></td>
							<td align="center" width="100"><s:property value="remaining" /></td>
							<td align="center" width="100"><s:property value="createdAt" /></td>
							<td align="center" width="100"><s:property value="updatedAt" /></td>
							<td align="center" width="100"><s:property
									value="categoryId" /></td>
							<td align="center" width="100"><s:property value="imgPath" /></td>
							<td align="center"><s:form action="event-delete">
									<s:hidden name="id" value="%{id}" />
									<s:submit value="削除"  cssClass="btn btn-danger" onclick="return confirm('データベース上からも削除されますが本当によろしいですか？');" onfocus="this.blur();"></s:submit>
								</s:form></td>
						</tr>
					</s:iterator>
				</table>
				<div class="row">
					<div class="col-xs-6 col-xs-offset-3">
						<ul class="pagination pagination-lg">
						<s:if test="page == 0">
							<li class="disabled"><a class="back" href=event-list?page=${page-5} aria-label="前のページへ"> 
							<span aria-hidden="true">«</span>
							</a></li>
						</s:if>
						<s:else>
							<li><a href=event-list?page=${page-5} aria-label="前のページへ"> 
							<span aria-hidden="true">«</span>	
							</a></li>					
						</s:else>
						
						<s:if test="page == 0">
							<li class="active"><a href=event-list?page=0>1</a></li>
 						    <li><a href=event-list?page=5>2</a></li>
   						    <li><a href=event-list?page=10>3</a></li>
						    <li><a href=event-list?page=15>4</a></li>
						    <li><a href=event-list?page=20>5</a></li>
						</s:if>
						<s:elseif test="page == 5">
							<li><a href=event-list?page=0>1</a></li>
 						    <li class="active"><a href=event-list?page=5>2</a></li>
   						    <li><a href=event-list?page=10>3</a></li>
						    <li><a href=event-list?page=15>4</a></li>
						    <li><a href=event-list?page=20>5</a></li>
						</s:elseif>
						<s:elseif test="page == 10">
							<li><a href=event-list?page=0>1</a></li>
 						    <li><a href=event-list?page=5>2</a></li>
   						    <li class="active"><a href=event-list?page=10>3</a></li>
						    <li><a href=event-list?page=15>4</a></li>
						    <li><a href=event-list?page=20>5</a></li>
						</s:elseif>
						<s:elseif test="page == 15">
							<li><a href=event-list?page=0>1</a></li>
 						    <li><a href=event-list?page=5>2</a></li>
   						    <li><a href=event-list?page=10>3</a></li>
						    <li class="active"><a href=event-list?page=15>4</a></li>
						    <li><a href=event-list?page=20>5</a></li>
						</s:elseif>
 						<s:elseif test="page == 20">
							<li><a href=event-list?page=0>1</a></li>
 						    <li><a href=event-list?page=5>2</a></li>
   						    <li><a href=event-list?page=10>3</a></li>
						    <li><a href=event-list?page=15>4</a></li>
						    <li  class="active"><a href=event-list?page=20>5</a></li>
						</s:elseif>
  						<s:else>
							<li class="active"><a href=event-list?page=0>1</a></li>
 						    <li><a href=event-list?page=5>2</a></li>
   						    <li><a href=event-list?page=10>3</a></li>
						    <li><a href=event-list?page=15>4</a></li>
						    <li  class="active"><a href=event-list?page=20>5</a></li>
						</s:else>
 
						<s:if test="page == 20">
							<li class="disabled"><a class="next" href=event-list?page=${page+5} aria-label="次のページへ"> 
							<span aria-hidden="true">»</span>
							</a></li>
						</s:if>
						<s:else>
							<li><a href=event-list?page=${page+5} aria-label="次のページへ"> 
							<span aria-hidden="true">»</span>	
							</a></li>					
						</s:else>	
						</ul><!-- pagination -->
					</div><!-- col-xs-6 col-xs-offset-3 -->
				</div><!-- row -->
			</div><!-- col-xs-5 col-xs-offset-3 -->
		</div><!-- /row -->
	</div><!-- /container -->
	<jsp:include page="base/footer.jsp" flush="true" />
	<script>
	$(function() {
    	$('a.back').click(function(){
        	return false;
    	});
    	$('a.next').click(function(){
        	return false;
    	});
	});
	</script>
</body>
</html>