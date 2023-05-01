package com.demo.synchronizationThread;

public class ATM {

    static synchronized void withdraw(BankAccount bankAccount, int amount) {
        int balance = bankAccount.getBalance();
        if ((balance - amount) < - bankAccount.getOverdraft()) {
            System.out.println("denied");
        } else {
            bankAccount.debit(amount);
            System.out.println("$" + amount + " susscefuly withdrawn");
        }
        System.out.println("current balance " + bankAccount.getBalance());
    }

}
