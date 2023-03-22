public class CCliente {
    private String numDocumento;// idCliente dni - No se opera
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String correo;
    private String tipo;
    private String estado;

    public CCliente(String numDocumento, String tipoDocumento,String nombres, String apellidos, String correo, String tipo, String estado) {
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.tipo = tipo;
        this.estado = estado;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    public void mostrar(){

    }
}
