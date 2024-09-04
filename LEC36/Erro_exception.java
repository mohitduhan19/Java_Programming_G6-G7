package LEC36;

public class Erro_exception {
    public static void main(String[] args) {
//        try {
//            int age = 15;
//            if(age < 18){
//                throw new ArithmeticException("Not eligible to vote");
//            }
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        try {
            divide(10 , 0);
        }catch (ArithmeticException e){
            System.out.println("Exception occured");
        }
    }
    public static void divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot divide");
        }else{
            System.out.println(a/b);
        }
    }
}
