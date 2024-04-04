public class StarTask {
    public static void main(String[] args) {

        ATM atm = new ATM(10, 20, 10);
        atm.addBanknotes(2, 3, 4);
        atm.getMoney(570);
        atm.getMoney(221);
    }
}
