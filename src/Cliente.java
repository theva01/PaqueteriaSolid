import java.util.List;

public class Cliente {

    private String idCliente;
    private String nombreCompleto;
    private String telefono;
    private List<ArchivoServicio> ListaServicios;

    // Constructor
    public Cliente(String idCliente, String nombreCompleto, String telefono) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<ArchivoServicio> getListaServicios() {
        return ListaServicios;
    }

    public void setListaServicios(List<ArchivoServicio> listaServicios) {
        ListaServicios = listaServicios;
    }
}
