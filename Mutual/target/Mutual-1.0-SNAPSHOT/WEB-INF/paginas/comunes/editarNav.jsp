<section id="action" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <a href="index.jsp" class="btn btn-ligth btn-block">
                    <i class="fas fa-arrow-left"></i>
                    Regresar a Inicio
                </a>
            </div>
            <div class="col-md-4">
                <button type="submit" class="btn btn-primary btn-block">
                    <i class="fas fa-check"></i>
                    Guardar Modificacion
                </button>
            </div>
            <div class="col-md-4">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idAfiliado=${afiliado.idAfiliado}" class="btn btn-danger btn-block">
                    <i class="fas fa-trash"></i>
                    Eliminar 
                </a>
            </div>
               
        </div>
    </div>
</section>

