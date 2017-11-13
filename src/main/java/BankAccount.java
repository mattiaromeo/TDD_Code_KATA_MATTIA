public class BankAccount {

    private String name;
    private int accountNumber;
    private double amount;

    public BankAccount(String name, int accountnumber, double amount) {
        this.name = name;
        this.accountNumber = accountnumber;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void withdrawMoney(int withdrawAmount) {
        amount -= withdrawAmount;
    }

    public void addMoney(int addMoney) {
        amount += addMoney;
    }
}
