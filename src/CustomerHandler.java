import java.util.ArrayList;

// Arraylist med dom olika tilgängliga kontona, get metoder och metoden som presenterar dom tilgängliga metoderna i RunFlow(selectCustomer).
public class CustomerHandler {
    ArrayList<Customer> customerArr = new ArrayList<>();

    public CustomerHandler() {

        customerArr.add(new Customer("Mathias", "Brynolf", 154.50f));
        customerArr.add(new Customer("Jenny ", "Hellqist", 2650.10f));
        customerArr.add(new Customer("Roger", "Pontare", 2.50f));
        customerArr.add(new Customer("Asterix", "Den lille", 7483.99f));
        customerArr.add(new Customer("Obelix", "Den stora", 1487.30f));

    }

    public Customer getCustomer(int index) {
        return customerArr.get(index);
    }

    public String getCustomerbalansAsString(int index) {
        float balanceFloat = customerArr.get(index).balance;
        String balancString = String.format("%.2f", balanceFloat);
        return balancString;
    }

    public int getCustomerSize() {
        int aarSize = customerArr.size();
        return aarSize;
    }

    public void customerpresenter() {
        for (Customer acc : customerArr) {
            int indexarr = customerArr.indexOf(acc);
            indexarr += 1;
            System.out.println((acc.firstName + ": " + indexarr));
        }
    }

}
