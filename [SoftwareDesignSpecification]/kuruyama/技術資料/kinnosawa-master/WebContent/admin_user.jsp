<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:property value="getText('admin_user.manegement')" /></title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/kojin-style.css">
<link rel="stylesheet" href="css/pagination_style.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/jquery.pagination.js"></script>
<script src="js/kojin-jquery.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body class="bodyBack">
<jsp:include page="admin_header.jsp"/>
    <div class="container" style="width:1170px;">
        <div class="adminBody">
            <h2><s:property value="getText('admin_user.information_manegement')" /></h2>
            <br>
            <br>
            <div class="text-right">
                <s:form method="post" action = 'AdminUserSearchAction' styleClass="form-contorol">
           		<s:textfield name = "user" placeholder ="%{getText('admin_user.enter_username')}" style="width:250px"/>
               <s:submit value ="%{getText('admin_user.search')}" cssClass="btn btn-default"/>
               </s:form>

                <s:form method="post" action = 'AdminUserDeleteAction' styleClass="form-contorol">
           		<s:textfield name = "userId" placeholder = "%{getText('admin_user.enter_userID')}" style="width:250px"/>
               <s:submit value ="%{getText('admin_user.delete')}" cssClass="btn btn-default"/>
               </s:form>
            </div>
            <br>
             <div class="h2 text-center text-danger"><s:property value = "message" />
             <s:property value="errorDelete"/><s:actionmessage style="list-style:none;"/></div>
            <table class="table table-bordered" style="width:100%; background-color:white;">

                <thead>
                        <th><s:property value="getText('admin_user.id')" /></th>
                        <th><s:property value="getText('admin_user.name')" /></th>
                        <th><s:property value="getText('admin_user.telephone')" /></th>
                        <th><s:property value="getText('admin_user.address')" /></th>
                </thead>
                <tbody >
                   <s:iterator value="userList">
                <tr class="li">
                   <td><s:property value="id"/></td>
                   <td><s:property value="userName"/></td>
                   <td><s:property value="tel"/></td>
                   <td><s:property value="address"/></td>
                </tr>
					</s:iterator>
                </tbody>
            </table>
            <div class="text-center">
           <s:if test="userList.size()>0">
           <div class="pager"></div>
           </s:if>
         </div>
         <br>
        </div>
        <div class="adminFooter">
        </div>

    </div>

</body>
</html>
