package Lec22;

import java.util.ArrayList;
import java.util.*;
public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void removeAccount(BankAccount account){
        accounts.remove(account);
    }
    public void deposit(int accountIndex , double amount){
        accounts.get(accountIndex).deposit(amount);
    }
    public void withdraw(int accountIndex , double amount){
        accounts.get(accountIndex).withdraw(amount);
    }
    public double getTotalBalance(){
        double total = 0;
        for(BankAccount account : accounts){
            total += account.getBalance();
        }
        return total;
    }
}