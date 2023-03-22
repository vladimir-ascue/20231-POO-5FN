public class CVendedor {
    private String tipoDocumento; // ID
    private String numDocumento;
    private String nombres;
    private String apellidos;
    private String correo;
    private String Contrasenia;
    private String estado;

    public CVendedor(String tipoDocumento, String numDocumento, String nombres, String apellidos, String correo, String contrasenia, String estado) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        Contrasenia = contrasenia;
        this.estado = estado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
