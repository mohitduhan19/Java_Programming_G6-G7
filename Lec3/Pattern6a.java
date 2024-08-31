package Lec3;

public class Pattern6a {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            // space
            for(int space=1;space<=2*row-2;space++){
                System.out.print("  ");
            }
            // star
            for(int star=1;star<=6-row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
