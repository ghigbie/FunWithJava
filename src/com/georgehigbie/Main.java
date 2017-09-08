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

        bank1.deposit(bank1, bank1.getBalance());
        bank2.deposit(bank2, bank2.getBalance());

        bank1.withdrawl(bank1,1000.00);
        bank2.withdrawl(bank2,100.00);
    }
}
