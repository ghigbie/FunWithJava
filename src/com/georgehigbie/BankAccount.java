package com.georgehigbie;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

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

    public void deposit(BankAccount account, double amount){
        double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
        System.out.println("The current balance is: " + account.getBalance());
    }

    public void withdrawl(BankAccount account, double amount){
        double balance = account.getBalance();
        if(balance > amount) {
            balance -= amount;
            account.setBalance(balance);
        }else{
            System.out.println("No withdrawl is possible at this time.");
        }
        System.out.println("The current balance is: " + account.getBalance());
    }
}
