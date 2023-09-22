//Sätter in och tar ut från rätt konto samt kontrolerar max utag.
public class BalanceHandler {
    Customer customer;
    double addToBalance;
    Boolean direction;
    boolean maxWithdrawal;

    BalanceHandler(Customer customer, double addToBalance) {
        this.customer = customer;
        this.addToBalance = addToBalance;
    }

    // Tar in rikting från depositWithdral och sätter in eller tar ut pengar från
    // kontot
    public void chanceBalance(Customer cust, String direction) {
        if (direction.equals("+")) {
            this.customer.balance += addToBalance;
        } else if (direction.equals("-") && maxWithdrawal == true) {
            customer.balance -= addToBalance;

        } else
            System.out.println("you cant Withdraw mor then you have on your account");

    }

    // tar in riktning från RunFlow(chanceBalanceInputs) och konverterar till bool.
    boolean depositWithdrawal(String directionInput) {
        boolean run = true;
        while (run) {
            if (directionInput.equals("+")) {
                direction = true;
                run = false;

            } else if (directionInput.equals("-")) {
                direction = false;
                run = false;
            }
        }
        return direction;

    }

    boolean checkMaxWithdrawal() {
        if (customer.balance >= addToBalance) {
            maxWithdrawal = true;
        } else
            maxWithdrawal = false;

        return maxWithdrawal;

    }

}
