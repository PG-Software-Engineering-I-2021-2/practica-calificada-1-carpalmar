package app;
public class LibroCopia {
    private LibroTitulo libroTitulo;
    private String edicion;
    private String anho;
    private String estado;
    public LibroCopia(LibroTitulo libroTitulo, String anho, String edicion, String estado) {
        this.libroTitulo = libroTitulo;
        this.anho = anho;
        this.edicion = edicion;
        this.estado = estado;
    }
    public LibroTitulo getLibroTitulo() {
        return this.libroTitulo;
    }


    public String getEdicion() {
        return this.edicion;
    }
    public String getAnho() {
        return this.anho;
    }
    public String getEstado() {return this.estado;}
}