public class Menu {
    public static void main(String[] args) {

        Patient Doe = new Patient(003, "John Doe");
        Receptionist Smith = new Receptionist(99, "Jane Smith");
        Doctor White = new Doctor(88, "Dr. White");

        Smith.giveAppointment(Doe);
        Smith.generateBill(Doe, 100, "analgin", 15);

        White.сheckPatient(Doe);
    }
}
