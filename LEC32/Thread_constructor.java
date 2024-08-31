package LEC32;

public class Thread_constructor {
    static class MyThreads extends Thread{
        MyThreads(String name){
            super(name);
        }
        public void run(){
            System.out.println("I m a thread");
        }
    }
    public static void main(String[] args) {
        MyThreads t = new MyThreads("john");
        t.start();
    }
}
