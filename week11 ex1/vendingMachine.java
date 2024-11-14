import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Drinks{
    COKE("Coke Cola", 2.5),
    SPRITE("Sprite", 2.0),
    FANTA("Fanta", 1.5);

    private final String name;
    private final double price;

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
};

enum Money{
    FIVE (5),
    TEN (10),
    TWENTY (20);

    private final int denomination;

    Money(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

};

public class vendingMachine {

    static int totalBank = 0;

    public static void showMenu() {
        System.out.println("Menu:");
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.getName() + " " + drink.getPrice());
        }
    }


    public static int insertMoney(Scanner scanner){
        System.out.println("Insert money");
        int total = 0;

        while(true){
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.isEmpty()) {
                break;
            }

            try{
                int money = Integer.parseInt(input);
                boolean valid = false;
                for (Money banknote: Money.values()){
                    if (banknote.getDenomination() == money){
                        valid = true;
                        total += money;
                        totalBank += money;
                        break;
                    }
                }
                if (!valid) {
                    throw new IllegalArgumentException("Недопустимый номинал.");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Insert an integer number");
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return total;
    }

    public static Drinks selectDrink(Scanner scanner){
        showMenu();
        System.out.println("Enter the drink:");
        String choice = scanner.nextLine().trim().toUpperCase();
        try {
            return Drinks.valueOf(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please choose a valid drink.");
            return null;
        }
    }

    public static void returnChange(int change) {
        List<Integer> changeReturned = new ArrayList<>();
        int[] denominations = {20, 10, 5};

        int returned = 0;
        for (int denom : denominations) {
            while (returned + denom <= change) {
                returned += denom;
                totalBank -= denom;
                changeReturned.add(denom);
            }
        }

        System.out.printf("Returning change: $%d%n", returned);
        System.out.println("Banknotes returned: " + changeReturned);
    }

    public static void starting(){
        Scanner scanner = new Scanner(System.in);
        int totalMoney = insertMoney(scanner);
        Drinks selectedDrink = selectDrink(scanner);

        if (selectedDrink != null) {
            if (totalMoney >= selectedDrink.getPrice()) {
                System.out.printf("Dispensing %s for $%.2f%n", selectedDrink.getName(), selectedDrink.getPrice());
                int changeNeeded = totalMoney - (int) selectedDrink.getPrice();

                if (changeNeeded > 0) {
                    returnChange(changeNeeded);
                }

                System.out.println("Thank you for your purchase!");
            } else {
                System.out.println("Not enough money. Transaction canceled, returning money.");
                returnChange(totalMoney);
            }
        } else {
            System.out.println("No valid drink selected. Returning money.");
            returnChange(totalMoney);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        starting();
    }
}
