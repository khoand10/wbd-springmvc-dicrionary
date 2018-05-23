<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 23/05/2018
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page</title>
</head>
<body>
    <form action="/home/dicrionary" method="get">
        <input type="text" name="keyword"><button>Translate</button>
    </form>
    Result: <input type="text" value="${result}">
    <h1>${message}</h1>
</body>
</html>
