package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        char[] array = new char[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.next().charAt(0);
        }

        char tmp;

        for (int i = 0; i < size / 2; i++) {
            tmp = array[i];
            array[i] = array[size - (i + 1)];
            array[size - (i + 1)] = tmp;
        }

        String output = Arrays.toString(array);
        System.out.println("Reversed symbols: " + output);
    }
}
