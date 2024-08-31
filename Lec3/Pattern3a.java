package Lec3;

public class Pattern3a {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int star=1;star<=n+1-row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
