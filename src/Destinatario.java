public class Destinatario extends Cliente{

    private String calle;
    private String ciudad;
    private String pais;

    public Destinatario(String idCliente, String nombreCompleto, String telefono, String calle, String ciudad, String pais) {
        super(idCliente, nombreCompleto, telefono);
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
