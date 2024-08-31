package LEC32;

public class Thread_constructor {
    static class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        public void run(){
            System.out.println("I m a thread");
        }
    }
    public static void main(String[] args) {
        MyThread t = new MyThread("john");
        t.start();
    }
}
