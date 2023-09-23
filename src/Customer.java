
//konstruktor för konton samt get och set metoder
public class Customer {
    String firstName;
    String lastName;
    float balance;

    public Customer(String firstName, String lastName, float balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}