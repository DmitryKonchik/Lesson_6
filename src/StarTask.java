public class StarTask {
    public static void main(String[] args) {

        ATM atm = new ATM(800, 100, 13);
        atm.addBanknotes(2, 2, 0);
        atm.getMoney(10091);

    }
}
