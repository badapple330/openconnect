<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><s:text name = "question.text1"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/message.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
    </head>
    <body background="images/washi.jpg">
        <jsp:include page="header.jsp" />
        <div class="container" style="width:1170px;">
            <div class="question">
                <h2 class="text-center sideMenu"><s:text name = "question.text1"/></h2>
                <h4 class="text-center"><s:text name = "question.text3"/>
                    <br><s:text name = "question.text4"/></h4>
                <font size="5" color="#ff0000" class="text-center"><s:actionmessage /><s:fielderror/></font>
                <s:form action="GoQuestionFromSendAction">
                    <table class="questionTable">
                        <tr>
                            <td><s:text name = "question.text5"/></td><td><s:textfield name="questionName" size="25" placeholder="%{getText('question.text8')}"></s:textfield></td>
                        </tr>
                        <tr>
                            <td><s:text name = "question.text6"/></td><td><s:textfield name="questionEmail" size="50" placeholder="%{getText('question.text9')}"></s:textfield></td>
                        </tr>
                        <tr>
                            <td><s:text name = "question.text7"/></td><td><s:textarea name="questionText" cssClass="box380" cols="60" rows="20" placeholder="%{getText('question.text10')}"></s:textarea></td>
                        </tr>
                    </table>
                    <div class="send">
                        <s:submit value="%{getText('question.text2')}" cssClass="btn btn-success"/>
                    </div>
                </s:form>
            </div>
        </div>
        <jsp:include page="footer.jsp" />
    </body>
</html>