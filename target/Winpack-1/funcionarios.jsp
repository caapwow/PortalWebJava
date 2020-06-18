<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista funcionarios</title>
    </head>
    <body>
        <h1>Control funcionarios</h1>
        <ul>
            <c:forEach var="funcionario" items="${funcionarios}">
                <li>${funcionario.rut} ${funcionario.password}</li>
            </c:forEach>
        </ul>
    </body>
</html>
