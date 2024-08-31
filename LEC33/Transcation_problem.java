package LEC33;

public class Transcation_problem {
    static class Account{
        private int balance = 1000;

        public void withdraw(int amount){
            if(balance >= amount){
                System.out.println("amount to bw withdrawn" + " " + amount);
                balance-=amount;
            }else{
                System.out.println("Insufficient fund");
            }
        }
        public int getBalance(){
            return balance;
        }
    }
    static class Transcation extends Thread{
        private Account account;
        private int amount;

        Transcation(Account account , int amount){
            this.account = account;
            this.amount= amount;
        }
        public void run(){
            account.withdraw(amount);
        }
    }
    public static void main(String[] args) {
        Account acc = new Account();

        Transcation t1 = new Transcation(acc , 500);
        Transcation t2 = new Transcation(acc , 500);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
