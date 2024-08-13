package com.LabActivitiesday2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class MyBank {
    private Map<String, Account> accounts;

    // Constructor to initialize the bank
    public MyBank() {
        accounts = new HashMap<>();
    }

    // Method to add a new account
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    // Method to remove an account by account number
    public void removeAccount(String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account removed: " + accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to print all account details
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

        // Adding some accounts
        bank.addAccount(new Account("123456", "Alice Johnson", 500.00));
        bank.addAccount(new Account("654321", "Bob Smith", 300.00));

        // Printing all accounts
        System.out.println("Initial account details:");
        bank.printAllAccounts();

        // Interacting with the bank
        System.out.print("Enter account number to deposit money: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bank.deposit(accountNumber, depositAmount);

        scanner.nextLine(); // Consume newline character

        System.out.print("Enter account number to withdraw money: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bank.withdraw(accountNumber, withdrawAmount);

        scanner.nextLine(); // Consume newline character

        System.out.print("Enter account number to remove: ");
        accountNumber = scanner.nextLine();
        bank.removeAccount(accountNumber);

        // Printing all accounts after transactions
        System.out.println("\nUpdated account details:");
        bank.printAllAccounts();
    }
}
