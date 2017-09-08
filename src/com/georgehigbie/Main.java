package com.georgehigbie;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("711");


        System.out.println(holden.getModel());
        System.out.println(porsche.getModel());

        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();

        bank1.setBalance(100.00);
        bank2.setBalance(200.00);
        System.out.println("bank1 balance: " + bank1.getBalance() );
        System.out.println("bank2 balance: " + bank2.getBalance() );

        bank1.deposit(100);
        bank2.deposit(100);

        bank1.withdrawl(1000.00);
        bank2.withdrawl(150.00);

        BankAccount bank3 = new BankAccount(12243, 200.00, "Bubba Buick",
                "afa@gmaid.com", "999-999");
        BankAccount bank4 = new BankAccount();

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("John", 5000.00);
        VipCustomer vip3 = new VipCustomer( "Tommy", 400.00, "tommy@customer.com");

        System.out.println(vip1.getName());
        System.out.println(vip2.getName());
        System.out.println(vip3.getName());
    }
}
