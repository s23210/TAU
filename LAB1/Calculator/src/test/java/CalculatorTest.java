import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }

    // Dodaj więcej testów w miarę potrzeb

    @Test
    public void testAddNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
    }

    //użyj innych metod z klasy Assert

    @Test
    public void testSubtractNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subtract(-5, -3));
    }

    @Test
    public void testMultiplyNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-15, calculator.multiply(-3, 5));
    }

    @Test
    public void testDivideNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-2.5, calculator.divide(-5, 2), 0.001);
    }

    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}
