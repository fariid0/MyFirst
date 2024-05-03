package src.Lesson.Task15.Bank;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder + "\n" +
                "Balance: " + balance;
    }

    void depositAmount(double amount){
        balance += amount;
         System.out.println("Deposit successful. New balance: " + balance);
    }

    void withdrawAmount (double amount) throws InsufficientResourcesException{
        if (balance - amount < 0) {
            throw  new InsufficientResourcesException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdraw successful. New balance: " + balance);
    }

    void transferFunds(BankAccount transfer, double amount){
        try {
            withdrawAmount(amount);
            transfer.depositAmount(amount);
            System.out.println("Transfer successful!" + transfer.balance);
        }catch (InsufficientResourcesException e){
            System.out.println("Insufficient funds");
        }
    }
}
