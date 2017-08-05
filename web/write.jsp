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
<link rel="stylesheet" href="../Resources/css/bootstrap.min.css">
<html>
<head>
</head>
<body style="background-image: url(img/writer.jpg)">

<b:container>
    <b:jumbotron tittle="Sample">
        <h1>Cuentanos tu historia</h1>
        <p>En esta sección podrás dar riendas sueltas a tu imaginación, para así crear una breve historia por mas loca que esta parezca solo tienes que plasmarla en el campo de abajo. Te brindaremos unas palabras para que desarrolles una conexión entre estas, no te preocupes si tu historia no tiene mucha coherencia, solo diviértete y escríbela xD.</p>
    </b:jumbotron>
</b:container>
<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-10 col-md-offset-1 col-lg-10 col-md-offset-1">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-2 col-lg-2">
                    <p>
                        <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="80" height="80">
                    </p>
                    <p>
                        <strong><s:property value="#session.user_name"/> <s:property value="#session.user_lastName"/></strong>
                    </p>
                </div>
                <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
                    <div id="tu">
                            <form name="formu" action="story">
                                <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
                                <c:forEach var="word"  items="${service.randomWords}" varStatus="record">
                                    <input id="nombre" name="nombre" class="btn btn-sm btn-primary" value="${word.name}" readonly>
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
                            <!--<div class="form-group">

                                    <%-- <div class="col-xs-5">
                                       <button type="button" class="btn btn-primary" onclick="vari('nombre'),vari2('nombre2'),vari3('nombre3'),vari4('nombre4'),vari5('nombre5')" >
                                         <span class="glyphicon glyphicon-lock"></span> Enviar</button>
                                </div>--%>
                            </div>-->
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
                           <s:if test="%{#session.user_id==null || #session.user_id==0}">
                               <div class="alert alert-warning">
                                   <strong>¡Advertencia!</strong> Debes iniciar sesión para poder publicar una historia.
                                   Si aún no tienes una cuenta, regístrate
                                   <a href="signup.jsp" class="alert-link">
                                       aquí
                                   </a>
                               </div>
                           </s:if>
                           <s:elseif test="%{#session.user_id>0}">
                               <s:hidden name="user" value="%{#session.user_id}"/>
                               Título: <s:textfield name="title" class="form-control" placeholder="¿Cómo desea titular su historia?" size="100%" onfocus="restaurar()"/>
                               <s:textarea name="description" class="form-control" rows="5" size="100%" onfocus="restaurar()"/>
                               <br>
                                <s:submit cssClass="btn btn-primary" value="Publicar" class="btn btn-primary" onclick="return encontrado()"/>
                           </s:elseif>
                       </s:form>
                       <!--
                            <form name="formulario"  id="chat" action="story" >

                                <input type="text" name="title" class="form-control" placeholder="Ponle titulo a tu historia" size="100%" onfocus="restaurar()" />
                                <input type="textarea" name="description" class="form-control" placeholder="Sólo siéntate y deja que fluya..." height="160" size="100%" onfocus="restaurar()"/>
                                <input type="submit" cssClass="btn btn-primary" onclick=" return encontrado()" class="btn btn-primary" value="Publicar"  />
                                       <%--onclick=" return comprobar()"--%>
                            </form>
                            <p id="aviso"></p>

                        </div>
                        -->
                    </div>
                    <%--<input id="file_url" type="file" class="form-control " id="exampleInputFile" aria-describedby="fileHelp" value="Agrega una Imagen" >

                    <s:div id="vista_previa" class="form-control "></s:div>--%>
                </div>
            </div>
        </div>

    </div>
</b:container>
<jsp:include page="footer.jsp"/>
<!--<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">-->
</body>
<script type="text/javascript" src="js/filters.js">

</script>
</html>
