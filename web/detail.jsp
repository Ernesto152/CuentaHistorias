<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 06/07/2017
  Time: 13:14
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
</head>
<body>
<s:set var="story_user_id" value="user" scope="session"/>
<b:container>
    <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
    <div class="row" style="padding-top: 40px ">
        <div class="col-md-8 col-md-offset-2">
            <div class="row">
                <div class="col-lg-1">
                <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="40" height="40">
            </div>
                <div class="col-lg-11">
                    <div class="row">
                        <c:forEach var="story" items="${service.stories}">
                            <c:if test="${story.user.id eq story_user_id}">
                                <h5><strong><c:out value="${story.user.firstName}"/> <c:out value="${story.user.lastName}"/>  </strong><span class="label label-info">Level <c:out value="${story.user.level}"/></span></h5>
                            </c:if>
                        </c:forEach>
                    </div>
                    <div class="row">
                        <h6><s:property value="publicationDate"/></h6>
                    </div>
                </div>
            </div>
            <div class="row">
                <h2 class="header-panel"><s:property value="title"/></h2>
                <p class="lead">
                    <s:property value="description"/>
                </p>
            </div>
            <a href="<s:url action="confrontation"><s:param name="id"><s:property value="id"/></s:param></s:url>"
               class="btn btn-danger">Retar
            </a>
            <div style="padding-bottom: 30px">
                <h3 class="header-panel">Coments</h3>
            </div>
            <div class="row">
                <div class="col-lg-1 center-block center-pill">
                    <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="40" height="40">
                    <p>Author</p>
                </div>
                <div class="col-lg-11">
                    <div class="well">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam
                            eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet.
                        </p>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-1">
                    <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="40" height="40">
                    <p>Author</p>
                </div>
                <div class="col-lg-11">
                    <div class="well">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam
                            eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet.
                        </p>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-1">
                    <img class="img-circle" src="img/imgProject/profile.png" alt="Generic placeholder image" width="40" height="40">
                    <p>Author</p>
                </div>
                <div class="col-lg-11">
                    <div class="well">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam
                            eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</b:container>
<jsp:include page="footer.jsp"/>
</body>
</html>
