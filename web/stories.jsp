<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 05/07/2017
  Time: 10:51
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
    <style>
        .im{
            display: flex;
            justify-content: center;
        }
    </style>

    <style>
        * {
            margin: 0; padding: 0; border: 0 none; position: relative;
        }
        *, *:after, *:before {
            box-sizing: border-box;
            -moz-box-sizing: border-box;
            padding-left: 10px;
        }
        p{
            max-height: 6rem;
            overflow: hidden;
            text-align: justify;

        }
        p:after{
            content:'Ver mas...';
            color: #0f4bac;
            background: #ffffff;
            position: absolute;
            top: 4rem;
            right: 0;
        }
    </style>
</head>
<body>
<b:container>
    <b:jumbotron tittle="Sample">
        <h1>Navbar example</h1>
        <h3>This example is a quick exercise to illustrate how the default, static and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</h3>
        <h3>To see the difference between static and fixed top navbars, just scroll.</h3>
    </b:jumbotron>
</b:container>

<b:container>
    <div class="row">
        <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
        <c:forEach var="story" items="${service.latestStories}">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="thumbnail" style="height: 202px">
                <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 im">
                            <img src="https://dummyimage.com/190x190/757075/ffffff.jpg&text=+">

                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
                            <div class="caption">
                                <h3><c:out value="${story.title}"/></h3>
                                <a href="<s:url action="detailsStory">
                                    <s:param name="id">
                                        <c:out value="${story.id}"/>
                                    </s:param></s:url>" style="text-decoration: none; color: #2b2b2b">
                                    <div>
                                        <p>
                                            <c:out value="${story.description}"/>
                                        </p>
                                    </div>
                                </a>
                                <p>
                                    <img class="img-circle" src='img/imgPhoto/${story.user.firstName}.png' alt="Generic placeholder image" width="40" height="40">
                                    <strong><c:out value="${story.user.firstName}"/> <c:out value="${story.user.lastName}"/> </strong>
                                </p>
                            </div>
                        </div>
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</b:container>
<jsp:include page="footer.jsp"/>
</body>
</html>
