package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];

        double minElement = Double.MAX_VALUE;
        int minElementIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            if (array[i] < minElement) {
                minElement = array[i];
                minElementIndex = i;
            }
        }
        
        System.out.println("Min index: " + minElementIndex);
    }
}
