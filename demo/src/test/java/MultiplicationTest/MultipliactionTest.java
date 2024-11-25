package MultiplicationTest;
import com.example.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipliactionTest {

    Multiplication m=new Multiplication();

    @ParameterizedTest
    @CsvSource({
        "2,4,8",
        "6,5,30",
        "-2,-3,6",
        "0,5,0"
    })
    public void testMultiply(int a,int b,int expected){
        assertEquals(expected,m.mul(a, b));
    }
    
    
}
