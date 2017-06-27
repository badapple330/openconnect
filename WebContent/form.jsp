<%@ taglib prefix = "s" uri= "/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/dropdown.css">


<div class = "nonbs-send-form">

<div class="nonbs-panel-body">
<s:form action="PostSetAction">
	<div class="nonbs-form-group">
    	<textarea name="postContents" class="nonbs-form-control" maxlength="255" ></textarea>
	</div><s:hidden name="receiverId" /><s:hidden name="groupId" /><s:hidden name="groupName" /><s:hidden name="friendsName" />
<div class="nonbs-rightside">
<button type="submit" class="btn btn-default" onclick="disabled = true;">送信</button>
</div>
</s:form>
</div>
</div>

<!-- スタンプ -->
<div class="stamp-form">
<button type="button" class="stamp-btn" data-toggle="modal" data-target="#stamp"> <img height=20px; src="pic/stamp/icon.png">
</button>
</div>


<div class="modal fade" id="stamp" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
				<h6 class="modal-title">スタンプ</h6>
			</div>

			<div class="m-http://localhost:8080/openconnect/PostAction.action#body">
				<ul id="normal" class="dropmenu">
					<s:iterator value="stList">
					<li><a href="#"><img src="<s:property value="typeUrl"/>" height="50px"></a>
  						<div class="stamps">
  						<s:iterator value="typedStampList">
     						<s:form action="PostSetAction">
								<s:hidden name="receiverId" /><s:hidden name="groupId" /><s:hidden name="groupName" /><s:hidden name="friendsName" />
								<s:hidden name="url" />
								<button type="submit"><img class="imgzoon" src="<s:property value="url"/>"></button>
							</s:form>
						</s:iterator>
						</div>
					</li>
 	 				</s:iterator>
				</ul>
			</div>

		</div>
	</div>
</div>

</html>