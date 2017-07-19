<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 19/07/2017
  Time: 0:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
<c:forEach var="word" items="${service.randomWords}">
    <p><c:out value="${word.name}"/></p>
</c:forEach>
</html>
