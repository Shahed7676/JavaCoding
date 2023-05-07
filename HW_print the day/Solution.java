import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Write a Java program that prompts the user to enter a number between 1 and 7 (inclusive) that represents a day of the week. The program should then use a switch statement to output the corresponding name of the day of the week.

for 1 output is Monday , for 2 output is Tuesday and so on. */
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        
    }
}