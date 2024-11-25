package JunitAssignment.orderprocessingsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ProductTest {


    Order o;
    @Test
    public void totalSumOfProduct(){
        Product p1=new Product("Phone", 1000, 2);
        Product p2=new Product("Charger", 200, 1);
        Product p3=new Product("earphones", 600, 1);
        Order o=new Order(Arrays.asList(p1,p2,p3));
        assertEquals(2800,o.calculateTotalPrice());
        
    }
    
}
