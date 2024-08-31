package Lec18;


public class Dynamic_Method_Dispatch {
    static class Bird{
        int eye;
        Bird(int eye){
            this.eye = eye;
        }
    }
    static class sparrow extends Bird{
        int wings = 2;
        sparrow(int eye , int wings){
            super(eye);
            this.wings=wings;
        }
    }

    public static void main(String[] args) {
       // Bird obj = new Bird(2);
        //Dynamice method dispatch

        Bird obj = new sparrow(2 , 2);
        System.out.println(obj.eye);

        //sparrow obj = new Bird(2);   WRONG
    }
}
