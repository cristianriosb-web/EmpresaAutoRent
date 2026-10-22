public class Automovil extends Vehiculo {

    private static final double RECARGO = 20000;

    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int añoFabricacion,
                     EstadoVehiculo estado, int numeroPuertas) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (TARIFA_BASE + RECARGO) * dias;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}