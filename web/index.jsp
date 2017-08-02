<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 11/06/2017
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="bootstrap.jsp"/>
<html>
<head>
</head>
<body>
<s:set var="user_id" value="id" scope="session"/>
<s:set var="user_name" value="firstName" scope="session"/>
<!---->
<jsp:include page="navbar.jsp"/>
<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="img/imgProject/creah4.jpg" class="first-slide" src="" alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Crea</h1>
                    <p>Demuestra tu creatividad creando todas las historias que quieras. Empieza a divertirte.</p>
                    <p><a class="btn btn-lg btn-primary" href="signup.jsp" role="button">Regístrate ahora</a></p>

                </div>
            </div>
        </div>
        <div class="item">
            <img src="img/imgProject/leeh.png" class="second-slide" src="" alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Lee</h1>
                    <p>Los amantes por la lectura nos prefieren, regístrate y ve sus historias.</p>
                    <p><a class="btn btn-lg btn-primary" href="signup.jsp" role="button">Regístrate ahora</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="img/imgProject/compiteh.jpg" class="third-slide" src="" alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Compite</h1>
                    <p>Demuestra que puedes crear historias mejor que cualquiera. Confiamos en ti</p>
                    <p><a class="btn btn-lg btn-primary" href="signup.jsp" role="button">Regístrate ahora</a></p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div><!-- /.carousel -->
<b:container>

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

        <!-- Three columns of text below the carousel -->
        <div class="row">
            <div class="col-lg-4">
                <img class="img-circle" src="img/imgProject/icoescr.png" alt="Generic placeholder image" width="140" height="140">
                <h2>Crea</h2>
                <p>En esta sección podrás plasmar tu imaginación en la web, te brindaremos palabras la cual deberás utilizar en tus oraciones, y asi darles un sentido a tu historia </p>
                <p><a class="btn btn-default" href="write.jsp" role="button">Ir &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
            <div class="col-lg-4">
                <img class="img-circle" src="img/imgProject/icolee.png" alt="Generic placeholder image" width="140" height="140">
                <h2>Lee</h2>
                <p> Como todo buen lector que eres, hemos puesto a tu disposión este apartado para que puedas cautivarte con las creaciones de tus colegas.</p>
                <p><a class="btn btn-default" href="stories.jsp" role="button">Ir &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
            <div class="col-lg-4">
                <img class="img-circle" src="img/imgProject/icocomp.png" alt="Generic placeholder image" width="140" height="140">
                <h2>Compite</h2>
                <p>Ahora podras retar a todos los creadores demostrando que tus habilidades pueden super a cualquiera, no te limites y deja volar tu imaginación.</p>
                <p><a class="btn btn-default" href="#" role="button">Ir &raquo;</a></p>
            </div><!-- /.col-lg-4 -->
        </div><!-- /.row -->


        <hr class="featurette-divider" style="color: #000">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">Creación <span class="text-muted"></span></h2>
                <p class="lead">.</p>
            </div>
            <div class="col-md-5">
                <img src="img/imgProject/creah2.jpg" class="featurette-image img-responsive center-block" src="https://dummyimage.com/500x500/b3b3b3/ffffff.jpg&text=+">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7 col-md-push-5">
                <h2 class="featurette-heading">Lectura <span class="text-muted"></span></h2>
                <p class="lead">.</p>
            </div>
            <div class="col-md-5 col-md-pull-7">
                <img src="img/imgProject/leer2.jpg" class="featurette-image img-responsive center-block" src="https://dummyimage.com/500x500/b3b3b3/ffffff.jpg&text=+">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">Competencia <span class="text-muted"></span></h2>
                <p class="lead"> .</p>
            </div>
            <div class="col-md-5">
                <img src="img/imgProject/compiteh2.jpg" class="featurette-image img-responsive center-block" src="https://dummyimage.com/500x500/b3b3b3/ffffff.jpg&text=+">
            </div>
        </div>
    </div>
</b:container>
<jsp:include page="footer.jsp"/>
</body>
</html>
