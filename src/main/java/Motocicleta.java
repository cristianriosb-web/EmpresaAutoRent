public class Motocicleta extends Vehiculo {

    private static final double DESCUENTO = 0.10;

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int añoFabricacion,
                       EstadoVehiculo estado, int cilindraje) {
        super(placa, marca, modelo, añoFabricacion, estado);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return TARIFA_BASE * dias * 0.90;
    }
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}