import java.util.*;

public class MapChecker {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of keys:");
        int numEntries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = scanner.nextLine();
            System.out.print("Enter value for " + key + ": ");
            int value = scanner.nextInt();
            scanner.nextLine();
            map.put(key, value);
        }

        boolean hasRepetitiveValues = checkRepetitiveValues(map);

        if (!hasRepetitiveValues) {
            System.out.println("All values are unique");
        }

        scanner.close();
    }

    public static boolean checkRepetitiveValues(Map<String, Integer> map) {
        Set<Integer> uniqueValues = new HashSet<>();
        boolean hasRepetitive = false;

        for (int value : map.values()) {
            if (!uniqueValues.add(value)) {
                System.out.println("The duplicate value is: " + value);
                hasRepetitive = true;
            }
        }

        return hasRepetitive;
    }
}
