import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PopulationTest {
    

    Population pop;

    @BeforeEach
    public void add(){
        pop=new Population();
        pop.add("mumbai",2000);
        pop.add("pune",4000);
        pop.add("Banglore",1000);
    }

    @Test
    public void getPopulation(){
        assertEquals(4000,pop.countPopulation("pune"));
    }
    
}
