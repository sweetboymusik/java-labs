package b;

public class Account {
    private int ID;
    private Customer customer;
    private double balance;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("%s(%d) balance=$%.2f", customer.getName(), customer.getID(), balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        double newBalance = this.balance + amount;
        this.setBalance(newBalance);
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            double newBalance = this.balance - amount;
            this.setBalance(newBalance);
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }

        return this;
    }
}
