/*
Use comparison operators to find out whether a given number is greater than the user entered number or not.

 */

import java.util.Scanner;

public class PracticeQuestion08 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number ; ");
        int x = input.nextInt();

        System.out.print("Enter the Second Number : ");
        int y = input.nextInt();

        if (x>y) {
            System.out.print("First number is Greater than the Second one");
        }
        else if (x<y){
            System.out.print("First number is Smaller than the Second one");
        }
        else {
            System.out.print("both are equal");
        }
    }
}
