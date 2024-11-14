public class Bill {

    private String name;
    private double amount;
    private int billId;

    public Bill(int billId, String name, double amount) {
        this.billId = billId;
        this.name = name;
        this.amount = amount;
    }

    public int getBillId() {
        return billId;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
