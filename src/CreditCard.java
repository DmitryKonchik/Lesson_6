public class CreditCard {
    int accountNumber;
    int accountBalance;

    public CreditCard(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void addMoney(int money) {
        accountBalance += money;
    }

    public void withdrawMoney(int money) {
        accountBalance -= money;
    }

    public void info() {
        System.out.println("Номер счета: " + accountNumber + " Остаток счета: " + accountBalance);
    }
}
