
package entity;


public class Afiliados {
    private int idAfiliado;
    private String nomYapeAfi;
    private String dniAfi;
    private String domicilioAfi;
    private String telefonoAfi;
    private String emailAfi;
    private int estadoAfiliado;

    public Afiliados(int idAfiliado, String nomYapeAfi, String dniAfi, String domicilioAfi, String telefonoAfi, String emailAfi,int estadoAfiliado) {
        this.idAfiliado = idAfiliado;
        this.nomYapeAfi = nomYapeAfi;
        this.dniAfi = dniAfi;
        this.domicilioAfi = domicilioAfi;
        this.telefonoAfi = telefonoAfi;
        this.emailAfi = emailAfi;
        this.estadoAfiliado= estadoAfiliado;
    }

    public Afiliados(String nomYapeAfi, String dniAfi, String domicilioAfi, String telefonoAfi, String emailAfi ,int estadoAfiliado) {
        this.nomYapeAfi = nomYapeAfi;
        this.dniAfi = dniAfi;
        this.domicilioAfi = domicilioAfi;
        this.telefonoAfi = telefonoAfi;
        this.emailAfi = emailAfi;
        this.estadoAfiliado= estadoAfiliado;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public String getNomYapeAfi() {
        return nomYapeAfi;
    }

    public void setNomYapeAfi(String nomYapeAfi) {
        this.nomYapeAfi = nomYapeAfi;
    }

    public String getDniAfi() {
        return dniAfi;
    }

    public void setDniAfi(String dniAfi) {
        this.dniAfi = dniAfi;
    }

    public String getDomicilioAfi() {
        return domicilioAfi;
    }

    public void setDomicilioAfi(String domicilioAfi) {
        this.domicilioAfi = domicilioAfi;
    }

    public String getTelefonoAfi() {
        return telefonoAfi;
    }

    public void setTelefonoAfi(String telefonoAfi) {
        this.telefonoAfi = telefonoAfi;
    }

    public String getEmailAfi() {
        return emailAfi;
    }

    public void setEmailAfi(String emailAfi) {
        this.emailAfi = emailAfi;
    }

    public int getEstadoAfiliado() {
        return estadoAfiliado;
    }

    public void setEstadoAfiliado(int estadoAfiliado) {
        this.estadoAfiliado = estadoAfiliado;
    }

    @Override
    public String toString() {
        return "Afiliados{" + "nomYapeAfi=" + nomYapeAfi + ", dniAfi=" + dniAfi + ", domicilioAfi=" + domicilioAfi + ", telefonoAfi=" + telefonoAfi + ", emailAfi=" + emailAfi + ", estadoAfiliado=" + estadoAfiliado + '}';
    }

    
    
}
