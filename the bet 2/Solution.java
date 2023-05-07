
package the bet 2;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int S1=sc.nextInt();
        int S2=sc.nextInt();
        int S3=sc.nextInt();
        
        
        if(S3<S1 && S3<S2){
            System.out.println("Sonu");
        }
        else if(S2<S1 && S2<S3){
            System.out.println("Bob");
        }
        else{
            System.out.println("Draw");
        }
    

        
	}
}
