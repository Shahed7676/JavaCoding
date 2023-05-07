import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%3==0 && x%4==0){
            System.out.println("Divisible by 3 and 4");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}