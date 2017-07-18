<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 16/07/2017
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <s:form>
        <s:textfield name="email" label="email"/>
        <s:textfield name="password" label="password"/>
        <s:submit value="Save"/>
    </s:form>
</body>
</html>
