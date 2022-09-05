package main;

import main.task8.CustomDouble;

import java.util.Scanner;

public class Task9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args){
        try {

            //final int num1 = getInt();
            //final int num2 = getInt();
            final CustomDouble dobl1 = new CustomDouble(getDouble());
            final CustomDouble dobl2 = new CustomDouble(getDouble());
            CustomDouble dobl3 = null;

            dobl3 = new CustomDouble(0, 0.0);

            final char operation = getOperation();
            //int result = 0;
            double resultd = 0.0;

            switch (operation) {
                case '+':
                    //result = num1 + num2;
                    dobl3 = dobl1.Sum(dobl2);
                    System.out.println("Результат операції: " + dobl3.toDouble());
                    break;
                case '-':
                    //result = num1 - num2;
                    dobl3 = dobl1.Sub(dobl2);
                    System.out.println("Результат операції: " + dobl3.toDouble());
                    break;
                case '*':
                    // result = num1 * num2;
                    final double a1 = dobl1.toDouble();
                    final double b1 = dobl2.toDouble();
                    resultd = a1 * b1;
                    System.out.println("Результат операції: " + resultd);
                    break;
                case '/':
                    //result = num1 / num2;
                    final double a2 = dobl1.toDouble();
                    final double b2 = dobl2.toDouble();
                    resultd = a2 / b2;
                    System.out.println("Результат операції: " + resultd);
                    break;
                default:
                    System.out.println("Операція не распізнана. Повторіть ввід.");
            }

            //System.out.println("Результат операції: " + result);
        }catch (final Exception e){
            System.out.println(e);
        }

    }

    public static int getInt() {
        System.out.println("Введіть число:");
        final int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили помилку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсія
            num = getInt();
        }
        return num;
    }

    public static double getDouble() {
        System.out.println("Введіть число:");
        final double num;
        if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
        } else {
            System.out.println("Ви припустили помилку при вводі числа. Спробуйте ще раз.");
            scanner.next();//рекурсія
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введіть операцію:");
        final char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ви припустили помилку при вводі операції. Спробуйте ще раз.");
            scanner.next();//рекурсія
            operation = getOperation();
        }
        return operation;
    }

}