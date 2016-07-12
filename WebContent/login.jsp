<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Open Connect -ログイン</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <script src="js/bootstrap.js"></script>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-default navbar-static-top">
                <div class="container">
                    <div class="navbar-header">
                        <h1><a href="index.jsp">Open Connect</a></h1>
                    </div>
                </div>
            </nav>
        </header>
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    <s:form theme="simple" id="inner" class="form-horizontal" action="LoginAction">
                        <div class="form-group">
                            <label class="col-sm-3">メールアドレス</label>
                            <s:textfield class="col-sm-5" name="email" value="" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3">パスワード</label>
                            <s:password class="col-sm-5" name="password" value="" />
                        </div>
                        <div class="form-group">
                            <div >
                            <s:submit name="submit" value="ログイン" />
                            </div>
                        </div>
                    </s:form>
                </div>
            </div>
        </div>
    </body>
</html>