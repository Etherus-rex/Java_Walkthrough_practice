//Write a program to sum three numbers in Java.


import java.util.Scanner;

public class PracticeQuestion02 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers u want to be added : ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int total = a + b + c;

        System.out.println("the total of all the numbers u entered is "+ total);
    }
}