import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path refers to a file");
            } else if (file.isDirectory()) {
                System.out.println("The path refers to a directory");
            } else {
                System.out.println("The is neither a file nor a directory.");
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}