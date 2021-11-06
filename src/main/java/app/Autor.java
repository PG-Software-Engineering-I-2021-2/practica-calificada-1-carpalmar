package app;
public class Autor {
    private String nombre;
    private String fechaNacimiento;
    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
}
