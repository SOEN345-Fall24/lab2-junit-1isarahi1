import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    Example example;


    @BeforeEach
    public void setUp() {
        example = new Example(2, 3);
    }

    // Test for Function_A when y > 0
    @Test
    public void testFunctionA_PositiveY() {
        int result = example.Function_A(5); // y > 0
        assertEquals(7, result, "Function_A with positive y should return y + a");
    }

    // Test for Function_A when y <= 0
    @Test
    public void testFunctionA_NegativeY() {
        int result = example.Function_A(-3); // y <= 0
        assertEquals(-5, result, "Function_A with negative y should return y - a");
    }

    // Test for Function_B when x < 6
    @Test
    public void testFunctionB_LessThanSix() {
        int result = example.Function_B(4); // x < 6
        assertEquals(7, result, "Function_B with x < 6 should return x + b");
    }

    // Test for Function_B when x >= 6
    @Test
    public void testFunctionB_GreaterThanOrEqualToSix() {
        int result = example.Function_B(8); // x >= 6
        assertEquals(5, result, "Function_B with x >= 6 should return x - b");
    }
}
