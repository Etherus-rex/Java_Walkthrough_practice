/*

Write a Java program to find whether a year entered by the user is a leap year or not.

 */

import java.util.Scanner;


public class PracticeQuestion13 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the year : ");
        short year = input.nextShort();

        if (year%2==0 && year%100==0){
            System.out.println("the year "+year+" is a leap year");
        }
        else {
            System.out.println("the year "+year+" is not a leap year");
        }
    }
}
