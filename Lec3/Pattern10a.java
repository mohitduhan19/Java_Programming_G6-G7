package Lec3;

public class Pattern10a {
    public static void main(String[] args) {
        int n=5;
        for(int row=n;row>=1;row--){
           // space
            for(int space=1;space<=5-row;space++){
                System.out.print("  ");
            }
            // star
            for(int star=1;star<=2*row-1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
