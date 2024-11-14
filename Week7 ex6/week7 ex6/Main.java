import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temp = s.nextInt();
        double tempc = ((temp - 32)*5)/9;
        System.out.println(tempc);
    }
}