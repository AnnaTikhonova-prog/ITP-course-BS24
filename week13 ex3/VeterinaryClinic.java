import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class VeterinaryClinic {
    private Map<Integer, Animal> animals = new HashMap<>();

    public void addPets(Collection<? extends Animal> pets) {
        for (Animal pet : pets) {
            if (animals.containsKey(pet.getId())) {
                System.out.println("Warning: Animal with ID " + pet.getId() + " already exists. Skipping.");
            } else {
                animals.put(pet.getId(), pet);
                System.out.println("Added: " + pet);
            }
        }
    }

    public void displayPets() {
        if (animals.isEmpty()) {
            System.out.println("No pets in the clinic.");
        } else {
            for (Animal animal : animals.values()) {
                System.out.println(animal);
            }
        }
    }
}