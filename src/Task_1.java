public class Task_1 {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(1, 1000);
        CreditCard card2 = new CreditCard(2, 2000);
        CreditCard card3 = new CreditCard(3, 3000);
        card1.addMoney(200);
        card2.addMoney(200);
        card3.withdrawMoney(5000);
        card1.info();
        card2.info();
        card3.info();
    }
}
