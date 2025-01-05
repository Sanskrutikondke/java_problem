import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num 1");
        int n1 = s.nextInt();
        System.out.println("enter num 2");
        int n2 = s.nextInt();

        int gcd=0;
        for (int i = 1; i <= n1 && i<=n2; i++) {
            if (n1 %i==0 && n2 %i==0){
                gcd = i;
            }
        }
        System.out.println("the greatest common divisor of given number is : "+gcd);
    }
}
