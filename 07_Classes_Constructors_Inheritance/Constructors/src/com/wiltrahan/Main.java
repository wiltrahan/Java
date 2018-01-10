package com.wiltrahan;

public class Main {

    public static void main(String[] args) {

        Account wilsAccount = new Account("67890", 0.00, "Willis Tee", "myemail@us.gov",
                "(800)-54-GIANT");
        System.out.println(wilsAccount.getNumber());
        System.out.println(wilsAccount.getBalance());

        wilsAccount.setNumber("12345");
        wilsAccount.setBalance(0.00);
        wilsAccount.setCustomerName("Willy T");
        wilsAccount.setCustomerEmailAddress("myemail@willis.org");
        wilsAccount.setCustomerPhoneNumber("1 (877) Kars-4-Kids");

        wilsAccount.withdrawal(100.0);

        wilsAccount.deposit(50.0);
        wilsAccount.withdrawal(100.00);

        wilsAccount.deposit(51.0);
        wilsAccount.withdrawal(100.0);


        Account jessAccount = new Account("Jess", "missJess@what.net", "22222");
        System.out.println(jessAccount.getNumber() + " name " + jessAccount.getCustomerName());


        VipCustomer wil = new VipCustomer();
        System.out.println(wil.getName());

        VipCustomer jess = new VipCustomer("Jess", 25000.00);
        System.out.println(jess.getName());

        VipCustomer frankie = new VipCustomer("Frankie", 1000.00, "frankie@WOOOF.net");
        System.out.println(frankie.getName() + "\n" + frankie.getEmailAddress());

    }
}
