package org.example;

public class Main {
    public static void main(String[] args) {


        BankAccount gilsonAcc = new BankAccount();
        BankAccount mariAcc = new BankAccount(13, 400, "mariana", "gilson@gma.", "75-999093c");

        gilsonAcc.setAccountBalance(3000.55);
        System.out.println(gilsonAcc.getAccountBalance());
        gilsonAcc.depositFunds(100);
        gilsonAcc.withdrawFunds(50);
        gilsonAcc.withdrawFunds(50);
        gilsonAcc.withdrawFunds(50);
    }

}


