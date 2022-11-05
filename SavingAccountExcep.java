package com.company;
import java.util.*;
import java.lang.*;


public class SavingsAccount {
    private double balance;

    public SavingsAccount() {
        balance = 0;
    }

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalArgumentException(" withdraw Amount  is more than balance");
        }
        else if(amount<0)
        {
        throw new IllegalStateException("Illegalbanktransaction");
        }
        balance = balance - amount;
    }

    public  double getBalance() {
        return balance;
    }
}
public class SavingAccountExcep {

    public static void main(String[] args) {
SavingsAccount check=new SavingsAccount();
        Scanner obj=new Scanner(System.in);
        System.out.println("Deposit");
        double a2=obj.nextDouble();
        System.out.println("withdraw");
        double a=obj.nextDouble();
check.deposit(a2);
check.withdraw(a);
System.out.println(check.getBalance());
    }
}

