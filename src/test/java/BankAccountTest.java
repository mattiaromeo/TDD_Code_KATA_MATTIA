import org.assertj.core.api.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private BankAccount bankAccount;
    @Before
    public void setUp() throws Exception {
        bankAccount=new BankAccount("jef",123,1000.5);
    }

    @Test
    public void BankAccountGetNameShouldReturnName() throws Exception {
        Assertions.assertThat(bankAccount.getName()).isEqualTo("jef");
    }

    @Test
    public void BankAccountGetAccountNumberShouldReturnName() throws Exception {
        Assertions.assertThat(bankAccount.getAccountNumber()).isEqualTo(123);
    }

    @Test
    public void BankAccountGetAmountShouldReturnAmount() throws Exception {
        Assertions.assertThat(bankAccount.getAmount()).isEqualTo(1000.5);
    }

    @Test
    public void CreateBankAccountShouldAddBankAccountToList() throws Exception {
        BankAccountList bankAccountList=new BankAccountList();
        bankAccountList.add(bankAccount);
        Assertions.assertThat(bankAccountList.getBankAccount(123)).contains(bankAccount);
    }
}
