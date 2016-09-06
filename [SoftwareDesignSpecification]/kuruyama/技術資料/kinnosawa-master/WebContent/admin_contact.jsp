<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><s:text name = "admin_contact.text1"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/message.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/kojin-jquery.js"></script>
    </head>
    <body class="bodyBack">
        <jsp:include page="admin_header.jsp" />
        <div class="container" style="width:1170px;">
            <div class="adminBody">
                <h2><s:text name = "admin_contact.text1"/><s:text name = "admin_contact.text1"/></h2><br>
                <br>
                <div class="text-right">
                    <s:form action="GoAdminContactSearchAction">
                        <s:textfield name="contactName" placeholder="%{getText('admin_contact.text6')}" cssStyle="width:250px"/>
                        <s:submit cssClass="btn btn-default" value="%{getText('admin_contact.text7')}"/>
                    </s:form>
                </div>
                <br>
                <table class="table table-bordered" style="width:100%; background-color:white;">
                    <thead>
                        <th>ID</th><th><s:text name = "admin_contact.text2"/></th><th><s:text name = "admin_contact.text3"/></th><th><s:text name = "admin_contact.text4"/></th><th><s:text name = "admin_contact.text5"/></th>
                    </thead>
                    <tbody>
                        <s:iterator value="list">
                            <tr style="display:none">
                                <td width="13"><s:property value="id"/></td><td width="10%"><s:property value="questionName"/></td><td width="200"><textarea readonly style="width:100%;" rows="5"><s:property value="questionEmail"/></textarea></td>
                                    <td><textarea readonly style="width:100%;" rows="5"><s:property value="questionText"/></textarea></td><td width="10%"><s:property value="createdAt"/></td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
                <font size="5" color="#ff0000" class="text-center"><s:actionmessage /></font>
                <div class="text-center">
                    <ul class="pagination" id="pagination">
                        <li>
                            <a href="javascript:previous()"><span aria-hidden="true">«</span></a>
                        </li>
                        <li>
                            <a href="javascript:select(1)">1</a>
                        </li>
                        <li>
                            <a href="javascript:select(2)">2</a>
                        </li>
                        <li>
                            <a href="javascript:select(3)">3</a>
                        </li>
                        <li>
                            <a href="javascript:select(4)">4</a>
                        </li>
                        <li>
                            <a href="javascript:select(5)">5</a>
                        </li>
                        <li>
                            <a href="javascript:next()"><span aria-hidden="true">»</span></a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="adminFooter">
            </div>
        </div>
        <script src="js/admin_contact.js"></script>
    </body>
</html>