import java.util.Scanner;

public class Sum_digits_in_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no");
        int n = s.nextInt();
        int sum =0;
        while(n!=0){
            int reminder =n%10;
            sum = sum +reminder;
            n = n/10;
        }

        System.out.println("sum of all the digits in the given no is : "+sum);
        s.close();

    }
}
