import java.util.Scanner;

public class Quotient_Reminder {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int a = s.nextInt();
        System.out.println("Enter num2 : ");
        int b = s.nextInt();
        System.out.println("the quotient is : "+(a/b));
        System.out.println("the remainder is " +(a%b));
        s.close();
    }
}
