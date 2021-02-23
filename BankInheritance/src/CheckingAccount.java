/**
 * A class to represent behaviors of.
 * @see         Account
 * @author      Steve Wasiswa
 * @version     1.0 September 18,2020
 */
public class CheckingAccount extends Account {

    // Declare and initialize this constant variable assuming it will the same regardless of amount in the account
    private final double OVERDRAFT_LIMIT = 500;

    /**
     * Class constructor that takes in three parameters and initializes them.
     * @param    account_holder    name of the account holder
     * @param    balance           initial balance
     * @param    account_number    identification number for the account
     */
    public CheckingAccount(String account_holder, double balance, long account_number) {
        super(account_holder, balance, account_number);

    }

    /**
     * The overridden method performs the withdrawal and computes the balance after the withdrawal has been made.
     * Takes a double number.
     * @param    amount_to_withdrawal      number to withdraw from account.
     */
    @Override
    public void Withdrawal(double amount_to_withdrawal){
        // Only performs the withdrawal if amount if positive and less than the balance
        if ( amount_to_withdrawal >= 0.0  && amount_to_withdrawal <= balance) {
            balance -= amount_to_withdrawal;
        }
        else if(amount_to_withdrawal >= 0.0 && amount_to_withdrawal > balance){
            // if the transaction is less than the overdraft limit, it will be performed
            if(amount_to_withdrawal - balance <= OVERDRAFT_LIMIT ){
                balance -= amount_to_withdrawal;
            }
            else{
                System.out.println("Transaction denied because of insufficient funds!");
            }
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */