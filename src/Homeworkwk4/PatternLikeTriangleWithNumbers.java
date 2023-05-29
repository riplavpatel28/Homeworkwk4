package Homeworkwk4;

import java.util.Scanner;

public class PatternLikeTriangleWithNumbers {

    public static void triangleWithNumbers() {
        int  z;
        int x =1;
        int y =1;
        System.out.println("Enter number of Rows :");
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();
        for (x = 1; x <=z; x++) {
            for (y = 1; y <= x; y++) {

                System.out.print(" " + y + " ");

            }
            System.out.println("");
        }
    }
    public static void main (String[]args){
        triangleWithNumbers();
    }
}

