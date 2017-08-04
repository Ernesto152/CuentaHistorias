<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 03/08/2017
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="bootstrap.jsp"/>
<jsp:include page="navbar.jsp"/>
<html>
<head>
    <title>Reto</title>
</head>
<body>
<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6" style="padding-top: 80px">
            <div class="thumbnail">
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <div class="caption">
                            <h3><s:property value="title"/> </h3><h6> <s:property value="publicationDate"/></h6>
                            <div>
                                <p><s:property value="description"/></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div id="tu">
                <form name="formu" action="story">
                    <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                    <c:forEach var="word"  items="${service.randomWords}" varStatus="record">
                        <input id="nombre" name="nombre" class="btn btn-sm btn-primary" value="${word.name}">
                    </c:forEach>

                    <jsp:useBean id="service2" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                    <c:forEach var="word"  items="${service2.randomWords}" varStatus="record">
                        <input id="nombre2" name="nombre2" class="btn btn-sm btn-primary" value="${word.name}">
                    </c:forEach>

                    <jsp:useBean id="service3" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                    <c:forEach var="word"  items="${service3.randomWords}" varStatus="record">
                        <input id="nombre3" name="nombre3" class="btn btn-sm btn-primary" value="${word.name}">
                    </c:forEach>

                    <jsp:useBean id="service4" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                    <c:forEach var="word"  items="${service4.randomWords}" varStatus="record">
                        <input id="nombre4" name="nombre4" class="btn btn-sm btn-primary" value="${word.name}" height="50%">
                    </c:forEach>

                    <jsp:useBean id="service5" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                    <c:forEach var="word"  items="${service5.randomWords}" varStatus="record">
                        <input id="nombre5" name="nombre5"  class="btn btn-sm btn-primary" value="${word.name}">
                    </c:forEach>
                </form>
                <br>
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
                    <s:form action="addStory" id="chat" name="formulario">
                        <s:hidden name="user" value="%{#session.user_id}"/>
                        Título: <s:textfield class="form-control" placeholder="¿Cómo desea titular su historia?" size="100%"/>
                        <s:textarea class="form-control" rows="5" size="100%"/>
                        <br>
                        <%--<s:submit cssClass="btn btn-primary" value="Publicar" class="btn btn-primary" onclick="return encontrado()"/>--%>
                        <a href="<s:url action="confrontation"><s:param name="id"><s:property value="id"/></s:param></s:url>">
                            <s:submit cssClass="btn btn-primary" value="Retar" class="btn btn-primary" onclick="return encontrado()"/>
                        </a>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</b:container>
<jsp:include page="footer.jsp"/>
</body>
<script type="text/javascript" src="js/filters.js"/>
</html>
