package Homeworkwk4;

import java.util.Scanner;

/**
        * Display right angle triangle of @ using nested for loops
        * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */


public class RightAngleTriangle8 {
    public static void main(String[] args) {
        RightAngleTriangle8 rightAngleTriangle8 = new RightAngleTriangle8();
        rightAngleTriangle8.displayRightAngleTriangle();
    }

    private void displayRightAngleTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("@");
            }
            System.out.println();
        }
        scanner.close();

    }
}
