package Lec22;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountType();
}