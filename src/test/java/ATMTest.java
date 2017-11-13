import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
    private BankAccount bankAccount1;
    private BankAccount bankAccount2;
    private GeldAutomaat atm;
    @Before
    public void setUp() throws Exception {
        bankAccount1 = new BankAccount("jef", 123, 1000.5);
        bankAccount2 = new BankAccount("john", 15, 5000.5);
        atm = new GeldAutomaat(bankAccount1,bankAccount2);
    }

    @Test
    public void WithdrawMoney50FromAccountShouldLowerAmountOfAccountBy50() throws Exception {
        atm.withdrawMoney(123, 50);
        Assertions.assertThat(bankAccount1.getAmount()).isEqualTo(950.5);

    }

    @Test
    public void TransferMOneyFRom123To15ShouldWithdraw50From123AndAdd50To15() throws Exception {
        atm.transferMoney(123,50,15);
        Assertions.assertThat(bankAccount1.getAmount()).isEqualTo(950.5);
        Assertions.assertThat(bankAccount2.getAmount()).isEqualTo(5050.5);
    }

    @Test
    public void WithdrawMoneyNotPossibleWhenAmountInsufficient() throws Exception {
        double expected=bankAccount1.getAmount();
        atm.withdrawMoney(123,1001);
        Assertions.assertThat(bankAccount1.getAmount()).isEqualTo(expected);
    }
}
