import java.util.Scanner;

public class Largest_Given_3No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("enter third number");
        int c = s.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is largest");
        } else if (b>c) {
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
        s.close();
    }
}
