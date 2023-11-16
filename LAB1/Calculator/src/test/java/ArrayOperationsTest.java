import org.example.ArrayOperations;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOperationsTest {

    @Test
    public void testReverseArray() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = arrayOperations.reverseArray(original);
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, reversed);
    }

    @Test
    public void testFindMax() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {3, 7, 1, 9, 4};
        assertEquals(9, arrayOperations.findMax(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxEmptyArray() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] emptyArray = {};
        arrayOperations.findMax(emptyArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxNullArray() {
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.findMax(null);
    }

    // Dodaj więcej testów w miarę potrzeb, używając innych metod klasy assert

    @Test
    public void testFindMaxNegative() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {-3, -7, -1, -9, -4};
        assertEquals(-1, arrayOperations.findMax(array));
    }

    @Test
    public void testFindMaxOneElement() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {3};
        assertEquals(3, arrayOperations.findMax(array));
    }

    @Test
    public void testFindMaxTwoElements() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {3, 7};
        assertEquals(7, arrayOperations.findMax(array));
    }

    @Test
    public void testFindMaxTwoElementsNegative() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {-3, -7};
        assertEquals(-3, arrayOperations.findMax(array));
    }

    @Test
    public void testFindMaxTwoElementsEqual() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {3, 3};
        assertEquals(3, arrayOperations.findMax(array));
    }

    //use assertnotsame
    @Test
    public void testFindMaxTwoElementsNotSame() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {3, 7};
        assertNotSame(3, arrayOperations.findMax(array));
    }
}
