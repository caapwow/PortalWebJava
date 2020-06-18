<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Lista funcionarios</title>
    </head>
    <body>


        <style>

            table.striped > tbody > tr:nth-child(odd) {
                background-color: rgba(63,193,122,1.00);
            }

        </style>
        <!--JavaScript at end of body for optimized loading-->
        
        <jsp:include page="vistas/headerAdmin.jsp"/>
            

        <form action="buscarUsuario.php" method="get" class="right flow-text">
            <div class="input-field">
                <input id="search" type="search" name="buscar" required>
                <i class="material-icons">close</i>
                <button class="btn-small red waves-effect waves-ligth" name="consulta">buscar</button>
            </div>
        </form>
        <div class="container section">

            <div class="row">
                <table class = "responsive-table striped highlight">
                    <thead>
                        <tr>
                            <th>Rut</th>
                            <th>Nombre</th>
                            <th>Telefono</th>
                            <th>Email</th>
                            <th>Lider</th>
                            <th>Linea</th>
                            <th>Foto</th>
                            <th>Planta</th>
                            <th>Cargo</th>
                        </tr>
                    <tbody>
                        <!-- 
                        bucle for each $registros es un array de todos los funcionarios de mi base de datos
                        $funcionarios nombre de variable
                        -->
                        <c:forEach var="funcionario" items="${funcionarios}">
                            <tr>

                                <td>${funcionario.rut}</td>
                                <td>${funcionario.nombre}</td>
                                <td>${funcionario.telefono}</td>
                                <td>${funcionario.email}</td>
                                <td>${funcionario.lider}</td>
                                <td>${funcionario.linea}</td>
                                <td><a href="#" /></td>
                                <td>${funcionario.planta.planta}</td>
                                <td>${funcionario.cargo.cargo}</td>
                                <td class="bot"><a href="#"><button class="btn-small red waves-effect waves-ligth" name="eliminar">Eliminar</button></a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    </thead>
                </table>
            </div>
        </div>

        <ul>



        </ul>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('.sidenav');
                var instances = M.Sidenav.init(elems);
                instances.open();
            });
        </script>
        <script>
            var collapsibleElem = document.querySelector('.collapsible');

            $(function () {
                $(".dropdown-trigger").dropdown();
                $('.sidenav').sidenav();
            })
        </script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('.modal');
                var instances = M.Modal.init(elems);
            });
        </script>
    </body>
</html>
