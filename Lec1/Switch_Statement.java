package Lec1;
// switch statement allows us to execute one statement from many statement and the statement are called case
public class Switch_Statement {
    public static void main(String[] args) {
        int day=2;
        switch (day){
            case 1:{
                System.out.println("monday");
                break;
            }
            case 2:{
                System.out.println("tuesday");
                break;
            }
            case 3:{
                System.out.println("wednesday");
                break;
            }
            case 4:{
                System.out.println("thrusday");
                break;
            }
            case 5:{
                System.out.println("friday");
                break;
            }
            case 6:{
                System.out.println("saturday");
                break;
            }
            case 7:{
                System.out.println("sunday");
                break;
            }
            default:{
                // if no case matched with parameter then default case will execute
                System.out.println("invalid input");
            }
        }
    }
}
