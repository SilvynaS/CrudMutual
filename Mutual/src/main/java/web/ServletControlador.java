package web;

import data.AfiliadosDAO;
import entity.Afiliados;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    editarAfiliado(req, res);
                    break;
                case "eliminar":
                    eliminarAfiliado(req, res);
                    break;
                default:
                    accionDefault(req, res);
                    break;
            }
        } else {
            accionDefault(req, res);
        }

        /*  List<Afiliados> afiliados = new AfiliadosDAO().findAll();

        afiliados.forEach(System.out::println);
        req.setAttribute("pepe", afiliados);//envia la info a la vista  o sea envia la lista de libros a la vista.
        //el nombre de la vista enla lista va ser "pepe" y libros es la lista
        req.setAttribute("cantidadAfiliados", calcularAfiliados(afiliados));
        req.setAttribute("cantAfiActivos",calcularAfiActivos(afiliados));
        req.getRequestDispatcher("mutual.jsp").forward(req, res);
         */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    guardarAfiliado(req, res);
                    break;
                case "modificar":
                    modificarAfiliado(req, res);
                    break;
                default:
                    accionDefault(req, res);
                    break;

            }
        }

    }

    private void accionDefault(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        List<Afiliados> afiliados = new AfiliadosDAO().findAll();
        HttpSession sesion = req.getSession();
        sesion.setAttribute("pepe", afiliados);
        //envia la info a la vista  o sea envia la lista de libros a la vista.
        //el nombre de la vista enla lista va ser "pepe" y libros es la lista
        sesion.setAttribute("cantidadAfiliados", calcularAfiliados(afiliados));
        sesion.setAttribute("cantAfiActivos", calcularAfiActivos(afiliados));
        //req.getRequestDispatcher("mutual.jsp").forward(req, res);
        res.sendRedirect("mutual.jsp");
    }

    private void guardarAfiliado(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nomYape = req.getParameter("nomyape");
        String dni = req.getParameter("dniafi");
        String domicilioafi = req.getParameter("domicilioafi");
        String telafi = req.getParameter("telafi");
        String emailafi = req.getParameter("emailafi");
        int estadoafi = Integer.parseInt(req.getParameter("estadoafi"));

        Afiliados afiliado = new Afiliados(nomYape, dni, domicilioafi, telafi, emailafi, estadoafi);
        int regMod = new AfiliadosDAO().create(afiliado);
        System.out.println("Insertados: " + regMod);
        accionDefault(req, res);
    }

    private void editarAfiliado(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // recibe el parametro o kivaliu idAfiliado de listarAfiliados
        int idAfiliado = Integer.parseInt(req.getParameter("idAfiliado"));//todo lo q recuperamos se tiene q transformar a un string
        //hacemos la consulta para retornar un afiliado
        Afiliados lib = new AfiliadosDAO().findById(idAfiliado);
        //se lo enviamos a una vista que se llama editarAfiliado
        req.setAttribute("afiliado", lib);
        req.getRequestDispatcher("/WEB-INF/paginas/operaciones/editarAfiliado.jsp").forward(req, res);
    }

    private void modificarAfiliado(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nomYapeAfi = req.getParameter("nomYapeAfi");
        String dniAfi = req.getParameter("dniAfi");
        String domicilioAfi = req.getParameter("domicilioAfi");
        String telefonoAfi = req.getParameter("telefonoAfi");
        String emailAfi = req.getParameter("emailAfi");
        int estadoAfiliado = Integer.parseInt(req.getParameter("estadoAfiliado"));

        int idAfiliado = Integer.parseInt(req.getParameter("idAfiliado"));
        Afiliados lib = new Afiliados(idAfiliado, nomYapeAfi, dniAfi, domicilioAfi, telefonoAfi, emailAfi,estadoAfiliado);
        int regMod = new AfiliadosDAO().update(lib);
        System.out.println("SE ACTUALIZARON: " + regMod + " REGISTROS");
        accionDefault(req, res);
    }

    private void eliminarAfiliado(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         int idAfiliado = Integer.parseInt(req.getParameter("idAfiliado"));
        
        int regDel = new AfiliadosDAO().delete(idAfiliado);
        
        System.out.println("REGISTROS ELIMINADOS: "+ regDel);
        
        accionDefault(req, res);
    }
     
    private int calcularAfiliados(List<Afiliados> lista) {
        int cantidad = 0;
        for (int i = 0; i < lista.size(); i++) {
            cantidad = cantidad + 1;
        }
        return cantidad;
    }

    private int calcularAfiActivos(List<Afiliados> lista) {
        int cantActivos = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEstadoAfiliado() == 1) {
                cantActivos = cantActivos + 1;
            }
        }
        return cantActivos;
    }
}
