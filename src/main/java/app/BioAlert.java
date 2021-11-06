package app;
import java.util.Objects;
public class BioAlert implements Observer {
    private String nombre;
    private String email;
    private String librodisponible;
    public BioAlert(String nombre, String email, String librodisponible) {
        this.nombre = nombre;
        this.email = email;
        this.librodisponible = librodisponible;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getEmail() {
        return this.email;
    }
    public String getArea() {
        return this.librodisponible;
    }
    @Override
    public void update(Observer observer, String librodisponible) {
        if (Objects.equals(this.librodisponible, librodisponible)) {
            System.out.println("Hay una nueva oferta para el area " + librodisponible);
        }
    }
}