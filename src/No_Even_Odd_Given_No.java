import java.util.Scanner;

public class No_Even_Odd_Given_No {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any digit number");
        int n = s.nextInt();
        int evencount = 0;
        int oddcount = 0;
        while (n>0){
            int remainder = n%10;
            if(remainder % 2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
            n = n/10;
        }
        System.out.println("even count is : "+evencount);
        System.out.println("odd count is : "+oddcount);
        s.close();
    }
}
