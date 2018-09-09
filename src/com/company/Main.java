package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //make accounts
        Customer customer1 = new Customer (1,400,60,100, 1000);
        Customer customer2 = new Customer (2, 100, 500, 0, 300);
        Customer customer3 = new Customer (3, 100, 500, 500, 600);
        Customer customer4 = new Customer (4, 200, 400, 0, 300);

        //because we know how many customers there are, I will for this assignment hardcode the iteration

        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        System.out.println("Calculating balances");

        for(int i = 0; i < customerList.size(); ++i){
            Customer customer = customerList.get(i);
            //display account number and calculate new balance
            System.out.println("Customer Account No." + Integer.toString(customer.accountNumber) + " New Balance: " + Integer.toString(customer.getNewBalance()));
            if(customer.getNewBalance() > customer.creditLimit){
                System.out.println("Notice: Credit limit exceeded");
            }

        }


    }
}
