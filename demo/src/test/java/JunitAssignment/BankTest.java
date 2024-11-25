package JunitAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    BankAccount b;

    @BeforeEach
    public void addData(){
        b=new BankAccount(2000);
    }

    @Test
    public void add(){

        assertEquals(3000, b.addAmount(1000));
    }

    @Test
    public void withdraw(){

        assertEquals(1000, b.withdrawAmount(1000));
    }

    @Test

    public void withdrawException(){
        assertThrows(InsufficientFundException.class, ()->{b.withdrawAmount(3000);});
    }
    
}
