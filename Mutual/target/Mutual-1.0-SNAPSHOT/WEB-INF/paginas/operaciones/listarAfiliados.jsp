<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="es_AR"/>

<section id="afiliados">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header ">
                        <h4>Listado de Afiliados</h4>
                    </div>
                    <table class="table-responsive table table-striped table-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre y Apellido</th>
                                <th>DNI</th>
                                <th>Domicilio</th>
                                <th>Telefono</th>
                                <th>Email</th>
                                <th>Estado</th>
                                <th>Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="afiliado" items="${pepe}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${afiliado.nomYapeAfi}</td>
                                    <td>${afiliado.dniAfi}</td>
                                    <td>${afiliado.domicilioAfi}</td>
                                    <td>>${afiliado.telefonoAfi}</td>
                                    <td>${afiliado.emailAfi}</td>
                                    <td>${afiliado.estadoAfiliado}</td>
                                    <!-- NO OLVIDAR COMPLETAR HREF cuando este terminado Editar -->
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idAfiliado=${afiliado.idAfiliado}" class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right"></i>
                                            Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Cantidad de Afiliados</h3>
                        <i class="fa-solid fa-person"></i>
                        <h4 class="display-4">${cantidadAfiliados}
                            
                        </h4>
                    </div>
                </div>
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Afiliados Activos</h3>
                        <i class="fa-solid fa-person-circle-plus"></i>
                        <h4 class="display-4">${cantAfiActivos}
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>

<jsp:include page="/WEB-INF/paginas/operaciones/agregarAfiliado.jsp"/>

