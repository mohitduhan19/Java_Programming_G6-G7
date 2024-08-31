package LEC32;

public class join {
    static class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        public void run(){
            System.out.println(this.getName());
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread("john");
        MyThread t2 = new MyThread("kira");

        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
