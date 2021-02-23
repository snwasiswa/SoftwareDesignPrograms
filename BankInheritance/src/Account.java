/**
 * A class to represent behaviors of.
 * @see         Account
 * @author      Steve Wasiswa
 * @version     1.0 September 18,2020
 */
public class Account {

    // Declare instances variables
    protected double balance;
    protected long account_number;
    protected String account_holder;

    /**
     * Class constructor that takes in three parameters and initializes them.
     * @param    account_holder    name of the account holder
     * @param    balance           initial balance
     * @param    account_number    identification number for the account
     */
    public Account(String account_holder, double balance, long account_number){

        // Initialize instances variables
        this.account_holder = account_holder;
        this.balance = balance;
        this.account_number = account_number;

    }

    /**
     * The method combines different string literals for a formatted output.
     *  Returns a string literal.
     * @return   String     combination of different string literals.
     */
    public String accountSummary(){
        return "Account Holder: "+ "\t\t\t\t\t" + account_holder  + "\n" + "Account Number: " + "\t\t\t\t\t" +
                account_number +"\nBalance: \t\t\t\t\t\t\t" + balance;
    }

    /**
     * The method performs the deposit and computes the balance after the deposit has been made.
     * Takes a double number.
     * @param    amount_to_deposit      number to deposit into account.
     */
    public void Deposit(double amount_to_deposit){

        if (amount_to_deposit >= 0.0){ // Only computes the balance if amount if positive
            balance += amount_to_deposit;
        }
    }

    /**
     * The method performs the withdrawal and computes the balance after the withdrawal has been made.
     * Takes a double number.
     * @param    amount_to_withdrawal      number to withdraw from account.
     */
    public void Withdrawal(double amount_to_withdrawal){

        // Only performs the withdrawal if amount if positive and less than the balance
        if ( amount_to_withdrawal >= 0.0 && amount_to_withdrawal <= balance) {
            balance -= amount_to_withdrawal;
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */