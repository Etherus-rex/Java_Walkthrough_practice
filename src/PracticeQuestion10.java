/*
Write a program to find out whether a student is pass or fail;
if it requires a total of 40% and at least 33% in each subject to pass.
Assume 3 subjects and take marks as input from the user.
 */

import java.util.Scanner;


public class PracticeQuestion10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Note you need enter the marks out of 100");

        System.out.print("Enter the marks for the 1st Subject");
        int marks1 = input.nextInt();

        System.out.print("Enter the marks for the 2nd Subject");
        int marks2 = input.nextInt();

        System.out.print("Enter the marks for the 3rd Subject");
        int marks3 = input.nextInt();

        if (marks1>33 && marks2>33 && marks3>33){
            float percentage = (marks1+marks2+marks3)/(3);
            if (percentage>=40){
                System.out.println("According to the marks you entered u passed with "+percentage+" percentage");
            }
            else {
                System.out.println("u have more than 33 percentage in every subject but u have failed ");
                System.out.println("because u have a total of less than 40 percentage overall");
            }

        }
        else {
            System.out.println("Sorry u have failed");
        }
    }
}
