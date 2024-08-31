package Lec1;
// A Variable is a Data Holder which stores the data .
//There are 2 types of Variables.
//1. Global Variable (its have alse two type)
//• Static Variable / class Variable.
//• Non Static Variable / Instance variable.
//2. Local Variable
public class Varibal_Demo {
    // Global Variable:
    //A Global variable is a variable which is declared directly within class , outside method or
    //constructor.
    //If Global variable is static , then it is called class variable .
    //If Global variable is non static , then it is called Instance variable
    static int a=20; // static variable
    int b=20;  // instance variable or non static valriable
    public static void main(String[] args) {
        //• Local variable is a variable which is created within a method or constructor or block.
        //• Local variable must be initialized before use . i.e.., Default initialization is not applicable
        //for local variable.
        int b=20;
        System.out.println(b);
    }
}
