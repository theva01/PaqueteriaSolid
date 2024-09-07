public abstract class Servicio {

    protected String idServicio;
    protected String tipoServicio;
    protected double valorBase;
    protected boolean esInternacional;


    public Servicio(String idServicio, String tipoServicio, double valorBase, boolean esInternacional) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
        this.valorBase = valorBase;
        this.esInternacional = esInternacional;
    }

    public abstract double calcularCosto();

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public boolean isEsInternacional() {
        return esInternacional;
    }

    public void setEsInternacional(boolean esInternacional) {
        this.esInternacional = esInternacional;
    }

}
