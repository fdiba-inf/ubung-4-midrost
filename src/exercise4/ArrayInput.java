package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        String arrayOutput = Arrays.toString(array);
        System.out.println("Numbers: " + arrayOutput);
    }
}
