import java.util.Scanner;

public class NO_Digits_Given_No {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any digit no");
        int n = s.nextInt();
        int digitcount = 0;
        while(n>0) {
            digitcount++;
            n=n/10;
        }
        System.out.println("the number of digits for given inputted number is : "+digitcount);
    }
}
