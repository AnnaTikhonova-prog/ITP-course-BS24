import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateArray();

        numbers.stream()
                .filter(n -> n % 3 == 0)
                .map(Math::abs)
                .forEach(System.out::println);
    }

    public static ArrayList<Integer> generateArray() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        int count = random.nextInt(100);
        for (int i =0; i < count; i++){
            numbers.add(random.nextInt(100 + 100 - 1) - 100);
        }

        return numbers;
    }

}