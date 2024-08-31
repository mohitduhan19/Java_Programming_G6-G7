package LEC32;

public class isalive {
    static class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        public void run(){
            System.out.println("I m a thread");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("john");

        if(t1.isAlive())System.out.println("true");
        else System.out.println("false");
    }
}
