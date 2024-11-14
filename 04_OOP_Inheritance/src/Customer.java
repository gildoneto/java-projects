public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Default Name", "Default Email");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public void printCustomer() {
        System.out.println("Name: " + name + "\n" +
                "Credit Limit: " + creditLimit + "\n" +
                "Email: " + email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
