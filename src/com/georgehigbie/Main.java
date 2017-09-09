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
        System.out.println(vip2.getName() + " " + vip2.getEmail());
        System.out.println(vip3.getName() + " " + vip3.getCreditLimit() + " " + vip3.getEmail());

        Animal animal1 = new Animal("Animal One", 1, 1, 12, 25);
        Dog dog1 = new Dog("Fluffy", 23, 34, 2, 4, 20, 1, "short");
        Dog dog2 = new Dog("Fluffy", 23, 34, 2, 4, 20, 1, "short");

        animal1.eat();
        dog1.eat();
        dog2.eat();

        animal1.move(5);

        Cat cat1 = new Cat("Kitty", 12, 10, 2, 4, 1,24, "short");
        cat1.eat();
        cat1.move(5);

        cat1.run();
        dog1.run();

        Fish fish1 = new Fish("Fishy", 1, 2, 23, 2, 5);
        fish1.rest();
        fish1.swim(2);

    }
}
