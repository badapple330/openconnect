<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><s:text name = "company_info.text1"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>

    </head>
    <body background="images/washi.jpg">
        <jsp:include page="header.jsp" />
        <div class="container" style="width:1170px;">
            <div class="company">
                <h2 class="text-center sideMenu"><s:text name = "company_info.text1"/></h2>
                <hr>
                <div class="row text-justify">
                    <div class="col-sm-12 col-md-12 col-lg-12 col-xs-12">
                        <h2 class="bg-info"><s:text name = "company_info.text2"/></h2>
                        <ul class="info">
                            <li><a href="#info01" ><h4><s:text name = "company_info.text3"/></h4></a></li>
                            <li><a href="#info02" ><h4><s:text name = "company_info.text4"/></h4></a></li>
                            <li><a href="#info03" ><h4><s:text name = "company_info.text5"/></h4></a></li>
                        </ul>
                        <a id ="info01"></a>
                        <h2 class="bg-info"><s:text name = "company_info.text3"/></h2>
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td> <strong><s:text name = "company_info.text6"/></strong></td><td><s:text name = "company_info.text7"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text8"/></strong></td><td><s:text name = "company_info.text9"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text10"/></strong></td><td><s:text name = "company_info.text11"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text12"/></strong></td><td><s:text name = "company_info.text13"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text14"/></strong></td><td><s:text name = "company_info.text15"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text16"/></strong></td><td><s:text name = "company_info.text17"/></td>
                                </tr>
                                <tr>
                                    <td><strong><s:text name = "company_info.text18"/></strong></td><td><s:text name = "company_info.text19"/></td>
                                </tr>
                            </tbody>
                        </table>
                        <a id ="info02"></a>
                        <h2 class="bg-info"><s:text name = "company_info.text4"/></h2>
                        <table class="table">
                            <tr>
                                <td><strong>2016.02.03</strong></td><td><s:text name = "company_info.text20"/></td>
                            </tr>
                            <tr>
                                <td><strong>2016.02.26</strong></td><td><s:text name = "company_info.text21"/></td>
                            </tr>
                        </table>
                        <a id ="info03"></a>
                        <h2 class="bg-info"><s:text name = "company_info.text5"/></h2>
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d809.9784672933268!2d139.76656248809596!3d35.703737087793904!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zMzXCsDQyJzEzLjQiTiAxMznCsDQ2JzAxLjYiRQ!5e0!3m2!1sja!2sjp!4v1451889753874"
                            width="600" height="450" style="border:0"></iframe><br/>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp" />
    </body>
</html>