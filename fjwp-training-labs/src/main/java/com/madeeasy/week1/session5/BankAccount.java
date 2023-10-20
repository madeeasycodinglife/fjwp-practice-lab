package com.madeeasy.week1.session5;

import lombok.Data;
import lombok.AllArgsConstructor;

/**
 * The type Bank account.
 */
@Data
@AllArgsConstructor
class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    /**
     * Deposit.
     *
     * @param amount the amount
     */
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    /**
     * Withdraw.
     *
     * @param amount the amount
     */
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 12345, 5000);

        // Deposit and withdraw transactions
        account.deposit(1000);
        account.withdraw(2000);

        // Get the balance
        int balance = account.getBalance();
        System.out.println("Current Balance: $" + balance);

        // Check if minimum balance is maintained
        String status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Display the status
        System.out.println("Account Status: " + status);
    }
}

/** o/p
 * Deposited $1000
 * Withdrawn $2000
 * Current Balance: $4000
 * Account Status: Minimum Balance not Maintained
 */