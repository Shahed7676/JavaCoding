import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        char val=sc.next().charAt(0);


/*
        if(val=='A'){
            System.out.println("Excellent!");
        }
        else if(val=='B'){
            System.out.println("Well done!");
        }
        else if(val=='C'){
            System.out.println("You passed!");
        }
        else if(val=='F'){
            System.out.println("Better luck next time!");
        }
        else{
            System.out.println("Invalid grade");
        }
        */


 switch(val){
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("You passed!");
                break;
            case 'F':
                System.out.println("Better luck next time!");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
    }
}