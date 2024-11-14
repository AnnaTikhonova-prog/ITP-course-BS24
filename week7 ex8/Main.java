import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();
        String convert = Integer.toBinaryString(x);
        System.out.println(convert);
        String convert1 = Integer.toOctalString(x);
        System.out.println(convert1);
        String convert2 = Integer.toHexString(x);
        System.out.println(convert2);
    }
}