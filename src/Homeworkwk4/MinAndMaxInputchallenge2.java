package Homeworkwk4;

import java.util.Scanner;

/**
        * Read the numbers from the console entered by the user and print the minimum
        * and maximum number the user has entered.
        * -Before the user enters the number, print the message Enter number:
        * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        * number.
        * Hint:
        * -Use an endless while loop.
        * -Create a class with the name MinAndMaxInputChallenge.
        */


public class MinAndMaxInputchallenge2 {
    public static void main(String[] args) {
        MinAndMaxInputchallenge2 minAndMaxInputchallenge2 = new MinAndMaxInputchallenge2();
        minAndMaxInputchallenge2.printMinMax();
    }
    private void printMinMax() {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean empty = true;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();

                if (empty) {
                    min = temp;
                    max = temp;
                    empty = false;
                }

                if (min > temp) {
                    min = temp;
                }

                if (max < temp) {
                    max = temp;
                }
            } else {
                break;
            }
        }

        scanner.close();

        System.out.println("Min =" + min);
        System.out.println("Max =" + max);
    }
}