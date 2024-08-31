package Lec23;

public class string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        if(s1.equals(s3))System.out.println("True");
        else System.out.println("false");
        if(s1==s2)System.out.println("true");
        else System.out.println("false");
    }
}
