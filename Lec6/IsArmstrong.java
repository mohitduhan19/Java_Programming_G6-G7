package Lec6;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ArmStrong(n));
    }
    public static boolean ArmStrong(int n){
        int c=NoOgDigit(n);
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=(int) (sum+Math.pow(rem,c));
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        else {
            return false;
        }
    }
    public static int NoOgDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
