package LEC32;

public class practice {
   static class practice1 extends Thread{
        public void run(){
            while (true){
                System.out.println("Good Morning");
            }
        }
    }
   static class practice2 extends Thread{
        public void run(){
            while (true){
                System.out.println("Welcome");
            }
        }
    }
    public static void main(String[] args) {
        practice1 t1 = new practice1();
        practice2 t2 = new practice2();
        t1.start();
        t2.start();
    }
}
