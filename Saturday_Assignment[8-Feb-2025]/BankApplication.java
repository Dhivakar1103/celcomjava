package com.assignment;

import java.util.*;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount );
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount );
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        
        Account account = new Account(accNumber, custName, balance);
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    public void removeAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number to Remove: ");
        String accNumber = sc.nextLine();
        
        accounts.removeIf(account -> account.getAccountNumber().equals(accNumber));
        System.out.println("Account removed successfully.");
    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                account.displayAccountDetails();
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    bank.addAccount();
                    break;
                case 2:
                    bank.removeAccount();
                    break;
                case 3:
                    bank.depositMoney();
                    break;
                case 4:
                    bank.withdrawMoney();
                    break;
                case 5:
                    bank.displayAccount();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
