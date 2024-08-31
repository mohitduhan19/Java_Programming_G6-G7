package Lec6;
//It is a collection of statement that performs an specific task.
//It executes when it is called by its name.
//A large program is devided into a number of small building block for simplicity and this building block is called function.
//We can call a function again and again.
//The most importent features of function is code reusability
public class Function_Demo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("hello");
        Add();
    }
    public static void Add(){
        int a=10;
        int b=30;
        int c=a+b;
        System.out.println(c);
        Sub();
    }
    public static void Sub(){
        int b=20;
        int a=10;
        int c=b-a;
        System.out.println(c);
    }
}
