package app;
import java.util.Objects;
public class Estudiante implements Observer {
    private String nombre;
    private String email;
    private String celular;
    private String area;
    public Estudiante(String nombre, String email, String celular, String area) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.area = area;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getEmail() {
        return this.email;
    }
    public String getCelular() {
        return this.celular;
    }
    public String getArea() {
        return this.area;
    }
    @Override
    public void update(Observer observer, String area) {
        if (Objects.equals(this.area, area)) {
            System.out.println("Hay una nueva oferta para el area " + area);
        }
    }
}

