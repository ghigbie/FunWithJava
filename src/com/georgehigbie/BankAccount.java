package com.georgehigbie;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){
        this(1234, 2.50, "Default name", "Default email", "9876543");
        System.out.println("This is an empty constructor with default values");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("The current balance is: " + this.balance);
    }

    public void withdrawl(double amount){
        if(this.balance > amount) {
            this.balance -= amount;
        }else{
            System.out.println("No withdrawl is possible at this time.");
        }
        System.out.println("The current balance is: " + this.balance);
    }
}
