<!doctype html>
<html>
    <head>  
        <meta charset="utf-8">
        <link rel="shortcut icon" type="image/ico" href="imagenes/favicon.ico">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <title>Login</title>
    </head>

    <body>
        <style>
            body{
                background: url("imagenes/sml1.jpeg")no-repeat center center fixed;    
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size:cover;
                background-size: cover;
                background-position: center;
            }
            .login{
                margin-top: 100px;
            }
            .login .card{
                background: rgba(0, 0, 0, .6);

            }
            .login label{
                font-size: 16px;
                color:#ccc;
            }
            .login input{
                font-size: 20px !important;
            }
        </style>

        <div class="row login">
            <div  class="col s4 offset-l4 centered" >
                <div class="card">
                    <div class="card-action red white-text">
                        <h3>Iniciar Sesion</h3>
                    </div>
                    <div class="card-content">
                        <form action="../acciones/validar.php" method="post">
                            <div class="form-field">
                                <div class="input-field">
                                    <i class="material-icons prefix red-text">email</i>
                                    <input type="email" class="validate" id="email" name="email" required/>
                                    <label for="email" class="white-text">winpack@gmail.com</label>  
                                </div>

                            </div>
                            <div class="form-field">
                                <div class="input-field">
                                    <i class="material-icons prefix red-text">lock</i>
                                    <input type="password" class="validate" id="clave" name="password" required/>
                                    <label for="clave" class="white-text">Contraseña</label>
                                </div>

                            </div>
                            <div class="form-field">
                                <label for="remember">
                                    <input type="checkbox" class="filled-in" checked="checked" name="recordar" id="remember"/>
                                    <span class="white-text">Recordar contraseña</span>
                                </label>


                            </div><br><br>

                            <div class="form-field center-align">
                                <button class="btn-large red" name="validar" type="submit">Entrar</button>
                            </div><br>
                            <div class="form-field">
                                <a href="nuevaPassword.jsp" class="white-text"><i class="material-icons red-text">help</i>¿olvidaste tu cuenta?</a>
                            </div>
                        </form> 

                    </div>
                </div>
            </div>
        </div>


        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script> <script>
            M.AutoInit();
        </script>  
    </body>
</html>
