<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="admin_item.GoodsManagement" /></title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/pagination_style.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.pagination.js"></script>
<script src="js/kojin-jquery.js"></script>

</head>
<body class="bodyBack">
<jsp:include page="admin_header.jsp"/>
    <div class="container" style="width:1170px;">

        <div class="adminBody">
            <h2><s:text name="admin_item.GoodsManagementScreen" /></h2>
            <br>
            <br>
            <div class="text-right">
            <form id="imageFileTransmitForm" name="imageFileTransmitForm" action="ImageFileTransmitfileUpload" enctype="multipart/form-data" method="post">
<s:text name="admin_item.upload" /><br>
				<div align="right"><input id="file" type="file"name="form.uploadFile" accept="image/*" style="display:none" />
				<input id="text" type="text" value=<s:text name="admin_item.select"/>><input id="button" type="hidden" class="btn btn-default" />
				<s:submit cssClass="btn btn-default" value="UP" /></div>
</form>
 <form id="imageFileTransmitForm" name="imageFileTransmitForm" action="ImageFileTransmitfileUploadSet" enctype="multipart/form-data" method="post">

<s:text name="admin_item.setUpload" /><br>
	<div align="right"><input id="sfile" type="file"name="form.uploadFile" accept="image/*" style="display:none" />

<input id="stext" type="text"  value=<s:text name="admin_item.select"/>>
<input id="sbutton" type="hidden" class="btn btn-default" /><s:submit cssClass="btn btn-default" value="UP" /></div>
</form>
<br>
<script type="text/javascript">
    var file = document.getElementById( 'file' );
    var text = document.getElementById( 'text' );
    var button = document.getElementById( 'button' );
    var sfile = document.getElementById( 'sfile' );
    var stext = document.getElementById( 'stext' );
    var sbutton = document.getElementById( 'sbutton' );


    file.onchange = function()
    {
        text.value = this.value;
    }

    text.onclick = button.onclick = function()
    {
        // type="file"要素のclickイベントを発生させる
        file.click();
    }


    sfile.onchange = function()
    {
        stext.value = this.value;
    }

    stext.onclick = sbutton.onclick = function()
    {
        // type="file"要素のclickイベントを発生させる
        sfile.click();
    }
