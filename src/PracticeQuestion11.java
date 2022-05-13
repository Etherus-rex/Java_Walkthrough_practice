/*
Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%

 */

import java.util.Scanner;

public class PracticeQuestion11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your salary in Lacs and use decimal no System ; ");

        float income = input.nextFloat();

        if (income>=2.5 && income<5.0){
            float tax = income*0.05f;
            System.out.println("the amount of tax needed according to your income is "+tax+"L");
        }
        else if(income>=5.0 && income<10.0){
            float tax = income*0.2f;
            System.out.println("the amount of tax needed according to your income is "+tax+"L");
        }
        else if (income>=10.0){
            float tax = income*0.3f;
            System.out.print("the amount of tax needed according to your income is "+tax+"L");
        }
        else {
            System.out.println("your income is too low to pay any tax");
        }
    }
}
