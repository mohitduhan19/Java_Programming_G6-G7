package Lec5;

import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;
            cnt++;
        }
        System.out.println(B_Number);
    }
}
