package com.demo.synchronizationThread;

public class UsersMain {

    static final BankAccount bankAccount = new BankAccount(50);

    public static void main(String[] args) {

        bankAccount.topUp(100);

        Thread t1 = new Thread(()-> {
            ATM.withdraw(bankAccount,100);
        }) ;

        Thread t2 = new Thread(()-> {
            ATM.withdraw(bankAccount,100);
        }) ;

        t1.start();
        t2.start();
    }
}

