package Lec31;

public class thread_using_runnable {
    static class MyRunnableThread1 implements Runnable{
        public void run(){
            System.out.println("Thread 1 running");
        }
    }
    static class MyRunnableThread2 implements Runnable{
        public void run(){
            System.out.println("Thread 2 running");
        }
    }
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new  MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
