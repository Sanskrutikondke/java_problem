import java.util.Scanner;

public class Conver_String_Lowercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any statement");
        String orig_str = s.nextLine();
        System.out.println(orig_str.toLowerCase());

    }
}
