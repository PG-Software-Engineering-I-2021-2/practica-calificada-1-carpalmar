package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
public class Bibliotecario implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private static Bibliotecario bibliotecario;
    private List<LibroTitulo> libros = new ArrayList<>();

    private Bibliotecario() {
    }
    public static Bibliotecario getInstance() {
        if (bibliotecario == null) {
            return new Bibliotecario();
        }
        return bibliotecario;
    }
    private LibroTitulo buscarLibro(String nombre, Autor autor) {
        System.out.println("Buscar libro por nombre " + nombre + " y author " + autor.getNombre() + " "
                + autor.getFechaNacimiento());
        for (LibroTitulo libro : this.libros) {
            if (Objects.equals(libro.getNombre(), nombre) && Objects.equals(
                    libro.getAutor().getNombre(), autor.getNombre())) {
                return libro;
            }
        }
        return null;
    }
    public LibroCopia registrarLibro(String nombre, String anho, Autor autor, String edicion, String estado) {
        System.out.println(
                "Registrando libro: " + nombre + ", anho: " + anho + " autor: " + autor.getNombre()
                        + ", edicion: " + edicion+ ", estado: "+estado);
        LibroTitulo libro = this.buscarLibro(nombre, autor);
        if (libro == null) {
            libro = new LibroTitulo(nombre, autor);
            this.libros.add(libro);
        }
        LibroCopia copia = new LibroCopia(libro, anho, edicion, estado);
        libro.agregarCopia(copia);
        System.out.println("Registrando libro copia " + copia.getAnho());
        return copia;
    }
    public List<LibroCopia> buscarLibrosPorAuthor(Autor autor) {
        ArrayList<LibroCopia> librosPorAuthor = new ArrayList<>();
        for (LibroTitulo libro : this.libros) {
            if (Objects.equals(libro.getAutor().getNombre(), autor.getNombre())) {
                for (LibroCopia copia : libro.getCopias()) {
                    librosPorAuthor.add(copia);
                }
            }
        }
        return librosPorAuthor;
    }
    public LibroCopia buscarLibroPorEdicion(LibroTitulo libro, String edicion) {
        for (LibroTitulo l : this.libros) {
            if (l == libro) {
                for (LibroCopia copia : l.getCopias()) {
                    if (Objects.equals(copia.getEdicion(), edicion)) {
                        return copia;
                    }
                }
            }
        }
        return null;
    }
    public List<LibroCopia> getLibros() {
        List<LibroCopia> copias = new ArrayList<>();
        for (LibroTitulo libro : this.libros) {
            for (LibroCopia copia : libro.getCopias()) {
                copias.add(copia);
            }
        }
        return copias;
    }
    public BioAlert registrarEstudiante(String nombre, String email, String celular) {
        return new BioAlert(nombre, email, celular);
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    @Override
    public void notifyObservers(String area) {
        for (Observer ob : this.observers) {
            ob.update(ob, area);
        }
    }
}
