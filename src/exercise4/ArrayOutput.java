package exercise4;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        String output = "";

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.println(array[i]);
            } else {
                output += " ";
                System.out.println(output + array[i]);
            }
        }
    }
}
