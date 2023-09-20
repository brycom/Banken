import java.util.Scanner;

public class RunFlowe {
    boolean run = true;
    boolean restart = true;
    Scanner myScanner = new Scanner(System.in);
    int accountNumber;
    public static CustomerHandler account = new CustomerHandler();
    public static Customer customer;

    public void selectCustomer() {
        /* CustomerHandler accountHandler = new CustomerHandler(); */
        System.out.println("whose account do you want to access:" + System.lineSeparator() +
                "Mathias: 1" + System.lineSeparator() +
                "Jenny: 2" + System.lineSeparator() +
                "Roger: 3" + System.lineSeparator() +
                "Asterix: 4" + System.lineSeparator() +
                "Obelix: 5" + System.lineSeparator() +
                "Input the account number:");
        accountNumber = myScanner.nextInt() - 1;
        myScanner.nextLine();

        customer = account.getCustomer(accountNumber);

    }

    public void chanceBalanceInputs() {
        System.out.println("Are you deposit or withdrawing use (+ or -) ");
        String direction = myScanner.nextLine();

        System.out.println("The amount: ");
        double amount = myScanner.nextDouble();
        myScanner.nextLine();

        BalanceHandler balanceAccount = new BalanceHandler(account.getCustomer(accountNumber), amount);

        balanceAccount.checkMaxWithdrawal();

        balanceAccount.depositWithdrawal(direction);
        balanceAccount.chanceBalance(customer);

        System.out.println("You now have: " + account.getCustomer(accountNumber).balance + "kr on your account.");

    }

    void restart() {
        while (restart) {
            System.out.println("Do you want to try again?");
            String reRun = myScanner.nextLine();
            if (reRun.equals("yes")) {
                restart = false;

            } else if (reRun.equals("no")) {
                run = false;
                restart = false;

            } else
                System.out.println("pleas say yes or no");

        }

    }

    public void menu() {
        while (run) {
            System.out.println("How can i help you today?" + System.lineSeparator() +
                    "input 1 to se your balance" + System.lineSeparator() +
                    "input 2 to deposit or withdrawing" + System.lineSeparator() +
                    "input 3 to cancel");
            int action = myScanner.nextInt();
            myScanner.nextLine();
            switch (action) {
                case 1:
                    System.out.println(
                            "Your account balance is: " + account.getCustomer(accountNumber).balance + "kr");
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;

                case 2:
                    System.out.println("blööööööööööö");
                    chanceBalanceInputs();
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;
                case 3:
                    System.out.println("nejnejnejnej");
                    run = false;

            }

        }

    }

}
