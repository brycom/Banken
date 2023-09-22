import java.util.ArrayList;

// Arraylist med dom olika tilgängliga kontona, get metoder och metoden som presenterar dom tilgängliga metoderna i RunFlow(selectCustomer).
public class CustomerHandler {
    ArrayList<Customer> customerArr = new ArrayList<>();

    public CustomerHandler() {

        // Customer[] customerArr;

        customerArr.add(new Customer("Mathias", "Brynolf", 154.50));
        customerArr.add(new Customer("Jenny ", "Hellqist", 2650.0));
        customerArr.add(new Customer("Roger", "Pontare", 2.50));
        customerArr.add(new Customer("Asterix", "Den lille", 7483.99));
        customerArr.add(new Customer("Obelix", "Den stora", 1487.30));

    }

    public Customer getCustomer(int index) {
        return customerArr.get(index);
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
