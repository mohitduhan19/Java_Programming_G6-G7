package Lec22;

public class CurrentAccount implements BankAccount{
    private double balance;
    private final double minimumBalance = 100;

    public CurrentAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance - amount >= minimumBalance){
            balance -= amount;
        }else{
            System.out.println("cannot withdraw");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return "Current";
    }
}