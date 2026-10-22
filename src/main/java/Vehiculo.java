public abstract class Vehiculo {

    protected static final double TARIFA_BASE = 10000;

    private String placa;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private EstadoVehiculo estado;

    public Vehiculo(String placa, String marca, String modelo, int añoFabricacion, EstadoVehiculo estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.estado = estado;
    }

    public abstract double calcularCostoAlquiler(int dias);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return añoFabricacion;
    }

    public void setAnioFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
}