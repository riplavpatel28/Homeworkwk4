package Homeworkwk4;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Fibonacci9 {
    public static void main(String[] args) {
        Fibonacci9 fibonacci9 = new Fibonacci9();
        fibonacci9.printFibonacci();
    }

    private void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of elements");
        int elements = scanner.nextInt();
        scanner.close();
        int firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + elements + " terms:");

        for (int i = 1; i <= elements; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
