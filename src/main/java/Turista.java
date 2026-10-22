public class Turista extends Cliente{
    public String visa;

    public Turista(String nombre, String correo, String documento, String visa) {
        super(nombre, correo, documento);
        this.visa = visa;
    }
    public String getVisa() {
        return visa;
    }
    public void setVisa(String visa) {
        this.visa = visa;
    }
}
