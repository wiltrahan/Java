package com.wiltrahan;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " has been deposited. Your new balance is " + this.balance);
    }

    public void withdrawal(double amount) {
        if(amount > this.balance) {
            System.out.println("Sorry, you do not have enough funds to cover this withdrawal. " +
                            "Your current balance is " + this.balance);
        }  else {
            this.balance -= amount;
            System.out.println("Withdrawal succeeded, your new balance is " + this.balance);
        }
    }
}
