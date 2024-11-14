import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        int result = a.compareTo(b);
        if (result == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}