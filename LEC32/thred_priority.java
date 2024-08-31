package LEC32;

public class thred_priority {
    static class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        public void run(){
            System.out.println(this.getName());
        }
    }
    public static void main(String[] args) {
        MyThread t1= new MyThread("john");
        MyThread t2 = new MyThread("abc");
        MyThread t3 = new MyThread("kira");

        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
