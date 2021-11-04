package exercise4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double maxElement = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("Max number: " + maxElement);
    }
}
