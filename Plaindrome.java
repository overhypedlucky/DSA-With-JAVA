import java.util.*;

class Plaindrome{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a value of n :");
        int n = s1.nextInt();
        s1.close();
        boolean isPlaindrome = checkPlaindrome(n);
        System.out.println((isPlaindrome) ? "Is Plaindrome" : " is not a Plaindrome");
    }
    public static boolean checkPlaindrome(int n){
        if(n < 0){
            return false;
        }
        int original = n;
        int rev =0;
        while(n > 0){
            rev =rev *10 +n%10;
            n/=10;
        }
        return rev == original;
    }
}