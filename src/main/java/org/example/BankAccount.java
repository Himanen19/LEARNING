package org.example;

public class BankAccount {

    int accountNumber;
    int accountBalance;
    String customerName;
    String Email;
    String phoneNumber;

    public void depositFunds(int value) {
        accountBalance += value;
        System.out.print("Your current balance is" + accountBalance);
    }

    public void withdrawFunds(int value) {

        if (accountBalance - value > 0) {
            accountBalance -= value;
        } else {
            System.out.print(accountBalance + "Your current acc balance is not enough to withdraw.");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
