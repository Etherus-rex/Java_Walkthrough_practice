/*
Write a Java program to convert Kilometers to miles.
 */

import java.util.Scanner;


public class PracticeQuestion05 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no of kilometers to be converted into  miles ; ");

        float km = input.nextFloat();
        float miles = km*0.621371f;

        System.out.println(km+" kilometers equals to "+miles+" miles");
    }
}
