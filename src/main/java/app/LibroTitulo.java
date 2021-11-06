package app;
import java.util.ArrayList;
import java.util.List;
public class LibroTitulo {
    private String nombre;
    private Autor autor;
    private ArrayList<LibroCopia> copias = new ArrayList<>();
    public LibroTitulo(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
    }
    public void agregarCopia(LibroCopia copia) {
        this.copias.add(copia);
    }
    public String getNombre() {
        return this.nombre;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public List<LibroCopia> getCopias() {
        return this.copias;
    }
}