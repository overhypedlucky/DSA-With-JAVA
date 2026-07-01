import java.util.*;

public class GreatestCommonDivisor {
    public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of num1 : ");
        int num1 = s1.nextInt();
        System.out.println("Enter the value of num2 : ");
        int num2 = s1.nextInt();
        int gdc = findGdc(num1,num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gdc);
    }

    public static int findGdc(int a,int b){
       while(b!=0){
        int temp = b;
        b =a%b;
        a = temp;
       }
       return Math.abs(a);
    }
}

