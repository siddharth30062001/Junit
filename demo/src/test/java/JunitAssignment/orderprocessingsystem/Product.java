package JunitAssignment.orderprocessingsystem;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private double price;
    private int quantity;

    Product(String productName, double price, int quantity){
        this.productName= productName;
        this.price= price;
        this.quantity= quantity;
    }

    public String getName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    
}

class Order{


    List<Product> products;

    Order(List<Product> products){
        this.products=products;
    }


    public double calculateTotalPrice() {
       double total=0;
       for(Product p:products){
        total=total+p.getPrice()*p.getQuantity();
       }
       return total;
    }
    
}
