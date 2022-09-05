package main.task7;
import java.util.Arrays;

public class Product {

    private String name;

    private double price;

    public String getName() { return name;}

    public double getPrice() {
        return price;
    }

    public Product(final String name, final double price){
        this.name = name;
        this.price = price;
    }

}
