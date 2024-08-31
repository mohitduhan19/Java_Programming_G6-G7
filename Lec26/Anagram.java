package Lec26;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean ans=Arrays.equals(str1,str2);
        System.out.println(ans);

    }
}
