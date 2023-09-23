
import java.util.Scanner;

//Inputtmetoder och menyer.

public class RunFlowe {
    boolean run = true;
    boolean restart = true;
    Scanner myScanner = new Scanner(System.in);
    int accountNumber = -1;
    public static CustomerHandler account = new CustomerHandler();
    public static Customer customer;
    String direction;

    // kontrolerar så att nästa input är en int.
    public void onlyInt() {
        while (!myScanner.hasNextInt()) {
            System.out.println("Pleas input a number:");
            myScanner.nextLine();
        }
    }

    // Tar in ett kontonummer och väljer rätt konto från arraylisten på
    // CustomerHandler.
    public void selectCustomer() {
        while (accountNumber < 0 || accountNumber > account.getCustomerSize()) {
            System.out.println("Whose account do you want to access:");
            account.customerpresenter();
            System.out.println("Input the account number:");
            onlyInt();
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

    // Tar in summa som ska sättas in eller tas ut och kör metoderna
    // från BalanceHandler.
    public void chanceBalanceInputs() {
        boolean lopBool = true;
        while (lopBool) {

            System.out.println("The amount: ");
            while (!myScanner.hasNextFloat()) {
                System.out.println("Pleas input a number.");
                myScanner.nextLine();
            }
            float amount = myScanner.nextFloat();
            myScanner.nextLine();

            BalanceHandler balanceAccount = new BalanceHandler(account.getCustomer(accountNumber), amount);
            if (direction.equals("-")) {
                balanceAccount.checkMaxWithdrawal();
            }
            balanceAccount.chanceBalance(customer, direction);

            System.out.println("You have: " + account.getCustomerbalansAsString(accountNumber) + "kr on your account.");

            // lopBool = false;
            break;

        }

    }

    // Metod för att starta om menyn.
    void restart() {
        while (restart) {
            System.out.println("Do you want to do something more?");
            String reRun = myScanner.nextLine();
            if (reRun.equals("yes")) {
                break;

            } else if (reRun.equals("no")) {
                run = false;
                break;

            } else
                System.out.println("Pleas say yes or no");

        }

    }

    // Meny val när kontot har valts
    public void menu() {
        while (run) {
            System.out.println("How can i help you today?" + System.lineSeparator() +
                    "Se your balance: 1" + System.lineSeparator() +
                    "Deposit: 2" + System.lineSeparator() +
                    "withdraw: 3" + System.lineSeparator() +
                    "Cancel: 4" + System.lineSeparator() +
                    "Chance account: 5");
            onlyInt();
            int action = myScanner.nextInt();
            myScanner.nextLine();
            switch (action) {
                case 1:
                    System.out.println(
                            "Your account balance is: " + account.getCustomerbalansAsString(accountNumber) + "kr");
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;

                case 2:
                    direction = "+";
                    chanceBalanceInputs();
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;
                case 3:
                    direction = "-";
                    chanceBalanceInputs();
                    restart();
                    if (run == false) {
                        break;
                    } else
                        continue;

                case 4:
                    break;
                case 5:
                    accountNumber = -1;
                    selectCustomer();

            }

        }

    }

}
