import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        switch(N){
            case 10:
                System.out.println(a+b);
                break;
            case 20:
                System.out.println(a-b);
                break;
            case 30:
                System.out.println(a*b);
                break;
            case 40:
                System.out.println(a%b);
                break;
            case 50:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter a valid number");
        }
    }
}