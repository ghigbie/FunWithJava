package com.georgehigbie;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Bubba Customer", 1000.00, "bubba@customer.com");
        System.out.println("The empty constructor was called");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "bubba@customer.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
