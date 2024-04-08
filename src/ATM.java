public class ATM {
    int numberOfBanknotes20;
    int numberOfBanknotes50;
    int numberOfBanknotes100;

    public ATM(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {
        this.numberOfBanknotes20 = numberOfBanknotes20;
        this.numberOfBanknotes50 = numberOfBanknotes50;
        this.numberOfBanknotes100 = numberOfBanknotes100;
    }

    public void addBanknotes(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {
        this.numberOfBanknotes20 += numberOfBanknotes20;
        this.numberOfBanknotes50 += numberOfBanknotes50;
        this.numberOfBanknotes100 += numberOfBanknotes100;
    }

    public boolean getMoney(int money) {
        int countBanknotes20 = 0;
        int countBanknotes50 = 0;
        int countBanknotes100 = 0;
        while (money >= 100) {
            money -= 100;
            countBanknotes100++;
        }
        if (money - 50 == 30) {
            while (money >= 20) {
                money -= 20;
                countBanknotes20++;
            }
        }
        while (money >= 50) {
            money -= 50;
            countBanknotes50++;
        }
        if (money == 10) {
            money += 100;
            countBanknotes100--;
            money -= 50;
            countBanknotes50++;
        }
        while (money >= 20) {
            money -= 20;
            countBanknotes20++;
        }
        if (countBanknotes100 <= numberOfBanknotes100 && countBanknotes50 <= numberOfBanknotes50
                && countBanknotes20 <= numberOfBanknotes20 && money == 0) {
            System.out.println("Купюр 100р: " + countBanknotes100 + " шт. Купюр 50р: "
                    + countBanknotes50 + " шт. Купюр 20р: " + countBanknotes20 + " шт.");
            return true;
        } else {
            System.out.println("Невозможно выдать заданную сумму");
            return false;
        }
    }
}
