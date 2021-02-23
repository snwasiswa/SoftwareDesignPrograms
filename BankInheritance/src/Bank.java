/**
 * The class tests all the different functionality included in the accounts.
 * @author     Steve Wasiswa
 * @version    1.0  September 18,2020
 */

// Import the relevant classes
import java.util.Scanner;

public class Bank { // Beginning of class Bank
    public static void main(String[] args){ //Beginning of the main method

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\tWelcome to your bank!\n");
        System.out.println("Press c to continue");

        String user_input = input.nextLine();

        while (true) { // Performs the loop forever unless the user enters a command
            System.out.println("Press:\n\ta for Account(superclass)\n\th for Checking Account\n\t" +
                    "s for Savings Account\n\t" + "l for Loan Account\n\tq to quit");

            String second_user_input = input.nextLine();
            // Test Account class
            if (second_user_input.equalsIgnoreCase("a")){
                System.out.println("Respectively, enter name, balance and account number to create a checking account");
                String account_name = input.nextLine();
                double account_balance = input.nextDouble();
                long account_number = input.nextLong();
                Account account = new Account(account_name,account_balance,account_number);
                System.out.println("How much would you like to deposit?");
                double amount_to_deposit = input.nextDouble();
                account.Deposit(amount_to_deposit);
                System.out.println("How much would you like to withdraw today?");
                double amount_to_withdraw = input.nextDouble();
                account.Withdrawal(amount_to_withdraw);
                System.out.println(account.accountSummary()+"\n");
            }
            // Test CheckingAccount class
            if (second_user_input.equalsIgnoreCase("h")){
                System.out.println("Respectively, enter name, balance and account number to create a checking account");
                String checking_name = input.nextLine();
                double checking_balance = input.nextDouble();
                long checking_number = input.nextLong();
                CheckingAccount account1 = new CheckingAccount(checking_name,checking_balance,checking_number);
                System.out.println("How much would you like to deposit?");
                double amount_to_deposit = input.nextDouble();
                account1.Deposit(amount_to_deposit);
                System.out.println("How much would you like to withdraw today?");
                double amount_to_withdraw = input.nextDouble();
                account1.Withdrawal(amount_to_withdraw);
                System.out.println(account1.accountSummary()+"\n");
            }
            // Test SavingsAccount class
            if (second_user_input.equalsIgnoreCase("s")){
                System.out.println("Respectively, enter name, balance and account number.");
                String saving_name = input.nextLine();
                double saving_balance = input.nextDouble();
                long saving_number = input.nextLong();
                SavingsAccount account2 = new SavingsAccount(saving_name,saving_balance,saving_number);
                System.out.println("How much would you like to deposit?");
                double amount_to_deposit = input.nextDouble();
                account2.Deposit(amount_to_deposit);
                System.out.println("Enter the interest you'd to apply? (Between 0.0 - 1.0)");
                double interest = input.nextDouble();
                account2.addInterestRate(interest);
                System.out.println(account2.accountSummary()+"\n");
            }
            // // Test LoanAccount class
            if (second_user_input.equalsIgnoreCase("l")){
                System.out.println("Respectively, enter name, balance and account number.");
                String loan_name = input.nextLine();
                double loan_balance = input.nextDouble();
                long loan_number = input.nextLong();
                LoanAccount account3 = new LoanAccount(loan_name,loan_balance,loan_number);
                System.out.println("Enter the interest you'd to apply? (Between 0.0 - 1.0)");
                double interest = input.nextDouble();
                account3.addLoanInterestRate(interest);
                System.out.println("How much would you like to pay?");
                double amount_to_pay = input.nextDouble();
                account3.makePayment(amount_to_pay);
                System.out.println(account3.accountSummary()+"\n");
            }
            // Break the loop if the user enters "q"
            if (second_user_input.equalsIgnoreCase("q")){
               break;
            }
            user_input = input.nextLine();
        }
    } // End of main method
} // End of class Bank
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */