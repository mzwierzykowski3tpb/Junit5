import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTestClass {

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result, "Expected 4 as the result of addition");
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result, "Expected 2 as the result of subtraction");
    }

    @Test
    public void testMultiplication() {
        int result = 4 * 3;
        assertEquals(12, result, "Expected 12 as the result of multiplication");
    }

    @Test
    public void testDivision() {
        int result = 10 / 2;
        assertEquals(5, result, "Expected 5 as the result of division");
    }
}
