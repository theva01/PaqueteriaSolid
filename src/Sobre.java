public class Sobre extends Servicio {

    private double tarifaFija;

    public Sobre(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double tarifaFija) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.tarifaFija = tarifaFija;
    }

    @Override
    public double calcularCosto() {
        return valorBase + tarifaFija;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }
}
