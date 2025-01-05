import java.util.Scanner;

public class Count_Digis {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any digit number");
        int n = s.nextInt();
        int sumdigit = 0;
        while (n>0){
            int reminader = n%10;
            sumdigit =  sumdigit+reminader ;
            n = n/10;
        }
        System.out.println("sum of digits is : "+sumdigit);
        s.close();
    }
}
