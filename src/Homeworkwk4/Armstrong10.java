package Homeworkwk4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Armstrong10 { public static void main(String[] args) {
    Armstrong10 armstrong10 = new Armstrong10();
    armstrong10.isArmstrong();

}


    public void isArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        int tempNumber = number;
        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            sum = sum + temp * temp * temp;
            number = number / 10;
        }

        if (sum == tempNumber) {
            System.out.println("number is Armstrong");
        } else {
            System.out.println("number is not Armstrong");
        }
    }
}
