/*
Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>,
 have a good day” text.
 */

import java.util.Scanner;

public class PracticeQuestion04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you mind telling me your name ; ");
        String name = input.nextLine();

        System.out.println("Hello "+name+", have a good day");

    }
}