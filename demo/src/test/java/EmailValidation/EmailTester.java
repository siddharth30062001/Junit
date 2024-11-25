package EmailValidation;
import com.example.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailTester {

    EmailValidation validator=new EmailValidation();

    @ParameterizedTest
    @ValueSource(strings ={
        "sid@gmail.com",
        "raj.com",
        "p@gmail.com",
        "abc@yahoo.com",
       "abc-100@yahoo.com",
       "abc.100@yahoo.com",
        "abc111@abc.com",
       "abc-100@abc.net",
      "abc.100@abc.com.au",
        "abc@1.com",
      "abc@gmail.com.com,",
       "abc+100@gmail.com"
    })

    public void checkEmail(String email){
        boolean result= validator.checkEmail(email);

        if(validator.checkEmail(email)){
            assertTrue(result, email +" should be valid");
        }
        else{
            assertFalse(result,email+" should be valid");
        }
    }

    // public void checkEmail(String s,boolean result){
    //     assertEquals(result, e.checkEmail(s));
    // }


    
}
