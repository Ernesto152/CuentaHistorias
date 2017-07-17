<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 08/07/2017
  Time: 08:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <tittle>Person</tittle>
  </head>
  <body>
    <s:form action="person">
      <s:textfield name="firstName" label="First Name"/>
      <s:textfield name="lastName" label="Last Name"/>
      <s:textfield name="email" label="Email"/>
      <s:textfield name="age" label="Age"/>
      <s:submit value="Save"/>
    </s:form>
  </body>
</html>
