import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = s.nextInt();
        System.out.println("enter the power : ");
        int pow = s.nextInt();
        int ia = a;
        for (int i = 1; i < pow; i++) {
            a = ia * a;
        }
        System.out.println("the power of number is : "+a);
    }
}
