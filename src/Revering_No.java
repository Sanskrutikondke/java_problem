import java.util.Scanner;

public class Revering_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = s.nextInt();
        int rev_no = 0;
        while (n > 0) {
            int reminder = n % 10;
            rev_no = (rev_no * 10) + reminder;
            n = n / 10;
        }
        System.out.println("reverse number is : "+rev_no);
        s.close();
    }
}
