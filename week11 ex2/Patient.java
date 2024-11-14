public class Patient {

    private int patientId;
    private String name;
    private Bill bill;
    private boolean status = false;

    public Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
    }

    public void giveRecipe(Bill bill){
        this.bill = bill;
    }

    public int getPatientId() {
        return patientId;
    }

    public void check(){
        status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public Bill getBill() {
        return bill;
    }

    public void payBill() {
        System.out.println("Payment of bill " + bill.getBillId() + " completed.");
    }
}
