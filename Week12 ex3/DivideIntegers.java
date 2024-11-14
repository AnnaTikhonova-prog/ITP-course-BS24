import java.io.*;

public class DivideIntegers {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

            String line1 = reader.readLine();
            int num1 = Integer.parseInt(line1.trim());

            String line2 = reader.readLine();
            int num2 = Integer.parseInt(line2.trim());

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

            reader.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found.");
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file.");
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please provide valid integers.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occurred - " + e.getMessage());
        }
    }
}
