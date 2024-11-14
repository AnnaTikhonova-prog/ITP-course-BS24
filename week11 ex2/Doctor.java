import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String name;
    private int doctorId;
    private List<Patient> patients;

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void сheckPatient(Patient patient) {
        patients.add(patient);
        patient.check();
        System.out.println("Patient " + patient.getName() + " checked by Dr. " + name);
    }
}
