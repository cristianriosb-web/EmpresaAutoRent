import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AutoRent autoRent = new AutoRent("AutoRent","Armenia");
        Cliente cliente1 = new Turista("Juan","Juanmecanico001@gmail.com","123456789","Visa-001");
        Cliente cliente2= new Residente("Ramiro","Ramiro001@gmail.com","987654321","calle 5");
        Cliente cliente3= new Residente("Julian","Jul456@gmail.com","123789456","avenida 12");

        autoRent.getListaClientes().add(cliente1);
        autoRent.getListaClientes().add(cliente2);
        autoRent.getListaClientes().add(cliente3);

        Vehiculo vehiculo1 = new Camioneta("ABC123","Toyota","Hilux",2024,EstadoVehiculo.BUENO,140.2);
        Vehiculo vehiculo2 = new Motocicleta("XYZ987","AKT","NKD 125",2020,EstadoVehiculo.BUENO,124);
        Vehiculo vehiculo3 = new Automovil("DEF456","Ford","Focus",2018,EstadoVehiculo.MALO,4);
        autoRent.getListaVehiculos().add(vehiculo1);
        autoRent.getListaVehiculos().add(vehiculo2);
        autoRent.getListaVehiculos().add(vehiculo3);
        System.out.println("Clientes registrados:");
        for (Cliente cliente : autoRent.getListaClientes()) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Correo: " + cliente.getCorreo());
            System.out.println("Documento: " + cliente.getDocumento());
            System.out.println();
        }
        System.out.println("Vehículos registrados:");
        for (Vehiculo vehiculo : autoRent.getListaVehiculos()) {
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnioFabricacion());
            System.out.println("Estado: " + vehiculo.getEstado());
            System.out.println();
        }

        Alquiler alquiler1 = new Alquiler("12345", LocalDate.of(2026,7,10),cliente1,vehiculo1,4);
        autoRent.getListaAlquiler().add(alquiler1);

        System.out.println("Alquiler registrado:");
        System.out.println("Código: " + alquiler1.getCodigo());
        System.out.println("Fecha: " + alquiler1.getFecha());
        System.out.println("Cliente: " + alquiler1.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler1.getVehiculo().getMarca() + " " + alquiler1.getVehiculo().getModelo());
        System.out.println("Días: " + alquiler1.getDias());
        System.out.println("Costo total: $" + alquiler1.calcularCostoTotal());

        Alquiler alquiler2 = new Alquiler("54321", LocalDate.of(2026,9,15),cliente2,vehiculo2,2);
        autoRent.getListaAlquiler().add(alquiler2);

        System.out.println("Alquiler registrado:");
        System.out.println("Código: " + alquiler2.getCodigo());
        System.out.println("Fecha: " + alquiler2.getFecha());
        System.out.println("Cliente: " + alquiler2.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler2.getVehiculo().getMarca() + " " + alquiler2.getVehiculo().getModelo());
        System.out.println("Días: " + alquiler2.getDias());
        System.out.println("Costo total: $" + alquiler2.calcularCostoTotal());
        
        Alquiler alquiler3 = new Alquiler("67890", LocalDate.of(2026,10,20),cliente3,vehiculo3,3);
        autoRent.getListaAlquiler().add(alquiler3);

        System.out.println("Alquiler registrado:");
        System.out.println("Código: " + alquiler3.getCodigo());
        System.out.println("Fecha: " + alquiler3.getFecha());
        System.out.println("Cliente: " + alquiler3.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler3.getVehiculo().getMarca() + " " + alquiler3.getVehiculo().getModelo());
        System.out.println("Días: " + alquiler3.getDias());
        System.out.println("Costo total: $" + alquiler3.calcularCostoTotal());
    }
}
