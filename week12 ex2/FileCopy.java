import java.io.*;

public class FileCopy {
        public static void main(String[] args) {
            String inputFilePath = "input.txt";
            String outputFilePath = "output.txt";

            try {
                File inputFile = new File(inputFilePath);
                if (!inputFile.exists()) {
                    throw new FileNotFoundException("Input file does not exist: " + inputFilePath);
                }

                File outputFile = new File(outputFilePath);
                if (outputFile.exists() && !outputFile.canWrite()) {
                    throw new IOException("No write permission for the output file: " + outputFilePath);
                }

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                reader.close();
                writer.close();


            } catch (FileNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("I/O Error: " + e.getMessage());
            }
        }
    }

