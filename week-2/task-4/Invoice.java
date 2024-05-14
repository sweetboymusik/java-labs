public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public static int invoiceCount = 0;

    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public Invoice(Invoice invoice) {
        this.id = invoice.id;
        this.desc = invoice.desc;
        this.qty = invoice.qty;
        this.unitPrice = invoice.unitPrice;
        invoiceCount++;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.2f]", id, desc, qty, unitPrice);
    }
}
