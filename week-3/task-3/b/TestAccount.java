package b;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(1, new Customer(22, "Elliott", 'm'));

        acc1.setBalance(5000.00f);

        System.out.println(acc1.getID());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getCustomer());
        System.out.println(acc1.getCustomerName());

        acc1.withdraw(1000.00f);
        System.out.println(acc1.getBalance());

        acc1.deposit(500.00f);
        System.out.println(acc1.getBalance());

        acc1.withdraw(10000.00);
        System.out.println(acc1.getBalance());

        System.out.println(acc1);
    }
}
