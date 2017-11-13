import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
    private List<BankAccount> bankAccounts = new ArrayList();


    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }


    public List<BankAccount> getBankAccount(int accountID) {
        List<BankAccount> getBankAccountList = new ArrayList();
        for (BankAccount bankaccount : bankAccounts) {
            if (bankaccount.getAccountNumber() == accountID) {
                getBankAccountList.add(bankaccount);
            }
        }
        return getBankAccountList;
    }
}
