import java.util.*;

class Reverse{
    public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n =s1.nextInt();
        int x = reverse(n);
        System.out.println("The reversed number is : " + x);
    }
    public static int reverse(int n){
        n = Math.abs(n);
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n%10;
            n/=10;
        }
        return rev;
    }
    
}