package Lec3;
public class Pattern4a {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=5-row;space++){
                System.out.print("  ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
