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
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();
    private Scanner sc; // Single Scanner instance

    public Bank(Scanner sc) {
        this.sc = sc;
    }

    public void addAccount() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // Consume newline

        accounts.add(new Account(accNumber, custName, balance));
        System.out.println("Account created successfully!");
    }

    public void removeAccount() {
        System.out.print("Enter Account Number to Remove: ");
        String accNumber = sc.nextLine();

        Account toRemove = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                toRemove = account;
                break;
            }
        }

        if (toRemove != null) {
            accounts.remove(toRemove);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine(); // Consume newline
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine(); // Consume newline
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccount() {
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
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(sc);

        while (true) {
            System.out.println("\n1. Add Account\n2. Remove Account\n3. Deposit Money\n4. Withdraw Money\n5. Display Account Details\n6. Exit\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

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
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
