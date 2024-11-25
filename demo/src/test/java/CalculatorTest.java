import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator=new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract(){
        assertEquals(1, calculator.sub(6, 5));
    }

    @Test
    void testMul(){
        assertEquals(10, calculator.mul(2, 5));
    }

    @Test
    void findMax(){
        assertEquals(92, calculator.calMax(new int[]{4,8,92,20}));
        assertEquals(-2, calculator.calMax(new int[]{-4,-8,-9,-2}));
    }


    
    
}
