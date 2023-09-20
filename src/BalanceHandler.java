public class BalanceHandler {
    Customer customer;
    double addToBalance;
    Boolean direction;
    boolean maxWithdrawal;

    BalanceHandler(Customer customer, double addToBalance) {
        this.customer = customer;
        this.addToBalance = addToBalance;
    }

    public void chanceBalance(Customer cust) {
        if (direction == true) {
            this.customer.balance += addToBalance;
            System.out.println("changebalance  add" + customer.getFirstName());
        } else if (direction == false && maxWithdrawal == true) {
            customer.balance -= addToBalance;
            System.out.println("changebalance Withdraw" + customer);
        } else
            System.out.println("you cant Withdraw mor then you have on your account");

    }

    boolean depositWithdrawal(String directionInput) {
        boolean run = true;
        while (run) {
            if (directionInput.equals("+")) {
                direction = true;
                run = false;

            } else if (directionInput.equals("-")) {
                direction = false;
                run = false;

            } else
                System.out.println("pleas input + for deposit or - for withdrawal");
        }
        return direction;

    }

    boolean checkMaxWithdrawal() {
        if (customer.balance > addToBalance) {
            maxWithdrawal = true;
        } else
            maxWithdrawal = false;

        return maxWithdrawal;

    }

}
