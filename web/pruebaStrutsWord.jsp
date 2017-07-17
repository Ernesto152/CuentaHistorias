<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 14/07/2017
  Time: 2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <tittle>Add Word</tittle>
</head>
<body>
<s:form action="word">
    <s:textfield name="id" label="ID"/>
    <s:textfield name="name" label="Name"/>
    <s:submit value="Save"/>
</s:form>
</body>
</html>
