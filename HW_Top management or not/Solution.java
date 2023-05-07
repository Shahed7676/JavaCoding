import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Take in experience, salary and rank as integer inputs, then

a. If experience is greater than or equal to 10 years or the salary is greater than or equal to 50,000 or rank is greater than or equal to 10, then print You are in top management

b. Else print You are not in top management */
        
        Scanner sc=new Scanner(System.in);
        int experience=sc.nextInt();
        int salary=sc.nextInt();
        int rank=sc.nextInt();
        
        if(experience>=10 || salary>=50000 || rank>=10){
            System.out.println("You are in top management");
        }
        else{
            System.out.println("You are not in top management");
        }
        
    }
}