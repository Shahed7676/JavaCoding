
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ride=sc.nextInt();
        
        if(ride<200){
            System.out.println("regular ride");
        }
        else if(ride>200 && ride<500){
            System.out.println("average ride");
        }
        if(ride>500){
            System.out.println("premium ride");
        }
        
        
	}
}
