package Lec4;

public class Conditional_Opetators_Or_Ternary_Operator {
    public static void main(String[] args) {
      //  int n=10;
//        if(n%2==0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }
    //    System.out.println((n%2==0?"even":"odd"));
        int a=5;
        int b=10;
        int max=a>b?a:b; // if the condition is true second part will execute otherwise third part will execute
        System.out.println(max);
    }
}
