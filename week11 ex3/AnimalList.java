import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private List<String> animals;

    public AnimalList() {
        animals = new ArrayList<>();
    }

    public void addAnimal(String animal) {
        animals.add(animal);
        System.out.println(animal + " added to the list.");
    }


    public void removeAnimal(String animal) {
        if (animals.remove(animal)) {
            System.out.println(animal + " removed from the list.");
        } else {
            System.out.println(animal + " not found in the list.");
        }
    }

    public void updateAnimal(int index, String newAnimal) {
        if (index >= 0 && index < animals.size()) {
            String oldAnimal = animals.set(index, newAnimal);
            System.out.println("Updated " + oldAnimal + " to " + newAnimal + " at index " + index + ".");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("The animal list is empty.");
        } else {
            System.out.println("Animals in the list:");
            for (int i = 0; i < animals.size(); i++) {
                System.out.println(i + ": " + animals.get(i));
            }
        }
    }

    public static void main(String[] args) {

    }
}

