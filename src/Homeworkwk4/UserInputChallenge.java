package Homeworkwk4;

import java.util.Scanner;

public class UserInputChallenge
{
    int iNo[] = new int[10];
    int sum =0,num;
    Scanner sc = new Scanner(System.in);
    public boolean hasNextInt(int no)
    {
        if(no<1)
        {
            System.out.println("invalid no");
            return false;
    }
        else
        {
            System.out.println("Enter No #");
            no = sc.nextInt();
        }
        this.num = no;
        return true;
    }
        public void nextInt()
        {
            int i = 1;
            while (i<=num)
            {
                System.out.println("Enter number #"+i+"");
                iNo[i]= sc.nextInt();
                sum = sum+iNo[i];
                i++;
            }
            System.out.println("Sum of Numbers are :"+sum);
            sc.close();
        }

    public static void main(String[] args) {

        UserInputChallenge r1 = new UserInputChallenge();
        r1.hasNextInt(10);
        r1.nextInt();
    }
}

