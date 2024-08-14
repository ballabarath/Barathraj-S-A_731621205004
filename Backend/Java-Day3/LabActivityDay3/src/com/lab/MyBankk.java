package com.lab;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

  
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Cannot withdraw. Balance must remain at least 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class MyBankk {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(100);
        System.out.println("BankAccount Balance:" + account.getBalance());

        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(600);
        System.out.println("SavingsAccount Balance:" + savings.getBalance());
    }
}
