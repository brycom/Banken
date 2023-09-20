import java.util.Scanner;

public class App {
    /*
     * Customer mathias = new Customer("Mathias", "Brynolf", 154.50);
     * Customer jenny = new Customer("Jenny ", "Hellqist", 2650.0);
     * Customer roger = new Customer("Roger", "Pontare", 2.50);
     * Customer asterix = new Customer("Asterix", "Den lille", 7483.99);
     * Customer obelix = new Customer("Obelix", "Den stora", 1487.30);
     * BalanceHandler balanceMathias = new BalanceHandler(mathias.balance, 50);
     */

    public static void main(String[] args) throws Exception {
        boolean run = true;
        Scanner myScanner = new Scanner(System.in);
        Customer mathias = new Customer("Mathias", "Brynolf", 154.50);

        while (run) {
            System.out.println("are you deposit or withdrawing use (+ or -) ");
            String direction = myScanner.nextLine();

            System.out.println("the amount: ");
            double amount = myScanner.nextDouble();
            myScanner.nextLine();

            BalanceHandler balanceMathias = new BalanceHandler(mathias.balance, amount);

            balanceMathias.checkMaxWithdrawal();
            balanceMathias.depositWithdrawal(direction);
            balanceMathias.chanceBalance();
            mathias.balance = balanceMathias.balance;
            System.out.println("ytre balance" + mathias.balance);
            System.out.println("do you want to try again?");
            String reRun = myScanner.nextLine();
            if (reRun.equals("yes")) {
                run = true;
            } else if (reRun.equals("no")) {
                run = false;
            } else
                System.out.println("pleas say yes or no");

        }
        myScanner.close();

    }
}
