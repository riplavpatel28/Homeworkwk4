package Homeworkwk4;

import java.util.Scanner;

/**Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *

 */
public class LeftAngleTriangle15 {
    public static void main(String[] args) {
        LeftAngleTriangle15 leftAngleTriangle15 = new LeftAngleTriangle15();
        leftAngleTriangle15.displayLeftAngleTriangle();
    }

    private void displayLeftAngleTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int row = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
