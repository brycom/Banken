public class BalanceHandler {
    double balance;
    double addToBalance;
    Boolean direction;
    boolean maxWithdrawal;

    BalanceHandler(double balance, double addToBalance) {
        this.balance = balance;
        this.addToBalance = addToBalance;
    }

    double chanceBalance() {
        if (direction == true) {
            this.balance += addToBalance;
            System.out.println("inre balans" + balance);
        } else if (direction == false && maxWithdrawal == true) {
            balance -= addToBalance;
            System.out.println("inre balans" + balance);
        } else
            System.out.println("you cant Withdraw mor then you have on your account");
        return balance;
    }

    boolean depositWithdrawal(String directionInput) {
        if (directionInput.equals("+")) {
            direction = true;

        } else if (directionInput.equals("-")) {
            direction = false;

        } else
            System.out.println("pleas input + for deposit or - for withdrawal");

        return direction;

    }

    boolean checkMaxWithdrawal() {
        if (balance > addToBalance) {
            maxWithdrawal = true;
        } else
            maxWithdrawal = false;

        return maxWithdrawal;

    }

}
