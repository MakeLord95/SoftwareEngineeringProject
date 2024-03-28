package SEP1;

import SEP1.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositIncreasesBalance() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void withdrawDecreasesBalance() {
        Account account = new Account();
        account.deposit(200.0);
        account.withdraw(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void withdrawReturnsZeroWhenInsufficientBalance() {
        Account account = new Account();
        account.deposit(50.0);
        double withdrawnAmount = account.withdraw(100.0);
        assertEquals(0.0, withdrawnAmount);
    }

    @Test
    public void withdrawDoesNotChangeBalanceWhenInsufficientBalance() {
        Account account = new Account();
        account.deposit(50.0);
        account.withdraw(100.0);
        assertEquals(50.0, account.getBalance());
    }
}
