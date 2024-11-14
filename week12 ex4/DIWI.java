import java.io.*;

public class DIWI {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "input.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

            try {
                String line1 = reader.readLine();
                int num1 = Integer.parseInt(line1.trim());

                String line2 = reader.readLine();
                int num2 = Integer.parseInt(line2.trim());

                int result = num1 / num2;
                System.out.println("Result of division: " + result);
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input. Please provide valid integers.");
                throw e;
            } catch (ArithmeticException e) {
                System.err.println("Error: Division by zero is not allowed.");
                throw e;
            } catch (Exception e) {
                System.err.println("Error: An unexpected error occurred - " + e.getMessage());
                throw e;
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error: Unable to close the file.");
                    e.addSuppressed(e);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found.");
            throw e;
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file.");
            throw e;
        }
    }
}
