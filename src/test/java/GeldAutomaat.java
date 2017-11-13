import java.util.ArrayList;
import java.util.List;

public class GeldAutomaat {
    private List<BankAccount> listOfBankAccounts = new ArrayList<>();

    public GeldAutomaat(BankAccount bankAccount1, BankAccount bankAccount2) {
        listOfBankAccounts.add(bankAccount1);
        listOfBankAccounts.add(bankAccount2);
    }

    public void withdrawMoney(int accountID, int withdrawAmount) {
        for (BankAccount bankaccount : listOfBankAccounts) {
            if (bankaccount.getAccountNumber() == accountID) {
                bankaccount.withdrawMoney(withdrawAmount);
            }
        }
    }

    public void transferMoney(int customerIDBase, int transferAmount, int customerIDTransferTo) {
        for (BankAccount bankaccount : listOfBankAccounts) {
            if (bankaccount.getAccountNumber() == customerIDBase) {
                if (bankaccount.getAmount() >= transferAmount) {
                    bankaccount.withdrawMoney(transferAmount);
                }
                if(bankaccount.getAccountNumber() == customerIDTransferTo){
                    bankaccount.addMoney(transferAmount);
                }
            }
        }
    }
}
