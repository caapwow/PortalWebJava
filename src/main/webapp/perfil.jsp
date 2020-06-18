<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Perfil</title>
    </head>

    <body>

        <style>
            body{
                background-image: url("../imagenes/sml.jpeg");    
                background-size: cover;
                background-position: center;
            }.perfil{
                margin-top: 100px;
            }
            .perfil .card{
                background: rgba(0, 0, 0, .6);

            }
            .perfil label{
                font-size: 16px;
                color:#ccc;
            }
            .perfil input{
                font-size: 20px !important;
            }
        </style>
       

        <jsp:include page="vistas/headerAdmin.jsp"/>

        <div class="container section">
            <div class="row perfil">

                <div class="row card">
                    <div class="col s4"> 
                        <div class="card">
                            <div class="card-image"><img src="" class="rounded responsive-img">          
                            </div>
                        </div>
                    </div>


                    <div class="col s6 ">
                        <label>Rut: </label>
                    </div>
                    <div class="col s6">
                        <label>Nombre: </label>
                    </div>
                    <div class="col s6">
                        <label>Telefono: </label>
                    </div>
                    <div class="col s6">
                        <label>email: </label>
                    </div>
                    <div class="col s6">
                        <label>Lider: </label>
                    </div>
                    <div class="col s6">
                        <label>Linea:</label>
                    </div>
                    <div class="col s6">
                        <label>Planta: </label>
                    </div>
                    <div class="col s6"> 
                        <label>Cargo: </label>
                    </div>
                    <div class="col s6"> 
                        <label>Rol: </label>
                    </div>
                    <button class="btn-small modal-trigger red waves-light" type="submit" name="editar" data-target="idmodal" >Editar
                        <i class="material-icons">edit</i>
                    </button>
                    <button class="btn-small modal-trigger red waves-light" type="submit" name="editar" data-target="idclave" >Nueva Contraseña
                    </button>
                    <form action="#" method="post">
                        <div id="idclave" class="modal">
                            <div class="modal-content">
                                <div class="col s12 ">
                                    <label>Nueva Contraseña:</label>
                                    <input type="password" name="clave1">                
                                </div>
                                <div class="col s12 ">
                                    <label>Nueva Contraseña:</label>
                                    <input type="password" name="clave2">                
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button class="btn-large red waves-effect waves-light" type="submit" name="cambiarPassword">Nueva Contraseña<i class="material-icons">save</i></button>
                                <a href="" class="btn-large red modal-close">Cerrar<i class="material-icons">clear</i></a>
                            </div> 
                        </div>
                    </form>

                    <form action="#" method="post"> 
                        <div id="idmodal" class="modal">
                            <div class="modal-content">
                                <div class="col s4 ">
                                    <label>Rut:</label>
                                    <input type="text" name="rut2" value="">                
                                </div>
                                <div class="col s4">
                                    <label>Nombre:</label>
                                    <input type="text" name="nombre2" value=""/>
                                </div>
                                <div class="col s4">
                                    <label>Telefono:</label>
                                    <input type="tel" name="telefono2" value="">
                                </div>
                                <div class="col s4">
                                    <label>email:</label>
                                    <input type="email" name="email2" value="">
                                </div>
                                <div class="col s4">
                                    <label>Lider:</label>
                                    <input type="text" name="lider2" value="">
                                </div>
                                <div class="col s4">
                                    <label>Linea:</label>
                                    <input type="text" name="linea2" value="">
                                </div>
                                <div class="col s4">
                                    <label>Planta:</label>
                                    <select name="planta2" >
                                        <option value="">Seleccione Planta</option>
                                        <option value="1">EXTRUSIÓN</option>
                                        <option value="2">SML</option>
                                        <option value="3">TEXOL</option>
                                        <option value="4">IMPRESIÓN</option>
                                    </select>
                                </div>
                                <div class="col s5"> 
                                    <label>Cargo:</label>
                                    <select name="cargo2">
                                        <option value="">Seleccione Planta</option>
                                        <option value="1">Maestro materia prima</option>
                                        <option value="2">Operador de Linea</option>
                                        <option value="3">Ayudante de Producción</option>
                                        <option value="4">Lider de Turno</option>
                                        <option value="5">Supervisor</option>
                                    </select>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button class="btn-large red waves-effect waves-light" type="submit" name="cambiar">Guardar<i class="material-icons">save</i></button>
                                <a href="" class="btn-large red modal-close">Cerrar<i class="material-icons">clear</i></a>
                            </div> 
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!--JavaScript at end of body for optimized loading-->
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
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('.modal');
                var instances = M.Modal.init(elems);
                var elems = document.querySelectorAll('.datepicker');
                var instances = M.Datepicker.init(elems);
                var elems = document.querySelectorAll('select');
                var instances = M.FormSelect.init(elems);
                $(document).ready(function () {
                    $('select').formSelect();
                });
            });
        </script>
    </body>
</html>
