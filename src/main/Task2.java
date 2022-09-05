package main;

public class Task2 {


    public static void main(final String[] args) {


        final String s = "bbbaad";
        String s1 = "";
        final char c = 'd';
        final char[] myCharArray = s.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            if (myCharArray[i] != c) {
               s1 += myCharArray[i];
            }
        }
        System.out.println(s1);
    }
}
