<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-21
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form:form modelAttribute="condiments" action="/result" method="post">
    Tomato: <form:checkbox path="tomato" value="tomato"/><br/>
    Apple: <form:checkbox path="apple" value="apple"/><br/>
    Mutap: <form:checkbox path="mutap" value="mutap"/><br/>
    <button type="submit">Summit</button>
  </form:form>

  <h3> you selected: ${condiments.apple} ${condiments.tomato} ${condiments.mutap}</h3>

  </body>
</html>
