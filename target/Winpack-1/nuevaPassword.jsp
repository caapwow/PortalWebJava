<!doctype html>
<html>
<head>  
<meta charset="utf-8">
    <link rel="shortcut icon" type="image/ico" href="../imagenes/favicon.ico">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

<title>Recuperar Contraseña</title>
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
                        <h3>Recuperar Contraseña</h3>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="login.jsp" style="color: white">Iniciar Sesión</a></div>
                    </div>
                    <div class="card-content">
                        <form action="#" method="post">
                        <div class="form-field">
                            <div class="input-field">
                                <i class="material-icons prefix red-text">email</i>
                                <input type="email" class="validate" id="email" name="email" required/>
                                <label for="email" class="white-text">winpack@gmail.com</label>  
                            </div>
                        </div>
                      <br>
                        <div class="form-field center-align">
                            <button class="btn-large red" name="reset" type="submit">Recuperar</button>
                        </div><br>
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
