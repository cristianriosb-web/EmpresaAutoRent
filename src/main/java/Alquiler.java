import java.time.LocalDate;
public class Alquiler {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int dias;
    public Alquiler(String codigo, LocalDate fecha, Cliente cliente, Vehiculo vehiculo, int dias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    public double calcularCostoTotal(
    ){
        return vehiculo.calcularCostoAlquiler(dias);

    }
    @Override
    public String toString() {
        return "Alquiler{" + "codigo=" + codigo + ", fecha=" + fecha + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", dias=" + dias + "costo Total: "+ calcularCostoTotal()+ '}';
    }
}
