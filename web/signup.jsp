<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 05/07/2017
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<jsp:include page="bootstrap.jsp"/>
<jsp:include page="navbar.jsp"/>

<html>
<head><title>CuentaHistorias</title>
</head>
<body>
<b:container>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <img class="featurette-image img-responsive center-block" src="https://dummyimage.com/500x500/b3b3b3/ffffff.jpg&text=+" style="padding-top: 15px">
        </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="container" id="container">
                <form id="contact" action="" method="post">
                    <h3>Regístrate</h3>
                    <h4>Únete a nosotros y monitorea tu dinero</h4>
                    <fieldset>
                        <input placeholder="Nombre" type="text" tabindex="1" required autofocus>
                    </fieldset>
                    <fieldset>
                        <input placeholder="Apellidos" type="text" tabindex="2" required autofocus>
                    </fieldset>
                    <fieldset>
                        <input placeholder="Correo electrónico" type="email" tabindex="3" required>
                    </fieldset>
                    <fieldset>
                        <input placeholder="Contraseña" type="password" tabindex="4" required>
                    </fieldset>
                    <fieldset>
                        <input placeholder="Confirmar contraseña" type="password" tabindex="5" required>
                    </fieldset>
                    <fieldset>
                        <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Registrarme</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"/>
</b:container>
</body>
</html>

