/**
 * A class to represent behaviors of.
 * @see         Account
 * @author      Steve Wasiswa
 * @version     1.0 September 18,2020
 */
public class SavingsAccount extends Account {

    /**
     * Class constructor that takes in three parameters and initializes them.
     * @param    account_holder    name of the account holder
     * @param    balance           initial balance
     * @param    account_number    identification number for the account
     */
    public SavingsAccount(String account_holder, double balance, long account_number) {
        super(account_holder, balance, account_number);
    }

    /**
     * The method performs the interest rate and computes the balance after the interest rate has been applied.
     * Takes a double number.
     * @param    interest_rate      interest to apply to the savings account.
     */
    public void addInterestRate(double interest_rate) {
        // Interest rate should be between 0.0 and 1.0( percent in decimal)
        if(interest_rate >= 0.0 && interest_rate <= 1.0){
            balance +=  balance * interest_rate;
        }

    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */