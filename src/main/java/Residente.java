public class Residente extends Cliente{
    private String direccion;

    public Residente(String nombre, String correo, String documento, String direccion) {
        super(nombre, correo, documento);
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
