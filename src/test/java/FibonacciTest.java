import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Fibonacci test cases:
 *
 *
 * fibonacci 0       -> @return 0
 * fibonacci 1       -> @return 1
 * fibonacci 2       -> @return 1
 * fibonacci 8       -> @return 21
 * fibonacci 10      -> @return 55
 * fibonacci (n < 0) -> RuntimeException()
 *
 */

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    private void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldComputeReturn0IfTheNumberIs0(){
        assertEquals(0, fibonacci.compute(0));
    }

    @Test
    public void shouldComputeReturn1IfTheNumberIs1(){
        assertEquals(1, fibonacci.compute(1));
    }

    @Test
    public void shouldComputeReturn1IfTheNumberIs2(){
        assertEquals(1, fibonacci.compute(2));
    }

    @Test
    public void shouldComputeReturn21IfTheNumberIs8(){
        assertEquals(21, fibonacci.compute(8));
    }

    @Test
    public void shouldComputeReturn55IfTheNumberIs10(){
        assertEquals(55, fibonacci.compute(10));
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }


}
