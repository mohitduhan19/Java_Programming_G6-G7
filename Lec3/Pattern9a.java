package Lec3;

public class Pattern9a {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            // space
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int stat=1;stat<=2*row-1;stat++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
