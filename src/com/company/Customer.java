package com.company;

public class Customer {
    int accountNumber;
    private int monthBalance;
    private int totalCharge;
    private int credits;
    int creditLimit;
    private int newBalance;

    Customer(int accountNumber, int monthBalance, int totalCharge, int credits, int creditLimit){
        this.accountNumber = accountNumber;
        this.monthBalance = monthBalance;
        this.totalCharge = totalCharge;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    public int getAccountNumber(int number){
        return accountNumber;
    }
    public int getNewBalance(){
        this.newBalance = monthBalance + totalCharge - credits;
        return newBalance;
    }

}