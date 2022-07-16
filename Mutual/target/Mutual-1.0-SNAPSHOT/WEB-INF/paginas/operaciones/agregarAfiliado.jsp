<div class="modal fade" id="agregarAfiliadoModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Afiliado</h5>
            </div>

            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group-floating">
                        <label for="nomyape">Nombre y Apellido</label>
                        <input type="text" class="form-control" name="nomyape" required="">
                    </div>
                    <div class="form-group">
                        <label for="dniafi">Dni</label>
                        <input type="number" class="form-control" name="dniafi" required="">
                    </div>
                    <div class="form-group">
                        <label for="domicilioafi">Domicilio</label>
                        <input type="text" class="form-control" name="domicilioafi" required="">
                    </div>
                    <div class="form-group-floating">
                        <label for="telafi">Telefono</label>
                        <input type="text" class="form-control" name="telafi" required="">
                    </div>
                    <div class="form-group-floating">
                        <label for="emailafi">Email</label>
                        <input type="text" class="form-control" name="emailafi" required="">
                    </div>
                    <div class="form-group-floating">
                        <label for="estadoafi">Estado</label>
                        <input type="number" class="form-control" name="estadoafi" required="">
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">
                        Guardar
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>