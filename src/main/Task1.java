package main;

public class Task1 {

    public static void main(final String[] args) {

        final String[] strings = {"a", "aaaaa", "aaaa", "aa", "aaa",};
        final int[] count = {0, 0, 0, 0, 0};

        final char c = 'a';

        System.out.println("Sorted array elements:");
        for (int i = 0; i < strings.length; i++) {
            final char[] myCharArray = strings[i].toCharArray();
            for (int j = 0; j < myCharArray.length; j++) {
                if (myCharArray[j] == c) {
                    count[i] ++;
                }
            }
            strings[i] = new String(myCharArray);
        }
        String temp;
        int temp_int;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i +1; j < strings.length; j++) {
                if (count[i] >= count[j]) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;

                    temp_int = count[i];
                    count[i] = count[j];
                    count[j] = temp_int;
                }
            }
            System.out.println(strings[i]);
        }
    }
}
