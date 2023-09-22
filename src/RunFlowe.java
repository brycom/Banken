
import java.util.Scanner;

//Inputtmetoder och menyer.
public class RunFlowe {
    boolean run = true;
    boolean restart = true;
    Scanner myScanner = new Scanner(System.in);
    int accountNumber = -1;
    public static CustomerHandler account = new CustomerHandler();
    public static Customer customer;

    // Tar in ett kontonummer och väljer rätt konto från arraylisten på
    // CustomerHandler.
    public void selectCustomer() {
        while (accountNumber < 0 || accountNumber > 5) {
            System.out.println("whose account do you want to access:");
            account.customerpresenter();
            System.out.println("Input the account number:");
            accountNumber = myScanner.nextInt() - 1;
            myScanner.nextLine();
            if (accountNumber < 0 || accountNumber >= account.getCustomerSize()) {
                System.out.println("Pleas use a valid accountnumber.");
                accountNumber = -1;
                continue;

            } else
                customer = account.getCustomer(accountNumber);
        }

    }

    // Tar in riktning och summa som ska sättas in eller tas ut och kör metoderna
    // från BalanceHandler.
    public void chanceBalanceInputs() {
        boolean lopBool = true;
        while (lopBool) {
            System.out.println("Are you deposit or withdrawing use (+ or -) ");
            String direction = myScanner.nextLine();
            if (!(direction.equals("+") || direction.equals("-"))) {
                System.out.println("pleas input + or -");
                continue;
            }

            System.out.println("The amount: ");
            double amount = myScanner.nextDouble();
            myScanner.nextLine();

            BalanceHandler balanceAccount = new BalanceHandler(account.getCustomer(accountNumber), amount);
            if (direction.equals("-")) {
                balanceAccount.checkMaxWithdrawal();
            }
            // balanceAccount.depositWithdrawal(direction);
            balanceAccount.chanceBalance(customer, direction);

            System.out.println("You have: " + account.getCustomer(accountNumber).balance + "kr on your account.");
            lopBool = false;

        }

    }

    // Metod för att starta om menyn.
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

    // Meny val när kontot har valts
    public void menu() {
        while (run) {
            System.out.println("How can i help you today?" + System.lineSeparator() +
                    "Se your balance: 1" + System.lineSeparator() +
                    "Deposit or withdrawing: 2" + System.lineSeparator() +
                    "Cancel: 3" + System.lineSeparator() +
                    "Chance account: 4");
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
                    chanceBalanceInputs();
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;
                case 3:
                    run = false;
                    break;
                case 4:
                    accountNumber = -1;
                    selectCustomer();

            }

        }

    }

}
