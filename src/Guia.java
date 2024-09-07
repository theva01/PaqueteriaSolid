public class Guia {

    private String numeroEnvioGuia;
    private String idServicio;
    private double valorDeclarado;
    private String estado;

    public Guia(String numeroEnvioGuia, String idServicio, double valorDeclarado, String estado) {
        this.numeroEnvioGuia = numeroEnvioGuia;
        this.idServicio = idServicio;
        this.valorDeclarado = valorDeclarado;
        this.estado = estado;
    }

    public void registrarGuia() {

    }

    public void registrarEntrega() {

    }

    public String consultarEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String getNumeroEnvioGuia() {
        return numeroEnvioGuia;
    }

    public void setNumeroEnvioGuia(String numeroEnvioGuia) {
        this.numeroEnvioGuia = numeroEnvioGuia;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }
}
