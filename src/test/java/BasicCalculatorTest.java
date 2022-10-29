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
    public void subtract_oneHundredAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(95, basic.subtract(100,5),.01);
    }

    @Test
    public void subtract_threeAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(-2, basic.subtract(3,5),.01);
    }

    @Test
    public void subtract_tenAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(9, basic.subtract(10.59,1.59),.01);
    }

    @Test
    public void multiply_threeAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(15, basic.multiply(3,5),.01);
    }

    @Test
    public void multiply_twoAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(-10, basic.multiply(-2,5),.01);
    }

    @Test
    public void multiply_threeAndTwo() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(6.2, basic.multiply(3.1,2),.01);
    }

    @Test
    public void divide_tenAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(2, basic.divide(10,5),.01);
    }

    @Test
    public void divide_fiftyAndFive() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(10, basic.divide(50,5),.01);
    }

    @Test
    public void divide_sixAndthree() {
        BasicCalculator basic = new BasicCalculator();
        assertEquals(2.062, basic.divide(6.6,3.2),.01);
    }
}
