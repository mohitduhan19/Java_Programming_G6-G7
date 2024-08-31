package Lec31;

public class Multithreading_usinf_extend {
    static class MyThread1 extends Thread{
        public void run(){
            System.out.println("Thread 1 running");
        }
    }
    static class MyThread2 extends Thread{
        public void run(){
            System.out.println("Thread 2 runnig");
        }
    }
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
