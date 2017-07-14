<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 14/07/2017
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Words</title>
</head>
<body>
    <jsp:useBean id="service" class="pe.edu.utp.cuentahistorias.services.CHService"/>
    <c:forEach var="word" items="${service.words}">
        <p><c:out value="${word.name}"/></p>
    </c:forEach>
</body>
</html>
