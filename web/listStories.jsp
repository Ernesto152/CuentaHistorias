<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: William
  Date: 17/07/2017
  Time: 03:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Stories</title>
</head>
<body>
<jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
<c:forEach var="story" items="${service.stories}">
    <p><c:out value="${story.tittle}"/></p>
</c:forEach>
</body>
</html>



