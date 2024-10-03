package com.artamonov;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposite(double amount) {
        if (amount < 0) {
            return; // Пустой return необходим для моментального завершения метода
        }
        balance += amount;
        System.out.printf("На баланс начислено %.2f\n", amount);
    }    
    
    public void withdraw(double amount) {
       if (amount < 0) {
           return; // Пустой return для моментального завершения метода
       } 
       if (amount <= balance) {
           balance -= amount;
           System.out.printf("Снято %.2f руб\n", amount);
       } else {
           System.out.printf("Невозможно списать %.2f руб. Недостаточно средст.\n", amount);
       }
    }

    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.format("Баланс счета %s: %.2f руб.", accountNumber, balance);
    }
}
