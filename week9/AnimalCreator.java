import java.util.Arrays;

public class AnimalCreator {

    public static void main(String[] args) {

        Animal Animals[] = new Animal[3];

        Animal cat = new Cat(10, 5, "white");
        Animals[0] = cat;

        Animal dog = new Dog(40, 28, "brown");
        Animals[1] = dog;

        Animal cow = new Cow(169, 450, "black");
        Animals[2] = cow;

        System.out.println(Arrays.toString(Animals));
    }

}
