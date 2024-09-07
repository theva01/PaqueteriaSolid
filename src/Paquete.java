public class Paquete extends Servicio{

    private double peso;

    public Paquete(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double peso) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.peso = peso;
    }

    @Override
    public double calcularCosto() {
        return valorBase + peso * 10;  // Ejemplo de cálculo basado en el peso
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
