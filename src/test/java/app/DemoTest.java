package app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void testSum() {
        Demo demo = new Demo();
        Assert.assertEquals(demo.sum(3, 5), 8);
    }

    @Test
    public void testProduct() {
        Demo demo = new Demo();
        Assert.assertEquals(demo.product(3, 5), 15);
    }

    @Test
    public void testSubtract() {
        Demo demo = new Demo();
        Assert.assertEquals(demo.subtract(3, 5), -2);
    }
}
