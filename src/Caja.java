public class Caja extends Servicio{

    private double tarifaAdicional;
    private double volumen;

    public Caja(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double tarifaAdicional, double volumen) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.tarifaAdicional = tarifaAdicional;
        this.volumen = volumen;
    }

    @Override
    public double calcularCosto() {
        return valorBase + tarifaAdicional * volumen;
    }

    public double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
