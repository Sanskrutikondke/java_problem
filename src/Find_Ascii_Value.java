import java.util.Scanner;

public class Find_Ascii_Value {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any chracter");
        char c = s.nextLine().charAt(0);

        int as = (int)c;
        System.out.println("ASCII value of the character is : "+as);
        s.close();
    }
}
