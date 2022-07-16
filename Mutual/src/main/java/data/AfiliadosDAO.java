package data;

import static data.Conexion.close;
import static data.Conexion.getConexion;
import entity.Afiliados;
import java.sql.*;
import java.util.*;

public class AfiliadosDAO {

    private static final String SQL_READ = "SELECT * FROM afiliados ";
    private static final String SQL_CREATE = "INSERT INTO afiliados(nomYapeAfi, dniAfi, domicilioAfi, telefonoAfi, emailAfi,estadoAfiliado) VALUES(?,?, ?, ?,? ,?)";
    private static final String SQL_UPDATE_DOMICILIO = "UPDATE afiliados SET domicilioAfi = ? WHERE idAfiliado = ?";
    private static final String SQL_UPDATE_TELEFONO = "UPDATE afiliados SET telefonoAfi = ? WHERE idAfiliado = ?";
    private static final String SQL_UPDATE_ESTADO = "UPDATE afiliados SET estadoAfiliado = ? WHERE idAfiliado = ?";
    private static final String SQL_UPDATE = "UPDATE afiliados SET nomYapeAfi = ?, dniAfi = ?, domicilioAfi = ?, telefonoAfi = ?,emailAfi = ? ,estadoAfiliado = ? WHERE idAfiliado = ?";
    private static final String SQL_DELETE = "DELETE FROM afiliados WHERE idAfiliado = ?";
    private static final String SQL_SELECT_BY_ID = "SELECT *  FROM afiliados WHERE idAfiliado = ?";

    public List<Afiliados> findAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Afiliados afiliado = null;
        List<Afiliados> afiliados = new ArrayList();

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_READ);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idAfiliado = rs.getInt(1);
                String nomYapeAfi = rs.getString(2);
                String dniAfi = rs.getString(3);
                String domicilioAfi = rs.getString(4);
                String telefonoAfi = rs.getString(5);
                String emailAfi = rs.getString(6);
                int estadoAfiliado = rs.getInt(7);
                afiliado = new Afiliados(idAfiliado, nomYapeAfi, dniAfi, domicilioAfi, telefonoAfi, emailAfi, estadoAfiliado);

                afiliados.add(afiliado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return afiliados;//retorma el arraylis libros
    }

    public Afiliados findById(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Afiliados afiliado = null;

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idAfiliado = rs.getInt(1);
                String nomYapeAfi = rs.getString(2);
                String dniAfi = rs.getString(3);
                String domicilioAfi = rs.getString(4);
                String telefonoAfi = rs.getString(5);
                String emailAfi = rs.getString(6);
                int estadoAfiliado = rs.getInt(7);

                afiliado = new Afiliados(idAfiliado, nomYapeAfi, dniAfi, domicilioAfi, telefonoAfi, emailAfi, estadoAfiliado);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return afiliado;
    }

    public int create(Afiliados afiliado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_CREATE);
            stmt.setString(1, afiliado.getNomYapeAfi());
            stmt.setString(2, afiliado.getDniAfi());
            stmt.setString(3, afiliado.getDomicilioAfi());
            stmt.setString(4, afiliado.getTelefonoAfi());
            stmt.setString(5, afiliado.getEmailAfi());
            stmt.setInt(6, afiliado.getEstadoAfiliado());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int update(Afiliados afiliado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, afiliado.getNomYapeAfi());
            stmt.setString(2, afiliado.getDniAfi());
            stmt.setString(3, afiliado.getDomicilioAfi());
            stmt.setString(4, afiliado.getTelefonoAfi());
            stmt.setString(5, afiliado.getEmailAfi());
            stmt.setInt(6, afiliado.getEstadoAfiliado());
            stmt.setInt(7, afiliado.getIdAfiliado());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int updateDomicilio(Afiliados afiliado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE_DOMICILIO);
            stmt.setString(1, afiliado.getDomicilioAfi());
            stmt.setInt(2, afiliado.getIdAfiliado());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int updateTelefono(Afiliados afiliado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE_TELEFONO);
            stmt.setString(1, afiliado.getTelefonoAfi());
            stmt.setInt(2, afiliado.getIdAfiliado());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int updateEstado(Afiliados afiliado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE_ESTADO);
            stmt.setInt(1, afiliado.getEstadoAfiliado());
            stmt.setInt(2, afiliado.getIdAfiliado());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
