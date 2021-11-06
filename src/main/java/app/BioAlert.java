package app;
import java.util.Objects;
public class BioAlert implements Observer {
    private String nombre;
    private String email;
    private String librodisponible;
    public BioAlert(String nombre, String email, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.librodisponible = estado;
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
    public void update(Observer observer, String estado) {
        if (Objects.equals(this.librodisponible, estado)) {
            System.out.println(estado);
        }
    }
}