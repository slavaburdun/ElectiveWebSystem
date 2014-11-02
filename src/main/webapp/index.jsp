<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <head>
        <title>JSP Timing</title>
    </head>

    <body>
        <c:out value="Welcome to JSTL"/>
        <h5>Показать список всех профессоров</h5>
        <form name="Simple" action="Servlet" method="POST">
            <input type="submit" name="button" value="Показать"/>
        </form>
    </body>

</html>
