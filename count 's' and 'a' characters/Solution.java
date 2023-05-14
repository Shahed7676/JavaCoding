import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine();
	int s=0;
	int a=0;
	for(int i=0; i<str.length();i++){
	    if(str.charAt(i)=='s'){
	        s+=1;
	    }else if(str.charAt(i)=='a'){
	        a+=1;
	    }
	    
	}
	System.out.print(s+" "+a);
	    
	    
	}
}
