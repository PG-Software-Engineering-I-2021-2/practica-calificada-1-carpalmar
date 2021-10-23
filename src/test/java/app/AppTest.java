package app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void testMain(){
        String[] args = new String[1];
        args[0] = "Practica Calificada 01";
        App.main(args);
        Assert.assertTrue(true);
    }
}
