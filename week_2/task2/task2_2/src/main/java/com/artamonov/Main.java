package com.artamonov;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("6179421438862549263244", 6722.20);
        System.out.println(bankAccount);

        bankAccount.deposite(2183.38);
        System.out.println(bankAccount);

        bankAccount.withdraw(830.63);
        System.out.println(bankAccount);

        bankAccount.withdraw(10000.00);
    }
}
