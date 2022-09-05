package main.task7;

import java.util.Arrays;

public class Task7 {

    public static void main(final String[] args) {

        final Product[] product = new Product[]{new Product("bread", 15.0),new Product("eggs", 5.50),new Product("sausage", 50.0),new Product("butter", 30.0)};
        final Pair[] pair = new Pair[]{new Pair(product[0], 1),new Pair(product[1], 3),new Pair(product[2], 1),new Pair(product[3], 2) };
        Arrays.stream(pair).forEach(System.out::println);

        System.out.println("Total amount "+ Pair.totalAmount(pair));
    }
}
