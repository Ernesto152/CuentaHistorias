<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 07/07/2017
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="bootstrap.jsp"/>
<jsp:include page="navbar.jsp"/>
<html>
<head>
    <tittle>CuentaHistorias</tittle>
</head>
<body>
<b:container>
    <b:jumbotron tittle="Sample">
        <h1>Navbar example</h1>
        <p>This example is a quick exercise to illustrate how the default, static and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>
    </b:jumbotron>
</b:container>
<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-10 col-md-offset-1 col-lg-10 col-md-offset-1">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-2 col-lg-2">
                    <p>
                        <img class="img-circle" src="img/profile.jpg" alt="Generic placeholder image" width="80" height="80">
                    </p>
                    <p>
                        <strong>Author, Author</strong>
                    </p>
                </div>
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                    <div>
                        <h4>
                            <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                            <c:forEach var="word" items="${service.randomWords}">
                            <span class="label label-primary"><c:out value="${word.name}"/></span>
                            </c:forEach>
                        </h4>
                        <!--
                        <h4>
                            <span class="label label-primary">arreglando </span>
                            <span class="label label-primary">la vaina</span>
                            <span class="label label-primary">Para q le des</span>
                            <span class="label label-primary">Pcmoit</span>
                            <span class="label label-primary">Palabra 5</span>
                        </h4>-->
                    </div>
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="btn-group btn-group-sm" role="group" aria-label="...">
                                <button type="button" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-bold" aria-hidden="true"></span>
                                </button>
                                <button type="button" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-italic" aria-hidden="true"></span>
                                </button>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">

                                <%--Título: <input type="text" class="form-control" placeholder="¿Cómo desea titular su historia?">--%>
                                <br>
                                <div class="container" id="container">
                                    <s:form action="story" id="story">
                                        <s:textfield name="title" class="form-control" placeholder="¿Cómo desea titular su historia?" />
                                        <s:textarea name="description" class="form-control" rows="5" />

                                        <s:submit cssClass="btn btn-primary" value="Publicar" class="btn btn-primary"/>
                                    </s:form>
                                </div>
                                <%--<textarea class="form-control" rows="5" placeholder="Empieza aquí...">
<%--<textarea class="form-control" rows="5" placeholder="Empieza aquí...">
<%--<textarea class="form-control" rows="5" placeholder="Empieza aquí...">
<%--<textarea class="form-control" rows="5" placeholder="Empieza aquí...">
                                </textarea>--%>

                            </div>
                        </div>
                    </div>
                    <div class="pull-right">
                        <button type="submit" class="btn btn-primary">Publicar</button>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <jsp:include page="footer.jsp"/>
</b:container>
<!--<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">-->
</body>
</html>
