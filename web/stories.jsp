<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 05/07/2017
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<jsp:include page="bootstrap.jsp"/>
<jsp:include page="navbar.jsp"/>

<html>
<head>
    <title>CuentaHistorias</title>
    <style>
        .im{
            display: flex;
            justify-content: center;
        }
    </style>
</head>
<body>

<b:container>
    <b:jumbotron title="Sample">
        <h1>Navbar example</h1>
        <p>This example is a quick exercise to illustrate how the default, static and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>
        <p>To see the difference between static and fixed top navbars, just scroll.</p>
    </b:jumbotron>
</b:container>

<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="thumbnail">
                <div class="row">
                    <a href="detail.jsp"><div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 im">
                        <img src="https://dummyimage.com/190x190/757075/ffffff.jpg&text=+">
                    </div></a>
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                        <div class="caption">
                            <h3>Título</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua...</p>
                            <p>
                                <img class="img-circle" src="img/profile.jpg" alt="Generic placeholder image" width="40" height="40">
                                <strong>Author, Author</strong>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="thumbnail">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 im">
                        <img src="https://dummyimage.com/190x190/757075/ffffff.jpg&text=+">
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                        <div class="caption">
                            <h3>Título</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua...</p>
                            <p>
                                <img class="img-circle" src="img/profile.jpg" alt="Generic placeholder image" width="40" height="40">
                                <strong>Author, Author</strong>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--------------------------------------------------------------------------------------------------------------->
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="thumbnail">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 im">
                        <img src="https://dummyimage.com/190x190/757075/ffffff.jpg&text=+">
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                        <div class="caption">
                            <h3>Título</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua...</p>
                            <p>
                                <img class="img-circle" src="img/profile.jpg" alt="Generic placeholder image" width="40" height="40">
                                <strong>Author, Author</strong>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="thumbnail">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 im">
                        <img src="https://dummyimage.com/190x190/757075/ffffff.jpg&text=+">
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                        <div class="caption">
                            <h3>Título</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua...</p>
                            <p>
                                <img class="img-circle" src="img/profile.jpg" alt="Generic placeholder image" width="40" height="40">
                                <strong>Author, Author</strong>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

<jsp:include page="footer.jsp"/>
</b:container>
</body>
</html>
