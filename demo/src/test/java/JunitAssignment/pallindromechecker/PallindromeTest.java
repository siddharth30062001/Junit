package JunitAssignment.pallindromechecker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PallindromeTest {


    PallindromeChecker p=new PallindromeChecker();
    @ParameterizedTest
    @CsvSource({
        "'madam',true",
        "'racecar',true",
        "'hello',false"
    })

    public void check(String s,boolean result){

        assertEquals(result,p.isPallindrome(s));
    }
    
}
