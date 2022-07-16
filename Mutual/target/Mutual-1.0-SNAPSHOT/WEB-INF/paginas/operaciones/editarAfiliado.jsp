<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Libreria</title>

        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" ">

        <!-- Iconos -->
        <script src="https://kit.fontawesome.com/382381b436.js" crossorigin="anonymous"></script>

    </head>
    <body>

        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>
       
        <!-- lugar donde va a parar el formulario -->
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idAfiliado=${afiliado.idAfiliado}" method="POST" class="was-validated">

            <jsp:include page="/WEB-INF/paginas/comunes/editarNav.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar </h4>               
                                </div>

                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="nomYapeAfi">Nombre y Apellido</label>
                                        <input type="text" class="form-control" name="nomYapeAfi" required="" value="${afiliado.nomYapeAfi}">
                                    </div>
                                    <div class="form-group">
                                        <label for="dniAfi">Dni</label>
                                        <input type="number" class="form-control" name="dniAfi" required="" value="${afiliado.dniAfi}">
                                    </div>
                                    <div class="form-group">
                                        <label for="domicilioAfi">Domicilio</label>
                                        <input type="text" class="form-control" name="domicilioAfi" required="" value="${afiliado.domicilioAfi}">
                                    </div>
                                    <div class="form-group-floating">
                                        <label for="telefonoAfi">Telefono</label>
                                        <input type="text" class="form-control" name="telefonoAfi" required="" value="${afiliado.telefonoAfi}">
                                    </div>
                                    <div class="form-group-floating">
                                        <label for="emailAfi">Email</label>
                                        <input type="text" class="form-control" name="emailAfi" required="" value="${afiliado.emailAfi}">
                                    </div>
                                    <div class="form-group-floating">
                                        <label for="estadoAfiliado">Estado</label>
                                        <input type="number" class="form-control" name="estadoAfiliado" required="" value="${afiliado.estadoAfiliado}">
                                    </div>

                                </div> 
                            </div>   
                        </div>   
                    </div>
                </div>
            </section>
        </form>
                                    
        <jsp:include page="/WEB-INF/paginas/comunes/pieDePagina.jsp"/>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>


