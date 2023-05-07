import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>B && A>C){
            System.out.println(Math.max(B,C));
        }
        else if(B>C && B>A){
            System.out.println(Math.max(C,A));
        }
        else if(C>A && C>B){
            System.out.println(Math.max(A,B));
        }
    }
}