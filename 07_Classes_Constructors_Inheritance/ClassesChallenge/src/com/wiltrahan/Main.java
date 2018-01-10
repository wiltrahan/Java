package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
	    BankAccount wilAccount = new BankAccount();
	    wilAccount.setCustomerName("Wil Trahan");
	    wilAccount.setBalance(143.90);
        wilAccount.setAccountNumber(8675309);
        wilAccount.setEmail("ohHai@us.gov");
        wilAccount.setPhoneNumber("401-444-4444");
        System.out.println("Account for " + wilAccount.getCustomerName() + " has a balance of " + wilAccount.getBalance());
        wilAccount.withdrawal(19.00);
        wilAccount.withdrawal(200.00);

        System.out.println("***************");

        VIPCustomer frankie = new VIPCustomer("Frank N. Stein", 100000.00);
        System.out.println(frankie.getName() + "\ncredit limit: $" + frankie.getCreditLimit() + "\nemail: " + frankie.getEmailAddress());
    }
}
