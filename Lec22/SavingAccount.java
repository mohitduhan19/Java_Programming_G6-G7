package Lec22;

public class SavingAccount implements BankAccount{
    private double balance;
    private final double interestRate = 0.3;

    public SavingAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return "Savings";
    }
    public void addInterest(){
        balance += balance * interestRate;
    }
}