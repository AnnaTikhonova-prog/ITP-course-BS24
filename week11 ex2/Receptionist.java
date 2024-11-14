import java.util.ArrayList;
import java.util.List;

public class Receptionist{

    private int receptionistId;
    private String name;
    private List<Patient> appointments;
    private List<Bill> bills;

    public Receptionist(int receptionistId, String name) {
        this.receptionistId = receptionistId;
        this.name = name;
        this.appointments = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

    public void giveAppointment(Patient patient) {
        appointments.add(patient);
        System.out.println("Appointment for " + patient.getName());
    }

    public void generateBill(Patient patient, int billId, String name, double amount) {
        Bill bill = new Bill(billId, name, amount);
        bills.add(bill);
        patient.giveRecipe(bill);
        System.out.println("Bill for " + patient.getName());
    }
}
