package com.LabActivitiesday2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
    }
}

public class MyBank {
    private Map<String, Account> accounts;
    public MyBank() {
        accounts = new HashMap<>();
    }
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added: " + account.getAccountNumber());
    }
    public void removeAccount(String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account removed: " + accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited Rs" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrew Rs" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }
    public void printAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts.values()) {
                account.printDetails();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBank bank = new MyBank();
        bank.addAccount(new Account("123456", "Kavin", 50000.00));
        bank.addAccount(new Account("654321", "Yogi", 30000.00));
        System.out.println("Account details:");
        bank.printAllAccounts();
        System.out.print("Enter account number to deposit money: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bank.deposit(accountNumber, depositAmount);
        scanner.nextLine();
        System.out.print("Enter account number to withdraw money: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bank.withdraw(accountNumber, withdrawAmount);
        scanner.nextLine(); 
        System.out.print("Enter account number to remove: ");
        accountNumber = scanner.nextLine();
        bank.removeAccount(accountNumber);
        System.out.println("\nUpdated account details:");
        bank.printAllAccounts();
    }
}
