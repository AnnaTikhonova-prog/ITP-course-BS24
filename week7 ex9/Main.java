import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Integer n = s.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = s.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += values[i];
        }
        double c = sum / values.length;
        System.out.println(c);
    }
}