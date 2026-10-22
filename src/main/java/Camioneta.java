public class Camioneta extends Vehiculo {

    private static final double RECARGO = 50000;

    private double capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, int añoFabricacion,
                     EstadoVehiculo estado, double capacidadCarga) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (TARIFA_BASE + RECARGO) * dias;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}