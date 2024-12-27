import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d \n" , n ,i ,n*i);
        }
        s.close();
    }
}
