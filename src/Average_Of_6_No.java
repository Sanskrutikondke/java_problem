import java.util.Scanner;

public class Average_Of_6_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num 1");
        int a =s.nextInt();
        System.out.println("enter num 2");
        int b =s.nextInt();
        System.out.println("enter num 3");
        int c =s.nextInt();
        System.out.println("enter num 4");
        int d =s.nextInt();
        System.out.println("enter num 5");
        int e =s.nextInt();
        System.out.println("enter num 6");
        int f =s.nextInt();

        int sum = (a+b+c+d+e+f);
        double avg = sum/6;
        System.out.println("the average of 6 no. is : " +avg);
    }

}
