import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Alice", "Smith", 30);
        Owner owner2 = new Owner("Bob", "Brown", 45);

        Cat cat1 = new Cat(1, "Whiskers", owner1, 50);
        Snake snake1 = new Snake(2, "Slither", owner2, 80);
        Rabbit rabbit1 = new Rabbit(3, "Floppy", owner1, 15.5);

        Cat cat2 = new Cat(1, "DuplicateCat", owner2, 60); // Duplicate ID

        List<Animal> petsBatch1 = List.of(cat1, snake1);
        List<Animal> petsBatch2 = List.of(rabbit1, cat2);

        VeterinaryClinic clinic = new VeterinaryClinic();

        System.out.println("Adding first batch of pets:");
        clinic.addPets(petsBatch1);

        System.out.println("\nAdding second batch of pets:");
        clinic.addPets(petsBatch2);

        System.out.println("\nDisplaying all pets in the clinic:");
        clinic.displayPets();
    }
}
