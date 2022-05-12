/*
Question no 01 .
Write a program to calculate the percentage of a given student in the CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
 */

import java.util.Scanner;


public class PracticeQuestion01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks from the 1st Subject ; ");
        int mark1 = input.nextInt();

        System.out.print("Enter your marks from the 2nd Subject ; ");
        int mark2 = input.nextInt();

        System.out.print("Enter your marks from the 3rd Subject ; ");
        int mark3 = input.nextInt();

        System.out.print("Enter your marks from the 4th Subject ; ");
        int mark4 = input.nextInt();

        System.out.print("Enter your marks from the 5th Subject ; ");
        int mark5 = input.nextInt();

        float total_marks = (mark1 + mark2 + mark3 + mark4 + mark5)/5 ;

        System.out.println("The percentage of all five marks entered is "+total_marks);
    }
}
