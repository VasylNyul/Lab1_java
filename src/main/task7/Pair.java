package main.task7;

public class Pair {
    private Product product;
    private int count;

    public Pair(final Product product, final int count){
        this.product = product;
        this.count = count;
    }

    public double totalPrice() { return product.getPrice() * count;}

    public static double totalAmount(final Pair[] array){
        double total = 0;


        for (final Pair i : array) {
            total += i.totalPrice();
        }
        return total;
    }

    @Override
    public String toString(){ return (product.getName() + "  " + product.getPrice() + " * "+ count + " = " + totalPrice());}
}
