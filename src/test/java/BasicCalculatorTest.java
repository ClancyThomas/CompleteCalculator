import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicCalculatorTest {

    @Test
    public void add_threeAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(8, basic.add(3,5),.01);
    }

    @Test
    public void add_tenAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(15.30, basic.add(10.14,5.16),.01);
    }

    @Test
    public void subtract_threeAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(-2, basic.subtract(3,5),.01);
    }

    @Test
    public void multiply_threeAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(15, basic.multiply(3,5),.01);
    }

    @Test
    public void divide_tenAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(2, basic.divide(10,5),.01);
    }
}
