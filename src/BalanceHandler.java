//Sätter in och tar ut från rätt konto samt kontrolerar max utag.
public class BalanceHandler {
    Customer customer;
    float addToBalance;
    Boolean direction;
    boolean maxWithdrawal;

    BalanceHandler(Customer customer, float addToBalance) {
        this.customer = customer;
        this.addToBalance = addToBalance;
    }

    // Tar in rikting från RunFlow(menu) och sätter in eller tar ut
    // pengar från kontot.
    public void chanceBalance(Customer cust, String direction) {
        if (direction.equals("+")) {
            this.customer.balance += addToBalance;
        } else if (direction.equals("-") && maxWithdrawal == true) {
            customer.balance -= addToBalance;

        } else
            System.out.println("You cant Withdraw mor then you have on your account");

    }

    // Kontrolerar så att utag inte överstiger konto balansen.
    boolean checkMaxWithdrawal() {
        if (customer.balance >= addToBalance) {
            maxWithdrawal = true;
        } else
            maxWithdrawal = false;

        return maxWithdrawal;

    }

}
