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
    <tittle>Add User</tittle>
</head>
<body>
<s:form action="user">
    <s:textfield name="firstName" label="First Name"/>
    <s:textfield name="lastName" label="Last Name"/>
    <s:textfield name="email" label="Email"/>
    <s:textfield name="password" label="Password"/>
    <s:submit value="Save"/>
</s:form>
</body>
</html>
