import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        int expectedResult = 3;

        int result = calculator.add(1, 2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void addTest2(){
        int expectedResult = 5;

        int result = calculator.add(3, 2);

        assertEquals(expectedResult, result);
    }
}