</script>

                 <button type="button" class="btn btn-default sm" data-toggle="modal" data-target="#sampleModal" style="width: 55px" ><s:text name="admin_item.add" /></button>
                <s:form action="AdminItemSearchAction" method="post">
                    <s:textfield  placeholder="%{getText('admin_item.searchEnter')}" style="width:250px" name="goodsName" value=""/>
                    <s:submit cssClass="btn btn-default" value="%{getText('admin_item.search')}"/>
                </s:form>
                <s:form action="AdminItemDeleteAction" method="post">
                    <s:textfield placeholder="%{getText('admin_item.deleteEnter')}" style="width:250px" name="itemId" value=""/>
 					 <s:submit cssClass="btn btn-default" value="%{getText('admin_item.delete')}" />
                </s:form>
                <!-- モーダル・ダイアログ -->
            <div class="modal fade" id="sampleModal" tabindex="-1">
	           <div class="modal-dialog">
		          <div class="modal-content">
                     <div class="modal-header">
                     <button type="button" class="close btn "style=font-size:30px; data-dismiss="modal">×</button>
                        <div class="text-center" >
                            <h3 style="font-weight:bold"><s:text name="admin_item.itemAdd" /></h3>
                        </div>
                    </div>
			        <div class="modal-body">
                        <s:form method="post" action="AdminItemInsertAction" >
                            <div class="text-center">
                                <div class="left">
                                    <label><s:text name="admin_item.itemName" />:</label><br>
                                    <s:textfield maxlength='9' placeholder="%{getText('admin_item.itemName')}" name="name" value=""/><br>
                                    <label><s:text name="admin_item.price" /><s:text name="admin_item.numberInfo" />:</label><br>
                                    <s:textfield type="number" min="0" step="0.1" placeholder="%{getText('admin_item.price')}" name="price" value=""/><br>
                                    <label><s:text name="admin_item.itemDetail" />:</label><br>
                                    <s:textarea maxlength='100' cols="50" rows="5" placeholder="%{getText('admin_item.itemDetail')}" name="detail" value=""></s:textarea><br>
                                    <label><s:text name="admin_item.imgPath" />:</label><br>
                                    <select name="imgPath">
                                    <s:iterator value="imageList">
                                    <option value=<s:property />><s:property /></option>
                                     </s:iterator>
                                    </select>

                                    <br>
                                     <label><s:text name="admin_item.setImgPath" />:</label><br>
                                    <select name="setImgPath">
                                    <s:iterator value="setImageList">
                                    <option value=<s:property />><s:property /></option>
                                     </s:iterator>
                                    </select>
                                   <br>
                                     <label><s:text name="admin_item.allergie" />:</label><br>
                                    <s:textfield placeholder="%{getText('admin_item.allergie')}" name="allergie" value=""/><br>
                                    <label><s:text name="admin_item.category" />:</label><br>
                                    <s:radio name="category" list="#{'焼き菓子':'焼き菓子','まんじゅう':'まんじゅう','餅菓子':'餅菓子'}" value="#{'焼き菓子'}"/><br>
									 <s:radio name="category" list="#{'ようかん':'ようかん','その他':'その他'}"/>
                                    <br>
                                     <label><s:text name="admin_item.closeUp" />:</label><br>
                                    <s:checkbox name="closeUp" value="0"/><s:text name="admin_item.closeUp" />
                                    <br>
                                    <label><s:text name="admin_item.topPage" />:</label><br>
                                    <s:checkbox name="topPage" value="0"/><s:text name="admin_item.topPage" />
                                    <br>
                                    </div>
                                </div>
                            <hr>
                            <div class="text-right">
                                <s:submit cssClass="btn btn-primary" style="height:35px font-weight:bold" value="%{getText('admin_item.add')}" />
                                <button type="button" class="btn btn-default" data-dismiss="modal" style="font-weight:bold"><s:text name="admin_item.return" /></button>
			                </div>
                        </s:form>
                      </div>
		          </div>
	           </div>
            </div>
            </div>
            <br>
             <s:property value = "images[i]" />
                            <div class="h2 text-center text-danger">
                            <s:property value="messageImg" />
							<s:property value="messageSetImg" />
							<s:property value = "message" />
							<s:actionmessage style="list-style:none;"/></div>
            <div class="table-responsive">
            <table class="table table-bordered text-nowrap " style="width:100%; background-color:white;">
                <thead>
                        <th><s:text name="admin_item.itemId" /></th>
                        <th><s:text name="admin_item.itemName" /></th>
                        <th><s:text name="admin_item.price" /></th>
                        <th><s:text name="admin_item.allergie" /></th>
                        <th><s:text name="admin_item.category" /></th>
                        <th><s:text name="admin_item.closeUp" /></th>
                        <th><s:text name="admin_item.topPage" /></th>
                        <th><s:text name="admin_item.createDate" /></th>
                        <th><s:text name="admin_item.itemDetail" /></th>
                        <th><s:text name="admin_item.imgPath" /></th>
                        <th><s:text name="admin_item.setImgPath" /></th>
                </thead>
                   <s:iterator value="itemList">
                <tbody class="li">
                    <tr>
                        <td><s:property value="id"/></td>
                        <td><s:property value="name"/></td>
                        <td><s:property value="price"/></td>
                        <td><s:property value="allergie"/></td>
                        <td><s:property value="category"/></td>
                        <td><s:property value="closeUp"/></td>
                        <td><s:property value="topPage"/></td>
                        <td><s:property value="createdDate"/></td>
                        <td><s:property value="detail"/></td>
                        <td><s:property value="imgPath"/></td>
                        <td><s:property value="setImgPath"/></td>
                    </tr>
                </tbody>
                     </s:iterator>
            </table>
            </div>
      			<div class="text-center">
				<s:if test="itemList.size() > 0"><div class="pager"></div></s:if>
				<br>
			</div>
        </div>
        <div class="adminFooter">
        </div>
    </div>
<script src="js/imgGet.js"></script>
</body>
</html>