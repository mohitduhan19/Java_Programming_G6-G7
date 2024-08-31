package Lec3;

public class Pattern2a {
    public static void main(String[] args) {
        int n=50;
        for(int row=1;row<=n;row++){
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
