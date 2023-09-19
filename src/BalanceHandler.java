public class BalanceHandler {
    double balance;
    double addToBalance;
    Boolean direction = true;

    BalanceHandler(double balance, double addToBalance) {
        this.balance = balance;
        this.addToBalance = addToBalance;
    }

    double chanceBalance() {
        if (direction == true) {
            this.balance += addToBalance;
            System.out.println("inre balans" + balance);
        } else {
            balance -= addToBalance;
            System.out.println(balance);
        }
        return balance;
    }

}
