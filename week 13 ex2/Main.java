import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void displayAnimals(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getNickname());
        }
    }

    public static void makeTalk(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }

    public static <T extends Animal> void addAnimals(Set<? super T> animalSet, T... animals) {
        for (T animal : animals) {
            animalSet.add(animal);
        }
    }

    public static void main(String[] args) {
        Set<Animal> allAnimals = new HashSet<>();
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();

        Cat cat1 = new Cat("Whiskers", 5);
        Cat cat2 = new Cat("Mittens", 3);
        Dog dog1 = new Dog("Rover", 7);
        Dog dog2 = new Dog("Spot", 9);

        addAnimals(cats, cat1, cat2);
        addAnimals(dogs, dog1, dog2);
        addAnimals(allAnimals, cat1, cat2, dog1, dog2);

        System.out.println("All Animals:");
        displayAnimals(allAnimals);

        System.out.println("\nCats:");
        displayAnimals(cats);

        System.out.println("\nDogs:");
        displayAnimals(dogs);

        System.out.println("\nAll Animals Talking:");
        makeTalk(allAnimals);
    }
}