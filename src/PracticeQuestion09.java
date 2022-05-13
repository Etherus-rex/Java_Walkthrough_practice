/*
Write the following expression in a java program:   (v^2-u^2)/2as
 */

import java.util.Scanner;


public class PracticeQuestion09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the initial velocity ");
        float u = input.nextFloat();

        System.out.print("Enter the Final velocity ");
        float v = input.nextFloat();

        System.out.print("Enter the Value of Acceleration ");
        float a = input.nextFloat();

        float s = (v*v-u*u)/(2*a) ;

        System.out.println("the distance Calculated through the values you entered "+s);

    }
}
