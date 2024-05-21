package a;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice(10, new Customer(100, "Elliott", 5), 100.25f);

        inv1.setAmount(25.99);
        inv1.setCustomer(new Customer(11, "Stacey", 5));

        System.out.println(inv1.getID());
        System.out.println(inv1.getCustomer());
        System.out.println(inv1.getCustomerName());
        System.out.println(inv1.getAmount());
        System.out.println(inv1.getAmountAfterDiscount());
    }
}
