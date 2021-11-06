package app;
import org.testng.Assert;
import org.testng.annotations.Test;
public class BibliotecarioTest {
    @Test
    public void BibliotecarioTest() {
        Bibliotecario bibliotecario = Bibliotecario.getInstance();
        Autor sommerfield = new Autor("Sommerfield", "18/11/1990");
        LibroCopia copia = bibliotecario.registrarLibro("Software Engineering", "1980", sommerfield,
                "6th edition","Disponible");
        bibliotecario.registrarLibro("Software Engineering", "1981", sommerfield, "7th edition","Disponible");
        bibliotecario.registrarLibro("Software Engineering", "1982", sommerfield, "8th edition","Disponible");
        LibroCopia softEngineering9 = bibliotecario.registrarLibro("Software Engineering", "1983",
                sommerfield, "9th edition","Disponible");
        Autor bob = new Autor("Robert Martin", "18/10/1970");
        bibliotecario.registrarLibro("Clean Code", "1990", bob, "6th edition","Prestado");
        bibliotecario.registrarLibro("Clean Code", "1991", bob, "7th edition","Rerservado");
        bibliotecario.registrarLibro("Clean Code", "1992", bob, "8th edition","Con retraso");
        bibliotecario.registrarLibro("Clean Code", "1993", bob, "9th edition","En reparacion");
        Assert.assertEquals(bibliotecario.getLibros().size(), 8);
        Assert.assertEquals(bibliotecario.buscarLibrosPorAuthor(sommerfield).size(), 4);
        Assert.assertEquals(bibliotecario.buscarLibroPorEdicion(copia.getLibroTitulo(), "9th edition"),
                softEngineering9);
        Assert.assertEquals(bibliotecario.buscarLibroPorEdicion(copia.getLibroTitulo(), "10th edition"),
                null);
        BioAlert luis = bibliotecario.registrarEstudiante("Carlos", "carlos@test.com", "123456789");
        bibliotecario.registerObserver(luis);
        Assert.assertEquals(luis.getNombre(), "Carlos");
        Assert.assertEquals(luis.getEmail(), "carlos@test.com");
        BioAlert jose = bibliotecario.registrarEstudiante("Pedro", "Pedro@test.com", "123456789");
        bibliotecario.registerObserver(jose);
        bibliotecario.removeObserver(luis);
    }
}
