import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = VowelsCount(str);
        System.out.println(count);
    }
    public static int VowelsCount(String str) {
        int y = 0;
        String vow = "aeiuoAEIOU";
        for ( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (vow.indexOf(ch) != -1){
                y++;
            }
        }
        return y;
    }
}