package main;

public class Task5 {
    public static void main(final String[] args) {

    final int n = 2;
    final int m = 3;
    final int[][] matrix1 = new int[n][m];
    final int[][] matrix2 = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = n*i + j;
            }
    }

        System.out.println("Початкова матриця");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matrix1[i][j]);
            }
            System.out.println();
    }


        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix1[j][i];
            }
        }


        System.out.println();
        System.out.println("Нова матриця");
        System.out.println("------");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%4d", matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
