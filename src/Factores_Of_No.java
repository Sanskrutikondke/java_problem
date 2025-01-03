import java.util.Scanner;

public class Factores_Of_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0) {
                count++;
                System.out.println("the number which divides " + n + " is " + i);
            }
        }
        System.out.println(count +" numbers divides the number " +n);

    }
}
