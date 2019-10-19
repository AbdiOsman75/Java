package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999",100,customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getcustomerName() {
        return this.customerName;
    }

    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money) {
        this.balance += money;
        System.out.println("Total Balance: " + this.balance);
    }

    public void withdrawFunds(double money) {
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println("Your new balance: " + this.balance);
        } else {
            System.out. println("Insufficient funds");
        }
    }
}
