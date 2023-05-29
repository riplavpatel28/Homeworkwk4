package Homeworkwk4;

/**Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp % 2 == 0) {
                sum = sum + temp;
            }
            number = number / 10;
        }
        return sum;
    }


    }

