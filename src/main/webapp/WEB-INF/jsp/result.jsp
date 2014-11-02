<%--
  Created by IntelliJ IDEA.
  User: burdun
  Date: 30.09.2014
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <p>Список всех профессоров:</p>
    <table>
        <c:forEach var="professor" items="${list}" varStatus="status">
            <tr>
                <td><c:out value="${ status.count }" /></td>
                <td><c:out value="${ professor.surname }" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
