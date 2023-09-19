public class App {

    public static void main(String[] args) throws Exception {
        Customer mathias = new Customer("Mathias", "Brynolf", 154.50);
        Customer jenny = new Customer("Jenny ", "Hellqist", 2650.0);
        Customer roger = new Customer("Roger", "Pontare", 2.50);
        Customer asterix = new Customer("Asterix", "Den lille", 7483.99);
        Customer obelix = new Customer("Obelix", "Den stora", 1487.30);
        BalanceHandler balanceMathias = new BalanceHandler(mathias.balance, 50);

        balanceMathias.chanceBalance();
        mathias.balance = balanceMathias.balance;
        System.out.println(mathias.balance);
        // hej hej hej

    }
}
