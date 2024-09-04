package LEC36;

public class exception_finally {
    public static void main(String[] args) {
        try {
            int res = divide(10 , 0);
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally is alwasy executed");
        }
    }
    public static int divide(int a , int b){
        return a/b;
    }
}
