import java.util.Scanner;

public class Palindrome_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int orig_n = s.nextInt();
        int n = orig_n;
        int rev_n = 0;
        while (n != 0) {
            int remainder = n % 10;
            rev_n = (rev_n * 10) + remainder;
            n = n / 10;
        }
        if (orig_n == rev_n) {
            System.out.println(orig_n + " is a palindrome");
        }
        else {
            System.out.println(orig_n+" is not a palindrome");
        }
        s.close();
    }
}
