import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the year");
        int y =s.nextInt();
        if ((y%4==0 && y%100!=0) || y%400==0){
            System.out.println( "the year is a leap year " );
        }

        else {
            System.out.println("the year is not leap year ");
        }
        s.close();
    }
}
