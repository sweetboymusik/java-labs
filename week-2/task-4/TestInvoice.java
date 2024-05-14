public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("1111", "Item 1", 5, 10.99);
        Invoice inv2 = new Invoice("2222", "Item 2", 1, 29.99);
        Invoice inv3 = new Invoice("3333", "Item 3", 25, 3.78);
        Invoice inv4 = new Invoice("4444", "Item 4", 9, 10.50);

        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);
        System.out.println(inv4);
        System.out.println(Invoice.invoiceCount);
    }

}
