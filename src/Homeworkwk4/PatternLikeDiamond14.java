package Homeworkwk4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class PatternLikeDiamond14 {
    public static void main(String[] args) {
        PatternLikeDiamond14 patternLikeDiamond14 = new PatternLikeDiamond14();
        patternLikeDiamond14.displayPatternLikeDiamond();
    }
    private void displayPatternLikeDiamond(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        scanner.close();
        int m, n;

        for (m = 1; m <= num; m++) {
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (m = num - 1; m > 0; m--) {
            for (n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
    }

