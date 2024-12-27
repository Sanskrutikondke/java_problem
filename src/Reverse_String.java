import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the string");
        String str =s.nextLine();
        char []c = str.toCharArray();
        int size = c.length;
        String rev_str = "" ;
        for (int i =size-1 ; i>=0 ; i--){
            rev_str = rev_str + c[i];
        }
        System.out.println(rev_str);
    }
}
