package LEC32;

public class thread_sleep {
    static class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        public void run(){
            System.out.println("I m a thread");
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("john");
        MyThread t2 = new MyThread("Kira");

        t1.start();
        t2.start();
    }
}
