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
    }
}
