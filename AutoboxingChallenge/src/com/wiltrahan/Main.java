package com.wiltrahan;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");

        bank.addBranch("Providence");

        bank.addCustomer("Providence", "Wil", 99.95);
        bank.addCustomer("Providence", "Frankie", 43.98);
        bank.addCustomer("Providence", "Jess", 97.00);

        bank.addBranch("Cranston");
        bank.addCustomer("Cranston", "Joe", 140.23);

        bank.addCustomerTransaction("Providence", "Wil", 64.77);
        bank.addCustomerTransaction("Providence", "Wil", 11.95);
        bank.addCustomerTransaction("Providence", "Frankie", 65.99);

        bank.listCustomers("Providence", true);

    }
}
