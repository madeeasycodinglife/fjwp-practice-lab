package com.madeeasy.week1.session4.assignment1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * The interface Account.
 */
interface Account {
    /**
     * Gets balance.
     *
     * @return the balance
     */
    double getBalance();

    /**
     * Deposit.
     *
     * @param amount the amount
     */
    void deposit(double amount);

    /**
     * Withdraw.
     *
     * @param amount the amount
     */
    void withdraw(double amount);
}

/**
 * The type Bank account.
 */
@Data
@Slf4j
@AllArgsConstructor
class BankAccount implements Account {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + " into " + bankName + " account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + bankName + " account.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    /**
     * Display account info.
     */
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + this.accountHolderName);
//        log.info("Account Holder: {}" , this.accountHolderName);
        System.out.println("Bank Name: " + this.bankName);
//        log.info("Bank Name: {}" , this.bankName);
        System.out.println("Account Balance: $" + this.accountBalance); // or you can call this.getBalance()
//        log.info("Account Balance: ${}" , this.accountBalance);
        System.out.println();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BankAccount iciciAccount = new BankAccount("abc", "ICICI", 1000.0);
        BankAccount hdfcAccount = new BankAccount("def", "HDFC", 1500.0);
        BankAccount sbiAccount = new BankAccount("ghi", "SBI", 2000.0);

        iciciAccount.deposit(500.0);
        iciciAccount.withdraw(100.0);
        hdfcAccount.deposit(1000.0);
        hdfcAccount.withdraw(200.0);
        sbiAccount.deposit(1000.0);
        sbiAccount.withdraw(200.0);

        iciciAccount.displayAccountInfo();
        hdfcAccount.displayAccountInfo();
        sbiAccount.displayAccountInfo();
    }
}
/**
 * Deposited $500.0 into ICICI account.
 * Withdrawn $100.0 from ICICI account.
 * Deposited $1000.0 into HDFC account.
 * Withdrawn $200.0 from HDFC account.
 * Deposited $1000.0 into SBI account.
 * Withdrawn $200.0 from SBI account.
 * Account Holder: abc
 * Bank Name: ICICI
 * Account Balance: $1400.0
 * <p>
 * Account Holder: def
 * Bank Name: HDFC
 * Account Balance: $2300.0
 * <p>
 * Account Holder: ghi
 * Bank Name: SBI
 * Account Balance: $2800.0
 */
