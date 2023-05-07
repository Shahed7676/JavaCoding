import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Write a program that prompts the user to enter a month number (1-12) and uses a switch statement to display the name of the corresponding month. If the user enters an invalid number, the program should print Invalid Number.
for 1 print January , for 2 print Feburary and so on. */
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feburary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");
        }
        
    }
}