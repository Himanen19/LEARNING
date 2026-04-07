package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount gilsonAcc = new BankAccount();
        gilsonAcc.setAccountBalance(3000);
        System.out.println(gilsonAcc.getAccountBalance());
        gilsonAcc.depositFunds(100);
        gilsonAcc.withdrawFunds(50);
        gilsonAcc.withdrawFunds(50);
        gilsonAcc.withdrawFunds(50);
    }
}

