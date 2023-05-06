public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int lengthOfRec=sc.nextInt();
        int breadthOfRec=sc.nextInt();
        System.out.println(lengthOfRec*breadthOfRec);
        System.out.println((lengthOfRec*2)+(breadthOfRec*2));
    }
}