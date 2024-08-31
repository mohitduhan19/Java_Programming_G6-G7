package Lec22;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John");

        BankAccount saving = new SavingAccount(1000.0);
        BankAccount current = new CurrentAccount(200.0);

        customer.addAccount(saving);
        customer.addAccount(current);

        customer.deposit(0 , 200);
        customer.withdraw(1,100);

        System.out.println("Total Balance"+ customer.getTotalBalance());
        System.out.println("Saving Account Balance" + saving.getBalance());
        System.out.println("Current Account Balance" + current.getBalance());

    }
}
