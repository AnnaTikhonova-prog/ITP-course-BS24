import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> words = fillArray();

        words.stream()
                .filter(s -> !s.isEmpty() && !s.matches(".*\\d.*"))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static String generateRandomString(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomString.toString();
    }

    public static ArrayList<String> fillArray(){

        Random random = new Random();
        ArrayList<String> words = new ArrayList<>();
        
        int count = random.nextInt(11);
        int length = random.nextInt((6) + 1);
        for (int i = 0; i < count; i++) {
            words.add(generateRandomString(length));

        }
        ArrayList <String> dublicateWords = new ArrayList<>(words);
        dublicateWords.addAll(words);
        
        return dublicateWords;
    }
}

