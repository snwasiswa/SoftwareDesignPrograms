// Import the relevant JUnit classes
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankInheritanceEasyJUnit{// Beginning class BankInheritanceEasyJUnit

    // Test Account methods
    Account account = new Account("Holly", 100, 1234);
    @Test
    void testDeposit() {

        account.Deposit(100);
        assertEquals(200, account.balance);
    }

    @Test
    void testWithdrawal(){
        account.Withdrawal(50);
        assertEquals(50,account.balance);
    }

    // Test Checking Account methods
    CheckingAccount account1 = new CheckingAccount("Nelly",500,123444);

    @Test
    void testCheckingWithdrawal(){
        account1.Withdrawal(500);
        assertEquals(0,account1.balance);
        account1.Withdrawal(500);
        assertEquals(-500,account1.balance);
        account1.Withdrawal(1000);
        assertEquals(-500, account1.balance);
    }

    // Test Savings Account methods
    SavingsAccount account2 = new SavingsAccount("Nelly",500,125444);

    @Test
    void testaddInterestRate(){
        account2.addInterestRate(0.10);
        assertEquals(550,account2.balance);
    }

    // Test Loan Account methods
    LoanAccount account3 = new LoanAccount("Nelly",600,123454);

    @Test
    void testaddLoanInterestRate(){
        account3.addLoanInterestRate(0.10);
        assertEquals(660,account3.balance);
    }

    @Test
    void testmakePayment(){
        account3.makePayment(300);
        assertEquals(300,account3.balance);
    }
}// End class BankInheritanceEasyJUnit
