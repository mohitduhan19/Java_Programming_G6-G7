package Lec5;

import java.util.Scanner;

public class Decimal_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deciNum = sc.nextInt();

        int octalNum = 0, countval = 1;
        int dNo = deciNum;
        while (deciNum != 0) {
            int remainder = deciNum % 8;
            octalNum += remainder * countval;
            countval = countval * 10;
            deciNum /= 8;
        }

        System.out.println(octalNum);
    }
}
