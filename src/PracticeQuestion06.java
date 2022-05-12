/*
Write a Java program to detect whether a number entered by the user is an integer or not.
 */
import java.util.Scanner;


public class PracticeQuestion06 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String data = ((Object)x).getClass().getSimpleName();
        data = data.toLowerCase();
        if (data=="integer"){
            System.out.println("the data u entered is a Integer");
        }
        else{
            System.out.println("the data u entered is not an integer");
        }
    }
}
