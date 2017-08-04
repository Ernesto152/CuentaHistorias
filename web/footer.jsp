<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 06/07/2017
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="b" uri="http://bootstrapjsp.org/" %>
<jsp:include page="bootstrap.jsp"/>
<div style="padding-top: 100px"></div>
<footer id="myFooter">
    <div class="container">
        <div class="row">
            <div class="col-sm-4 myCols">
                <h5>Comenzar</h5>
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="signup.jsp">Registrarse</a></li>
                    <li><a href="#">Downloads</a></li>
                </ul>
            </div>
            <div class="col-sm-4 myCols">
                <h5>Sobre nosotros</h5>
                <ul>
                    <li><a href="#">Información de la empresa</a></li>
                    <li><a href="#">Contáctenos</a></li>
                    <li><a href="#">Comentarios</a></li>
                </ul>
            </div>
            <div class="col-sm-4 myCols">
                <h5>Legal</h5>
                <ul>
                    <li><a href="#">Términos de Servicio</a></li>
                    <li><a href="#">Términos de Uso</a></li>
                    <li><a href="#">Políticas de Privacidad</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="social-networks">
        <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
        <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
        <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
    </div>
    <div class="footer-copyright">
        <p>© 2017 Copyright JavaDevs </p>
    </div>
</footer>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
