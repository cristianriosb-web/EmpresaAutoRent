import java.util.List;
import java.util.ArrayList;

public class AutoRent {
    private String nombre;
    private String ciudad;

    private List<Cliente> listaClientes;
    private List<Vehiculo> listaVehiculos;
    private List<Alquiler> listaAlquiler;

    public AutoRent(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.listaClientes = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaAlquiler = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Alquiler> getListaAlquiler() {
        return listaAlquiler;
    }

    public void setListaAlquiler(List<Alquiler> listaAlquiler) {
        this.listaAlquiler = listaAlquiler;
    }

}
