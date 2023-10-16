<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.estudos.gerenciador.servlet.Empresa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Isaac
  Date: 16/10/2023
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Empresas cadastradas</title>
  </head>
  <body>
      Lista de Empresas: <br/>
      <ul>
          <c:forEach items="${empresas}" var="empresa">
              <li>${ empresa.nome }</li>
          </c:forEach>
      </ul>
  </body>
</html>
