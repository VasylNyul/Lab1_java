package main;

public class Task3 {
    public static void main(final String[] args) {

        final int b = factorialREC(3);
        System.out.println(b);
        final int a = factorial(3);
        System.out.println(a);
    }
    public static int factorialREC(final int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
    static int factorial(final int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }
}
