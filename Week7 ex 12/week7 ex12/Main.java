import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pathname = "some_directory";
        File file = new File(pathname);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path points to file");
            } else if (file.isDirectory()) {
                System.out.println("The specified path points to directory");
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}