package Lec6;

public class Function_Demo2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int ans=Add(a,b);
        System.out.println(ans);
    }
    public static int Add(int a,int b){
        int c=a+b;
        return c+Sub();
    }
    public static int Sub(){
        int a=20;
        int b=30;
        return b-a;
    }
}
