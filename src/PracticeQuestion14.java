/*
Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website

 */

import java.util.Scanner;


public class PracticeQuestion14 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("enter the url of the website u want to get info on ; ");
        String link = input.nextLine();

        boolean com , org , in ;

        com = link.endsWith(".com");
        org = link.endsWith(".org");
        in = link.endsWith(".in");

        if (com==true){
            System.out.println("commercial Website");
        }
        else if (org==true){
            System.out.println("organization website");
        }
        else if (in == true){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("not valid ");
        }

        input.close();
    }
}
