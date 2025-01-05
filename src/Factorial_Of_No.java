import java.util.Scanner;

public class Factorial_Of_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int num = s.nextInt();
        int fact = factorial(num);
        System.out.println("factorial of the given number is " +fact);
    }
        public static int factorial(int n){
            if(n==0){
                return 1;
            }
            else {
            return n*factorial(n-1);
            }
    }
}
