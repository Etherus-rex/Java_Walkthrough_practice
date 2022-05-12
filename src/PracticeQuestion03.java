// Write a program to calculate CGPA using marks of three subjects (out of 100)

import java.util.Scanner;

public class PracticeQuestion03 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks for 1st subject : ");
        int sub1 = input.nextInt();

        System.out.print("Enter the marks for 2nd Subject : ");
        int sub2 = input.nextInt();

        System.out.print("Enter the marks for 3rd subject : ");
        int sub3 = input.nextInt();

        int total = sub1 + sub2 + sub3 ;

        float CGPA = total/30.0f;

        System.out.println("Your CGPA Based on the marks u entered is "+CGPA);
    }
}
