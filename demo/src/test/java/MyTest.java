import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test1(){

        System.out.println("Hello");
    }

    @Test
    public void test2(){

        System.out.println("Hii");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Every Test Case");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Every Test case");
    }

    // @AfterAll
    // public void after(){
    //     System.out.println("After All Test case");
    // }

    // @BeforeAll
    // public void before(){
    //     System.out.println("Before All Test Case");
    // }
    
}
